/**
 */
package algorithme.impl;

import algorithme.AlgorithmeElements;
import algorithme.AlgorithmePackage;
import algorithme.Guidance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.GuidanceImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link algorithme.impl.GuidanceImpl#getGtoAE <em>Gto AE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceImpl extends AlgorithmeElementsImpl implements Guidance {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGtoAE() <em>Gto AE</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtoAE()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgorithmeElements> gtoAE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.GUIDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.GUIDANCE__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlgorithmeElements> getGtoAE() {
		if (gtoAE == null) {
			gtoAE = new EObjectResolvingEList<AlgorithmeElements>(AlgorithmeElements.class, this, AlgorithmePackage.GUIDANCE__GTO_AE);
		}
		return gtoAE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.GUIDANCE__TEXTE:
				return getTexte();
			case AlgorithmePackage.GUIDANCE__GTO_AE:
				return getGtoAE();
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
			case AlgorithmePackage.GUIDANCE__TEXTE:
				setTexte((String)newValue);
				return;
			case AlgorithmePackage.GUIDANCE__GTO_AE:
				getGtoAE().clear();
				getGtoAE().addAll((Collection<? extends AlgorithmeElements>)newValue);
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
			case AlgorithmePackage.GUIDANCE__TEXTE:
				setTexte(TEXTE_EDEFAULT);
				return;
			case AlgorithmePackage.GUIDANCE__GTO_AE:
				getGtoAE().clear();
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
			case AlgorithmePackage.GUIDANCE__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
			case AlgorithmePackage.GUIDANCE__GTO_AE:
				return gtoAE != null && !gtoAE.isEmpty();
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
		result.append(" (texte: ");
		result.append(texte);
		result.append(')');
		return result.toString();
	}

} //GuidanceImpl
