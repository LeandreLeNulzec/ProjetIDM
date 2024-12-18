/**
 */
package table.impl;

import algorithme.AlgorithmePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import script.ScriptPackage;
import table.Colonne;
import table.ColonneDerivee;
import table.ColonneProvient;
import table.ColonnesElementsType;
import table.Condition;
import table.Contenu;
import table.ContenuBool;
import table.ContenuFloat;
import table.ContenuInt;
import table.ContenuString;
import table.Contrainte;
import table.Et;
import table.Ou;
import table.Predicat;
import table.PredicatColonne;
import table.PredicatValeur;
import table.Table;
import table.TableFactory;
import table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TablePackageImpl extends EPackageImpl implements TablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneProvientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneDeriveeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuBoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicatValeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicatColonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colonnesElementsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see table.TablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TablePackageImpl() {
		super(eNS_URI, TableFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TablePackage init() {
		if (isInited) return (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TablePackageImpl theTablePackage = registeredTablePackage instanceof TablePackageImpl ? (TablePackageImpl)registeredTablePackage : new TablePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AlgorithmePackage.eINSTANCE.eClass();
		ScriptPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTablePackage.createPackageContents();

		// Initialize created meta-data
		theTablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TablePackage.eNS_URI, theTablePackage);
		return theTablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Nom() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Colonnes() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_IdColonne() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Nom() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Table() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_ElementType() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Contraintes() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_NbLignes() {
		return (EAttribute)colonneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Contenu() {
		return (EReference)colonneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneProvient() {
		return colonneProvientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneProvient_TableOrigine() {
		return (EReference)colonneProvientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonneProvient_RefColonne() {
		return (EAttribute)colonneProvientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneDerivee() {
		return colonneDeriveeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneDerivee_Algorithme() {
		return (EReference)colonneDeriveeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneDerivee_ColonnesEntree() {
		return (EReference)colonneDeriveeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenu() {
		return contenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenuFloat() {
		return contenuFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenuFloat_Contenu() {
		return (EAttribute)contenuFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenuInt() {
		return contenuIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenuInt_Contenu() {
		return (EAttribute)contenuIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenuBool() {
		return contenuBoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenuBool_Contenu() {
		return (EAttribute)contenuBoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenuString() {
		return contenuStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenuString_Contenu() {
		return (EAttribute)contenuStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContrainte() {
		return contrainteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOu() {
		return ouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOu_Variables() {
		return (EReference)ouEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEt() {
		return etEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEt_Variables() {
		return (EReference)etEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicat() {
		return predicatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicat_Condition() {
		return (EAttribute)predicatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicatValeur() {
		return predicatValeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicatValeur_Comparant() {
		return (EAttribute)predicatValeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicatColonne() {
		return predicatColonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicatColonne_ColonneComparante() {
		return (EReference)predicatColonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColonnesElementsType() {
		return colonnesElementsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCondition() {
		return conditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableFactory getTableFactory() {
		return (TableFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NOM);
		createEReference(tableEClass, TABLE__COLONNES);
		createEReference(tableEClass, TABLE__ID_COLONNE);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__NOM);
		createEReference(colonneEClass, COLONNE__TABLE);
		createEAttribute(colonneEClass, COLONNE__ELEMENT_TYPE);
		createEReference(colonneEClass, COLONNE__CONTRAINTES);
		createEAttribute(colonneEClass, COLONNE__NB_LIGNES);
		createEReference(colonneEClass, COLONNE__CONTENU);

		colonneProvientEClass = createEClass(COLONNE_PROVIENT);
		createEReference(colonneProvientEClass, COLONNE_PROVIENT__TABLE_ORIGINE);
		createEAttribute(colonneProvientEClass, COLONNE_PROVIENT__REF_COLONNE);

		colonneDeriveeEClass = createEClass(COLONNE_DERIVEE);
		createEReference(colonneDeriveeEClass, COLONNE_DERIVEE__ALGORITHME);
		createEReference(colonneDeriveeEClass, COLONNE_DERIVEE__COLONNES_ENTREE);

		contenuEClass = createEClass(CONTENU);

		contenuFloatEClass = createEClass(CONTENU_FLOAT);
		createEAttribute(contenuFloatEClass, CONTENU_FLOAT__CONTENU);

		contenuIntEClass = createEClass(CONTENU_INT);
		createEAttribute(contenuIntEClass, CONTENU_INT__CONTENU);

		contenuBoolEClass = createEClass(CONTENU_BOOL);
		createEAttribute(contenuBoolEClass, CONTENU_BOOL__CONTENU);

		contenuStringEClass = createEClass(CONTENU_STRING);
		createEAttribute(contenuStringEClass, CONTENU_STRING__CONTENU);

		contrainteEClass = createEClass(CONTRAINTE);

		ouEClass = createEClass(OU);
		createEReference(ouEClass, OU__VARIABLES);

		etEClass = createEClass(ET);
		createEReference(etEClass, ET__VARIABLES);

		predicatEClass = createEClass(PREDICAT);
		createEAttribute(predicatEClass, PREDICAT__CONDITION);

		predicatValeurEClass = createEClass(PREDICAT_VALEUR);
		createEAttribute(predicatValeurEClass, PREDICAT_VALEUR__COMPARANT);

		predicatColonneEClass = createEClass(PREDICAT_COLONNE);
		createEReference(predicatColonneEClass, PREDICAT_COLONNE__COLONNE_COMPARANTE);

		// Create enums
		colonnesElementsTypeEEnum = createEEnum(COLONNES_ELEMENTS_TYPE);
		conditionEEnum = createEEnum(CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AlgorithmePackage theAlgorithmePackage = (AlgorithmePackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		colonneProvientEClass.getESuperTypes().add(this.getColonne());
		colonneDeriveeEClass.getESuperTypes().add(this.getColonne());
		contenuFloatEClass.getESuperTypes().add(this.getContenu());
		contenuIntEClass.getESuperTypes().add(this.getContenu());
		contenuBoolEClass.getESuperTypes().add(this.getContenu());
		contenuStringEClass.getESuperTypes().add(this.getContenu());
		ouEClass.getESuperTypes().add(this.getContrainte());
		etEClass.getESuperTypes().add(this.getContrainte());
		predicatEClass.getESuperTypes().add(this.getContrainte());
		predicatValeurEClass.getESuperTypes().add(this.getPredicat());
		predicatColonneEClass.getESuperTypes().add(this.getPredicat());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Nom(), ecorePackage.getEString(), "nom", "tableSansNom", 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Colonnes(), this.getColonne(), this.getColonne_Table(), "colonnes", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_IdColonne(), this.getColonne(), null, "idColonne", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Nom(), ecorePackage.getEString(), "nom", "colonneSansNom", 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Table(), this.getTable(), this.getTable_Colonnes(), "table", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_ElementType(), this.getColonnesElementsType(), "ElementType", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Contraintes(), this.getContrainte(), null, "contraintes", null, 0, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_NbLignes(), ecorePackage.getEInt(), "nbLignes", null, 1, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Contenu(), this.getContenuFloat(), null, "contenu", null, 0, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneProvientEClass, ColonneProvient.class, "ColonneProvient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneProvient_TableOrigine(), this.getTable(), null, "tableOrigine", null, 1, 1, ColonneProvient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonneProvient_RefColonne(), ecorePackage.getEString(), "refColonne", null, 1, 1, ColonneProvient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneDeriveeEClass, ColonneDerivee.class, "ColonneDerivee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneDerivee_Algorithme(), theAlgorithmePackage.getAlgorithme(), null, "algorithme", null, 1, 1, ColonneDerivee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonneDerivee_ColonnesEntree(), this.getColonne(), null, "colonnesEntree", null, 0, -1, ColonneDerivee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenuEClass, Contenu.class, "Contenu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contenuFloatEClass, ContenuFloat.class, "ContenuFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenuFloat_Contenu(), ecorePackage.getEFloat(), "contenu", null, 0, -1, ContenuFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenuIntEClass, ContenuInt.class, "ContenuInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenuInt_Contenu(), ecorePackage.getEInt(), "contenu", null, 0, -1, ContenuInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenuBoolEClass, ContenuBool.class, "ContenuBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenuBool_Contenu(), ecorePackage.getEBoolean(), "contenu", null, 0, -1, ContenuBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenuStringEClass, ContenuString.class, "ContenuString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenuString_Contenu(), ecorePackage.getEString(), "contenu", null, 0, -1, ContenuString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contrainteEClass, Contrainte.class, "Contrainte", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ouEClass, Ou.class, "Ou", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOu_Variables(), this.getContrainte(), null, "variables", null, 2, -1, Ou.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etEClass, Et.class, "Et", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEt_Variables(), this.getContrainte(), null, "variables", null, 2, -1, Et.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicatEClass, Predicat.class, "Predicat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicat_Condition(), this.getCondition(), "condition", null, 1, 1, Predicat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicatValeurEClass, PredicatValeur.class, "PredicatValeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicatValeur_Comparant(), ecorePackage.getEFloat(), "comparant", null, 1, 1, PredicatValeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicatColonneEClass, PredicatColonne.class, "PredicatColonne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicatColonne_ColonneComparante(), this.getColonne(), null, "colonneComparante", null, 1, 1, PredicatColonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colonnesElementsTypeEEnum, ColonnesElementsType.class, "ColonnesElementsType");
		addEEnumLiteral(colonnesElementsTypeEEnum, ColonnesElementsType.FLOAT);
		addEEnumLiteral(colonnesElementsTypeEEnum, ColonnesElementsType.INT);
		addEEnumLiteral(colonnesElementsTypeEEnum, ColonnesElementsType.STRING);
		addEEnumLiteral(colonnesElementsTypeEEnum, ColonnesElementsType.BOOL);

		initEEnum(conditionEEnum, Condition.class, "Condition");
		addEEnumLiteral(conditionEEnum, Condition.INFERIEUR_OU_EGAL);
		addEEnumLiteral(conditionEEnum, Condition.INFERIEUR_STRICT);
		addEEnumLiteral(conditionEEnum, Condition.EGAL);
		addEEnumLiteral(conditionEEnum, Condition.SUPERIEUR_STRICT);
		addEEnumLiteral(conditionEEnum, Condition.SUPERIEUR_OU_EGAL);

		// Create resource
		createResource(eNS_URI);
	}

} //TablePackageImpl
