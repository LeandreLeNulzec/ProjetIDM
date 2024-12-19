/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.Argument#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @see fr.n7.table_xtext.Table_xtextPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends ScriptElements
{
  /**
   * Returns the value of the '<em><b>Entree</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entree</em>' reference.
   * @see #setEntree(Colonne)
   * @see fr.n7.table_xtext.Table_xtextPackage#getArgument_Entree()
   * @model
   * @generated
   */
  Colonne getEntree();

  /**
   * Sets the value of the '{@link fr.n7.table_xtext.Argument#getEntree <em>Entree</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entree</em>' reference.
   * @see #getEntree()
   * @generated
   */
  void setEntree(Colonne value);

} // Argument