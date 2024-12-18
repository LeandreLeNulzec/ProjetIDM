/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.PortEntree#getPEtoBU <em>PEto BU</em>}</li>
 *   <li>{@link script.PortEntree#getPEtoBB <em>PEto BB</em>}</li>
 *   <li>{@link script.PortEntree#getPEtoBF <em>PEto BF</em>}</li>
 *   <li>{@link script.PortEntree#getNbEntrees <em>Nb Entrees</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getPortEntree()
 * @model
 * @generated
 */
public interface PortEntree extends EObject {
	/**
	 * Returns the value of the '<em><b>PEto BU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEto BU</em>' reference.
	 * @see #setPEtoBU(Bloc_Unaire)
	 * @see script.ScriptPackage#getPortEntree_PEtoBU()
	 * @model
	 * @generated
	 */
	Bloc_Unaire getPEtoBU();

	/**
	 * Sets the value of the '{@link script.PortEntree#getPEtoBU <em>PEto BU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEto BU</em>' reference.
	 * @see #getPEtoBU()
	 * @generated
	 */
	void setPEtoBU(Bloc_Unaire value);

	/**
	 * Returns the value of the '<em><b>PEto BB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEto BB</em>' reference.
	 * @see #setPEtoBB(Bloc_Binaire)
	 * @see script.ScriptPackage#getPortEntree_PEtoBB()
	 * @model
	 * @generated
	 */
	Bloc_Binaire getPEtoBB();

	/**
	 * Sets the value of the '{@link script.PortEntree#getPEtoBB <em>PEto BB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEto BB</em>' reference.
	 * @see #getPEtoBB()
	 * @generated
	 */
	void setPEtoBB(Bloc_Binaire value);

	/**
	 * Returns the value of the '<em><b>PEto BF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEto BF</em>' reference.
	 * @see #setPEtoBF(Bloc_Fonction)
	 * @see script.ScriptPackage#getPortEntree_PEtoBF()
	 * @model
	 * @generated
	 */
	Bloc_Fonction getPEtoBF();

	/**
	 * Sets the value of the '{@link script.PortEntree#getPEtoBF <em>PEto BF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEto BF</em>' reference.
	 * @see #getPEtoBF()
	 * @generated
	 */
	void setPEtoBF(Bloc_Fonction value);

	/**
	 * Returns the value of the '<em><b>Nb Entrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Entrees</em>' attribute.
	 * @see #setNbEntrees(int)
	 * @see script.ScriptPackage#getPortEntree_NbEntrees()
	 * @model
	 * @generated
	 */
	int getNbEntrees();

	/**
	 * Sets the value of the '{@link script.PortEntree#getNbEntrees <em>Nb Entrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Entrees</em>' attribute.
	 * @see #getNbEntrees()
	 * @generated
	 */
	void setNbEntrees(int value);

} // PortEntree
