/**
 * generated by Xtext 2.32.0
 */
package fr.n7.algorithme_xtext.impl;

import fr.n7.algorithme_xtext.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Algorithme_xtextFactoryImpl extends EFactoryImpl implements Algorithme_xtextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Algorithme_xtextFactory init()
  {
    try
    {
      Algorithme_xtextFactory theAlgorithme_xtextFactory = (Algorithme_xtextFactory)EPackage.Registry.INSTANCE.getEFactory(Algorithme_xtextPackage.eNS_URI);
      if (theAlgorithme_xtextFactory != null)
      {
        return theAlgorithme_xtextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Algorithme_xtextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Algorithme_xtextFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Algorithme_xtextPackage.ALGORITHME: return createAlgorithme();
      case Algorithme_xtextPackage.ALGORITHME_ELEMENTS: return createAlgorithmeElements();
      case Algorithme_xtextPackage.RESSOURCES: return createRessources();
      case Algorithme_xtextPackage.DOCUMENTATION: return createDocumentation();
      case Algorithme_xtextPackage.ENTREE: return createEntree();
      case Algorithme_xtextPackage.SORTIE: return createSortie();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithme createAlgorithme()
  {
    AlgorithmeImpl algorithme = new AlgorithmeImpl();
    return algorithme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlgorithmeElements createAlgorithmeElements()
  {
    AlgorithmeElementsImpl algorithmeElements = new AlgorithmeElementsImpl();
    return algorithmeElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ressources createRessources()
  {
    RessourcesImpl ressources = new RessourcesImpl();
    return ressources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Documentation createDocumentation()
  {
    DocumentationImpl documentation = new DocumentationImpl();
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entree createEntree()
  {
    EntreeImpl entree = new EntreeImpl();
    return entree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sortie createSortie()
  {
    SortieImpl sortie = new SortieImpl();
    return sortie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithme_xtextPackage getAlgorithme_xtextPackage()
  {
    return (Algorithme_xtextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Algorithme_xtextPackage getPackage()
  {
    return Algorithme_xtextPackage.eINSTANCE;
  }

} //Algorithme_xtextFactoryImpl
