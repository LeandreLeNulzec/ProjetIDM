/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmePackage;
import algorithme.E_S;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.E_SImpl#getE_StoA <em>ESto A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E_SImpl extends MinimalEObjectImpl.Container implements E_S {
	/**
	 * The cached value of the '{@link #getE_StoA() <em>ESto A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_StoA()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithme> e_StoA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E_SImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithme> getE_StoA() {
		if (e_StoA == null) {
			e_StoA = new EObjectResolvingEList<Algorithme>(Algorithme.class, this, AlgorithmePackage.ES__ESTO_A);
		}
		return e_StoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.ES__ESTO_A:
				return getE_StoA();
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
			case AlgorithmePackage.ES__ESTO_A:
				getE_StoA().clear();
				getE_StoA().addAll((Collection<? extends Algorithme>)newValue);
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
			case AlgorithmePackage.ES__ESTO_A:
				getE_StoA().clear();
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
			case AlgorithmePackage.ES__ESTO_A:
				return e_StoA != null && !e_StoA.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //E_SImpl
