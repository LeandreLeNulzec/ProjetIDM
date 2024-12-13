/**
 */
package script.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import script.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see script.ScriptPackage
 * @generated
 */
public class ScriptAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScriptPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScriptPackage.eINSTANCE;
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
	protected ScriptSwitch<Adapter> modelSwitch =
		new ScriptSwitch<Adapter>() {
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseScriptElements(ScriptElements object) {
				return createScriptElementsAdapter();
			}
			@Override
			public Adapter casePortEntree(PortEntree object) {
				return createPortEntreeAdapter();
			}
			@Override
			public Adapter casePortSortie(PortSortie object) {
				return createPortSortieAdapter();
			}
			@Override
			public Adapter caseEntree(Entree object) {
				return createEntreeAdapter();
			}
			@Override
			public Adapter caseSortie(Sortie object) {
				return createSortieAdapter();
			}
			@Override
			public Adapter caseBloc_Binaire(Bloc_Binaire object) {
				return createBloc_BinaireAdapter();
			}
			@Override
			public Adapter caseBloc_Unaire(Bloc_Unaire object) {
				return createBloc_UnaireAdapter();
			}
			@Override
			public Adapter caseBloc_Fonction(Bloc_Fonction object) {
				return createBloc_FonctionAdapter();
			}
			@Override
			public Adapter caseAddition(Addition object) {
				return createAdditionAdapter();
			}
			@Override
			public Adapter caseMultiplication(Multiplication object) {
				return createMultiplicationAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseMin(Min object) {
				return createMinAdapter();
			}
			@Override
			public Adapter caseMax(Max object) {
				return createMaxAdapter();
			}
			@Override
			public Adapter caseOppose(Oppose object) {
				return createOpposeAdapter();
			}
			@Override
			public Adapter caseInverse(Inverse object) {
				return createInverseAdapter();
			}
			@Override
			public Adapter caseSin(Sin object) {
				return createSinAdapter();
			}
			@Override
			public Adapter caseCos(Cos object) {
				return createCosAdapter();
			}
			@Override
			public Adapter caseRacine(Racine object) {
				return createRacineAdapter();
			}
			@Override
			public Adapter caseExpo(Expo object) {
				return createExpoAdapter();
			}
			@Override
			public Adapter caseConstante(Constante object) {
				return createConstanteAdapter();
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
	 * Creates a new adapter for an object of class '{@link script.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.ScriptElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.ScriptElements
	 * @generated
	 */
	public Adapter createScriptElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.PortEntree <em>Port Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.PortEntree
	 * @generated
	 */
	public Adapter createPortEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.PortSortie <em>Port Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.PortSortie
	 * @generated
	 */
	public Adapter createPortSortieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Entree
	 * @generated
	 */
	public Adapter createEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Sortie
	 * @generated
	 */
	public Adapter createSortieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Bloc_Binaire <em>Bloc Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Bloc_Binaire
	 * @generated
	 */
	public Adapter createBloc_BinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Bloc_Unaire <em>Bloc Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Bloc_Unaire
	 * @generated
	 */
	public Adapter createBloc_UnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Bloc_Fonction <em>Bloc Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Bloc_Fonction
	 * @generated
	 */
	public Adapter createBloc_FonctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Min
	 * @generated
	 */
	public Adapter createMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Max
	 * @generated
	 */
	public Adapter createMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Oppose <em>Oppose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Oppose
	 * @generated
	 */
	public Adapter createOpposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Inverse
	 * @generated
	 */
	public Adapter createInverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Sin <em>Sin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Sin
	 * @generated
	 */
	public Adapter createSinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Cos <em>Cos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Cos
	 * @generated
	 */
	public Adapter createCosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Racine <em>Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Racine
	 * @generated
	 */
	public Adapter createRacineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Expo <em>Expo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Expo
	 * @generated
	 */
	public Adapter createExpoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link script.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see script.Constante
	 * @generated
	 */
	public Adapter createConstanteAdapter() {
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

} //ScriptAdapterFactory
