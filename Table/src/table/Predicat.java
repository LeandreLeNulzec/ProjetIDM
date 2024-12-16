/**
 */
package table;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Predicat#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getPredicat()
 * @model abstract="true"
 * @generated
 */
public interface Predicat extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link table.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see table.Condition
	 * @see #setCondition(Condition)
	 * @see table.TablePackage#getPredicat_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link table.Predicat#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see table.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Predicat
