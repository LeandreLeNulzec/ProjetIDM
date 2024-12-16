/**
 */
package script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc_Binaire#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc_Binaire()
 * @model abstract="true"
 * @generated
 */
public interface Bloc_Binaire extends Bloc {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' reference list.
	 * The list contents are of type {@link script.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' reference list.
	 * @see script.ScriptPackage#getBloc_Binaire_Entrees()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getEntrees();

} // Bloc_Binaire
