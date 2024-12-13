/**
 */
package algorithme.impl;

import algorithme.AlgorithmePackage;
import algorithme.Entree;
import algorithme.PortSortie;
import algorithme.Script;
import algorithme.Sortie;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import script.PortEntree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.SortieImpl#getStoPS <em>Sto PS</em>}</li>
 *   <li>{@link algorithme.impl.SortieImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.impl.SortieImpl#getStoScr <em>Sto Scr</em>}</li>
 *   <li>{@link algorithme.impl.SortieImpl#getStoE <em>Sto E</em>}</li>
 *   <li>{@link algorithme.impl.SortieImpl#getPortEntreeS <em>Port Entree S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortieImpl extends MinimalEObjectImpl.Container implements Sortie {
	/**
	 * The cached value of the '{@link #getStoPS() <em>Sto PS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoPS()
	 * @generated
	 * @ordered
	 */
	protected PortSortie stoPS;
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
	 * The cached value of the '{@link #getStoE() <em>Sto E</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoE()
	 * @generated
	 * @ordered
	 */
	protected EList<Entree> stoE;
	/**
	 * The cached value of the '{@link #getPortEntreeS() <em>Port Entree S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortEntreeS()
	 * @generated
	 * @ordered
	 */
	protected PortEntree portEntreeS;

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
	public PortSortie getStoPS() {
		if (stoPS != null && stoPS.eIsProxy()) {
			InternalEObject oldStoPS = (InternalEObject)stoPS;
			stoPS = (PortSortie)eResolveProxy(oldStoPS);
			if (stoPS != oldStoPS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.SORTIE__STO_PS, oldStoPS, stoPS));
			}
		}
		return stoPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSortie basicGetStoPS() {
		return stoPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoPS(PortSortie newStoPS) {
		PortSortie oldStoPS = stoPS;
		stoPS = newStoPS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SORTIE__STO_PS, oldStoPS, stoPS));
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
	public Script getStoScr() {
		if (eContainerFeatureID() != AlgorithmePackage.SORTIE__STO_SCR) return null;
		return (Script)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoScr(Script newStoScr, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStoScr, AlgorithmePackage.SORTIE__STO_SCR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoScr(Script newStoScr) {
		if (newStoScr != eInternalContainer() || (eContainerFeatureID() != AlgorithmePackage.SORTIE__STO_SCR && newStoScr != null)) {
			if (EcoreUtil.isAncestor(this, newStoScr))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStoScr != null)
				msgs = ((InternalEObject)newStoScr).eInverseAdd(this, AlgorithmePackage.SCRIPT__SCRTO_S, Script.class, msgs);
			msgs = basicSetStoScr(newStoScr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SORTIE__STO_SCR, newStoScr, newStoScr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entree> getStoE() {
		if (stoE == null) {
			stoE = new EObjectResolvingEList<Entree>(Entree.class, this, AlgorithmePackage.SORTIE__STO_E);
		}
		return stoE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortEntree getPortEntreeS() {
		if (portEntreeS != null && portEntreeS.eIsProxy()) {
			InternalEObject oldPortEntreeS = (InternalEObject)portEntreeS;
			portEntreeS = (PortEntree)eResolveProxy(oldPortEntreeS);
			if (portEntreeS != oldPortEntreeS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.SORTIE__PORT_ENTREE_S, oldPortEntreeS, portEntreeS));
			}
		}
		return portEntreeS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortEntree basicGetPortEntreeS() {
		return portEntreeS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortEntreeS(PortEntree newPortEntreeS) {
		PortEntree oldPortEntreeS = portEntreeS;
		portEntreeS = newPortEntreeS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.SORTIE__PORT_ENTREE_S, oldPortEntreeS, portEntreeS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.SORTIE__STO_SCR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStoScr((Script)otherEnd, msgs);
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
			case AlgorithmePackage.SORTIE__STO_SCR:
				return basicSetStoScr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AlgorithmePackage.SORTIE__STO_SCR:
				return eInternalContainer().eInverseRemove(this, AlgorithmePackage.SCRIPT__SCRTO_S, Script.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.SORTIE__STO_PS:
				if (resolve) return getStoPS();
				return basicGetStoPS();
			case AlgorithmePackage.SORTIE__NOM:
				return getNom();
			case AlgorithmePackage.SORTIE__STO_SCR:
				return getStoScr();
			case AlgorithmePackage.SORTIE__STO_E:
				return getStoE();
			case AlgorithmePackage.SORTIE__PORT_ENTREE_S:
				if (resolve) return getPortEntreeS();
				return basicGetPortEntreeS();
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
			case AlgorithmePackage.SORTIE__STO_PS:
				setStoPS((PortSortie)newValue);
				return;
			case AlgorithmePackage.SORTIE__NOM:
				setNom((String)newValue);
				return;
			case AlgorithmePackage.SORTIE__STO_SCR:
				setStoScr((Script)newValue);
				return;
			case AlgorithmePackage.SORTIE__STO_E:
				getStoE().clear();
				getStoE().addAll((Collection<? extends Entree>)newValue);
				return;
			case AlgorithmePackage.SORTIE__PORT_ENTREE_S:
				setPortEntreeS((PortEntree)newValue);
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
			case AlgorithmePackage.SORTIE__STO_PS:
				setStoPS((PortSortie)null);
				return;
			case AlgorithmePackage.SORTIE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlgorithmePackage.SORTIE__STO_SCR:
				setStoScr((Script)null);
				return;
			case AlgorithmePackage.SORTIE__STO_E:
				getStoE().clear();
				return;
			case AlgorithmePackage.SORTIE__PORT_ENTREE_S:
				setPortEntreeS((PortEntree)null);
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
			case AlgorithmePackage.SORTIE__STO_PS:
				return stoPS != null;
			case AlgorithmePackage.SORTIE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlgorithmePackage.SORTIE__STO_SCR:
				return getStoScr() != null;
			case AlgorithmePackage.SORTIE__STO_E:
				return stoE != null && !stoE.isEmpty();
			case AlgorithmePackage.SORTIE__PORT_ENTREE_S:
				return portEntreeS != null;
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

} //SortieImpl
