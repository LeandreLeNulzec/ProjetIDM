/**
 */
package table;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicat Valeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.PredicatValeur#getComparant <em>Comparant</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getPredicatValeur()
 * @model
 * @generated
 */
public interface PredicatValeur extends Predicat {
	/**
	 * Returns the value of the '<em><b>Comparant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparant</em>' attribute.
	 * @see #setComparant(float)
	 * @see table.TablePackage#getPredicatValeur_Comparant()
	 * @model required="true"
	 * @generated
	 */
	float getComparant();

	/**
	 * Sets the value of the '{@link table.PredicatValeur#getComparant <em>Comparant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparant</em>' attribute.
	 * @see #getComparant()
	 * @generated
	 */
	void setComparant(float value);

} // PredicatValeur
