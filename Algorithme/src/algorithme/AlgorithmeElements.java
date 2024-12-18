/**
 */
package algorithme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.AlgorithmeElements#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getAlgorithmeElements()
 * @model abstract="true"
 * @generated
 */
public interface AlgorithmeElements extends Algorithme {
	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Algorithme#getAlgorithmeElements <em>Algorithme Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' container reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see algorithme.AlgorithmePackage#getAlgorithmeElements_Algorithme()
	 * @see algorithme.Algorithme#getAlgorithmeElements
	 * @model opposite="algorithmeElements" transient="false"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link algorithme.AlgorithmeElements#getAlgorithme <em>Algorithme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' container reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // AlgorithmeElements
