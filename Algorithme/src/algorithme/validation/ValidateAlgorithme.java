package algorithme.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import algorithme.AlgorithmePackage;

/**
 * Réalise la validation de modèles conformes Ã  Algorithme Ã  l'aide du validateur et
 * affiche le résultat.
 * 
 * Les modèles sont donnés dans les arguments de la ligne de commande, et le résultat
 * est affiché dans le terminal.
 * 
 */
public class ValidateAlgorithme {
	
	/**
	 * Afficher une lsite d'erreur avec un préfixe.
	 * Le préfixe est affiché avec juste "OK" Ã  la suite si la liste est vide, et sinon
	 * la liste est affiché avec une erreur par ligne, la source de l'erreur et le message
	 * associé.
	 * @param prefix préfixe Ã  afficher avant la liste (potentielle) d'erreurs
	 * @param errors erreurs Ã  afficher
	 */
	private static void afficherErreurs(String prefix, List<ValidationResult.ValidationError> errors) {
		System.out.print(prefix + ":");
		if (errors.isEmpty()) {
			System.out.println(" OK");
		} else {
			System.out.println(" " + errors.size() + " erreurs trouvées");
			for (ValidationResult.ValidationError error : errors) {
				System.out.println("=> " + error.toString());
			}
		}
	}
	
	/**
	 * Affiche les erreurs pour les divers éléments du méta-modèle : process, activités,
	 * dépendances, commentaires.
	 * @param resultat résultat de la validation calculé auparavant
	 */
	private static void afficherResultat(ValidationResult resultat) {
		afficherErreurs("- Algorithme", resultat.getRecordedErrorsFor(AlgorithmePackage.ALGORITHME));
		afficherErreurs("- Ressources", resultat.getRecordedErrorsFor(AlgorithmePackage.RESSOURCES));
<<<<<<< HEAD
		afficherErreurs("- Entree", resultat.getRecordedErrorsFor(AlgorithmePackage.ENTREE));
		afficherErreurs("- Sortie", resultat.getRecordedErrorsFor(AlgorithmePackage.SORTIE));
		afficherErreurs("- Documentation", resultat.getRecordedErrorsFor(AlgorithmePackage.DOCUMENTATION));
=======
>>>>>>> 85930e357d8d27f6770f7dd522f9c3c781e1eb98
	}

	/**
	 * Fonction principale. Charge le méta-modèle et les modèles passés en paramètre sur
	 * la ligne de commande, lance la validation pour chaque modèle et affiche le résultat.
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String... args) {
		// On a besoin de récupérer l'eINSTANCE pour qu'elle soit correctement instanciée.
		// C'est cette étape qui "charge le méta-modèle".
		// Bien sûr, on n'utilise pas directement packageInstance, d'où le warning "unused" qui
		// est supprimé avec l'annotation.
		@SuppressWarnings("unused")
		AlgorithmePackage packageInstance = AlgorithmePackage.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		AlgorithmeValidator validator = new AlgorithmeValidator();

		for (String model : args) {
			URI modelURI = URI.createURI(model);
			Resource resource = resSet.getResource(modelURI, true);
			ValidationResult resultat = validator.validate(resource);
			
			System.out.println("Résultat de validation pour " + model + ":");
			afficherResultat(resultat);
		}
		
		System.out.println("Fini.");
	
	}

}
