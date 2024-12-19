/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext.impl;

import fr.n7.table_xtext.Colonnes;
import fr.n7.table_xtext.PredicatColonne;
import fr.n7.table_xtext.Table_xtextPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicat Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.table_xtext.impl.PredicatColonneImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicatColonneImpl extends PredicatImpl implements PredicatColonne
{
  /**
   * The cached value of the '{@link #getColonne() <em>Colonne</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColonne()
   * @generated
   * @ordered
   */
  protected Colonnes colonne;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicatColonneImpl()
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
    return Table_xtextPackage.Literals.PREDICAT_COLONNE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Colonnes getColonne()
  {
    if (colonne != null && colonne.eIsProxy())
    {
      InternalEObject oldColonne = (InternalEObject)colonne;
      colonne = (Colonnes)eResolveProxy(oldColonne);
      if (colonne != oldColonne)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Table_xtextPackage.PREDICAT_COLONNE__COLONNE, oldColonne, colonne));
      }
    }
    return colonne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Colonnes basicGetColonne()
  {
    return colonne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColonne(Colonnes newColonne)
  {
    Colonnes oldColonne = colonne;
    colonne = newColonne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Table_xtextPackage.PREDICAT_COLONNE__COLONNE, oldColonne, colonne));
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
      case Table_xtextPackage.PREDICAT_COLONNE__COLONNE:
        if (resolve) return getColonne();
        return basicGetColonne();
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
      case Table_xtextPackage.PREDICAT_COLONNE__COLONNE:
        setColonne((Colonnes)newValue);
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
      case Table_xtextPackage.PREDICAT_COLONNE__COLONNE:
        setColonne((Colonnes)null);
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
      case Table_xtextPackage.PREDICAT_COLONNE__COLONNE:
        return colonne != null;
    }
    return super.eIsSet(featureID);
  }

} //PredicatColonneImpl
