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
 *   <li>{@link script.ScriptElements#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getScriptElements()
 * @model abstract="true"
 * @generated
 */
public interface ScriptElements extends Script {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link script.Script#getScriptElements <em>Script Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' container reference.
	 * @see #setScript(Script)
	 * @see script.ScriptPackage#getScriptElements_Script()
	 * @see script.Script#getScriptElements
	 * @model opposite="scriptElements" transient="false"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link script.ScriptElements#getScript <em>Script</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' container reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // ScriptElements
