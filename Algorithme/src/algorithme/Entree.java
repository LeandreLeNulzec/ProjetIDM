/**
 */
package algorithme;

import org.eclipse.emf.ecore.EObject;

import script.PortSortie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Entree#getValeur <em>Valeur</em>}</li>
 *   <li>{@link algorithme.Entree#getEtoS <em>Eto S</em>}</li>
 *   <li>{@link algorithme.Entree#getPortSortieS <em>Port Sortie S</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getEntree()
 * @model abstract="true"
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(float)
	 * @see algorithme.AlgorithmePackage#getEntree_Valeur()
	 * @model default="0.0"
	 * @generated
	 */
	float getValeur();

	/**
	 * Sets the value of the '{@link algorithme.Entree#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(float value);

	/**
	 * Returns the value of the '<em><b>Eto S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eto S</em>' reference.
	 * @see #setEtoS(Sortie)
	 * @see algorithme.AlgorithmePackage#getEntree_EtoS()
	 * @model
	 * @generated
	 */
	Sortie getEtoS();

	/**
	 * Sets the value of the '{@link algorithme.Entree#getEtoS <em>Eto S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eto S</em>' reference.
	 * @see #getEtoS()
	 * @generated
	 */
	void setEtoS(Sortie value);

	/**
	 * Returns the value of the '<em><b>Port Sortie S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Sortie S</em>' reference.
	 * @see #setPortSortieS(PortSortie)
	 * @see algorithme.AlgorithmePackage#getEntree_PortSortieS()
	 * @model
	 * @generated
	 */
	PortSortie getPortSortieS();

	/**
	 * Sets the value of the '{@link algorithme.Entree#getPortSortieS <em>Port Sortie S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Sortie S</em>' reference.
	 * @see #getPortSortieS()
	 * @generated
	 */
	void setPortSortieS(PortSortie value);

} // Entree
