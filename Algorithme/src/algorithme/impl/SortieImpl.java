/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Sortie;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.SortieImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.impl.SortieImpl#getSortieScript <em>Sortie Script</em>}</li>
 *   <li>{@link algorithme.impl.SortieImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortieImpl extends MinimalEObjectImpl.Container implements Sortie {
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
	 * The cached value of the '{@link #getSortieScript() <em>Sortie Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortieScript()
	 * @generated
	 * @ordered
	 */
	protected script.Sortie sortieScript;
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected float valeur = VALEUR_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.SORTIE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SORTIE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public script.Sortie getSortieScript() {
		if (sortieScript != null && sortieScript.eIsProxy()) {
			InternalEObject oldSortieScript = (InternalEObject)sortieScript;
			sortieScript = (script.Sortie)eResolveProxy(oldSortieScript);
			if (sortieScript != oldSortieScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.SORTIE__SORTIE_SCRIPT, oldSortieScript, sortieScript));
			}
		}
		return sortieScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public script.Sortie basicGetSortieScript() {
		return sortieScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortieScript(script.Sortie newSortieScript) {
		script.Sortie oldSortieScript = sortieScript;
		sortieScript = newSortieScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SORTIE__SORTIE_SCRIPT, oldSortieScript, sortieScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeur(float newValeur) {
		float oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SORTIE__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.SORTIE__NOM:
				return getNom();
			case AlgorithmePackage.SORTIE__SORTIE_SCRIPT:
				if (resolve) return getSortieScript();
				return basicGetSortieScript();
			case AlgorithmePackage.SORTIE__VALEUR:
				return getValeur();
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
			case AlgorithmePackage.SORTIE__NOM:
				setNom((String)newValue);
				return;
			case AlgorithmePackage.SORTIE__SORTIE_SCRIPT:
				setSortieScript((script.Sortie)newValue);
				return;
			case AlgorithmePackage.SORTIE__VALEUR:
				setValeur((Float)newValue);
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
			case AlgorithmePackage.SORTIE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlgorithmePackage.SORTIE__SORTIE_SCRIPT:
				setSortieScript((script.Sortie)null);
				return;
			case AlgorithmePackage.SORTIE__VALEUR:
				setValeur(VALEUR_EDEFAULT);
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
			case AlgorithmePackage.SORTIE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlgorithmePackage.SORTIE__SORTIE_SCRIPT:
				return sortieScript != null;
			case AlgorithmePackage.SORTIE__VALEUR:
				return valeur != VALEUR_EDEFAULT;
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

} //SortieImpl
