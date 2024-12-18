/**
 */
package algorithme;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Sortie#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.Sortie#getSortieScript <em>Sortie Script</em>}</li>
 *   <li>{@link algorithme.Sortie#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithme.AlgorithmePackage#getSortie_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Sortie Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie Script</em>' reference.
	 * @see #setSortieScript(script.Sortie)
	 * @see algorithme.AlgorithmePackage#getSortie_SortieScript()
	 * @model
	 * @generated
	 */
	script.Sortie getSortieScript();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getSortieScript <em>Sortie Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie Script</em>' reference.
	 * @see #getSortieScript()
	 * @generated
	 */
	void setSortieScript(script.Sortie value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(float)
	 * @see algorithme.AlgorithmePackage#getSortie_Valeur()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getValeur();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(float value);
} // Sortie
