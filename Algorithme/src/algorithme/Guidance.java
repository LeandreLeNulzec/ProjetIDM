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
 *   <li>{@link algorithme.Guidance#getTexte <em>Texte</em>}</li>
 *   <li>{@link algorithme.Guidance#getGtoAE <em>Gto AE</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getGuidance()
 * @model
 * @generated
 */
public interface Guidance extends AlgorithmeElements {
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

	/**
	 * Returns the value of the '<em><b>Gto AE</b></em>' reference list.
	 * The list contents are of type {@link algorithme.AlgorithmeElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gto AE</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getGuidance_GtoAE()
	 * @model
	 * @generated
	 */
	EList<AlgorithmeElements> getGtoAE();

} // Guidance
