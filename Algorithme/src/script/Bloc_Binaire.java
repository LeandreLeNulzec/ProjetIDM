/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc_Binaire#getBBtoS <em>BBto S</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc_Binaire()
 * @model
 * @generated
 */
public interface Bloc_Binaire extends EObject {
	/**
	 * Returns the value of the '<em><b>BBto S</b></em>' reference list.
	 * The list contents are of type {@link script.ScriptElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BBto S</em>' reference list.
	 * @see script.ScriptPackage#getBloc_Binaire_BBtoS()
	 * @model
	 * @generated
	 */
	EList<ScriptElements> getBBtoS();

} // Bloc_Binaire
