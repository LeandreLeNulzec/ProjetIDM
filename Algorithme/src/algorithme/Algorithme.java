/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Algorithme#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.Algorithme#getEntreeGlobale <em>Entree Globale</em>}</li>
 *   <li>{@link algorithme.Algorithme#getSortieGlobale <em>Sortie Globale</em>}</li>
 *   <li>{@link algorithme.Algorithme#getAlgorithmeElements <em>Algorithme Elements</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getAlgorithme()
 * @model
 * @generated
 */
public interface Algorithme extends EObject {

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Entree Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree Globale</em>' reference.
	 * @see #setEntreeGlobale(Entree)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_EntreeGlobale()
	 * @model
	 * @generated
	 */
	Entree getEntreeGlobale();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getEntreeGlobale <em>Entree Globale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree Globale</em>' reference.
	 * @see #getEntreeGlobale()
	 * @generated
	 */
	void setEntreeGlobale(Entree value);

	/**
	 * Returns the value of the '<em><b>Sortie Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie Globale</em>' reference.
	 * @see #setSortieGlobale(Sortie)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_SortieGlobale()
	 * @model
	 * @generated
	 */
	Sortie getSortieGlobale();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getSortieGlobale <em>Sortie Globale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie Globale</em>' reference.
	 * @see #getSortieGlobale()
	 * @generated
	 */
	void setSortieGlobale(Sortie value);

	/**
	 * Returns the value of the '<em><b>Algorithme Elements</b></em>' containment reference list.
	 * The list contents are of type {@link algorithme.AlgorithmeElements}.
	 * It is bidirectional and its opposite is '{@link algorithme.AlgorithmeElements#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme Elements</em>' containment reference list.
	 * @see algorithme.AlgorithmePackage#getAlgorithme_AlgorithmeElements()
	 * @see algorithme.AlgorithmeElements#getAlgorithme
	 * @model opposite="algorithme" containment="true"
	 * @generated
	 */
	EList<AlgorithmeElements> getAlgorithmeElements();
} // Algorithme
