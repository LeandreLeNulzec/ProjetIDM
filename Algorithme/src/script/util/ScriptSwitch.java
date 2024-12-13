/**
 */
package script.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import script.*;

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
 * @see script.ScriptPackage
 * @generated
 */
public class ScriptSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScriptPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptSwitch() {
		if (modelPackage == null) {
			modelPackage = ScriptPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScriptPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.SCRIPT_ELEMENTS: {
				ScriptElements scriptElements = (ScriptElements)theEObject;
				T result = caseScriptElements(scriptElements);
				if (result == null) result = caseScript(scriptElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.PORT_ENTREE: {
				PortEntree portEntree = (PortEntree)theEObject;
				T result = casePortEntree(portEntree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.PORT_SORTIE: {
				PortSortie portSortie = (PortSortie)theEObject;
				T result = casePortSortie(portSortie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.ENTREE: {
				Entree entree = (Entree)theEObject;
				T result = caseEntree(entree);
				if (result == null) result = casePortEntree(entree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.SORTIE: {
				Sortie sortie = (Sortie)theEObject;
				T result = caseSortie(sortie);
				if (result == null) result = casePortSortie(sortie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.BLOC_BINAIRE: {
				Bloc_Binaire bloc_Binaire = (Bloc_Binaire)theEObject;
				T result = caseBloc_Binaire(bloc_Binaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.BLOC_UNAIRE: {
				Bloc_Unaire bloc_Unaire = (Bloc_Unaire)theEObject;
				T result = caseBloc_Unaire(bloc_Unaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.BLOC_FONCTION: {
				Bloc_Fonction bloc_Fonction = (Bloc_Fonction)theEObject;
				T result = caseBloc_Fonction(bloc_Fonction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseBloc_Binaire(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseBloc_Binaire(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseBloc_Binaire(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.MIN: {
				Min min = (Min)theEObject;
				T result = caseMin(min);
				if (result == null) result = caseBloc_Binaire(min);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.MAX: {
				Max max = (Max)theEObject;
				T result = caseMax(max);
				if (result == null) result = caseBloc_Binaire(max);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.OPPOSE: {
				Oppose oppose = (Oppose)theEObject;
				T result = caseOppose(oppose);
				if (result == null) result = caseBloc_Unaire(oppose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.INVERSE: {
				Inverse inverse = (Inverse)theEObject;
				T result = caseInverse(inverse);
				if (result == null) result = caseBloc_Unaire(inverse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.SIN: {
				Sin sin = (Sin)theEObject;
				T result = caseSin(sin);
				if (result == null) result = caseBloc_Fonction(sin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.COS: {
				Cos cos = (Cos)theEObject;
				T result = caseCos(cos);
				if (result == null) result = caseBloc_Fonction(cos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.RACINE: {
				Racine racine = (Racine)theEObject;
				T result = caseRacine(racine);
				if (result == null) result = caseBloc_Fonction(racine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.EXPO: {
				Expo expo = (Expo)theEObject;
				T result = caseExpo(expo);
				if (result == null) result = caseBloc_Fonction(expo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScriptPackage.CONSTANTE: {
				Constante constante = (Constante)theEObject;
				T result = caseConstante(constante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptElements(ScriptElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortEntree(PortEntree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Sortie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSortie(PortSortie object) {
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
	public T caseEntree(Entree object) {
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
	public T caseSortie(Sortie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloc_Binaire(Bloc_Binaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloc_Unaire(Bloc_Unaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Fonction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Fonction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloc_Fonction(Bloc_Fonction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin(Min object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax(Max object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOppose(Oppose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverse(Inverse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSin(Sin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCos(Cos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Racine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Racine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRacine(Racine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpo(Expo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstante(Constante object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ScriptSwitch
