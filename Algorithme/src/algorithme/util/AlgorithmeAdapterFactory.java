/**
 */
package algorithme.util;

import algorithme.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see algorithme.AlgorithmePackage
 * @generated
 */
public class AlgorithmeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgorithmePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlgorithmePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmeSwitch<Adapter> modelSwitch =
		new AlgorithmeSwitch<Adapter>() {
			@Override
			public Adapter caseAlgorithme(Algorithme object) {
				return createAlgorithmeAdapter();
			}
			@Override
			public Adapter caseRessources(Ressources object) {
				return createRessourcesAdapter();
			}
			@Override
			public Adapter caseProgramme(Programme object) {
				return createProgrammeAdapter();
			}
			@Override
			public Adapter caseFichier(Fichier object) {
				return createFichierAdapter();
			}
			@Override
			public Adapter caseGuidance(Guidance object) {
				return createGuidanceAdapter();
			}
			@Override
			public Adapter caseE_S(E_S object) {
				return createE_SAdapter();
			}
			@Override
			public Adapter caseEntrée(Entrée object) {
				return createEntréeAdapter();
			}
			@Override
			public Adapter caseSortie(Sortie object) {
				return createSortieAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Algorithme
	 * @generated
	 */
	public Adapter createAlgorithmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Ressources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Ressources
	 * @generated
	 */
	public Adapter createRessourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Programme
	 * @generated
	 */
	public Adapter createProgrammeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Fichier
	 * @generated
	 */
	public Adapter createFichierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Guidance
	 * @generated
	 */
	public Adapter createGuidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.E_S <em>ES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.E_S
	 * @generated
	 */
	public Adapter createE_SAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Entrée <em>Entrée</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Entrée
	 * @generated
	 */
	public Adapter createEntréeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link algorithme.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see algorithme.Sortie
	 * @generated
	 */
	public Adapter createSortieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlgorithmeAdapterFactory
