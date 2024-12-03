/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Entrée;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entrée</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.EntréeImpl#getParamètre <em>Paramètre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntréeImpl extends E_SImpl implements Entrée {
	/**
	 * The default value of the '{@link #getParamètre() <em>Paramètre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamètre()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMÈTRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamètre() <em>Paramètre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamètre()
	 * @generated
	 * @ordered
	 */
	protected String paramètre = PARAMÈTRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntréeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ENTRÉE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParamètre() {
		return paramètre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParamètre(String newParamètre) {
		String oldParamètre = paramètre;
		paramètre = newParamètre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTRÉE__PARAMÈTRE, oldParamètre, paramètre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.ENTRÉE__PARAMÈTRE:
				return getParamètre();
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
			case AlgorithmePackage.ENTRÉE__PARAMÈTRE:
				setParamètre((String)newValue);
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
			case AlgorithmePackage.ENTRÉE__PARAMÈTRE:
				setParamètre(PARAMÈTRE_EDEFAULT);
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
			case AlgorithmePackage.ENTRÉE__PARAMÈTRE:
				return PARAMÈTRE_EDEFAULT == null ? paramètre != null : !PARAMÈTRE_EDEFAULT.equals(paramètre);
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
		result.append(" (paramètre: ");
		result.append(paramètre);
		result.append(')');
		return result.toString();
	}

} //EntréeImpl
