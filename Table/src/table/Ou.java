/**
 */
package table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ou</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Ou#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getOu()
 * @model
 * @generated
 */
public interface Ou extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link table.Contrainte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see table.TablePackage#getOu_Variables()
	 * @model lower="2"
	 * @generated
	 */
	EList<Contrainte> getVariables();

} // Ou
