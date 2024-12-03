/**
 */
package algorithme.impl;

import algorithme.*;

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
public class AlgorithmeFactoryImpl extends EFactoryImpl implements AlgorithmeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgorithmeFactory init() {
		try {
			AlgorithmeFactory theAlgorithmeFactory = (AlgorithmeFactory)EPackage.Registry.INSTANCE.getEFactory(AlgorithmePackage.eNS_URI);
			if (theAlgorithmeFactory != null) {
				return theAlgorithmeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgorithmeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AlgorithmePackage.ALGORITHME: return createAlgorithme();
			case AlgorithmePackage.RESSOURCES: return createRessources();
			case AlgorithmePackage.PROGRAMME: return createProgramme();
			case AlgorithmePackage.FICHIER: return createFichier();
			case AlgorithmePackage.GUIDANCE: return createGuidance();
			case AlgorithmePackage.ES: return createE_S();
			case AlgorithmePackage.ENTRÉE: return createEntrée();
			case AlgorithmePackage.SORTIE: return createSortie();
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
	public Algorithme createAlgorithme() {
		AlgorithmeImpl algorithme = new AlgorithmeImpl();
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressources createRessources() {
		RessourcesImpl ressources = new RessourcesImpl();
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fichier createFichier() {
		FichierImpl fichier = new FichierImpl();
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guidance createGuidance() {
		GuidanceImpl guidance = new GuidanceImpl();
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E_S createE_S() {
		E_SImpl e_S = new E_SImpl();
		return e_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entrée createEntrée() {
		EntréeImpl entrée = new EntréeImpl();
		return entrée;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sortie createSortie() {
		SortieImpl sortie = new SortieImpl();
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmePackage getAlgorithmePackage() {
		return (AlgorithmePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgorithmePackage getPackage() {
		return AlgorithmePackage.eINSTANCE;
	}

} //AlgorithmeFactoryImpl
