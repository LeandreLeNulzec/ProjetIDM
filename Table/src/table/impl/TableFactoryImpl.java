/**
 */
package table.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import table.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableFactoryImpl extends EFactoryImpl implements TableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableFactory init() {
		try {
			TableFactory theTableFactory = (TableFactory)EPackage.Registry.INSTANCE.getEFactory(TablePackage.eNS_URI);
			if (theTableFactory != null) {
				return theTableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFactoryImpl() {
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
			case TablePackage.TABLE: return createTable();
			case TablePackage.COLONNE: return createColonne();
			case TablePackage.COLONNE_PROVIENT: return createColonneProvient();
			case TablePackage.COLONNE_DERIVEE: return createColonneDerivee();
			case TablePackage.CONTENU_FLOAT: return createContenuFloat();
			case TablePackage.CONTENU_INT: return createContenuInt();
			case TablePackage.CONTENU_BOOL: return createContenuBool();
			case TablePackage.CONTENU_STRING: return createContenuString();
			case TablePackage.OU: return createOu();
			case TablePackage.ET: return createEt();
			case TablePackage.PREDICAT_VALEUR: return createPredicatValeur();
			case TablePackage.PREDICAT_COLONNE: return createPredicatColonne();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TablePackage.COLONNES_ELEMENTS_TYPE:
				return createColonnesElementsTypeFromString(eDataType, initialValue);
			case TablePackage.CONDITION:
				return createConditionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TablePackage.COLONNES_ELEMENTS_TYPE:
				return convertColonnesElementsTypeToString(eDataType, instanceValue);
			case TablePackage.CONDITION:
				return convertConditionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne createColonne() {
		ColonneImpl colonne = new ColonneImpl();
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneProvient createColonneProvient() {
		ColonneProvientImpl colonneProvient = new ColonneProvientImpl();
		return colonneProvient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneDerivee createColonneDerivee() {
		ColonneDeriveeImpl colonneDerivee = new ColonneDeriveeImpl();
		return colonneDerivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContenuFloat createContenuFloat() {
		ContenuFloatImpl contenuFloat = new ContenuFloatImpl();
		return contenuFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContenuInt createContenuInt() {
		ContenuIntImpl contenuInt = new ContenuIntImpl();
		return contenuInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContenuBool createContenuBool() {
		ContenuBoolImpl contenuBool = new ContenuBoolImpl();
		return contenuBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContenuString createContenuString() {
		ContenuStringImpl contenuString = new ContenuStringImpl();
		return contenuString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ou createOu() {
		OuImpl ou = new OuImpl();
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Et createEt() {
		EtImpl et = new EtImpl();
		return et;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicatValeur createPredicatValeur() {
		PredicatValeurImpl predicatValeur = new PredicatValeurImpl();
		return predicatValeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicatColonne createPredicatColonne() {
		PredicatColonneImpl predicatColonne = new PredicatColonneImpl();
		return predicatColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonnesElementsType createColonnesElementsTypeFromString(EDataType eDataType, String initialValue) {
		ColonnesElementsType result = ColonnesElementsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColonnesElementsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createConditionFromString(EDataType eDataType, String initialValue) {
		Condition result = Condition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TablePackage getTablePackage() {
		return (TablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TablePackage getPackage() {
		return TablePackage.eINSTANCE;
	}

} //TableFactoryImpl
