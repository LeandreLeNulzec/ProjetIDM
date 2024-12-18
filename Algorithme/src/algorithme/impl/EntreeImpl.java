/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmePackage;
import algorithme.Entree;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.EntreeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.impl.EntreeImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link algorithme.impl.EntreeImpl#getEntreeScript <em>Entree Script</em>}</li>
 *   <li>{@link algorithme.impl.EntreeImpl#getEntreeGlobale <em>Entree Globale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntreeImpl extends MinimalEObjectImpl.Container implements Entree {
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
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> valeur;

	/**
	 * The cached value of the '{@link #getEntreeScript() <em>Entree Script</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreeScript()
	 * @generated
	 * @ordered
	 */
	protected EList<script.Entree> entreeScript;

	/**
	 * The cached value of the '{@link #getEntreeGlobale() <em>Entree Globale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreeGlobale()
	 * @generated
	 * @ordered
	 */
	protected Algorithme entreeGlobale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ENTREE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getValeur() {
		if (valeur == null) {
			valeur = new EDataTypeUniqueEList<Float>(Float.class, this, AlgorithmePackage.ENTREE__VALEUR);
		}
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<script.Entree> getEntreeScript() {
		if (entreeScript == null) {
			entreeScript = new EObjectResolvingEList<script.Entree>(script.Entree.class, this, AlgorithmePackage.ENTREE__ENTREE_SCRIPT);
		}
		return entreeScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getEntreeGlobale() {
		if (entreeGlobale != null && entreeGlobale.eIsProxy()) {
			InternalEObject oldEntreeGlobale = (InternalEObject)entreeGlobale;
			entreeGlobale = (Algorithme)eResolveProxy(oldEntreeGlobale);
			if (entreeGlobale != oldEntreeGlobale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.ENTREE__ENTREE_GLOBALE, oldEntreeGlobale, entreeGlobale));
			}
		}
		return entreeGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithme basicGetEntreeGlobale() {
		return entreeGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntreeGlobale(Algorithme newEntreeGlobale) {
		Algorithme oldEntreeGlobale = entreeGlobale;
		entreeGlobale = newEntreeGlobale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__ENTREE_GLOBALE, oldEntreeGlobale, entreeGlobale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.ENTREE__NOM:
				return getNom();
			case AlgorithmePackage.ENTREE__VALEUR:
				return getValeur();
			case AlgorithmePackage.ENTREE__ENTREE_SCRIPT:
				return getEntreeScript();
			case AlgorithmePackage.ENTREE__ENTREE_GLOBALE:
				if (resolve) return getEntreeGlobale();
				return basicGetEntreeGlobale();
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
			case AlgorithmePackage.ENTREE__NOM:
				setNom((String)newValue);
				return;
			case AlgorithmePackage.ENTREE__VALEUR:
				getValeur().clear();
				getValeur().addAll((Collection<? extends Float>)newValue);
				return;
			case AlgorithmePackage.ENTREE__ENTREE_SCRIPT:
				getEntreeScript().clear();
				getEntreeScript().addAll((Collection<? extends script.Entree>)newValue);
				return;
			case AlgorithmePackage.ENTREE__ENTREE_GLOBALE:
				setEntreeGlobale((Algorithme)newValue);
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
			case AlgorithmePackage.ENTREE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlgorithmePackage.ENTREE__VALEUR:
				getValeur().clear();
				return;
			case AlgorithmePackage.ENTREE__ENTREE_SCRIPT:
				getEntreeScript().clear();
				return;
			case AlgorithmePackage.ENTREE__ENTREE_GLOBALE:
				setEntreeGlobale((Algorithme)null);
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
			case AlgorithmePackage.ENTREE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlgorithmePackage.ENTREE__VALEUR:
				return valeur != null && !valeur.isEmpty();
			case AlgorithmePackage.ENTREE__ENTREE_SCRIPT:
				return entreeScript != null && !entreeScript.isEmpty();
			case AlgorithmePackage.ENTREE__ENTREE_GLOBALE:
				return entreeGlobale != null;
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
		result.append(", valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //EntreeImpl
