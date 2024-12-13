/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmeElements;
import algorithme.AlgorithmePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.AlgorithmeElementsImpl#getAEtoA <em>AEto A</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlgorithmeElementsImpl extends AlgorithmeImpl implements AlgorithmeElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmeElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ALGORITHME_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getAEtoA() {
		if (eContainerFeatureID() != AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A) return null;
		return (Algorithme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEtoA(Algorithme newAEtoA, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAEtoA, AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAEtoA(Algorithme newAEtoA) {
		if (newAEtoA != eInternalContainer() || (eContainerFeatureID() != AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A && newAEtoA != null)) {
			if (EcoreUtil.isAncestor(this, newAEtoA))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAEtoA != null)
				msgs = ((InternalEObject)newAEtoA).eInverseAdd(this, AlgorithmePackage.ALGORITHME__ATO_AE, Algorithme.class, msgs);
			msgs = basicSetAEtoA(newAEtoA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A, newAEtoA, newAEtoA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAEtoA((Algorithme)otherEnd, msgs);
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
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				return basicSetAEtoA(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				return eInternalContainer().eInverseRemove(this, AlgorithmePackage.ALGORITHME__ATO_AE, Algorithme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				return getAEtoA();
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
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				setAEtoA((Algorithme)newValue);
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
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				setAEtoA((Algorithme)null);
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
			case AlgorithmePackage.ALGORITHME_ELEMENTS__AETO_A:
				return getAEtoA() != null;
		}
		return super.eIsSet(featureID);
	}

} //AlgorithmeElementsImpl
