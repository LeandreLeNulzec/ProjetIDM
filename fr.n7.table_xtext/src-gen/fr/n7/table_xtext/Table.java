/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.Table#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.table_xtext.Table#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link fr.n7.table_xtext.Table#getColonneID <em>Colonne ID</em>}</li>
 *   <li>{@link fr.n7.table_xtext.Table#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see fr.n7.table_xtext.Table_xtextPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.table_xtext.Table_xtextPackage#getTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.table_xtext.Table#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Colonnes</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.table_xtext.Colonnes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colonnes</em>' containment reference list.
   * @see fr.n7.table_xtext.Table_xtextPackage#getTable_Colonnes()
   * @model containment="true"
   * @generated
   */
  EList<Colonnes> getColonnes();

  /**
   * Returns the value of the '<em><b>Colonne ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colonne ID</em>' reference.
   * @see #setColonneID(Colonne)
   * @see fr.n7.table_xtext.Table_xtextPackage#getTable_ColonneID()
   * @model
   * @generated
   */
  Colonne getColonneID();

  /**
   * Sets the value of the '{@link fr.n7.table_xtext.Table#getColonneID <em>Colonne ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colonne ID</em>' reference.
   * @see #getColonneID()
   * @generated
   */
  void setColonneID(Colonne value);

  /**
   * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.table_xtext.Script}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scripts</em>' containment reference list.
   * @see fr.n7.table_xtext.Table_xtextPackage#getTable_Scripts()
   * @model containment="true"
   * @generated
   */
  EList<Script> getScripts();

} // Table
