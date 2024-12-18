/**
 */
package table.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import table.*;

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
 * @see table.TablePackage
 * @generated
 */
public class TableSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableSwitch() {
		if (modelPackage == null) {
			modelPackage = TablePackage.eINSTANCE;
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
			case TablePackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.COLONNE: {
				Colonne colonne = (Colonne)theEObject;
				T result = caseColonne(colonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.COLONNE_PROVIENT: {
				ColonneProvient colonneProvient = (ColonneProvient)theEObject;
				T result = caseColonneProvient(colonneProvient);
				if (result == null) result = caseColonne(colonneProvient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.COLONNE_DERIVEE: {
				ColonneDerivee colonneDerivee = (ColonneDerivee)theEObject;
				T result = caseColonneDerivee(colonneDerivee);
				if (result == null) result = caseColonne(colonneDerivee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENU: {
				Contenu contenu = (Contenu)theEObject;
				T result = caseContenu(contenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENU_FLOAT: {
				ContenuFloat contenuFloat = (ContenuFloat)theEObject;
				T result = caseContenuFloat(contenuFloat);
				if (result == null) result = caseContenu(contenuFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENU_INT: {
				ContenuInt contenuInt = (ContenuInt)theEObject;
				T result = caseContenuInt(contenuInt);
				if (result == null) result = caseContenu(contenuInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENU_BOOL: {
				ContenuBool contenuBool = (ContenuBool)theEObject;
				T result = caseContenuBool(contenuBool);
				if (result == null) result = caseContenu(contenuBool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENU_STRING: {
				ContenuString contenuString = (ContenuString)theEObject;
				T result = caseContenuString(contenuString);
				if (result == null) result = caseContenu(contenuString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTRAINTE: {
				Contrainte contrainte = (Contrainte)theEObject;
				T result = caseContrainte(contrainte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.OU: {
				Ou ou = (Ou)theEObject;
				T result = caseOu(ou);
				if (result == null) result = caseContrainte(ou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.ET: {
				Et et = (Et)theEObject;
				T result = caseEt(et);
				if (result == null) result = caseContrainte(et);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.PREDICAT: {
				Predicat predicat = (Predicat)theEObject;
				T result = casePredicat(predicat);
				if (result == null) result = caseContrainte(predicat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.PREDICAT_VALEUR: {
				PredicatValeur predicatValeur = (PredicatValeur)theEObject;
				T result = casePredicatValeur(predicatValeur);
				if (result == null) result = casePredicat(predicatValeur);
				if (result == null) result = caseContrainte(predicatValeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.PREDICAT_COLONNE: {
				PredicatColonne predicatColonne = (PredicatColonne)theEObject;
				T result = casePredicatColonne(predicatColonne);
				if (result == null) result = casePredicat(predicatColonne);
				if (result == null) result = caseContrainte(predicatColonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonne(Colonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Provient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Provient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneProvient(ColonneProvient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Derivee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Derivee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneDerivee(ColonneDerivee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenu(Contenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenuFloat(ContenuFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenuInt(ContenuInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenuBool(ContenuBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenuString(ContenuString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainte(Contrainte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ou</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ou</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOu(Ou object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Et</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Et</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEt(Et object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicat(Predicat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicat Valeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicat Valeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicatValeur(PredicatValeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicat Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicat Colonne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicatColonne(PredicatColonne object) {
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

} //TableSwitch
