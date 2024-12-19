/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.Predicat#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fr.n7.table_xtext.Table_xtextPackage#getPredicat()
 * @model
 * @generated
 */
public interface Predicat extends Contrainte
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * The literals are from the enumeration {@link fr.n7.table_xtext.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see fr.n7.table_xtext.Condition
   * @see #setCondition(Condition)
   * @see fr.n7.table_xtext.Table_xtextPackage#getPredicat_Condition()
   * @model
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link fr.n7.table_xtext.Predicat#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see fr.n7.table_xtext.Condition
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

} // Predicat