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
import script.PortSortie;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Sortie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.PortSortieImpl#getPStoBU <em>PSto BU</em>}</li>
 *   <li>{@link script.impl.PortSortieImpl#getPStoBB <em>PSto BB</em>}</li>
 *   <li>{@link script.impl.PortSortieImpl#getPStoBF <em>PSto BF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortSortieImpl extends MinimalEObjectImpl.Container implements PortSortie {
	/**
	 * The cached value of the '{@link #getPStoBU() <em>PSto BU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStoBU()
	 * @generated
	 * @ordered
	 */
	protected Bloc_Unaire pStoBU;

	/**
	 * The cached value of the '{@link #getPStoBB() <em>PSto BB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStoBB()
	 * @generated
	 * @ordered
	 */
	protected Bloc_Binaire pStoBB;

	/**
	 * The cached value of the '{@link #getPStoBF() <em>PSto BF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStoBF()
	 * @generated
	 * @ordered
	 */
	protected Bloc_Fonction pStoBF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSortieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.PORT_SORTIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc_Unaire getPStoBU() {
		if (pStoBU != null && pStoBU.eIsProxy()) {
			InternalEObject oldPStoBU = (InternalEObject)pStoBU;
			pStoBU = (Bloc_Unaire)eResolveProxy(oldPStoBU);
			if (pStoBU != oldPStoBU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.PORT_SORTIE__PSTO_BU, oldPStoBU, pStoBU));
			}
		}
		return pStoBU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_Unaire basicGetPStoBU() {
		return pStoBU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPStoBU(Bloc_Unaire newPStoBU) {
		Bloc_Unaire oldPStoBU = pStoBU;
		pStoBU = newPStoBU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.PORT_SORTIE__PSTO_BU, oldPStoBU, pStoBU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc_Binaire getPStoBB() {
		if (pStoBB != null && pStoBB.eIsProxy()) {
			InternalEObject oldPStoBB = (InternalEObject)pStoBB;
			pStoBB = (Bloc_Binaire)eResolveProxy(oldPStoBB);
			if (pStoBB != oldPStoBB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.PORT_SORTIE__PSTO_BB, oldPStoBB, pStoBB));
			}
		}
		return pStoBB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_Binaire basicGetPStoBB() {
		return pStoBB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPStoBB(Bloc_Binaire newPStoBB) {
		Bloc_Binaire oldPStoBB = pStoBB;
		pStoBB = newPStoBB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.PORT_SORTIE__PSTO_BB, oldPStoBB, pStoBB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc_Fonction getPStoBF() {
		if (pStoBF != null && pStoBF.eIsProxy()) {
			InternalEObject oldPStoBF = (InternalEObject)pStoBF;
			pStoBF = (Bloc_Fonction)eResolveProxy(oldPStoBF);
			if (pStoBF != oldPStoBF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.PORT_SORTIE__PSTO_BF, oldPStoBF, pStoBF));
			}
		}
		return pStoBF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_Fonction basicGetPStoBF() {
		return pStoBF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPStoBF(Bloc_Fonction newPStoBF) {
		Bloc_Fonction oldPStoBF = pStoBF;
		pStoBF = newPStoBF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.PORT_SORTIE__PSTO_BF, oldPStoBF, pStoBF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.PORT_SORTIE__PSTO_BU:
				if (resolve) return getPStoBU();
				return basicGetPStoBU();
			case ScriptPackage.PORT_SORTIE__PSTO_BB:
				if (resolve) return getPStoBB();
				return basicGetPStoBB();
			case ScriptPackage.PORT_SORTIE__PSTO_BF:
				if (resolve) return getPStoBF();
				return basicGetPStoBF();
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
			case ScriptPackage.PORT_SORTIE__PSTO_BU:
				setPStoBU((Bloc_Unaire)newValue);
				return;
			case ScriptPackage.PORT_SORTIE__PSTO_BB:
				setPStoBB((Bloc_Binaire)newValue);
				return;
			case ScriptPackage.PORT_SORTIE__PSTO_BF:
				setPStoBF((Bloc_Fonction)newValue);
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
			case ScriptPackage.PORT_SORTIE__PSTO_BU:
				setPStoBU((Bloc_Unaire)null);
				return;
			case ScriptPackage.PORT_SORTIE__PSTO_BB:
				setPStoBB((Bloc_Binaire)null);
				return;
			case ScriptPackage.PORT_SORTIE__PSTO_BF:
				setPStoBF((Bloc_Fonction)null);
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
			case ScriptPackage.PORT_SORTIE__PSTO_BU:
				return pStoBU != null;
			case ScriptPackage.PORT_SORTIE__PSTO_BB:
				return pStoBB != null;
			case ScriptPackage.PORT_SORTIE__PSTO_BF:
				return pStoBF != null;
		}
		return super.eIsSet(featureID);
	}

} //PortSortieImpl
