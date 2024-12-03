/**
 */
package table.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import table.Colonne;
import table.ColonneProvient;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Provient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.impl.ColonneProvientImpl#getColonneOrigine <em>Colonne Origine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneProvientImpl extends ColonneImpl implements ColonneProvient {
	/**
	 * The cached value of the '{@link #getColonneOrigine() <em>Colonne Origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneOrigine()
	 * @generated
	 * @ordered
	 */
	protected Colonne colonneOrigine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneProvientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.COLONNE_PROVIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonneOrigine() {
		if (colonneOrigine != null && colonneOrigine.eIsProxy()) {
			InternalEObject oldColonneOrigine = (InternalEObject)colonneOrigine;
			colonneOrigine = (Colonne)eResolveProxy(oldColonneOrigine);
			if (colonneOrigine != oldColonneOrigine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.COLONNE_PROVIENT__COLONNE_ORIGINE, oldColonneOrigine, colonneOrigine));
			}
		}
		return colonneOrigine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne basicGetColonneOrigine() {
		return colonneOrigine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonneOrigine(Colonne newColonneOrigine) {
		Colonne oldColonneOrigine = colonneOrigine;
		colonneOrigine = newColonneOrigine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE_PROVIENT__COLONNE_ORIGINE, oldColonneOrigine, colonneOrigine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.COLONNE_PROVIENT__COLONNE_ORIGINE:
				if (resolve) return getColonneOrigine();
				return basicGetColonneOrigine();
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
			case TablePackage.COLONNE_PROVIENT__COLONNE_ORIGINE:
				setColonneOrigine((Colonne)newValue);
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
			case TablePackage.COLONNE_PROVIENT__COLONNE_ORIGINE:
				setColonneOrigine((Colonne)null);
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
			case TablePackage.COLONNE_PROVIENT__COLONNE_ORIGINE:
				return colonneOrigine != null;
		}
		return super.eIsSet(featureID);
	}

} //ColonneProvientImpl
