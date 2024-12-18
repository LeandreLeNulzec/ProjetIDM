/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Constante#getVal <em>Val</em>}</li>
 *   <li>{@link script.Constante#getCtoS <em>Cto S</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getConstante()
 * @model
 * @generated
 */
public interface Constante extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(float)
	 * @see script.ScriptPackage#getConstante_Val()
	 * @model
	 * @generated
	 */
	float getVal();

	/**
	 * Sets the value of the '{@link script.Constante#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(float value);

	/**
	 * Returns the value of the '<em><b>Cto S</b></em>' reference list.
	 * The list contents are of type {@link script.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cto S</em>' reference list.
	 * @see script.ScriptPackage#getConstante_CtoS()
	 * @model
	 * @generated
	 */
	EList<Script> getCtoS();

} // Constante