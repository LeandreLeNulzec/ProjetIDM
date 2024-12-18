package script.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import script.ScriptPackage;
import script.util.ScriptSwitch;
import script.Script;
import script.Port;
import script.Entree;
import script.Sortie;
import script.ScriptElements;
import script.Bloc;
import script.Bloc_Binaire;
import script.Bloc_Unaire;
import script.Bloc_Fonction;
import script.Addition;
import script.Multiplication;
import script.Division;
import script.Oppose;
import script.Inverse;
import script.Min;
import script.Max;
import script.Sin;
import script.Cos;
import script.Racine;
import script.Expo;
import script.Constante;
import script.Type;
/**
 * Réalise la validation d'un EObject issu de Script.
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 *
 */
public class ScriptValidator extends ScriptSwitch<Boolean>{
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
	public ScriptValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les Scripts présents dans la ressource.
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
	 * Méthode appelée lorsque l'objet visité est un Script.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseScript(script.Script object) {
		// Contraintes sur Script
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'Script ne respecte pas les conventions Java");
		
		// Visite
		for (ScriptElements se : object.getScriptElements()) {
			this.doSwitch(se);
		}
		
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
