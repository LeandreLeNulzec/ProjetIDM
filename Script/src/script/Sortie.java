/**
 */
package script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Sortie#getSorties <em>Sorties</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends ScriptElements {
	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' reference list.
	 * The list contents are of type {@link script.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' reference list.
	 * @see script.ScriptPackage#getSortie_Sorties()
	 * @model
	 * @generated
	 */
	EList<Port> getSorties();

} // Sortie
