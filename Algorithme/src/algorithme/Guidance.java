/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Guidance#getElements <em>Elements</em>}</li>
 *   <li>{@link algorithme.Guidance#getTexte <em>Texte</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getGuidance()
 * @model
 * @generated
 */
public interface Guidance extends Algorithme {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link algorithme.Algorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getGuidance_Elements()
	 * @model
	 * @generated
	 */
	EList<Algorithme> getElements();

	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see algorithme.AlgorithmePackage#getGuidance_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link algorithme.Guidance#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

} // Guidance
