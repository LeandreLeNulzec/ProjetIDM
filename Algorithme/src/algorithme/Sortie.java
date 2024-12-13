/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import script.PortEntree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Sortie#getStoPS <em>Sto PS</em>}</li>
 *   <li>{@link algorithme.Sortie#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.Sortie#getStoScr <em>Sto Scr</em>}</li>
 *   <li>{@link algorithme.Sortie#getStoE <em>Sto E</em>}</li>
 *   <li>{@link algorithme.Sortie#getPortEntreeS <em>Port Entree S</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {

	/**
	 * Returns the value of the '<em><b>Sto PS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sto PS</em>' reference.
	 * @see #setStoPS(PortSortie)
	 * @see algorithme.AlgorithmePackage#getSortie_StoPS()
	 * @model required="true"
	 * @generated
	 */
	PortSortie getStoPS();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getStoPS <em>Sto PS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sto PS</em>' reference.
	 * @see #getStoPS()
	 * @generated
	 */
	void setStoPS(PortSortie value);

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
	 * Returns the value of the '<em><b>Sto Scr</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Script#getScrtoS <em>Scrto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sto Scr</em>' container reference.
	 * @see #setStoScr(Script)
	 * @see algorithme.AlgorithmePackage#getSortie_StoScr()
	 * @see algorithme.Script#getScrtoS
	 * @model opposite="ScrtoS" transient="false"
	 * @generated
	 */
	Script getStoScr();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getStoScr <em>Sto Scr</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sto Scr</em>' container reference.
	 * @see #getStoScr()
	 * @generated
	 */
	void setStoScr(Script value);

	/**
	 * Returns the value of the '<em><b>Sto E</b></em>' reference list.
	 * The list contents are of type {@link algorithme.Entree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sto E</em>' reference list.
	 * @see algorithme.AlgorithmePackage#getSortie_StoE()
	 * @model required="true"
	 * @generated
	 */
	EList<Entree> getStoE();

	/**
	 * Returns the value of the '<em><b>Port Entree S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Entree S</em>' reference.
	 * @see #setPortEntreeS(PortEntree)
	 * @see algorithme.AlgorithmePackage#getSortie_PortEntreeS()
	 * @model
	 * @generated
	 */
	PortEntree getPortEntreeS();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getPortEntreeS <em>Port Entree S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Entree S</em>' reference.
	 * @see #getPortEntreeS()
	 * @generated
	 */
	void setPortEntreeS(PortEntree value);
} // Sortie
