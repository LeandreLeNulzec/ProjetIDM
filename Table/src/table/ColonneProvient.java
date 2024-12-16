/**
 */
package table;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Provient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.ColonneProvient#getTableOrigine <em>Table Origine</em>}</li>
 *   <li>{@link table.ColonneProvient#getRefColonne <em>Ref Colonne</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getColonneProvient()
 * @model
 * @generated
 */
public interface ColonneProvient extends Colonne {
	/**
	 * Returns the value of the '<em><b>Table Origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Origine</em>' reference.
	 * @see #setTableOrigine(Table)
	 * @see table.TablePackage#getColonneProvient_TableOrigine()
	 * @model required="true"
	 * @generated
	 */
	Table getTableOrigine();

	/**
	 * Sets the value of the '{@link table.ColonneProvient#getTableOrigine <em>Table Origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Origine</em>' reference.
	 * @see #getTableOrigine()
	 * @generated
	 */
	void setTableOrigine(Table value);

	/**
	 * Returns the value of the '<em><b>Ref Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Colonne</em>' attribute.
	 * @see #setRefColonne(String)
	 * @see table.TablePackage#getColonneProvient_RefColonne()
	 * @model required="true"
	 * @generated
	 */
	String getRefColonne();

	/**
	 * Sets the value of the '{@link table.ColonneProvient#getRefColonne <em>Ref Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Colonne</em>' attribute.
	 * @see #getRefColonne()
	 * @generated
	 */
	void setRefColonne(String value);

} // ColonneProvient
