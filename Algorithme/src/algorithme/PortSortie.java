/**
 */
package algorithme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.PortSortie#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getPortSortie()
 * @model abstract="true"
 * @generated
 */
public interface PortSortie extends Port {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(Float)
	 * @see algorithme.AlgorithmePackage#getPortSortie_Valeur()
	 * @model default="0.0"
	 * @generated
	 */
	Float getValeur();

	/**
	 * Sets the value of the '{@link algorithme.PortSortie#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(Float value);

} // PortSortie
