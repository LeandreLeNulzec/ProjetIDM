/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmePackage;
import algorithme.E_S;
import algorithme.Ressources;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.RessourcesImpl#getRtoA <em>Rto A</em>}</li>
 *   <li>{@link algorithme.impl.RessourcesImpl#getRtoE_S <em>Rto ES</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourcesImpl extends MinimalEObjectImpl.Container implements Ressources {
	/**
	 * The cached value of the '{@link #getRtoA() <em>Rto A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoA()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithme> rtoA;

	/**
	 * The cached value of the '{@link #getRtoE_S() <em>Rto ES</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoE_S()
	 * @generated
	 * @ordered
	 */
	protected EList<E_S> rtoE_S;

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
	public EList<Algorithme> getRtoA() {
		if (rtoA == null) {
			rtoA = new EObjectResolvingEList<Algorithme>(Algorithme.class, this, AlgorithmePackage.RESSOURCES__RTO_A);
		}
		return rtoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<E_S> getRtoE_S() {
		if (rtoE_S == null) {
			rtoE_S = new EObjectResolvingEList<E_S>(E_S.class, this, AlgorithmePackage.RESSOURCES__RTO_ES);
		}
		return rtoE_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.RESSOURCES__RTO_A:
				return getRtoA();
			case AlgorithmePackage.RESSOURCES__RTO_ES:
				return getRtoE_S();
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
			case AlgorithmePackage.RESSOURCES__RTO_A:
				getRtoA().clear();
				getRtoA().addAll((Collection<? extends Algorithme>)newValue);
				return;
			case AlgorithmePackage.RESSOURCES__RTO_ES:
				getRtoE_S().clear();
				getRtoE_S().addAll((Collection<? extends E_S>)newValue);
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
			case AlgorithmePackage.RESSOURCES__RTO_A:
				getRtoA().clear();
				return;
			case AlgorithmePackage.RESSOURCES__RTO_ES:
				getRtoE_S().clear();
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
			case AlgorithmePackage.RESSOURCES__RTO_A:
				return rtoA != null && !rtoA.isEmpty();
			case AlgorithmePackage.RESSOURCES__RTO_ES:
				return rtoE_S != null && !rtoE_S.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RessourcesImpl
