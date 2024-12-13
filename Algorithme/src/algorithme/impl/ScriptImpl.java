/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Script;
import algorithme.Sortie;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.ScriptElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.ScriptImpl#getScrtoS <em>Scrto S</em>}</li>
 *   <li>{@link algorithme.impl.ScriptImpl#getScrtoSE <em>Scrto SE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
	/**
	 * The cached value of the '{@link #getScrtoS() <em>Scrto S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrtoS()
	 * @generated
	 * @ordered
	 */
	protected Sortie scrtoS;

	/**
	 * The cached value of the '{@link #getScrtoSE() <em>Scrto SE</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrtoSE()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptElements> scrtoSE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sortie getScrtoS() {
		return scrtoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrtoS(Sortie newScrtoS, NotificationChain msgs) {
		Sortie oldScrtoS = scrtoS;
		scrtoS = newScrtoS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SCRIPT__SCRTO_S, oldScrtoS, newScrtoS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScrtoS(Sortie newScrtoS) {
		if (newScrtoS != scrtoS) {
			NotificationChain msgs = null;
			if (scrtoS != null)
				msgs = ((InternalEObject)scrtoS).eInverseRemove(this, AlgorithmePackage.SORTIE__STO_SCR, Sortie.class, msgs);
			if (newScrtoS != null)
				msgs = ((InternalEObject)newScrtoS).eInverseAdd(this, AlgorithmePackage.SORTIE__STO_SCR, Sortie.class, msgs);
			msgs = basicSetScrtoS(newScrtoS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SCRIPT__SCRTO_S, newScrtoS, newScrtoS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptElements> getScrtoSE() {
		if (scrtoSE == null) {
			scrtoSE = new EObjectResolvingEList<ScriptElements>(ScriptElements.class, this, AlgorithmePackage.SCRIPT__SCRTO_SE);
		}
		return scrtoSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.SCRIPT__SCRTO_S:
				if (scrtoS != null)
					msgs = ((InternalEObject)scrtoS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmePackage.SCRIPT__SCRTO_S, null, msgs);
				return basicSetScrtoS((Sortie)otherEnd, msgs);
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
			case AlgorithmePackage.SCRIPT__SCRTO_S:
				return basicSetScrtoS(null, msgs);
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
			case AlgorithmePackage.SCRIPT__SCRTO_S:
				return getScrtoS();
			case AlgorithmePackage.SCRIPT__SCRTO_SE:
				return getScrtoSE();
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
			case AlgorithmePackage.SCRIPT__SCRTO_S:
				setScrtoS((Sortie)newValue);
				return;
			case AlgorithmePackage.SCRIPT__SCRTO_SE:
				getScrtoSE().clear();
				getScrtoSE().addAll((Collection<? extends ScriptElements>)newValue);
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
			case AlgorithmePackage.SCRIPT__SCRTO_S:
				setScrtoS((Sortie)null);
				return;
			case AlgorithmePackage.SCRIPT__SCRTO_SE:
				getScrtoSE().clear();
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
			case AlgorithmePackage.SCRIPT__SCRTO_S:
				return scrtoS != null;
			case AlgorithmePackage.SCRIPT__SCRTO_SE:
				return scrtoSE != null && !scrtoSE.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScriptImpl
