/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Et</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.Et#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fr.n7.table_xtext.Table_xtextPackage#getEt()
 * @model
 * @generated
 */
public interface Et extends Contrainte
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' reference list.
   * The list contents are of type {@link fr.n7.table_xtext.Contrainte}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' reference list.
   * @see fr.n7.table_xtext.Table_xtextPackage#getEt_Variables()
   * @model
   * @generated
   */
  EList<Contrainte> getVariables();

} // Et