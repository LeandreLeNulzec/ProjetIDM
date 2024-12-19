/**
 * generated by Xtext 2.32.0
 */
package fr.n7.algorithme_xtext.util;

import fr.n7.algorithme_xtext.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.n7.algorithme_xtext.Algorithme_xtextPackage
 * @generated
 */
public class Algorithme_xtextSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Algorithme_xtextPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Algorithme_xtextSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Algorithme_xtextPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Algorithme_xtextPackage.ALGORITHME:
      {
        Algorithme algorithme = (Algorithme)theEObject;
        T result = caseAlgorithme(algorithme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Algorithme_xtextPackage.ALGORITHME_ELEMENTS:
      {
        AlgorithmeElements algorithmeElements = (AlgorithmeElements)theEObject;
        T result = caseAlgorithmeElements(algorithmeElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Algorithme_xtextPackage.RESSOURCES:
      {
        Ressources ressources = (Ressources)theEObject;
        T result = caseRessources(ressources);
        if (result == null) result = caseAlgorithmeElements(ressources);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Algorithme_xtextPackage.DOCUMENTATION:
      {
        Documentation documentation = (Documentation)theEObject;
        T result = caseDocumentation(documentation);
        if (result == null) result = caseAlgorithmeElements(documentation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Algorithme_xtextPackage.ENTREE:
      {
        Entree entree = (Entree)theEObject;
        T result = caseEntree(entree);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Algorithme_xtextPackage.SORTIE:
      {
        Sortie sortie = (Sortie)theEObject;
        T result = caseSortie(sortie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algorithme</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algorithme</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgorithme(Algorithme object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algorithme Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algorithme Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgorithmeElements(AlgorithmeElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ressources</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ressources</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRessources(Ressources object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentation(Documentation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntree(Entree object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sortie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sortie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortie(Sortie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Algorithme_xtextSwitch