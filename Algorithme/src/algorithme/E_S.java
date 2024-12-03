/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.E_S#getE_StoA <em>ESto A</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getE_S()
 * @model
 * @generated
 */
public interface E_S extends EObject {
	/**
	 * Returns the value of the '<em><b>ESto A</b></em>' reference list.
	 * The list contents are of type {@link algorithme.Algorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESto A</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getE_S_E_StoA()
	 * @model
	 * @generated
	 */
	EList<Algorithme> getE_StoA();

} // E_S
