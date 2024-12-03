/**
 */
package algorithme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see algorithme.AlgorithmePackage
 * @generated
 */
public interface AlgorithmeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmeFactory eINSTANCE = algorithme.impl.AlgorithmeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Algorithme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithme</em>'.
	 * @generated
	 */
	Algorithme createAlgorithme();

	/**
	 * Returns a new object of class '<em>Ressources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressources</em>'.
	 * @generated
	 */
	Ressources createRessources();

	/**
	 * Returns a new object of class '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme</em>'.
	 * @generated
	 */
	Programme createProgramme();

	/**
	 * Returns a new object of class '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier</em>'.
	 * @generated
	 */
	Fichier createFichier();

	/**
	 * Returns a new object of class '<em>Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance</em>'.
	 * @generated
	 */
	Guidance createGuidance();

	/**
	 * Returns a new object of class '<em>ES</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ES</em>'.
	 * @generated
	 */
	E_S createE_S();

	/**
	 * Returns a new object of class '<em>Entrée</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrée</em>'.
	 * @generated
	 */
	Entrée createEntrée();

	/**
	 * Returns a new object of class '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortie</em>'.
	 * @generated
	 */
	Sortie createSortie();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlgorithmePackage getAlgorithmePackage();

} //AlgorithmeFactory
