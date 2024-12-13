/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Port;
import algorithme.Ressources;

import algorithme.Script;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.RessourcesImpl#getRtoP <em>Rto P</em>}</li>
 *   <li>{@link algorithme.impl.RessourcesImpl#getChemin <em>Chemin</em>}</li>
 *   <li>{@link algorithme.impl.RessourcesImpl#getTypeRes <em>Type Res</em>}</li>
 *   <li>{@link algorithme.impl.RessourcesImpl#getRtoScr <em>Rto Scr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourcesImpl extends AlgorithmeElementsImpl implements Ressources {
	/**
	 * The cached value of the '{@link #getRtoP() <em>Rto P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoP()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> rtoP;

	/**
	 * The default value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected String chemin = CHEMIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeRes() <em>Type Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRes()
	 * @generated
	 * @ordered
	 */
	protected Object typeRes;

	/**
	 * The cached value of the '{@link #getRtoScr() <em>Rto Scr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoScr()
	 * @generated
	 * @ordered
	 */
	protected Script rtoScr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.RESSOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getRtoP() {
		if (rtoP == null) {
			rtoP = new EObjectContainmentWithInverseEList<Port>(Port.class, this, AlgorithmePackage.RESSOURCES__RTO_P, AlgorithmePackage.PORT__PTO_R);
		}
		return rtoP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChemin() {
		return chemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChemin(String newChemin) {
		String oldChemin = chemin;
		chemin = newChemin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.RESSOURCES__CHEMIN, oldChemin, chemin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTypeRes() {
		return typeRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeRes(Object newTypeRes) {
		Object oldTypeRes = typeRes;
		typeRes = newTypeRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.RESSOURCES__TYPE_RES, oldTypeRes, typeRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script getRtoScr() {
		if (rtoScr != null && rtoScr.eIsProxy()) {
			InternalEObject oldRtoScr = (InternalEObject)rtoScr;
			rtoScr = (Script)eResolveProxy(oldRtoScr);
			if (rtoScr != oldRtoScr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.RESSOURCES__RTO_SCR, oldRtoScr, rtoScr));
			}
		}
		return rtoScr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetRtoScr() {
		return rtoScr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRtoScr(Script newRtoScr) {
		Script oldRtoScr = rtoScr;
		rtoScr = newRtoScr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.RESSOURCES__RTO_SCR, oldRtoScr, rtoScr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.RESSOURCES__RTO_P:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRtoP()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.RESSOURCES__RTO_P:
				return ((InternalEList<?>)getRtoP()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.RESSOURCES__RTO_P:
				return getRtoP();
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				return getChemin();
			case AlgorithmePackage.RESSOURCES__TYPE_RES:
				return getTypeRes();
			case AlgorithmePackage.RESSOURCES__RTO_SCR:
				if (resolve) return getRtoScr();
				return basicGetRtoScr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgorithmePackage.RESSOURCES__RTO_P:
				getRtoP().clear();
				getRtoP().addAll((Collection<? extends Port>)newValue);
				return;
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				setChemin((String)newValue);
				return;
			case AlgorithmePackage.RESSOURCES__TYPE_RES:
				setTypeRes(newValue);
				return;
			case AlgorithmePackage.RESSOURCES__RTO_SCR:
				setRtoScr((Script)newValue);
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
			case AlgorithmePackage.RESSOURCES__RTO_P:
				getRtoP().clear();
				return;
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				setChemin(CHEMIN_EDEFAULT);
				return;
			case AlgorithmePackage.RESSOURCES__TYPE_RES:
				setTypeRes((Object)null);
				return;
			case AlgorithmePackage.RESSOURCES__RTO_SCR:
				setRtoScr((Script)null);
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
			case AlgorithmePackage.RESSOURCES__RTO_P:
				return rtoP != null && !rtoP.isEmpty();
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
			case AlgorithmePackage.RESSOURCES__TYPE_RES:
				return typeRes != null;
			case AlgorithmePackage.RESSOURCES__RTO_SCR:
				return rtoScr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (chemin: ");
		result.append(chemin);
		result.append(", typeRes: ");
		result.append(typeRes);
		result.append(')');
		return result.toString();
	}

} //RessourcesImpl
