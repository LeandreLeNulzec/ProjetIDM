/**
 */
package table.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import table.ColonneProvient;
import table.Table;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Provient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.impl.ColonneProvientImpl#getTableOrigine <em>Table Origine</em>}</li>
 *   <li>{@link table.impl.ColonneProvientImpl#getRefColonne <em>Ref Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneProvientImpl extends ColonneImpl implements ColonneProvient {
	/**
	 * The cached value of the '{@link #getTableOrigine() <em>Table Origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableOrigine()
	 * @generated
	 * @ordered
	 */
	protected Table tableOrigine;
	/**
	 * The default value of the '{@link #getRefColonne() <em>Ref Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefColonne()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_COLONNE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRefColonne() <em>Ref Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefColonne()
	 * @generated
	 * @ordered
	 */
	protected String refColonne = REF_COLONNE_EDEFAULT;
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
	public Table getTableOrigine() {
		if (tableOrigine != null && tableOrigine.eIsProxy()) {
			InternalEObject oldTableOrigine = (InternalEObject)tableOrigine;
			tableOrigine = (Table)eResolveProxy(oldTableOrigine);
			if (tableOrigine != oldTableOrigine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.COLONNE_PROVIENT__TABLE_ORIGINE, oldTableOrigine, tableOrigine));
			}
		}
		return tableOrigine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableOrigine() {
		return tableOrigine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableOrigine(Table newTableOrigine) {
		Table oldTableOrigine = tableOrigine;
		tableOrigine = newTableOrigine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE_PROVIENT__TABLE_ORIGINE, oldTableOrigine, tableOrigine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefColonne() {
		return refColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefColonne(String newRefColonne) {
		String oldRefColonne = refColonne;
		refColonne = newRefColonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE_PROVIENT__REF_COLONNE, oldRefColonne, refColonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.COLONNE_PROVIENT__TABLE_ORIGINE:
				if (resolve) return getTableOrigine();
				return basicGetTableOrigine();
			case TablePackage.COLONNE_PROVIENT__REF_COLONNE:
				return getRefColonne();
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
			case TablePackage.COLONNE_PROVIENT__TABLE_ORIGINE:
				setTableOrigine((Table)newValue);
				return;
			case TablePackage.COLONNE_PROVIENT__REF_COLONNE:
				setRefColonne((String)newValue);
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
			case TablePackage.COLONNE_PROVIENT__TABLE_ORIGINE:
				setTableOrigine((Table)null);
				return;
			case TablePackage.COLONNE_PROVIENT__REF_COLONNE:
				setRefColonne(REF_COLONNE_EDEFAULT);
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
			case TablePackage.COLONNE_PROVIENT__TABLE_ORIGINE:
				return tableOrigine != null;
			case TablePackage.COLONNE_PROVIENT__REF_COLONNE:
				return REF_COLONNE_EDEFAULT == null ? refColonne != null : !REF_COLONNE_EDEFAULT.equals(refColonne);
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
		result.append(" (refColonne: ");
		result.append(refColonne);
		result.append(')');
		return result.toString();
	}

} //ColonneProvientImpl
