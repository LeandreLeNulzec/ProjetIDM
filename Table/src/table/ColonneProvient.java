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
 *   <li>{@link table.ColonneProvient#getColonneOrigine <em>Colonne Origine</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getColonneProvient()
 * @model
 * @generated
 */
public interface ColonneProvient extends Colonne {
	/**
	 * Returns the value of the '<em><b>Colonne Origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne Origine</em>' reference.
	 * @see #setColonneOrigine(Colonne)
	 * @see table.TablePackage#getColonneProvient_ColonneOrigine()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonneOrigine();

	/**
	 * Sets the value of the '{@link table.ColonneProvient#getColonneOrigine <em>Colonne Origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne Origine</em>' reference.
	 * @see #getColonneOrigine()
	 * @generated
	 */
	void setColonneOrigine(Colonne value);

} // ColonneProvient
