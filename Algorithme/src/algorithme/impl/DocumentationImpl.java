/**
 */
package algorithme.impl;

import algorithme.AlgorithmeElements;
import algorithme.AlgorithmePackage;
import algorithme.Documentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.DocumentationImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link algorithme.impl.DocumentationImpl#getDocuElement <em>Docu Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends AlgorithmeElementsImpl implements Documentation {
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
	 * The cached value of the '{@link #getDocuElement() <em>Docu Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuElement()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmeElements docuElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.DOCUMENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.DOCUMENTATION__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmeElements getDocuElement() {
		if (docuElement != null && docuElement.eIsProxy()) {
			InternalEObject oldDocuElement = (InternalEObject)docuElement;
			docuElement = (AlgorithmeElements)eResolveProxy(oldDocuElement);
			if (docuElement != oldDocuElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.DOCUMENTATION__DOCU_ELEMENT, oldDocuElement, docuElement));
			}
		}
		return docuElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmeElements basicGetDocuElement() {
		return docuElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocuElement(AlgorithmeElements newDocuElement) {
		AlgorithmeElements oldDocuElement = docuElement;
		docuElement = newDocuElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.DOCUMENTATION__DOCU_ELEMENT, oldDocuElement, docuElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.DOCUMENTATION__TEXTE:
				return getTexte();
			case AlgorithmePackage.DOCUMENTATION__DOCU_ELEMENT:
				if (resolve) return getDocuElement();
				return basicGetDocuElement();
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
			case AlgorithmePackage.DOCUMENTATION__TEXTE:
				setTexte((String)newValue);
				return;
			case AlgorithmePackage.DOCUMENTATION__DOCU_ELEMENT:
				setDocuElement((AlgorithmeElements)newValue);
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
			case AlgorithmePackage.DOCUMENTATION__TEXTE:
				setTexte(TEXTE_EDEFAULT);
				return;
			case AlgorithmePackage.DOCUMENTATION__DOCU_ELEMENT:
				setDocuElement((AlgorithmeElements)null);
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
			case AlgorithmePackage.DOCUMENTATION__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
			case AlgorithmePackage.DOCUMENTATION__DOCU_ELEMENT:
				return docuElement != null;
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

} //DocumentationImpl
