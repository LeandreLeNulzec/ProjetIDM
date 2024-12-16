/**
 */
package table.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import table.Colonne;
import table.PredicatColonne;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicat Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.impl.PredicatColonneImpl#getColonneComparante <em>Colonne Comparante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicatColonneImpl extends PredicatImpl implements PredicatColonne {
	/**
	 * The cached value of the '{@link #getColonneComparante() <em>Colonne Comparante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneComparante()
	 * @generated
	 * @ordered
	 */
	protected Colonne colonneComparante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicatColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.PREDICAT_COLONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonneComparante() {
		if (colonneComparante != null && colonneComparante.eIsProxy()) {
			InternalEObject oldColonneComparante = (InternalEObject)colonneComparante;
			colonneComparante = (Colonne)eResolveProxy(oldColonneComparante);
			if (colonneComparante != oldColonneComparante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.PREDICAT_COLONNE__COLONNE_COMPARANTE, oldColonneComparante, colonneComparante));
			}
		}
		return colonneComparante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne basicGetColonneComparante() {
		return colonneComparante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonneComparante(Colonne newColonneComparante) {
		Colonne oldColonneComparante = colonneComparante;
		colonneComparante = newColonneComparante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.PREDICAT_COLONNE__COLONNE_COMPARANTE, oldColonneComparante, colonneComparante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.PREDICAT_COLONNE__COLONNE_COMPARANTE:
				if (resolve) return getColonneComparante();
				return basicGetColonneComparante();
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
			case TablePackage.PREDICAT_COLONNE__COLONNE_COMPARANTE:
				setColonneComparante((Colonne)newValue);
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
			case TablePackage.PREDICAT_COLONNE__COLONNE_COMPARANTE:
				setColonneComparante((Colonne)null);
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
			case TablePackage.PREDICAT_COLONNE__COLONNE_COMPARANTE:
				return colonneComparante != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicatColonneImpl
