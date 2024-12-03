/**
 */
package table;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Contrainte#getParametre <em>Parametre</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getContrainte()
 * @model
 * @generated
 */
public interface Contrainte extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametre</b></em>' attribute.
	 * The literals are from the enumeration {@link table.ColonnesElementsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametre</em>' attribute.
	 * @see table.ColonnesElementsType
	 * @see #setParametre(ColonnesElementsType)
	 * @see table.TablePackage#getContrainte_Parametre()
	 * @model required="true"
	 * @generated
	 */
	ColonnesElementsType getParametre();

	/**
	 * Sets the value of the '{@link table.Contrainte#getParametre <em>Parametre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametre</em>' attribute.
	 * @see table.ColonnesElementsType
	 * @see #getParametre()
	 * @generated
	 */
	void setParametre(ColonnesElementsType value);

} // Contrainte
