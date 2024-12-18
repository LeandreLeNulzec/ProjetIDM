/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.PortSortie#getPStoBU <em>PSto BU</em>}</li>
 *   <li>{@link script.PortSortie#getPStoBB <em>PSto BB</em>}</li>
 *   <li>{@link script.PortSortie#getPStoBF <em>PSto BF</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getPortSortie()
 * @model
 * @generated
 */
public interface PortSortie extends EObject {
	/**
	 * Returns the value of the '<em><b>PSto BU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSto BU</em>' reference.
	 * @see #setPStoBU(Bloc_Unaire)
	 * @see script.ScriptPackage#getPortSortie_PStoBU()
	 * @model
	 * @generated
	 */
	Bloc_Unaire getPStoBU();

	/**
	 * Sets the value of the '{@link script.PortSortie#getPStoBU <em>PSto BU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSto BU</em>' reference.
	 * @see #getPStoBU()
	 * @generated
	 */
	void setPStoBU(Bloc_Unaire value);

	/**
	 * Returns the value of the '<em><b>PSto BB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSto BB</em>' reference.
	 * @see #setPStoBB(Bloc_Binaire)
	 * @see script.ScriptPackage#getPortSortie_PStoBB()
	 * @model
	 * @generated
	 */
	Bloc_Binaire getPStoBB();

	/**
	 * Sets the value of the '{@link script.PortSortie#getPStoBB <em>PSto BB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSto BB</em>' reference.
	 * @see #getPStoBB()
	 * @generated
	 */
	void setPStoBB(Bloc_Binaire value);

	/**
	 * Returns the value of the '<em><b>PSto BF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSto BF</em>' reference.
	 * @see #setPStoBF(Bloc_Fonction)
	 * @see script.ScriptPackage#getPortSortie_PStoBF()
	 * @model
	 * @generated
	 */
	Bloc_Fonction getPStoBF();

	/**
	 * Sets the value of the '{@link script.PortSortie#getPStoBF <em>PSto BF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSto BF</em>' reference.
	 * @see #getPStoBF()
	 * @generated
	 */
	void setPStoBF(Bloc_Fonction value);

} // PortSortie
