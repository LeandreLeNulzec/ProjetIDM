/**
 */
package script;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.ScriptElements#getSEtos <em>SEtos</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getScriptElements()
 * @model abstract="true"
 * @generated
 */
public interface ScriptElements extends Script {
	/**
	 * Returns the value of the '<em><b>SEtos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link script.Script#getStoSE <em>Sto SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SEtos</em>' container reference.
	 * @see #setSEtos(Script)
	 * @see script.ScriptPackage#getScriptElements_SEtos()
	 * @see script.Script#getStoSE
	 * @model opposite="StoSE" transient="false"
	 * @generated
	 */
	Script getSEtos();

	/**
	 * Sets the value of the '{@link script.ScriptElements#getSEtos <em>SEtos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEtos</em>' container reference.
	 * @see #getSEtos()
	 * @generated
	 */
	void setSEtos(Script value);

} // ScriptElements
