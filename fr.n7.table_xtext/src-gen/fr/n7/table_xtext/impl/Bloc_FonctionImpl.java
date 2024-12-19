/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext.impl;

import fr.n7.table_xtext.Bloc_Fonction;
import fr.n7.table_xtext.Table_xtextPackage;
import fr.n7.table_xtext.fonction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc Fonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.impl.Bloc_FonctionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bloc_FonctionImpl extends BlocImpl implements Bloc_Fonction
{
  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final fonction OPERATION_EDEFAULT = fonction.MIN;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected fonction operation = OPERATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Bloc_FonctionImpl()
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
    return Table_xtextPackage.Literals.BLOC_FONCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public fonction getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperation(fonction newOperation)
  {
    fonction oldOperation = operation;
    operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.BLOC_FONCTION__OPERATION, oldOperation, operation));
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
      case Table_xtextPackage.BLOC_FONCTION__OPERATION:
        return getOperation();
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
      case Table_xtextPackage.BLOC_FONCTION__OPERATION:
        setOperation((fonction)newValue);
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
      case Table_xtextPackage.BLOC_FONCTION__OPERATION:
        setOperation(OPERATION_EDEFAULT);
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
      case Table_xtextPackage.BLOC_FONCTION__OPERATION:
        return operation != OPERATION_EDEFAULT;
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
    result.append(" (operation: ");
    result.append(operation);
    result.append(')');
    return result.toString();
  }

} //Bloc_FonctionImpl
