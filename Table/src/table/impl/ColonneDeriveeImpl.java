/**
 */
package table.impl;

import algorithme.Algorithme;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import table.Colonne;
import table.ColonneDerivee;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Derivee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.impl.ColonneDeriveeImpl#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link table.impl.ColonneDeriveeImpl#getColonnesEntree <em>Colonnes Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneDeriveeImpl extends ColonneImpl implements ColonneDerivee {
	/**
	 * The cached value of the '{@link #getAlgorithme() <em>Algorithme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithme()
	 * @generated
	 * @ordered
	 */
	protected Algorithme algorithme;

	/**
	 * The cached value of the '{@link #getColonnesEntree() <em>Colonnes Entree</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonnesEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonnesEntree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneDeriveeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.COLONNE_DERIVEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getAlgorithme() {
		if (algorithme != null && algorithme.eIsProxy()) {
			InternalEObject oldAlgorithme = (InternalEObject)algorithme;
			algorithme = (Algorithme)eResolveProxy(oldAlgorithme);
			if (algorithme != oldAlgorithme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.COLONNE_DERIVEE__ALGORITHME, oldAlgorithme, algorithme));
			}
		}
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithme basicGetAlgorithme() {
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithme(Algorithme newAlgorithme) {
		Algorithme oldAlgorithme = algorithme;
		algorithme = newAlgorithme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE_DERIVEE__ALGORITHME, oldAlgorithme, algorithme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getColonnesEntree() {
		if (colonnesEntree == null) {
			colonnesEntree = new EObjectResolvingEList<Colonne>(Colonne.class, this, TablePackage.COLONNE_DERIVEE__COLONNES_ENTREE);
		}
		return colonnesEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.COLONNE_DERIVEE__ALGORITHME:
				if (resolve) return getAlgorithme();
				return basicGetAlgorithme();
			case TablePackage.COLONNE_DERIVEE__COLONNES_ENTREE:
				return getColonnesEntree();
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
			case TablePackage.COLONNE_DERIVEE__ALGORITHME:
				setAlgorithme((Algorithme)newValue);
				return;
			case TablePackage.COLONNE_DERIVEE__COLONNES_ENTREE:
				getColonnesEntree().clear();
				getColonnesEntree().addAll((Collection<? extends Colonne>)newValue);
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
			case TablePackage.COLONNE_DERIVEE__ALGORITHME:
				setAlgorithme((Algorithme)null);
				return;
			case TablePackage.COLONNE_DERIVEE__COLONNES_ENTREE:
				getColonnesEntree().clear();
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
			case TablePackage.COLONNE_DERIVEE__ALGORITHME:
				return algorithme != null;
			case TablePackage.COLONNE_DERIVEE__COLONNES_ENTREE:
				return colonnesEntree != null && !colonnesEntree.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColonneDeriveeImpl
