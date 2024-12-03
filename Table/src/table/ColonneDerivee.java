/**
 */
package table;

import algorithme.Algorithme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Derivee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.ColonneDerivee#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link table.ColonneDerivee#getColonnesEntree <em>Colonnes Entree</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getColonneDerivee()
 * @model
 * @generated
 */
public interface ColonneDerivee extends Colonne {
	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see table.TablePackage#getColonneDerivee_Algorithme()
	 * @model required="true"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link table.ColonneDerivee#getAlgorithme <em>Algorithme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

	/**
	 * Returns the value of the '<em><b>Colonnes Entree</b></em>' reference list.
	 * The list contents are of type {@link table.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes Entree</em>' reference list.
	 * @see table.TablePackage#getColonneDerivee_ColonnesEntree()
	 * @model
	 * @generated
	 */
	EList<Colonne> getColonnesEntree();

} // ColonneDerivee
