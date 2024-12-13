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
 *   <li>{@link algorithme.Algorithme#getAtoAE <em>Ato AE</em>}</li>
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
	 * Returns the value of the '<em><b>Ato AE</b></em>' containment reference list.
	 * The list contents are of type {@link algorithme.AlgorithmeElements}.
	 * It is bidirectional and its opposite is '{@link algorithme.AlgorithmeElements#getAEtoA <em>AEto A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ato AE</em>' containment reference list.
	 * @see algorithme.AlgorithmePackage#getAlgorithme_AtoAE()
	 * @see algorithme.AlgorithmeElements#getAEtoA
	 * @model opposite="AEtoA" containment="true"
	 * @generated
	 */
	EList<AlgorithmeElements> getAtoAE();
} // Algorithme
