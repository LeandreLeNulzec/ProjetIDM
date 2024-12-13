/**
 */
package script.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.Bloc_Fonction;
import script.ScriptElements;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc Fonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.Bloc_FonctionImpl#getBFtoS <em>BFto S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bloc_FonctionImpl extends MinimalEObjectImpl.Container implements Bloc_Fonction {
	/**
	 * The cached value of the '{@link #getBFtoS() <em>BFto S</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBFtoS()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptElements> bFtoS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bloc_FonctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.BLOC_FONCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptElements> getBFtoS() {
		if (bFtoS == null) {
			bFtoS = new EObjectResolvingEList<ScriptElements>(ScriptElements.class, this, ScriptPackage.BLOC_FONCTION__BFTO_S);
		}
		return bFtoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.BLOC_FONCTION__BFTO_S:
				return getBFtoS();
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
			case ScriptPackage.BLOC_FONCTION__BFTO_S:
				getBFtoS().clear();
				getBFtoS().addAll((Collection<? extends ScriptElements>)newValue);
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
			case ScriptPackage.BLOC_FONCTION__BFTO_S:
				getBFtoS().clear();
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
			case ScriptPackage.BLOC_FONCTION__BFTO_S:
				return bFtoS != null && !bFtoS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Bloc_FonctionImpl
