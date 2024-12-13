/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Argument;
import algorithme.Entree;
import algorithme.PortEntree;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.PortEntreeImpl#getPEtoE <em>PEto E</em>}</li>
 *   <li>{@link algorithme.impl.PortEntreeImpl#getPStoArg <em>PSto Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortEntreeImpl extends PortImpl implements PortEntree {
	/**
	 * The cached value of the '{@link #getPEtoE() <em>PEto E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEtoE()
	 * @generated
	 * @ordered
	 */
	protected Entree pEtoE;

	/**
	 * The cached value of the '{@link #getPStoArg() <em>PSto Arg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStoArg()
	 * @generated
	 * @ordered
	 */
	protected Argument pStoArg;

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
		return AlgorithmePackage.Literals.PORT_ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entree getPEtoE() {
		if (pEtoE != null && pEtoE.eIsProxy()) {
			InternalEObject oldPEtoE = (InternalEObject)pEtoE;
			pEtoE = (Entree)eResolveProxy(oldPEtoE);
			if (pEtoE != oldPEtoE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.PORT_ENTREE__PETO_E, oldPEtoE, pEtoE));
			}
		}
		return pEtoE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree basicGetPEtoE() {
		return pEtoE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEtoE(Entree newPEtoE) {
		Entree oldPEtoE = pEtoE;
		pEtoE = newPEtoE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.PORT_ENTREE__PETO_E, oldPEtoE, pEtoE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Argument getPStoArg() {
		if (pStoArg != null && pStoArg.eIsProxy()) {
			InternalEObject oldPStoArg = (InternalEObject)pStoArg;
			pStoArg = (Argument)eResolveProxy(oldPStoArg);
			if (pStoArg != oldPStoArg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.PORT_ENTREE__PSTO_ARG, oldPStoArg, pStoArg));
			}
		}
		return pStoArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetPStoArg() {
		return pStoArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPStoArg(Argument newPStoArg) {
		Argument oldPStoArg = pStoArg;
		pStoArg = newPStoArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.PORT_ENTREE__PSTO_ARG, oldPStoArg, pStoArg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.PORT_ENTREE__PETO_E:
				if (resolve) return getPEtoE();
				return basicGetPEtoE();
			case AlgorithmePackage.PORT_ENTREE__PSTO_ARG:
				if (resolve) return getPStoArg();
				return basicGetPStoArg();
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
			case AlgorithmePackage.PORT_ENTREE__PETO_E:
				setPEtoE((Entree)newValue);
				return;
			case AlgorithmePackage.PORT_ENTREE__PSTO_ARG:
				setPStoArg((Argument)newValue);
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
			case AlgorithmePackage.PORT_ENTREE__PETO_E:
				setPEtoE((Entree)null);
				return;
			case AlgorithmePackage.PORT_ENTREE__PSTO_ARG:
				setPStoArg((Argument)null);
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
			case AlgorithmePackage.PORT_ENTREE__PETO_E:
				return pEtoE != null;
			case AlgorithmePackage.PORT_ENTREE__PSTO_ARG:
				return pStoArg != null;
		}
		return super.eIsSet(featureID);
	}

} //PortEntreeImpl
