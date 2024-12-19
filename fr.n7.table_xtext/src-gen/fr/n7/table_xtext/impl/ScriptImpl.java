/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext.impl;

import fr.n7.table_xtext.Colonne;
import fr.n7.table_xtext.Script;
import fr.n7.table_xtext.ScriptElements;
import fr.n7.table_xtext.Table_xtextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.impl.ScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.table_xtext.impl.ScriptImpl#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link fr.n7.table_xtext.impl.ScriptImpl#getScriptElements <em>Script Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
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
   * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntrees()
   * @generated
   * @ordered
   */
  protected EList<Colonne> entrees;

  /**
   * The cached value of the '{@link #getScriptElements() <em>Script Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptElements()
   * @generated
   * @ordered
   */
  protected EList<ScriptElements> scriptElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return Table_xtextPackage.Literals.SCRIPT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.SCRIPT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Colonne> getEntrees()
  {
    if (entrees == null)
    {
      entrees = new EObjectResolvingEList<Colonne>(Colonne.class, this, Table_xtextPackage.SCRIPT__ENTREES);
    }
    return entrees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ScriptElements> getScriptElements()
  {
    if (scriptElements == null)
    {
      scriptElements = new EObjectContainmentEList<ScriptElements>(ScriptElements.class, this, Table_xtextPackage.SCRIPT__SCRIPT_ELEMENTS);
    }
    return scriptElements;
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
      case Table_xtextPackage.SCRIPT__SCRIPT_ELEMENTS:
        return ((InternalEList<?>)getScriptElements()).basicRemove(otherEnd, msgs);
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
      case Table_xtextPackage.SCRIPT__NAME:
        return getName();
      case Table_xtextPackage.SCRIPT__ENTREES:
        return getEntrees();
      case Table_xtextPackage.SCRIPT__SCRIPT_ELEMENTS:
        return getScriptElements();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Table_xtextPackage.SCRIPT__NAME:
        setName((String)newValue);
        return;
      case Table_xtextPackage.SCRIPT__ENTREES:
        getEntrees().clear();
        getEntrees().addAll((Collection<? extends Colonne>)newValue);
        return;
      case Table_xtextPackage.SCRIPT__SCRIPT_ELEMENTS:
        getScriptElements().clear();
        getScriptElements().addAll((Collection<? extends ScriptElements>)newValue);
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
      case Table_xtextPackage.SCRIPT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Table_xtextPackage.SCRIPT__ENTREES:
        getEntrees().clear();
        return;
      case Table_xtextPackage.SCRIPT__SCRIPT_ELEMENTS:
        getScriptElements().clear();
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
      case Table_xtextPackage.SCRIPT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Table_xtextPackage.SCRIPT__ENTREES:
        return entrees != null && !entrees.isEmpty();
      case Table_xtextPackage.SCRIPT__SCRIPT_ELEMENTS:
        return scriptElements != null && !scriptElements.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ScriptImpl
