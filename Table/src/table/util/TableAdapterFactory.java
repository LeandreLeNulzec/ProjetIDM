/**
 */
package table.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import table.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see table.TablePackage
 * @generated
 */
public class TableAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TablePackage.eINSTANCE;
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
	protected TableSwitch<Adapter> modelSwitch =
		new TableSwitch<Adapter>() {
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseColonne(Colonne object) {
				return createColonneAdapter();
			}
			@Override
			public Adapter caseColonneProvient(ColonneProvient object) {
				return createColonneProvientAdapter();
			}
			@Override
			public Adapter caseColonneDerivee(ColonneDerivee object) {
				return createColonneDeriveeAdapter();
			}
			@Override
			public Adapter caseContenu(Contenu object) {
				return createContenuAdapter();
			}
			@Override
			public Adapter caseContenuFloat(ContenuFloat object) {
				return createContenuFloatAdapter();
			}
			@Override
			public Adapter caseContenuInt(ContenuInt object) {
				return createContenuIntAdapter();
			}
			@Override
			public Adapter caseContenuBool(ContenuBool object) {
				return createContenuBoolAdapter();
			}
			@Override
			public Adapter caseContenuString(ContenuString object) {
				return createContenuStringAdapter();
			}
			@Override
			public Adapter caseContrainte(Contrainte object) {
				return createContrainteAdapter();
			}
			@Override
			public Adapter caseOu(Ou object) {
				return createOuAdapter();
			}
			@Override
			public Adapter caseEt(Et object) {
				return createEtAdapter();
			}
			@Override
			public Adapter casePredicat(Predicat object) {
				return createPredicatAdapter();
			}
			@Override
			public Adapter casePredicatValeur(PredicatValeur object) {
				return createPredicatValeurAdapter();
			}
			@Override
			public Adapter casePredicatColonne(PredicatColonne object) {
				return createPredicatColonneAdapter();
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
	 * Creates a new adapter for an object of class '{@link table.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Colonne
	 * @generated
	 */
	public Adapter createColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.ColonneProvient <em>Colonne Provient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.ColonneProvient
	 * @generated
	 */
	public Adapter createColonneProvientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.ColonneDerivee <em>Colonne Derivee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.ColonneDerivee
	 * @generated
	 */
	public Adapter createColonneDeriveeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Contenu
	 * @generated
	 */
	public Adapter createContenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.ContenuFloat <em>Contenu Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.ContenuFloat
	 * @generated
	 */
	public Adapter createContenuFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.ContenuInt <em>Contenu Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.ContenuInt
	 * @generated
	 */
	public Adapter createContenuIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.ContenuBool <em>Contenu Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.ContenuBool
	 * @generated
	 */
	public Adapter createContenuBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.ContenuString <em>Contenu String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.ContenuString
	 * @generated
	 */
	public Adapter createContenuStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Contrainte
	 * @generated
	 */
	public Adapter createContrainteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.Ou <em>Ou</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Ou
	 * @generated
	 */
	public Adapter createOuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.Et <em>Et</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Et
	 * @generated
	 */
	public Adapter createEtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.Predicat
	 * @generated
	 */
	public Adapter createPredicatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.PredicatValeur <em>Predicat Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.PredicatValeur
	 * @generated
	 */
	public Adapter createPredicatValeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link table.PredicatColonne <em>Predicat Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see table.PredicatColonne
	 * @generated
	 */
	public Adapter createPredicatColonneAdapter() {
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

} //TableAdapterFactory
