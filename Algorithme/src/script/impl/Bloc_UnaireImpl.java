/**
 */
package script.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.Bloc_Unaire;
import script.ScriptElements;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc Unaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.Bloc_UnaireImpl#getBUtoS <em>BUto S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bloc_UnaireImpl extends MinimalEObjectImpl.Container implements Bloc_Unaire {
	/**
	 * The cached value of the '{@link #getBUtoS() <em>BUto S</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUtoS()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptElements> bUtoS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bloc_UnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.BLOC_UNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptElements> getBUtoS() {
		if (bUtoS == null) {
			bUtoS = new EObjectResolvingEList<ScriptElements>(ScriptElements.class, this, ScriptPackage.BLOC_UNAIRE__BUTO_S);
		}
		return bUtoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.BLOC_UNAIRE__BUTO_S:
				return getBUtoS();
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
			case ScriptPackage.BLOC_UNAIRE__BUTO_S:
				getBUtoS().clear();
				getBUtoS().addAll((Collection<? extends ScriptElements>)newValue);
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
			case ScriptPackage.BLOC_UNAIRE__BUTO_S:
				getBUtoS().clear();
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
			case ScriptPackage.BLOC_UNAIRE__BUTO_S:
				return bUtoS != null && !bUtoS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Bloc_UnaireImpl
