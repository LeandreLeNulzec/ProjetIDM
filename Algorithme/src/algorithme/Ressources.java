/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Ressources#getRtoA <em>Rto A</em>}</li>
 *   <li>{@link algorithme.Ressources#getRtoE_S <em>Rto ES</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getRessources()
 * @model
 * @generated
 */
public interface Ressources extends EObject {
	/**
	 * Returns the value of the '<em><b>Rto A</b></em>' reference list.
	 * The list contents are of type {@link algorithme.Algorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rto A</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getRessources_RtoA()
	 * @model
	 * @generated
	 */
	EList<Algorithme> getRtoA();

	/**
	 * Returns the value of the '<em><b>Rto ES</b></em>' reference list.
	 * The list contents are of type {@link algorithme.E_S}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rto ES</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getRessources_RtoE_S()
	 * @model
	 * @generated
	 */
	EList<E_S> getRtoE_S();

} // Ressources
