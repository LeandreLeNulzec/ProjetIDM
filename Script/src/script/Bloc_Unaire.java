/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc_Unaire#getBUtoS <em>BUto S</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc_Unaire()
 * @model
 * @generated
 */
public interface Bloc_Unaire extends EObject {
	/**
	 * Returns the value of the '<em><b>BUto S</b></em>' reference list.
	 * The list contents are of type {@link script.ScriptElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUto S</em>' reference list.
	 * @see script.ScriptPackage#getBloc_Unaire_BUtoS()
	 * @model
	 * @generated
	 */
	EList<ScriptElements> getBUtoS();

} // Bloc_Unaire
