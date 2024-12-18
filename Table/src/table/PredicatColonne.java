/**
 */
package table;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicat Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.PredicatColonne#getColonneComparante <em>Colonne Comparante</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getPredicatColonne()
 * @model
 * @generated
 */
public interface PredicatColonne extends Predicat {
	/**
	 * Returns the value of the '<em><b>Colonne Comparante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne Comparante</em>' reference.
	 * @see #setColonneComparante(Colonne)
	 * @see table.TablePackage#getPredicatColonne_ColonneComparante()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonneComparante();

	/**
	 * Sets the value of the '{@link table.PredicatColonne#getColonneComparante <em>Colonne Comparante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne Comparante</em>' reference.
	 * @see #getColonneComparante()
	 * @generated
	 */
	void setColonneComparante(Colonne value);

} // PredicatColonne
