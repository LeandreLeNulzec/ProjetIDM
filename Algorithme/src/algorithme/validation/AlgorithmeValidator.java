package algorithme.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import algorithme.Guidance;
import algorithme.Ressources;
import algorithme.AlgorithmePackage;
import algorithme.Script;
import algorithme.Port;
import algorithme.Entree;
import algorithme.Sortie;
import algorithme.Argument;
import algorithme.PortEntree;
import algorithme.PortSortie;
import algorithme.AlgorithmeElements;
import algorithme.util.AlgorithmeSwitch;
import simplepdl.ProcessElement;

/**
 * Réalise la validation d'un EObject issu de Algorithme.
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 *
 */
public class AlgorithmeValidator extends AlgorithmeSwitch<Boolean>{
	/**
	 * Expression réguliÃ¨re qui correspond Ã  un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé Ã  chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public AlgorithmeValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les algorithmes présents dans la ressource.
	 * @param resource resource Ã  valider
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
	 * Méthode appelée lorsque l'objet visité est un Algorithme.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseAlgorithme(algorithme.Algorithme object) {
		// Contraintes sur algorithme
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'algorithme ne respecte pas les conventions Java");
		
		// Visite
		for (AlgorithmeElements ae : object.getAtoAE()) {
			this.doSwitch(ae);
		}
		
		return null;
	}
	
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Ressource.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseRessources(algorithme.Ressources object) {
		// Contraintes sur Ressources
		//le chemin de la ressource est non nul
		this.result.recordIfFailed(
				object.getChemin() != null, object,
				"Le chemin de la ressource est nul.");
		return null;
	}

	
	/**
	 * Méthode appelée lorsque l'objet visité est un Port d'entrée.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePortEntree(algorithme.PortEntree object) {
		//il y a au moins un port d'entrée
		
		return null;
	}

	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas Ã  un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert Ã  rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute faÃ§on ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
