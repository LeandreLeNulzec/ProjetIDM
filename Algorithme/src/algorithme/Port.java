/**
 */
package algorithme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Port#getPtoR <em>Pto R</em>}</li>
 *   <li>{@link algorithme.Port#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Pto R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Ressources#getRtoP <em>Rto P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pto R</em>' container reference.
	 * @see #setPtoR(Ressources)
	 * @see algorithme.AlgorithmePackage#getPort_PtoR()
	 * @see algorithme.Ressources#getRtoP
	 * @model opposite="RtoP" transient="false"
	 * @generated
	 */
	Ressources getPtoR();

	/**
	 * Sets the value of the '{@link algorithme.Port#getPtoR <em>Pto R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pto R</em>' container reference.
	 * @see #getPtoR()
	 * @generated
	 */
	void setPtoR(Ressources value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithme.AlgorithmePackage#getPort_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithme.Port#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Port
