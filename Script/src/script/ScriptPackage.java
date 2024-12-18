/**
 */
package script;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see script.ScriptFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "script";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://script";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "script";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScriptPackage eINSTANCE = script.impl.ScriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link script.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ScriptImpl
	 * @see script.impl.ScriptPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__SCRIPT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NOM = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.impl.ScriptElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ScriptElementsImpl
	 * @see script.impl.ScriptPackageImpl#getScriptElements()
	 * @generated
	 */
	int SCRIPT_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS__SCRIPT_ELEMENTS = SCRIPT__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS__NOM = SCRIPT__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS__SCRIPT = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS_OPERATION_COUNT = SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.PortImpl
	 * @see script.impl.ScriptPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VALEUR = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.EntreeImpl
	 * @see script.impl.ScriptPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 3;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SCRIPT_ELEMENTS = SCRIPT_ELEMENTS__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__NOM = SCRIPT_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SCRIPT = SCRIPT_ELEMENTS__SCRIPT;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ENTREES = SCRIPT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = SCRIPT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = SCRIPT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.SortieImpl
	 * @see script.impl.ScriptPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 4;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SCRIPT_ELEMENTS = SCRIPT_ELEMENTS__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NOM = SCRIPT_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SCRIPT = SCRIPT_ELEMENTS__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sorties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SORTIES = SCRIPT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = SCRIPT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = SCRIPT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.BlocImpl <em>Bloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.BlocImpl
	 * @see script.impl.ScriptPackageImpl#getBloc()
	 * @generated
	 */
	int BLOC = 5;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__SCRIPT_ELEMENTS = SCRIPT_ELEMENTS__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__NOM = SCRIPT_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__SCRIPT = SCRIPT_ELEMENTS__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__SORTIE = SCRIPT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FEATURE_COUNT = SCRIPT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_OPERATION_COUNT = SCRIPT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.Bloc_BinaireImpl <em>Bloc Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.Bloc_BinaireImpl
	 * @see script.impl.ScriptPackageImpl#getBloc_Binaire()
	 * @generated
	 */
	int BLOC_BINAIRE = 6;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__SCRIPT_ELEMENTS = BLOC__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__NOM = BLOC__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__SCRIPT = BLOC__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__SORTIE = BLOC__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__ENTREES = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bloc Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bloc Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.Bloc_UnaireImpl <em>Bloc Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.Bloc_UnaireImpl
	 * @see script.impl.ScriptPackageImpl#getBloc_Unaire()
	 * @generated
	 */
	int BLOC_UNAIRE = 7;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__SCRIPT_ELEMENTS = BLOC__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__NOM = BLOC__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__SCRIPT = BLOC__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__SORTIE = BLOC__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__ENTREES = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bloc Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bloc Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.Bloc_FonctionImpl <em>Bloc Fonction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.Bloc_FonctionImpl
	 * @see script.impl.ScriptPackageImpl#getBloc_Fonction()
	 * @generated
	 */
	int BLOC_FONCTION = 8;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION__SCRIPT_ELEMENTS = BLOC__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION__NOM = BLOC__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION__SCRIPT = BLOC__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION__SORTIE = BLOC__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION__ENTREES = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bloc Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION_FEATURE_COUNT = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bloc Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.AdditionImpl
	 * @see script.impl.ScriptPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 9;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SCRIPT_ELEMENTS = BLOC_BINAIRE__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__NOM = BLOC_BINAIRE__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SCRIPT = BLOC_BINAIRE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SORTIE = BLOC_BINAIRE__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ENTREES = BLOC_BINAIRE__ENTREES;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.MultiplicationImpl
	 * @see script.impl.ScriptPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SCRIPT_ELEMENTS = BLOC_BINAIRE__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__NOM = BLOC_BINAIRE__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SCRIPT = BLOC_BINAIRE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SORTIE = BLOC_BINAIRE__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__ENTREES = BLOC_BINAIRE__ENTREES;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.DivisionImpl
	 * @see script.impl.ScriptPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 11;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SCRIPT_ELEMENTS = BLOC_BINAIRE__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NOM = BLOC_BINAIRE__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SCRIPT = BLOC_BINAIRE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SORTIE = BLOC_BINAIRE__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ENTREES = BLOC_BINAIRE__ENTREES;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.MinImpl
	 * @see script.impl.ScriptPackageImpl#getMin()
	 * @generated
	 */
	int MIN = 14;

	/**
	 * The meta object id for the '{@link script.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.MaxImpl
	 * @see script.impl.ScriptPackageImpl#getMax()
	 * @generated
	 */
	int MAX = 15;

	/**
	 * The meta object id for the '{@link script.impl.OpposeImpl <em>Oppose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.OpposeImpl
	 * @see script.impl.ScriptPackageImpl#getOppose()
	 * @generated
	 */
	int OPPOSE = 12;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__SCRIPT_ELEMENTS = BLOC_UNAIRE__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__NOM = BLOC_UNAIRE__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__SCRIPT = BLOC_UNAIRE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__SORTIE = BLOC_UNAIRE__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__ENTREES = BLOC_UNAIRE__ENTREES;

	/**
	 * The number of structural features of the '<em>Oppose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE_FEATURE_COUNT = BLOC_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oppose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE_OPERATION_COUNT = BLOC_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.InverseImpl <em>Inverse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.InverseImpl
	 * @see script.impl.ScriptPackageImpl#getInverse()
	 * @generated
	 */
	int INVERSE = 13;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__SCRIPT_ELEMENTS = BLOC_UNAIRE__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__NOM = BLOC_UNAIRE__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__SCRIPT = BLOC_UNAIRE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__SORTIE = BLOC_UNAIRE__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__ENTREES = BLOC_UNAIRE__ENTREES;

	/**
	 * The number of structural features of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FEATURE_COUNT = BLOC_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OPERATION_COUNT = BLOC_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__SCRIPT_ELEMENTS = BLOC_FONCTION__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__NOM = BLOC_FONCTION__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__SCRIPT = BLOC_FONCTION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__SORTIE = BLOC_FONCTION__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__ENTREES = BLOC_FONCTION__ENTREES;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = BLOC_FONCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATION_COUNT = BLOC_FONCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__SCRIPT_ELEMENTS = BLOC_FONCTION__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__NOM = BLOC_FONCTION__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__SCRIPT = BLOC_FONCTION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__SORTIE = BLOC_FONCTION__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__ENTREES = BLOC_FONCTION__ENTREES;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = BLOC_FONCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATION_COUNT = BLOC_FONCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.SinImpl <em>Sin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.SinImpl
	 * @see script.impl.ScriptPackageImpl#getSin()
	 * @generated
	 */
	int SIN = 16;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__SCRIPT_ELEMENTS = BLOC_FONCTION__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__NOM = BLOC_FONCTION__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__SCRIPT = BLOC_FONCTION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__SORTIE = BLOC_FONCTION__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__ENTREES = BLOC_FONCTION__ENTREES;

	/**
	 * The number of structural features of the '<em>Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_FEATURE_COUNT = BLOC_FONCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_OPERATION_COUNT = BLOC_FONCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.CosImpl <em>Cos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.CosImpl
	 * @see script.impl.ScriptPackageImpl#getCos()
	 * @generated
	 */
	int COS = 17;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS__SCRIPT_ELEMENTS = BLOC_FONCTION__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS__NOM = BLOC_FONCTION__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS__SCRIPT = BLOC_FONCTION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS__SORTIE = BLOC_FONCTION__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS__ENTREES = BLOC_FONCTION__ENTREES;

	/**
	 * The number of structural features of the '<em>Cos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS_FEATURE_COUNT = BLOC_FONCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS_OPERATION_COUNT = BLOC_FONCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.RacineImpl <em>Racine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.RacineImpl
	 * @see script.impl.ScriptPackageImpl#getRacine()
	 * @generated
	 */
	int RACINE = 18;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__SCRIPT_ELEMENTS = BLOC_FONCTION__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__NOM = BLOC_FONCTION__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__SCRIPT = BLOC_FONCTION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__SORTIE = BLOC_FONCTION__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__ENTREES = BLOC_FONCTION__ENTREES;

	/**
	 * The number of structural features of the '<em>Racine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE_FEATURE_COUNT = BLOC_FONCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Racine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE_OPERATION_COUNT = BLOC_FONCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.ExpoImpl <em>Expo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ExpoImpl
	 * @see script.impl.ScriptPackageImpl#getExpo()
	 * @generated
	 */
	int EXPO = 19;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO__SCRIPT_ELEMENTS = BLOC_FONCTION__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO__NOM = BLOC_FONCTION__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO__SCRIPT = BLOC_FONCTION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO__SORTIE = BLOC_FONCTION__SORTIE;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO__ENTREES = BLOC_FONCTION__ENTREES;

	/**
	 * The number of structural features of the '<em>Expo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO_FEATURE_COUNT = BLOC_FONCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO_OPERATION_COUNT = BLOC_FONCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ConstanteImpl
	 * @see script.impl.ScriptPackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 20;

	/**
	 * The feature id for the '<em><b>Script Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__SCRIPT_ELEMENTS = SCRIPT_ELEMENTS__SCRIPT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__NOM = SCRIPT_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__SCRIPT = SCRIPT_ELEMENTS__SCRIPT;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VAL = SCRIPT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = SCRIPT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = SCRIPT_ELEMENTS_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link script.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.Type
	 * @see script.impl.ScriptPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 21;


	/**
	 * Returns the meta object for class '{@link script.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see script.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getScriptElements <em>Script Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script Elements</em>'.
	 * @see script.Script#getScriptElements()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_ScriptElements();

	/**
	 * Returns the meta object for the attribute '{@link script.Script#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see script.Script#getNom()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Nom();

	/**
	 * Returns the meta object for class '{@link script.ScriptElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see script.ScriptElements
	 * @generated
	 */
	EClass getScriptElements();

	/**
	 * Returns the meta object for the container reference '{@link script.ScriptElements#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see script.ScriptElements#getScript()
	 * @see #getScriptElements()
	 * @generated
	 */
	EReference getScriptElements_Script();

	/**
	 * Returns the meta object for class '{@link script.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see script.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link script.Port#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see script.Port#getValeur()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Valeur();

	/**
	 * Returns the meta object for class '{@link script.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see script.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the reference list '{@link script.Entree#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entrees</em>'.
	 * @see script.Entree#getEntrees()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_Entrees();

	/**
	 * Returns the meta object for class '{@link script.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see script.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for the reference list '{@link script.Sortie#getSorties <em>Sorties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorties</em>'.
	 * @see script.Sortie#getSorties()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_Sorties();

	/**
	 * Returns the meta object for class '{@link script.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc</em>'.
	 * @see script.Bloc
	 * @generated
	 */
	EClass getBloc();

	/**
	 * Returns the meta object for the reference '{@link script.Bloc#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortie</em>'.
	 * @see script.Bloc#getSortie()
	 * @see #getBloc()
	 * @generated
	 */
	EReference getBloc_Sortie();

	/**
	 * Returns the meta object for class '{@link script.Bloc_Binaire <em>Bloc Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Binaire</em>'.
	 * @see script.Bloc_Binaire
	 * @generated
	 */
	EClass getBloc_Binaire();

	/**
	 * Returns the meta object for the reference list '{@link script.Bloc_Binaire#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entrees</em>'.
	 * @see script.Bloc_Binaire#getEntrees()
	 * @see #getBloc_Binaire()
	 * @generated
	 */
	EReference getBloc_Binaire_Entrees();

	/**
	 * Returns the meta object for class '{@link script.Bloc_Unaire <em>Bloc Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Unaire</em>'.
	 * @see script.Bloc_Unaire
	 * @generated
	 */
	EClass getBloc_Unaire();

	/**
	 * Returns the meta object for the reference '{@link script.Bloc_Unaire#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entrees</em>'.
	 * @see script.Bloc_Unaire#getEntrees()
	 * @see #getBloc_Unaire()
	 * @generated
	 */
	EReference getBloc_Unaire_Entrees();

	/**
	 * Returns the meta object for class '{@link script.Bloc_Fonction <em>Bloc Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Fonction</em>'.
	 * @see script.Bloc_Fonction
	 * @generated
	 */
	EClass getBloc_Fonction();

	/**
	 * Returns the meta object for the reference list '{@link script.Bloc_Fonction#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entrees</em>'.
	 * @see script.Bloc_Fonction#getEntrees()
	 * @see #getBloc_Fonction()
	 * @generated
	 */
	EReference getBloc_Fonction_Entrees();

	/**
	 * Returns the meta object for class '{@link script.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see script.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link script.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see script.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link script.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see script.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link script.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see script.Min
	 * @generated
	 */
	EClass getMin();

	/**
	 * Returns the meta object for class '{@link script.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see script.Max
	 * @generated
	 */
	EClass getMax();

	/**
	 * Returns the meta object for class '{@link script.Oppose <em>Oppose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oppose</em>'.
	 * @see script.Oppose
	 * @generated
	 */
	EClass getOppose();

	/**
	 * Returns the meta object for class '{@link script.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse</em>'.
	 * @see script.Inverse
	 * @generated
	 */
	EClass getInverse();

	/**
	 * Returns the meta object for class '{@link script.Sin <em>Sin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sin</em>'.
	 * @see script.Sin
	 * @generated
	 */
	EClass getSin();

	/**
	 * Returns the meta object for class '{@link script.Cos <em>Cos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cos</em>'.
	 * @see script.Cos
	 * @generated
	 */
	EClass getCos();

	/**
	 * Returns the meta object for class '{@link script.Racine <em>Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Racine</em>'.
	 * @see script.Racine
	 * @generated
	 */
	EClass getRacine();

	/**
	 * Returns the meta object for class '{@link script.Expo <em>Expo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expo</em>'.
	 * @see script.Expo
	 * @generated
	 */
	EClass getExpo();

	/**
	 * Returns the meta object for class '{@link script.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see script.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link script.Constante#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see script.Constante#getVal()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Val();

	/**
	 * Returns the meta object for enum '{@link script.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see script.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScriptFactory getScriptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link script.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ScriptImpl
		 * @see script.impl.ScriptPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Script Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__SCRIPT_ELEMENTS = eINSTANCE.getScript_ScriptElements();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__NOM = eINSTANCE.getScript_Nom();

		/**
		 * The meta object literal for the '{@link script.impl.ScriptElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ScriptElementsImpl
		 * @see script.impl.ScriptPackageImpl#getScriptElements()
		 * @generated
		 */
		EClass SCRIPT_ELEMENTS = eINSTANCE.getScriptElements();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_ELEMENTS__SCRIPT = eINSTANCE.getScriptElements_Script();

		/**
		 * The meta object literal for the '{@link script.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.PortImpl
		 * @see script.impl.ScriptPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__VALEUR = eINSTANCE.getPort_Valeur();

		/**
		 * The meta object literal for the '{@link script.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.EntreeImpl
		 * @see script.impl.ScriptPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__ENTREES = eINSTANCE.getEntree_Entrees();

		/**
		 * The meta object literal for the '{@link script.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.SortieImpl
		 * @see script.impl.ScriptPackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '<em><b>Sorties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__SORTIES = eINSTANCE.getSortie_Sorties();

		/**
		 * The meta object literal for the '{@link script.impl.BlocImpl <em>Bloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.BlocImpl
		 * @see script.impl.ScriptPackageImpl#getBloc()
		 * @generated
		 */
		EClass BLOC = eINSTANCE.getBloc();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC__SORTIE = eINSTANCE.getBloc_Sortie();

		/**
		 * The meta object literal for the '{@link script.impl.Bloc_BinaireImpl <em>Bloc Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.Bloc_BinaireImpl
		 * @see script.impl.ScriptPackageImpl#getBloc_Binaire()
		 * @generated
		 */
		EClass BLOC_BINAIRE = eINSTANCE.getBloc_Binaire();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_BINAIRE__ENTREES = eINSTANCE.getBloc_Binaire_Entrees();

		/**
		 * The meta object literal for the '{@link script.impl.Bloc_UnaireImpl <em>Bloc Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.Bloc_UnaireImpl
		 * @see script.impl.ScriptPackageImpl#getBloc_Unaire()
		 * @generated
		 */
		EClass BLOC_UNAIRE = eINSTANCE.getBloc_Unaire();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_UNAIRE__ENTREES = eINSTANCE.getBloc_Unaire_Entrees();

		/**
		 * The meta object literal for the '{@link script.impl.Bloc_FonctionImpl <em>Bloc Fonction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.Bloc_FonctionImpl
		 * @see script.impl.ScriptPackageImpl#getBloc_Fonction()
		 * @generated
		 */
		EClass BLOC_FONCTION = eINSTANCE.getBloc_Fonction();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_FONCTION__ENTREES = eINSTANCE.getBloc_Fonction_Entrees();

		/**
		 * The meta object literal for the '{@link script.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.AdditionImpl
		 * @see script.impl.ScriptPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link script.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.MultiplicationImpl
		 * @see script.impl.ScriptPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link script.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.DivisionImpl
		 * @see script.impl.ScriptPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link script.impl.MinImpl <em>Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.MinImpl
		 * @see script.impl.ScriptPackageImpl#getMin()
		 * @generated
		 */
		EClass MIN = eINSTANCE.getMin();

		/**
		 * The meta object literal for the '{@link script.impl.MaxImpl <em>Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.MaxImpl
		 * @see script.impl.ScriptPackageImpl#getMax()
		 * @generated
		 */
		EClass MAX = eINSTANCE.getMax();

		/**
		 * The meta object literal for the '{@link script.impl.OpposeImpl <em>Oppose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.OpposeImpl
		 * @see script.impl.ScriptPackageImpl#getOppose()
		 * @generated
		 */
		EClass OPPOSE = eINSTANCE.getOppose();

		/**
		 * The meta object literal for the '{@link script.impl.InverseImpl <em>Inverse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.InverseImpl
		 * @see script.impl.ScriptPackageImpl#getInverse()
		 * @generated
		 */
		EClass INVERSE = eINSTANCE.getInverse();

		/**
		 * The meta object literal for the '{@link script.impl.SinImpl <em>Sin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.SinImpl
		 * @see script.impl.ScriptPackageImpl#getSin()
		 * @generated
		 */
		EClass SIN = eINSTANCE.getSin();

		/**
		 * The meta object literal for the '{@link script.impl.CosImpl <em>Cos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.CosImpl
		 * @see script.impl.ScriptPackageImpl#getCos()
		 * @generated
		 */
		EClass COS = eINSTANCE.getCos();

		/**
		 * The meta object literal for the '{@link script.impl.RacineImpl <em>Racine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.RacineImpl
		 * @see script.impl.ScriptPackageImpl#getRacine()
		 * @generated
		 */
		EClass RACINE = eINSTANCE.getRacine();

		/**
		 * The meta object literal for the '{@link script.impl.ExpoImpl <em>Expo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ExpoImpl
		 * @see script.impl.ScriptPackageImpl#getExpo()
		 * @generated
		 */
		EClass EXPO = eINSTANCE.getExpo();

		/**
		 * The meta object literal for the '{@link script.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ConstanteImpl
		 * @see script.impl.ScriptPackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VAL = eINSTANCE.getConstante_Val();

		/**
		 * The meta object literal for the '{@link script.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.Type
		 * @see script.impl.ScriptPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //ScriptPackage
