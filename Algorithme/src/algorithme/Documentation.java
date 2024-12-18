/**
 */
package algorithme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Documentation#getTexte <em>Texte</em>}</li>
 *   <li>{@link algorithme.Documentation#getDocuElement <em>Docu Element</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends AlgorithmeElements {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see algorithme.AlgorithmePackage#getDocumentation_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link algorithme.Documentation#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Docu Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docu Element</em>' reference.
	 * @see #setDocuElement(AlgorithmeElements)
	 * @see algorithme.AlgorithmePackage#getDocumentation_DocuElement()
	 * @model
	 * @generated
	 */
	AlgorithmeElements getDocuElement();

	/**
	 * Sets the value of the '{@link algorithme.Documentation#getDocuElement <em>Docu Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docu Element</em>' reference.
	 * @see #getDocuElement()
	 * @generated
	 */
	void setDocuElement(AlgorithmeElements value);

} // Documentation
