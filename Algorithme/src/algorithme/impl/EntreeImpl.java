/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Entree;
import algorithme.Sortie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import script.PortSortie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.EntreeImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link algorithme.impl.EntreeImpl#getEtoS <em>Eto S</em>}</li>
 *   <li>{@link algorithme.impl.EntreeImpl#getPortSortieS <em>Port Sortie S</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntreeImpl extends MinimalEObjectImpl.Container implements Entree {
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected float valeur = VALEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEtoS() <em>Eto S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtoS()
	 * @generated
	 * @ordered
	 */
	protected Sortie etoS;

	/**
	 * The cached value of the '{@link #getPortSortieS() <em>Port Sortie S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortSortieS()
	 * @generated
	 * @ordered
	 */
	protected PortSortie portSortieS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeur(float newValeur) {
		float oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sortie getEtoS() {
		if (etoS != null && etoS.eIsProxy()) {
			InternalEObject oldEtoS = (InternalEObject)etoS;
			etoS = (Sortie)eResolveProxy(oldEtoS);
			if (etoS != oldEtoS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.ENTREE__ETO_S, oldEtoS, etoS));
			}
		}
		return etoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortie basicGetEtoS() {
		return etoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEtoS(Sortie newEtoS) {
		Sortie oldEtoS = etoS;
		etoS = newEtoS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__ETO_S, oldEtoS, etoS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortSortie getPortSortieS() {
		if (portSortieS != null && portSortieS.eIsProxy()) {
			InternalEObject oldPortSortieS = (InternalEObject)portSortieS;
			portSortieS = (PortSortie)eResolveProxy(oldPortSortieS);
			if (portSortieS != oldPortSortieS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.ENTREE__PORT_SORTIE_S, oldPortSortieS, portSortieS));
			}
		}
		return portSortieS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSortie basicGetPortSortieS() {
		return portSortieS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortSortieS(PortSortie newPortSortieS) {
		PortSortie oldPortSortieS = portSortieS;
		portSortieS = newPortSortieS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__PORT_SORTIE_S, oldPortSortieS, portSortieS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.ENTREE__VALEUR:
				return getValeur();
			case AlgorithmePackage.ENTREE__ETO_S:
				if (resolve) return getEtoS();
				return basicGetEtoS();
			case AlgorithmePackage.ENTREE__PORT_SORTIE_S:
				if (resolve) return getPortSortieS();
				return basicGetPortSortieS();
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
			case AlgorithmePackage.ENTREE__VALEUR:
				setValeur((Float)newValue);
				return;
			case AlgorithmePackage.ENTREE__ETO_S:
				setEtoS((Sortie)newValue);
				return;
			case AlgorithmePackage.ENTREE__PORT_SORTIE_S:
				setPortSortieS((PortSortie)newValue);
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
			case AlgorithmePackage.ENTREE__VALEUR:
				setValeur(VALEUR_EDEFAULT);
				return;
			case AlgorithmePackage.ENTREE__ETO_S:
				setEtoS((Sortie)null);
				return;
			case AlgorithmePackage.ENTREE__PORT_SORTIE_S:
				setPortSortieS((PortSortie)null);
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
			case AlgorithmePackage.ENTREE__VALEUR:
				return valeur != VALEUR_EDEFAULT;
			case AlgorithmePackage.ENTREE__ETO_S:
				return etoS != null;
			case AlgorithmePackage.ENTREE__PORT_SORTIE_S:
				return portSortieS != null;
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
		result.append(" (valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //EntreeImpl
