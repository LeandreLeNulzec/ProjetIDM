/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Ressources#getRtoP <em>Rto P</em>}</li>
 *   <li>{@link algorithme.Ressources#getChemin <em>Chemin</em>}</li>
 *   <li>{@link algorithme.Ressources#getTypeRes <em>Type Res</em>}</li>
 *   <li>{@link algorithme.Ressources#getRtoScr <em>Rto Scr</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getRessources()
 * @model
 * @generated
 */
public interface Ressources extends AlgorithmeElements {
	/**
	 * Returns the value of the '<em><b>Rto P</b></em>' containment reference list.
	 * The list contents are of type {@link algorithme.Port}.
	 * It is bidirectional and its opposite is '{@link algorithme.Port#getPtoR <em>Pto R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rto P</em>' containment reference list.
	 * @see algorithme.AlgorithmePackage#getRessources_RtoP()
	 * @see algorithme.Port#getPtoR
	 * @model opposite="PtoR" containment="true"
	 * @generated
	 */
	EList<Port> getRtoP();

	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see algorithme.AlgorithmePackage#getRessources_Chemin()
	 * @model required="true"
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link algorithme.Ressources#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

	/**
	 * Returns the value of the '<em><b>Type Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Res</em>' attribute.
	 * @see #setTypeRes(Object)
	 * @see algorithme.AlgorithmePackage#getRessources_TypeRes()
	 * @model dataType="algorithme.Calculs"
	 * @generated
	 */
	Object getTypeRes();

	/**
	 * Sets the value of the '{@link algorithme.Ressources#getTypeRes <em>Type Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Res</em>' attribute.
	 * @see #getTypeRes()
	 * @generated
	 */
	void setTypeRes(Object value);

	/**
	 * Returns the value of the '<em><b>Rto Scr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rto Scr</em>' reference.
	 * @see #setRtoScr(Script)
	 * @see algorithme.AlgorithmePackage#getRessources_RtoScr()
	 * @model
	 * @generated
	 */
	Script getRtoScr();

	/**
	 * Sets the value of the '{@link algorithme.Ressources#getRtoScr <em>Rto Scr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rto Scr</em>' reference.
	 * @see #getRtoScr()
	 * @generated
	 */
	void setRtoScr(Script value);

} // Ressources
