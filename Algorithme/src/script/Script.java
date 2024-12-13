/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Script#getStoSE <em>Sto SE</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Sto SE</b></em>' containment reference list.
	 * The list contents are of type {@link script.ScriptElements}.
	 * It is bidirectional and its opposite is '{@link script.ScriptElements#getSEtos <em>SEtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sto SE</em>' containment reference list.
	 * @see script.ScriptPackage#getScript_StoSE()
	 * @see script.ScriptElements#getSEtos
	 * @model opposite="SEtos" containment="true"
	 * @generated
	 */
	EList<ScriptElements> getStoSE();

} // Script
