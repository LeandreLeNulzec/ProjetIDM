/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext.impl;

import fr.n7.table_xtext.ColonneElementType;
import fr.n7.table_xtext.Colonnes;
import fr.n7.table_xtext.Contrainte;
import fr.n7.table_xtext.Table_xtextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonnes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.impl.ColonnesImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.table_xtext.impl.ColonnesImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link fr.n7.table_xtext.impl.ColonnesImpl#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link fr.n7.table_xtext.impl.ColonnesImpl#getNbLignes <em>Nb Lignes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonnesImpl extends MinimalEObjectImpl.Container implements Colonnes
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected static final ColonneElementType ELEMENT_TYPE_EDEFAULT = ColonneElementType.FLOAT;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected ColonneElementType elementType = ELEMENT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' containment reference.
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColonnesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Table_xtextPackage.Literals.COLONNES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.COLONNES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColonneElementType getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElementType(ColonneElementType newElementType)
  {
    ColonneElementType oldElementType = elementType;
    elementType = newElementType == null ? ELEMENT_TYPE_EDEFAULT : newElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.COLONNES__ELEMENT_TYPE, oldElementType, elementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contrainte getContraintes()
  {
    return contraintes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContraintes(Contrainte newContraintes, NotificationChain msgs)
  {
    Contrainte oldContraintes = contraintes;
    contraintes = newContraintes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Table_xtextPackage.COLONNES__CONTRAINTES, oldContraintes, newContraintes);
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
  public void setContraintes(Contrainte newContraintes)
  {
    if (newContraintes != contraintes)
    {
      NotificationChain msgs = null;
      if (contraintes != null)
        msgs = ((InternalEObject)contraintes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Table_xtextPackage.COLONNES__CONTRAINTES, null, msgs);
      if (newContraintes != null)
        msgs = ((InternalEObject)newContraintes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Table_xtextPackage.COLONNES__CONTRAINTES, null, msgs);
      msgs = basicSetContraintes(newContraintes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.COLONNES__CONTRAINTES, newContraintes, newContraintes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNbLignes()
  {
    return nbLignes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNbLignes(int newNbLignes)
  {
    int oldNbLignes = nbLignes;
    nbLignes = newNbLignes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.COLONNES__NB_LIGNES, oldNbLignes, nbLignes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Table_xtextPackage.COLONNES__CONTRAINTES:
        return basicSetContraintes(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Table_xtextPackage.COLONNES__NAME:
        return getName();
      case Table_xtextPackage.COLONNES__ELEMENT_TYPE:
        return getElementType();
      case Table_xtextPackage.COLONNES__CONTRAINTES:
        return getContraintes();
      case Table_xtextPackage.COLONNES__NB_LIGNES:
        return getNbLignes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Table_xtextPackage.COLONNES__NAME:
        setName((String)newValue);
        return;
      case Table_xtextPackage.COLONNES__ELEMENT_TYPE:
        setElementType((ColonneElementType)newValue);
        return;
      case Table_xtextPackage.COLONNES__CONTRAINTES:
        setContraintes((Contrainte)newValue);
        return;
      case Table_xtextPackage.COLONNES__NB_LIGNES:
        setNbLignes((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Table_xtextPackage.COLONNES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Table_xtextPackage.COLONNES__ELEMENT_TYPE:
        setElementType(ELEMENT_TYPE_EDEFAULT);
        return;
      case Table_xtextPackage.COLONNES__CONTRAINTES:
        setContraintes((Contrainte)null);
        return;
      case Table_xtextPackage.COLONNES__NB_LIGNES:
        setNbLignes(NB_LIGNES_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Table_xtextPackage.COLONNES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Table_xtextPackage.COLONNES__ELEMENT_TYPE:
        return elementType != ELEMENT_TYPE_EDEFAULT;
      case Table_xtextPackage.COLONNES__CONTRAINTES:
        return contraintes != null;
      case Table_xtextPackage.COLONNES__NB_LIGNES:
        return nbLignes != NB_LIGNES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", elementType: ");
    result.append(elementType);
    result.append(", nbLignes: ");
    result.append(nbLignes);
    result.append(')');
    return result.toString();
  }

} //ColonnesImpl
