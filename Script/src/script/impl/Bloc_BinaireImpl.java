/**
 */
package script.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.Bloc_Binaire;
import script.Port;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.Bloc_BinaireImpl#getEntrees <em>Entrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Bloc_BinaireImpl extends BlocImpl implements Bloc_Binaire {
	/**
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> entrees;
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
	public EList<Port> getEntrees() {
		if (entrees == null) {
			entrees = new EObjectResolvingEList<Port>(Port.class, this, ScriptPackage.BLOC_BINAIRE__ENTREES);
		}
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.BLOC_BINAIRE__ENTREES:
				return getEntrees();
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
			case ScriptPackage.BLOC_BINAIRE__ENTREES:
				getEntrees().clear();
				getEntrees().addAll((Collection<? extends Port>)newValue);
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
			case ScriptPackage.BLOC_BINAIRE__ENTREES:
				getEntrees().clear();
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
			case ScriptPackage.BLOC_BINAIRE__ENTREES:
				return entrees != null && !entrees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Bloc_BinaireImpl
