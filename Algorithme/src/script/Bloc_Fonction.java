/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc_Fonction#getBFtoS <em>BFto S</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc_Fonction()
 * @model
 * @generated
 */
public interface Bloc_Fonction extends EObject {
	/**
	 * Returns the value of the '<em><b>BFto S</b></em>' reference list.
	 * The list contents are of type {@link script.ScriptElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BFto S</em>' reference list.
	 * @see script.ScriptPackage#getBloc_Fonction_BFtoS()
	 * @model
	 * @generated
	 */
	EList<ScriptElements> getBFtoS();

} // Bloc_Fonction
