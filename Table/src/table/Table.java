/**
 */
package table;

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
 *   <li>{@link table.Table#getNom <em>Nom</em>}</li>
 *   <li>{@link table.Table#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link table.Table#getIdColonne <em>Id Colonne</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * The default value is <code>"tableSansNom"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see table.TablePackage#getTable_Nom()
	 * @model default="tableSansNom" required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link table.Table#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Colonnes</b></em>' reference list.
	 * The list contents are of type {@link table.Colonne}.
	 * It is bidirectional and its opposite is '{@link table.Colonne#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes</em>' reference list.
	 * @see table.TablePackage#getTable_Colonnes()
	 * @see table.Colonne#getTable
	 * @model opposite="table"
	 * @generated
	 */
	EList<Colonne> getColonnes();

	/**
	 * Returns the value of the '<em><b>Id Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Colonne</em>' reference.
	 * @see #setIdColonne(Colonne)
	 * @see table.TablePackage#getTable_IdColonne()
	 * @model required="true"
	 * @generated
	 */
	Colonne getIdColonne();

	/**
	 * Sets the value of the '{@link table.Table#getIdColonne <em>Id Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Colonne</em>' reference.
	 * @see #getIdColonne()
	 * @generated
	 */
	void setIdColonne(Colonne value);

} // Table
