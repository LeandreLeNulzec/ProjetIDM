/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import script.ScriptElements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Script#getScrtoS <em>Scrto S</em>}</li>
 *   <li>{@link algorithme.Script#getScrtoSE <em>Scrto SE</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Scrto S</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Sortie#getStoScr <em>Sto Scr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrto S</em>' containment reference.
	 * @see #setScrtoS(Sortie)
	 * @see algorithme.AlgorithmePackage#getScript_ScrtoS()
	 * @see algorithme.Sortie#getStoScr
	 * @model opposite="StoScr" containment="true" required="true"
	 * @generated
	 */
	Sortie getScrtoS();

	/**
	 * Sets the value of the '{@link algorithme.Script#getScrtoS <em>Scrto S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrto S</em>' containment reference.
	 * @see #getScrtoS()
	 * @generated
	 */
	void setScrtoS(Sortie value);

	/**
	 * Returns the value of the '<em><b>Scrto SE</b></em>' reference list.
	 * The list contents are of type {@link script.ScriptElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrto SE</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getScript_ScrtoSE()
	 * @model
	 * @generated
	 */
	EList<ScriptElements> getScrtoSE();

} // Script
