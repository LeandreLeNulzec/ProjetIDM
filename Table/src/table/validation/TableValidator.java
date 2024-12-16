package table.validation;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import table.util.TableSwitch;
import table.*;

/**
 * Réalise la validation d'un EObject issu de Table.
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class TableValidator extends TableSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public TableValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseTable(Table object) {
		// Contraintes sur process
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite des colonnes
		for (Colonne c : object.getColonnes()) {
			this.doSwitch(c);
		}
		
		//Visite de la colonne ID
		this.doSwitch(object.getIdColonne());
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Colonne (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonne(Colonne object) {
		this.result.recordIfFailed(
				object.getTable().getColonnes().stream()
				.filter(p -> object.getTable().getIdColonne().getNbLignes() != p.getNbLignes())
				.count()>0,
				object,
				"Toutes les colonnes n'ont pas le même nombre de lignes déclarées");
		
		this.result.recordIfFailed(
				object.getTable().getColonnes().stream()
					.allMatch(c -> (c.equals(object) || !((Colonne) c).getNom().contains(object.getNom()))),
				object, 
				"Le nom de la colonne (" + object.getNom() + ") n'est pas unique");
		
		this.result.recordIfFailed(
				object.getContenu().size() != object.getNbLignes(),
				object,
				"La colonne (" + object.getNom() + ") n'a pas le nombre d'éléments attendus");
		
		if (object.equals(object.getTable().getIdColonne())) {
			this.result.recordIfFailed(
					object.getContenu().stream()
					.noneMatch(c -> object.getContenu().stream()
									.filter(c2 -> c.equals(c2))
									.count()>0),
					object, 
					"Le nom de la colonne (" + object.getNom() + ") n'est pas unique");
		}
		
		if (object instanceof ColonneProvient) {
			this.doSwitch((ColonneProvient) object);
		}
		
		if (object instanceof ColonneDerivee) {
			this.doSwitch((ColonneDerivee) object);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonneDerivee(ColonneDerivee object) {		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColonneProvient(ColonneProvient object) {
		
		
		if (object.getTableOrigine() != null) {
			//Si une table est référencée, on vérifie qu'elle est valide, 
			// notamment qu'il n'y a pas plusieurs colonne ayant le même nom
			// ce qui poserait problème si nous y faisaions référence.
			// Attention : risque de bouble infinie en cas de cycle de référencement
			this.doSwitch((Table) object.getTableOrigine());			
		}else {
			// Sinon il y a une erreur 
			this.result.recordIfFailed(false, object, "La table d'origine est nulle");
		}
		
		Colonne colonneReferencee = 
				//On récupère le stream des colonnes de l'autre table
				object.getTableOrigine().getColonnes().stream()
				
				//On filtre pour ne garde que la colonne référencée,
				.filter(c -> c.getNom().equals(object.getRefColonne()))	
				
				 //On la récupère
				.collect(Collectors.toList()).remove(0);
		
		// La colonne référencée doit avoir le même nombre de lignes que 
		// les autres colonnes de la table, notamment que ColonneID.
		this.result.recordIfFailed(
				colonneReferencee.getNbLignes() != object.getTable().getIdColonne().getNbLignes(), 
				object, 
				"La colonne de provenance n'a pas le bon nombre de lignes");
		
		return null;
	}


	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
