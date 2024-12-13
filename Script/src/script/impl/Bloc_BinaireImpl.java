/**
 */
package script.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.Bloc_Binaire;
import script.ScriptElements;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.Bloc_BinaireImpl#getBBtoS <em>BBto S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bloc_BinaireImpl extends MinimalEObjectImpl.Container implements Bloc_Binaire {
	/**
	 * The cached value of the '{@link #getBBtoS() <em>BBto S</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBBtoS()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptElements> bBtoS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bloc_BinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.BLOC_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptElements> getBBtoS() {
		if (bBtoS == null) {
			bBtoS = new EObjectResolvingEList<ScriptElements>(ScriptElements.class, this, ScriptPackage.BLOC_BINAIRE__BBTO_S);
		}
		return bBtoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.BLOC_BINAIRE__BBTO_S:
				return getBBtoS();
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
			case ScriptPackage.BLOC_BINAIRE__BBTO_S:
				getBBtoS().clear();
				getBBtoS().addAll((Collection<? extends ScriptElements>)newValue);
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
			case ScriptPackage.BLOC_BINAIRE__BBTO_S:
				getBBtoS().clear();
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
			case ScriptPackage.BLOC_BINAIRE__BBTO_S:
				return bBtoS != null && !bBtoS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Bloc_BinaireImpl
