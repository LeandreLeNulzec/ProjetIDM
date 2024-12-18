/**
 */
package script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc_Fonction#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc_Fonction()
 * @model abstract="true"
 * @generated
 */
public interface Bloc_Fonction extends Bloc {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' reference list.
	 * The list contents are of type {@link script.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' reference list.
	 * @see script.ScriptPackage#getBloc_Fonction_Entrees()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getEntrees();

} // Bloc_Fonction
