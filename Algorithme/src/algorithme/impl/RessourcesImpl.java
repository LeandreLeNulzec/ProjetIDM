/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Ressources;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import script.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.RessourcesImpl#getChemin <em>Chemin</em>}</li>
 *   <li>{@link algorithme.impl.RessourcesImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourcesImpl extends AlgorithmeElementsImpl implements Ressources {
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
	 * The cached value of the '{@link #getScript() <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Script script;

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
	public Script getScript() {
		if (script != null && script.eIsProxy()) {
			InternalEObject oldScript = (InternalEObject)script;
			script = (Script)eResolveProxy(oldScript);
			if (script != oldScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.RESSOURCES__SCRIPT, oldScript, script));
			}
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(Script newScript) {
		Script oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.RESSOURCES__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				return getChemin();
			case AlgorithmePackage.RESSOURCES__SCRIPT:
				if (resolve) return getScript();
				return basicGetScript();
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
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				setChemin((String)newValue);
				return;
			case AlgorithmePackage.RESSOURCES__SCRIPT:
				setScript((Script)newValue);
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
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				setChemin(CHEMIN_EDEFAULT);
				return;
			case AlgorithmePackage.RESSOURCES__SCRIPT:
				setScript((Script)null);
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
			case AlgorithmePackage.RESSOURCES__CHEMIN:
				return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
			case AlgorithmePackage.RESSOURCES__SCRIPT:
				return script != null;
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
		result.append(')');
		return result.toString();
	}

} //RessourcesImpl
