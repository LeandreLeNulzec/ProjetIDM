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
 *   <li>{@link script.Script#getScriptElements <em>Script Elements</em>}</li>
 *   <li>{@link script.Script#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Script Elements</b></em>' containment reference list.
	 * The list contents are of type {@link script.ScriptElements}.
	 * It is bidirectional and its opposite is '{@link script.ScriptElements#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Elements</em>' containment reference list.
	 * @see script.ScriptPackage#getScript_ScriptElements()
	 * @see script.ScriptElements#getScript
	 * @model opposite="script" containment="true"
	 * @generated
	 */
	EList<ScriptElements> getScriptElements();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see script.ScriptPackage#getScript_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link script.Script#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Script
