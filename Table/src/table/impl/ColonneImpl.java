/**
 */
package table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import table.Colonne;
import table.ColonnesElementsType;
import table.Contenu;
import table.Contrainte;
import table.Table;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.impl.ColonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link table.impl.ColonneImpl#getTable <em>Table</em>}</li>
 *   <li>{@link table.impl.ColonneImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link table.impl.ColonneImpl#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link table.impl.ColonneImpl#getNbLignes <em>Nb Lignes</em>}</li>
 *   <li>{@link table.impl.ColonneImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneImpl extends MinimalEObjectImpl.Container implements Colonne {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = "colonneSansNom";

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final ColonnesElementsType ELEMENT_TYPE_EDEFAULT = ColonnesElementsType.FLOAT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected ColonnesElementsType elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected Contrainte contraintes;

	/**
	 * The default value of the '{@link #getNbLignes() <em>Nb Lignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLignes()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_LIGNES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbLignes() <em>Nb Lignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLignes()
	 * @generated
	 * @ordered
	 */
	protected int nbLignes = NB_LIGNES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Contenu> contenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.COLONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.COLONNE__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(Table newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, TablePackage.TABLE__COLONNES, Table.class, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, TablePackage.TABLE__COLONNES, Table.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonnesElementsType getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementType(ColonnesElementsType newElementType) {
		ColonnesElementsType oldElementType = elementType;
		elementType = newElementType == null ? ELEMENT_TYPE_EDEFAULT : newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte getContraintes() {
		if (contraintes != null && contraintes.eIsProxy()) {
			InternalEObject oldContraintes = (InternalEObject)contraintes;
			contraintes = (Contrainte)eResolveProxy(oldContraintes);
			if (contraintes != oldContraintes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.COLONNE__CONTRAINTES, oldContraintes, contraintes));
			}
		}
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contrainte basicGetContraintes() {
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContraintes(Contrainte newContraintes) {
		Contrainte oldContraintes = contraintes;
		contraintes = newContraintes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE__CONTRAINTES, oldContraintes, contraintes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbLignes() {
		return nbLignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbLignes(int newNbLignes) {
		int oldNbLignes = nbLignes;
		nbLignes = newNbLignes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.COLONNE__NB_LIGNES, oldNbLignes, nbLignes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contenu> getContenu() {
		if (contenu == null) {
			contenu = new EObjectResolvingEList<Contenu>(Contenu.class, this, TablePackage.COLONNE__CONTENU);
		}
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.COLONNE__TABLE:
				if (table != null)
					msgs = ((InternalEObject)table).eInverseRemove(this, TablePackage.TABLE__COLONNES, Table.class, msgs);
				return basicSetTable((Table)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.COLONNE__TABLE:
				return basicSetTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.COLONNE__NOM:
				return getNom();
			case TablePackage.COLONNE__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case TablePackage.COLONNE__ELEMENT_TYPE:
				return getElementType();
			case TablePackage.COLONNE__CONTRAINTES:
				if (resolve) return getContraintes();
				return basicGetContraintes();
			case TablePackage.COLONNE__NB_LIGNES:
				return getNbLignes();
			case TablePackage.COLONNE__CONTENU:
				return getContenu();
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
			case TablePackage.COLONNE__NOM:
				setNom((String)newValue);
				return;
			case TablePackage.COLONNE__TABLE:
				setTable((Table)newValue);
				return;
			case TablePackage.COLONNE__ELEMENT_TYPE:
				setElementType((ColonnesElementsType)newValue);
				return;
			case TablePackage.COLONNE__CONTRAINTES:
				setContraintes((Contrainte)newValue);
				return;
			case TablePackage.COLONNE__NB_LIGNES:
				setNbLignes((Integer)newValue);
				return;
			case TablePackage.COLONNE__CONTENU:
				getContenu().clear();
				getContenu().addAll((Collection<? extends Contenu>)newValue);
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
			case TablePackage.COLONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case TablePackage.COLONNE__TABLE:
				setTable((Table)null);
				return;
			case TablePackage.COLONNE__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case TablePackage.COLONNE__CONTRAINTES:
				setContraintes((Contrainte)null);
				return;
			case TablePackage.COLONNE__NB_LIGNES:
				setNbLignes(NB_LIGNES_EDEFAULT);
				return;
			case TablePackage.COLONNE__CONTENU:
				getContenu().clear();
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
			case TablePackage.COLONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case TablePackage.COLONNE__TABLE:
				return table != null;
			case TablePackage.COLONNE__ELEMENT_TYPE:
				return elementType != ELEMENT_TYPE_EDEFAULT;
			case TablePackage.COLONNE__CONTRAINTES:
				return contraintes != null;
			case TablePackage.COLONNE__NB_LIGNES:
				return nbLignes != NB_LIGNES_EDEFAULT;
			case TablePackage.COLONNE__CONTENU:
				return contenu != null && !contenu.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", ElementType: ");
		result.append(elementType);
		result.append(", nbLignes: ");
		result.append(nbLignes);
		result.append(')');
		return result.toString();
	}

} //ColonneImpl
