/**
 */
package table;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Colonne#getNom <em>Nom</em>}</li>
 *   <li>{@link table.Colonne#getTable <em>Table</em>}</li>
 *   <li>{@link table.Colonne#getElementType <em>Element Type</em>}</li>
 *   <li>{@link table.Colonne#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link table.Colonne#getNbLignes <em>Nb Lignes</em>}</li>
 *   <li>{@link table.Colonne#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getColonne()
 * @model
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * The default value is <code>"colonneSansNom"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see table.TablePackage#getColonne_Nom()
	 * @model default="colonneSansNom" id="true" required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link table.Colonne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link table.Table#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see table.TablePackage#getColonne_Table()
	 * @see table.Table#getColonnes
	 * @model opposite="colonnes" required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link table.Colonne#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link table.ColonnesElementsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see table.ColonnesElementsType
	 * @see #setElementType(ColonnesElementsType)
	 * @see table.TablePackage#getColonne_ElementType()
	 * @model required="true"
	 * @generated
	 */
	ColonnesElementsType getElementType();

	/**
	 * Sets the value of the '{@link table.Colonne#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see table.ColonnesElementsType
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ColonnesElementsType value);

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' reference.
	 * @see #setContraintes(Contrainte)
	 * @see table.TablePackage#getColonne_Contraintes()
	 * @model
	 * @generated
	 */
	Contrainte getContraintes();

	/**
	 * Sets the value of the '{@link table.Colonne#getContraintes <em>Contraintes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraintes</em>' reference.
	 * @see #getContraintes()
	 * @generated
	 */
	void setContraintes(Contrainte value);

	/**
	 * Returns the value of the '<em><b>Nb Lignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Lignes</em>' attribute.
	 * @see #setNbLignes(int)
	 * @see table.TablePackage#getColonne_NbLignes()
	 * @model required="true"
	 * @generated
	 */
	int getNbLignes();

	/**
	 * Sets the value of the '{@link table.Colonne#getNbLignes <em>Nb Lignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Lignes</em>' attribute.
	 * @see #getNbLignes()
	 * @generated
	 */
	void setNbLignes(int value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' reference list.
	 * The list contents are of type {@link table.Contenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' reference list.
	 * @see table.TablePackage#getColonne_Contenu()
	 * @model
	 * @generated
	 */
	EList<Contenu> getContenu();

} // Colonne
