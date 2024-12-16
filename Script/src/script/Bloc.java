/**
 */
package script;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Bloc#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getBloc()
 * @model abstract="true"
 * @generated
 */
public interface Bloc extends ScriptElements {
	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(Port)
	 * @see script.ScriptPackage#getBloc_Sortie()
	 * @model
	 * @generated
	 */
	Port getSortie();

	/**
	 * Sets the value of the '{@link script.Bloc#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Port value);

} // Bloc
