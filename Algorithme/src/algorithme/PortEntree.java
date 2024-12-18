/**
 */
package algorithme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.PortEntree#getPEtoE <em>PEto E</em>}</li>
 *   <li>{@link algorithme.PortEntree#getPStoArg <em>PSto Arg</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getPortEntree()
 * @model
 * @generated
 */
public interface PortEntree extends Port {
	/**
	 * Returns the value of the '<em><b>PEto E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEto E</em>' reference.
	 * @see #setPEtoE(Entree)
	 * @see algorithme.AlgorithmePackage#getPortEntree_PEtoE()
	 * @model required="true"
	 * @generated
	 */
	Entree getPEtoE();

	/**
	 * Sets the value of the '{@link algorithme.PortEntree#getPEtoE <em>PEto E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEto E</em>' reference.
	 * @see #getPEtoE()
	 * @generated
	 */
	void setPEtoE(Entree value);

	/**
	 * Returns the value of the '<em><b>PSto Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSto Arg</em>' reference.
	 * @see #setPStoArg(Argument)
	 * @see algorithme.AlgorithmePackage#getPortEntree_PStoArg()
	 * @model
	 * @generated
	 */
	Argument getPStoArg();

	/**
	 * Sets the value of the '{@link algorithme.PortEntree#getPStoArg <em>PSto Arg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSto Arg</em>' reference.
	 * @see #getPStoArg()
	 * @generated
	 */
	void setPStoArg(Argument value);

} // PortEntree
