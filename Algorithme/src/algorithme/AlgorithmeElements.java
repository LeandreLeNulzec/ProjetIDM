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
 *   <li>{@link algorithme.AlgorithmeElements#getAEtoA <em>AEto A</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getAlgorithmeElements()
 * @model abstract="true"
 * @generated
 */
public interface AlgorithmeElements extends Algorithme {
	/**
	 * Returns the value of the '<em><b>AEto A</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Algorithme#getAtoAE <em>Ato AE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEto A</em>' container reference.
	 * @see #setAEtoA(Algorithme)
	 * @see algorithme.AlgorithmePackage#getAlgorithmeElements_AEtoA()
	 * @see algorithme.Algorithme#getAtoAE
	 * @model opposite="AtoAE" transient="false"
	 * @generated
	 */
	Algorithme getAEtoA();

	/**
	 * Sets the value of the '{@link algorithme.AlgorithmeElements#getAEtoA <em>AEto A</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEto A</em>' container reference.
	 * @see #getAEtoA()
	 * @generated
	 */
	void setAEtoA(Algorithme value);

} // AlgorithmeElements
