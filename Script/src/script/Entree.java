/**
 */
package script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Entree#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends ScriptElements {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' reference list.
	 * The list contents are of type {@link script.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' reference list.
	 * @see script.ScriptPackage#getEntree_Entrees()
	 * @model
	 * @generated
	 */
	EList<Port> getEntrees();

} // Entree
