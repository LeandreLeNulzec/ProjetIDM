/**
 */
package algorithme;

import script.Script;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Ressources#getChemin <em>Chemin</em>}</li>
 *   <li>{@link algorithme.Ressources#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getRessources()
 * @model
 * @generated
 */
public interface Ressources extends AlgorithmeElements {
	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see algorithme.AlgorithmePackage#getRessources_Chemin()
	 * @model
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link algorithme.Ressources#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(Script)
	 * @see algorithme.AlgorithmePackage#getRessources_Script()
	 * @model
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link algorithme.Ressources#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // Ressources
