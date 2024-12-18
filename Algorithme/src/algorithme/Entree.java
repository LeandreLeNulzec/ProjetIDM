/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Entree#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.Entree#getValeur <em>Valeur</em>}</li>
 *   <li>{@link algorithme.Entree#getEntreeScript <em>Entree Script</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithme.AlgorithmePackage#getEntree_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithme.Entree#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute list.
	 * @see algorithme.AlgorithmePackage#getEntree_Valeur()
	 * @model default="0.0"
	 * @generated
	 */
	EList<Float> getValeur();

	/**
	 * Returns the value of the '<em><b>Entree Script</b></em>' reference list.
	 * The list contents are of type {@link script.Entree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree Script</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getEntree_EntreeScript()
	 * @model required="true"
	 * @generated
	 */
	EList<script.Entree> getEntreeScript();

} // Entree
