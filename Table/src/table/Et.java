/**
 */
package table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Et</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Et#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getEt()
 * @model
 * @generated
 */
public interface Et extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link table.Contrainte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see table.TablePackage#getEt_Variables()
	 * @model lower="2"
	 * @generated
	 */
	EList<Contrainte> getVariables();

} // Et
