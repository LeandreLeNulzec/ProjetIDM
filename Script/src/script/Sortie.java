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
 *   <li>{@link script.Sortie#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends PortSortie {
	/**
	 * Returns the value of the '<em><b>Res</b></em>' attribute list.
	 * The list contents are of type {@link script.Type}.
	 * The literals are from the enumeration {@link script.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' attribute list.
	 * @see script.Type
	 * @see script.ScriptPackage#getSortie_Res()
	 * @model dataType="script.Type"
	 * @generated
	 */
	EList<Type> getRes();

} // Sortie