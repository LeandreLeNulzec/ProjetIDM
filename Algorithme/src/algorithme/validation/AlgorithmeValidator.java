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

/**
 * RÃ©alise la validation d'un EObject issu de Algorithme.
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 *
 * @author Baptiste Rajaonah
 */
public class AlgorithmeValidator extends AlgorithmeSwitch<Boolean>{
	/**
	 * Expression rÃ©guliÃ¨re qui correspond Ã  un identifiant bien formÃ©.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * RÃ©sultat de la validation (Ã©tat interne rÃ©initialisÃ© Ã  chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public AlgorithmeValidator() {}
	
	/**
	 * Lancer la validation et compiler les rÃ©sultats dans un ValidationResult.
	 * Cette mÃ©thode se charge de crÃ©er un rÃ©sultat de validation vide puis de
	 *  visiter les process prÃ©sents dans la ressource.
	 * @param resource resource Ã  valider
	 * @return rÃ©sultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est un Port d'entrée.
	 * @param object élément visité
	 * @return résultat de validation 
	 */
	@Override
	public Boolean casePortEntree(algorithme.PortEntree object) {
		// Contraintes sur le port d'entrée
		return null;
	}


	/**
	 * Cas par dÃ©faut, lorsque l'objet visitÃ© ne correspond pas Ã  un des autres cas.
	 * Cette mÃ©thode est aussi appelÃ©e lorsqu'une mÃ©thode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implÃ©menter le switch diffÃ©remment, en ne renvoyant null dans les autres
	 * mÃ©thodes que si la contrainte ne sert Ã  rien, et se servir de cette mÃ©thode pour
	 * identifier les Ã©lÃ©ments Ã©trangers (qui de toute faÃ§on ne doivent pas exister).
	 * C'est aussi la mÃ©thode appelÃ©e si on ne redÃ©fini pas un des caseXXX.
	 * @param object objet visitÃ©
	 * @return rÃ©sultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
