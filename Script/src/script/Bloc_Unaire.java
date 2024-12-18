/**
 */
package script;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc_Unaire#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc_Unaire()
 * @model abstract="true"
 * @generated
 */
public interface Bloc_Unaire extends Bloc {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' reference.
	 * @see #setEntrees(Port)
	 * @see script.ScriptPackage#getBloc_Unaire_Entrees()
	 * @model required="true"
	 * @generated
	 */
	Port getEntrees();

	/**
	 * Sets the value of the '{@link script.Bloc_Unaire#getEntrees <em>Entrees</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrees</em>' reference.
	 * @see #getEntrees()
	 * @generated
	 */
	void setEntrees(Port value);

} // Bloc_Unaire
