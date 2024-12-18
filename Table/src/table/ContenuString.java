/**
 */
package table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenu String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.ContenuString#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getContenuString()
 * @model
 * @generated
 */
public interface ContenuString extends Contenu {
	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute list.
	 * @see table.TablePackage#getContenuString_Contenu()
	 * @model
	 * @generated
	 */
	EList<String> getContenu();

} // ContenuString
