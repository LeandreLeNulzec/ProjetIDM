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
 *   <li>{@link script.Entree#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends PortEntree {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute list.
	 * @see script.ScriptPackage#getEntree_Arg()
	 * @model
	 * @generated
	 */
	EList<Float> getArg();

} // Entree
