/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmeElements;
import algorithme.AlgorithmePackage;

import algorithme.Entree;
import algorithme.Sortie;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getEntreeGlobale <em>Entree Globale</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getSortieGlobale <em>Sortie Globale</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getAlgorithmeElements <em>Algorithme Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmeImpl extends MinimalEObjectImpl.Container implements Algorithme {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;
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
	 * The cached value of the '{@link #getEntreeGlobale() <em>Entree Globale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreeGlobale()
	 * @generated
	 * @ordered
	 */
	protected Entree entreeGlobale;
	/**
	 * The cached value of the '{@link #getSortieGlobale() <em>Sortie Globale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortieGlobale()
	 * @generated
	 * @ordered
	 */
	protected Sortie sortieGlobale;
	/**
	 * The cached value of the '{@link #getAlgorithmeElements() <em>Algorithme Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgorithmeElements> algorithmeElements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ALGORITHME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entree getEntreeGlobale() {
		if (entreeGlobale != null && entreeGlobale.eIsProxy()) {
			InternalEObject oldEntreeGlobale = (InternalEObject)entreeGlobale;
			entreeGlobale = (Entree)eResolveProxy(oldEntreeGlobale);
			if (entreeGlobale != oldEntreeGlobale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.ALGORITHME__ENTREE_GLOBALE, oldEntreeGlobale, entreeGlobale));
			}
		}
		return entreeGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree basicGetEntreeGlobale() {
		return entreeGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntreeGlobale(Entree newEntreeGlobale) {
		Entree oldEntreeGlobale = entreeGlobale;
		entreeGlobale = newEntreeGlobale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__ENTREE_GLOBALE, oldEntreeGlobale, entreeGlobale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sortie getSortieGlobale() {
		if (sortieGlobale != null && sortieGlobale.eIsProxy()) {
			InternalEObject oldSortieGlobale = (InternalEObject)sortieGlobale;
			sortieGlobale = (Sortie)eResolveProxy(oldSortieGlobale);
			if (sortieGlobale != oldSortieGlobale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.ALGORITHME__SORTIE_GLOBALE, oldSortieGlobale, sortieGlobale));
			}
		}
		return sortieGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortie basicGetSortieGlobale() {
		return sortieGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortieGlobale(Sortie newSortieGlobale) {
		Sortie oldSortieGlobale = sortieGlobale;
		sortieGlobale = newSortieGlobale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__SORTIE_GLOBALE, oldSortieGlobale, sortieGlobale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlgorithmeElements> getAlgorithmeElements() {
		if (algorithmeElements == null) {
			algorithmeElements = new EObjectContainmentWithInverseEList<AlgorithmeElements>(AlgorithmeElements.class, this, AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS, AlgorithmePackage.ALGORITHME_ELEMENTS__ALGORITHME);
		}
		return algorithmeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlgorithmeElements()).basicAdd(otherEnd, msgs);
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
			case AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS:
				return ((InternalEList<?>)getAlgorithmeElements()).basicRemove(otherEnd, msgs);
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
			case AlgorithmePackage.ALGORITHME__NOM:
				return getNom();
			case AlgorithmePackage.ALGORITHME__ENTREE_GLOBALE:
				if (resolve) return getEntreeGlobale();
				return basicGetEntreeGlobale();
			case AlgorithmePackage.ALGORITHME__SORTIE_GLOBALE:
				if (resolve) return getSortieGlobale();
				return basicGetSortieGlobale();
			case AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS:
				return getAlgorithmeElements();
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
			case AlgorithmePackage.ALGORITHME__NOM:
				setNom((String)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__ENTREE_GLOBALE:
				setEntreeGlobale((Entree)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__SORTIE_GLOBALE:
				setSortieGlobale((Sortie)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS:
				getAlgorithmeElements().clear();
				getAlgorithmeElements().addAll((Collection<? extends AlgorithmeElements>)newValue);
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
			case AlgorithmePackage.ALGORITHME__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlgorithmePackage.ALGORITHME__ENTREE_GLOBALE:
				setEntreeGlobale((Entree)null);
				return;
			case AlgorithmePackage.ALGORITHME__SORTIE_GLOBALE:
				setSortieGlobale((Sortie)null);
				return;
			case AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS:
				getAlgorithmeElements().clear();
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
			case AlgorithmePackage.ALGORITHME__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlgorithmePackage.ALGORITHME__ENTREE_GLOBALE:
				return entreeGlobale != null;
			case AlgorithmePackage.ALGORITHME__SORTIE_GLOBALE:
				return sortieGlobale != null;
			case AlgorithmePackage.ALGORITHME__ALGORITHME_ELEMENTS:
				return algorithmeElements != null && !algorithmeElements.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AlgorithmeImpl
