/**
 */
package script.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import script.Bloc_Binaire;
import script.Bloc_Fonction;
import script.Bloc_Unaire;
import script.PortEntree;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.PortEntreeImpl#getPEtoBU <em>PEto BU</em>}</li>
 *   <li>{@link script.impl.PortEntreeImpl#getPEtoBB <em>PEto BB</em>}</li>
 *   <li>{@link script.impl.PortEntreeImpl#getPEtoBF <em>PEto BF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortEntreeImpl extends MinimalEObjectImpl.Container implements PortEntree {
	/**
	 * The cached value of the '{@link #getPEtoBU() <em>PEto BU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEtoBU()
	 * @generated
	 * @ordered
	 */
	protected Bloc_Unaire pEtoBU;

	/**
	 * The cached value of the '{@link #getPEtoBB() <em>PEto BB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEtoBB()
	 * @generated
	 * @ordered
	 */
	protected Bloc_Binaire pEtoBB;

	/**
	 * The cached value of the '{@link #getPEtoBF() <em>PEto BF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEtoBF()
	 * @generated
	 * @ordered
	 */
	protected Bloc_Fonction pEtoBF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortEntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.PORT_ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc_Unaire getPEtoBU() {
		if (pEtoBU != null && pEtoBU.eIsProxy()) {
			InternalEObject oldPEtoBU = (InternalEObject)pEtoBU;
			pEtoBU = (Bloc_Unaire)eResolveProxy(oldPEtoBU);
			if (pEtoBU != oldPEtoBU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.PORT_ENTREE__PETO_BU, oldPEtoBU, pEtoBU));
			}
		}
		return pEtoBU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_Unaire basicGetPEtoBU() {
		return pEtoBU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEtoBU(Bloc_Unaire newPEtoBU) {
		Bloc_Unaire oldPEtoBU = pEtoBU;
		pEtoBU = newPEtoBU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.PORT_ENTREE__PETO_BU, oldPEtoBU, pEtoBU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc_Binaire getPEtoBB() {
		if (pEtoBB != null && pEtoBB.eIsProxy()) {
			InternalEObject oldPEtoBB = (InternalEObject)pEtoBB;
			pEtoBB = (Bloc_Binaire)eResolveProxy(oldPEtoBB);
			if (pEtoBB != oldPEtoBB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.PORT_ENTREE__PETO_BB, oldPEtoBB, pEtoBB));
			}
		}
		return pEtoBB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_Binaire basicGetPEtoBB() {
		return pEtoBB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEtoBB(Bloc_Binaire newPEtoBB) {
		Bloc_Binaire oldPEtoBB = pEtoBB;
		pEtoBB = newPEtoBB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.PORT_ENTREE__PETO_BB, oldPEtoBB, pEtoBB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc_Fonction getPEtoBF() {
		if (pEtoBF != null && pEtoBF.eIsProxy()) {
			InternalEObject oldPEtoBF = (InternalEObject)pEtoBF;
			pEtoBF = (Bloc_Fonction)eResolveProxy(oldPEtoBF);
			if (pEtoBF != oldPEtoBF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.PORT_ENTREE__PETO_BF, oldPEtoBF, pEtoBF));
			}
		}
		return pEtoBF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_Fonction basicGetPEtoBF() {
		return pEtoBF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEtoBF(Bloc_Fonction newPEtoBF) {
		Bloc_Fonction oldPEtoBF = pEtoBF;
		pEtoBF = newPEtoBF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.PORT_ENTREE__PETO_BF, oldPEtoBF, pEtoBF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.PORT_ENTREE__PETO_BU:
				if (resolve) return getPEtoBU();
				return basicGetPEtoBU();
			case ScriptPackage.PORT_ENTREE__PETO_BB:
				if (resolve) return getPEtoBB();
				return basicGetPEtoBB();
			case ScriptPackage.PORT_ENTREE__PETO_BF:
				if (resolve) return getPEtoBF();
				return basicGetPEtoBF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScriptPackage.PORT_ENTREE__PETO_BU:
				setPEtoBU((Bloc_Unaire)newValue);
				return;
			case ScriptPackage.PORT_ENTREE__PETO_BB:
				setPEtoBB((Bloc_Binaire)newValue);
				return;
			case ScriptPackage.PORT_ENTREE__PETO_BF:
				setPEtoBF((Bloc_Fonction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScriptPackage.PORT_ENTREE__PETO_BU:
				setPEtoBU((Bloc_Unaire)null);
				return;
			case ScriptPackage.PORT_ENTREE__PETO_BB:
				setPEtoBB((Bloc_Binaire)null);
				return;
			case ScriptPackage.PORT_ENTREE__PETO_BF:
				setPEtoBF((Bloc_Fonction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScriptPackage.PORT_ENTREE__PETO_BU:
				return pEtoBU != null;
			case ScriptPackage.PORT_ENTREE__PETO_BB:
				return pEtoBB != null;
			case ScriptPackage.PORT_ENTREE__PETO_BF:
				return pEtoBF != null;
		}
		return super.eIsSet(featureID);
	}

} //PortEntreeImpl
