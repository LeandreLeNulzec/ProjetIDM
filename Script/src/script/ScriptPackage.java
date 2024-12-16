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
	 * The feature id for the '<em><b>Sto SE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STO_SE = 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Sto SE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS__STO_SE = SCRIPT__STO_SE;

	/**
	 * The feature id for the '<em><b>SEtos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENTS__SETOS = SCRIPT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link script.impl.PortEntreeImpl <em>Port Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.PortEntreeImpl
	 * @see script.impl.ScriptPackageImpl#getPortEntree()
	 * @generated
	 */
	int PORT_ENTREE = 2;

	/**
	 * The feature id for the '<em><b>PEto BU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__PETO_BU = 0;

	/**
	 * The feature id for the '<em><b>PEto BB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__PETO_BB = 1;

	/**
	 * The feature id for the '<em><b>PEto BF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__PETO_BF = 2;

	/**
	 * The number of structural features of the '<em>Port Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.impl.PortSortieImpl <em>Port Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.PortSortieImpl
	 * @see script.impl.ScriptPackageImpl#getPortSortie()
	 * @generated
	 */
	int PORT_SORTIE = 3;

	/**
	 * The feature id for the '<em><b>PSto BU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE__PSTO_BU = 0;

	/**
	 * The feature id for the '<em><b>PSto BB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE__PSTO_BB = 1;

	/**
	 * The feature id for the '<em><b>PSto BF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE__PSTO_BF = 2;

	/**
	 * The number of structural features of the '<em>Port Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.EntreeImpl
	 * @see script.impl.ScriptPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 4;

	/**
	 * The feature id for the '<em><b>PEto BU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PETO_BU = PORT_ENTREE__PETO_BU;

	/**
	 * The feature id for the '<em><b>PEto BB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PETO_BB = PORT_ENTREE__PETO_BB;

	/**
	 * The feature id for the '<em><b>PEto BF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PETO_BF = PORT_ENTREE__PETO_BF;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ARG = PORT_ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = PORT_ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = PORT_ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.SortieImpl
	 * @see script.impl.ScriptPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 5;

	/**
	 * The feature id for the '<em><b>PSto BU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__PSTO_BU = PORT_SORTIE__PSTO_BU;

	/**
	 * The feature id for the '<em><b>PSto BB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__PSTO_BB = PORT_SORTIE__PSTO_BB;

	/**
	 * The feature id for the '<em><b>PSto BF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__PSTO_BF = PORT_SORTIE__PSTO_BF;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__RES = PORT_SORTIE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = PORT_SORTIE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = PORT_SORTIE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>BBto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__BBTO_S = 0;

	/**
	 * The number of structural features of the '<em>Bloc Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bloc Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>BUto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__BUTO_S = 0;

	/**
	 * The number of structural features of the '<em>Bloc Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bloc Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>BFto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION__BFTO_S = 0;

	/**
	 * The number of structural features of the '<em>Bloc Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bloc Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FONCTION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>BBto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__BBTO_S = BLOC_BINAIRE__BBTO_S;

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
	 * The feature id for the '<em><b>BBto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__BBTO_S = BLOC_BINAIRE__BBTO_S;

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
	 * The feature id for the '<em><b>BBto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__BBTO_S = BLOC_BINAIRE__BBTO_S;

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
	int MIN = 12;

	/**
	 * The feature id for the '<em><b>BBto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__BBTO_S = BLOC_BINAIRE__BBTO_S;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.MaxImpl
	 * @see script.impl.ScriptPackageImpl#getMax()
	 * @generated
	 */
	int MAX = 13;

	/**
	 * The feature id for the '<em><b>BBto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__BBTO_S = BLOC_BINAIRE__BBTO_S;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.OpposeImpl <em>Oppose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.OpposeImpl
	 * @see script.impl.ScriptPackageImpl#getOppose()
	 * @generated
	 */
	int OPPOSE = 14;

	/**
	 * The feature id for the '<em><b>BUto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__BUTO_S = BLOC_UNAIRE__BUTO_S;

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
	int INVERSE = 15;

	/**
	 * The feature id for the '<em><b>BUto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__BUTO_S = BLOC_UNAIRE__BUTO_S;

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
	 * The meta object id for the '{@link script.impl.SinImpl <em>Sin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.SinImpl
	 * @see script.impl.ScriptPackageImpl#getSin()
	 * @generated
	 */
	int SIN = 16;

	/**
	 * The feature id for the '<em><b>BFto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__BFTO_S = BLOC_FONCTION__BFTO_S;

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
	 * The feature id for the '<em><b>BFto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COS__BFTO_S = BLOC_FONCTION__BFTO_S;

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
	 * The feature id for the '<em><b>BFto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE__BFTO_S = BLOC_FONCTION__BFTO_S;

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
	 * The feature id for the '<em><b>BFto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO__BFTO_S = BLOC_FONCTION__BFTO_S;

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
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VAL = 0;

	/**
	 * The feature id for the '<em><b>Cto S</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__CTO_S = 1;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link script.Script#getStoSE <em>Sto SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sto SE</em>'.
	 * @see script.Script#getStoSE()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_StoSE();

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
	 * Returns the meta object for the container reference '{@link script.ScriptElements#getSEtos <em>SEtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>SEtos</em>'.
	 * @see script.ScriptElements#getSEtos()
	 * @see #getScriptElements()
	 * @generated
	 */
	EReference getScriptElements_SEtos();

	/**
	 * Returns the meta object for class '{@link script.PortEntree <em>Port Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Entree</em>'.
	 * @see script.PortEntree
	 * @generated
	 */
	EClass getPortEntree();

	/**
	 * Returns the meta object for the reference '{@link script.PortEntree#getPEtoBU <em>PEto BU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PEto BU</em>'.
	 * @see script.PortEntree#getPEtoBU()
	 * @see #getPortEntree()
	 * @generated
	 */
	EReference getPortEntree_PEtoBU();

	/**
	 * Returns the meta object for the reference '{@link script.PortEntree#getPEtoBB <em>PEto BB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PEto BB</em>'.
	 * @see script.PortEntree#getPEtoBB()
	 * @see #getPortEntree()
	 * @generated
	 */
	EReference getPortEntree_PEtoBB();

	/**
	 * Returns the meta object for the reference '{@link script.PortEntree#getPEtoBF <em>PEto BF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PEto BF</em>'.
	 * @see script.PortEntree#getPEtoBF()
	 * @see #getPortEntree()
	 * @generated
	 */
	EReference getPortEntree_PEtoBF();

	/**
	 * Returns the meta object for class '{@link script.PortSortie <em>Port Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Sortie</em>'.
	 * @see script.PortSortie
	 * @generated
	 */
	EClass getPortSortie();

	/**
	 * Returns the meta object for the reference '{@link script.PortSortie#getPStoBU <em>PSto BU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PSto BU</em>'.
	 * @see script.PortSortie#getPStoBU()
	 * @see #getPortSortie()
	 * @generated
	 */
	EReference getPortSortie_PStoBU();

	/**
	 * Returns the meta object for the reference '{@link script.PortSortie#getPStoBB <em>PSto BB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PSto BB</em>'.
	 * @see script.PortSortie#getPStoBB()
	 * @see #getPortSortie()
	 * @generated
	 */
	EReference getPortSortie_PStoBB();

	/**
	 * Returns the meta object for the reference '{@link script.PortSortie#getPStoBF <em>PSto BF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PSto BF</em>'.
	 * @see script.PortSortie#getPStoBF()
	 * @see #getPortSortie()
	 * @generated
	 */
	EReference getPortSortie_PStoBF();

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
	 * Returns the meta object for the attribute list '{@link script.Entree#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arg</em>'.
	 * @see script.Entree#getArg()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Arg();

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
	 * Returns the meta object for the attribute list '{@link script.Sortie#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Res</em>'.
	 * @see script.Sortie#getRes()
	 * @see #getSortie()
	 * @generated
	 */
	EAttribute getSortie_Res();

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
	 * Returns the meta object for the reference list '{@link script.Bloc_Binaire#getBBtoS <em>BBto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BBto S</em>'.
	 * @see script.Bloc_Binaire#getBBtoS()
	 * @see #getBloc_Binaire()
	 * @generated
	 */
	EReference getBloc_Binaire_BBtoS();

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
	 * Returns the meta object for the reference list '{@link script.Bloc_Unaire#getBUtoS <em>BUto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BUto S</em>'.
	 * @see script.Bloc_Unaire#getBUtoS()
	 * @see #getBloc_Unaire()
	 * @generated
	 */
	EReference getBloc_Unaire_BUtoS();

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
	 * Returns the meta object for the reference list '{@link script.Bloc_Fonction#getBFtoS <em>BFto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BFto S</em>'.
	 * @see script.Bloc_Fonction#getBFtoS()
	 * @see #getBloc_Fonction()
	 * @generated
	 */
	EReference getBloc_Fonction_BFtoS();

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
	 * Returns the meta object for the reference list '{@link script.Constante#getCtoS <em>Cto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cto S</em>'.
	 * @see script.Constante#getCtoS()
	 * @see #getConstante()
	 * @generated
	 */
	EReference getConstante_CtoS();

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
		 * The meta object literal for the '<em><b>Sto SE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__STO_SE = eINSTANCE.getScript_StoSE();

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
		 * The meta object literal for the '<em><b>SEtos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_ELEMENTS__SETOS = eINSTANCE.getScriptElements_SEtos();

		/**
		 * The meta object literal for the '{@link script.impl.PortEntreeImpl <em>Port Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.PortEntreeImpl
		 * @see script.impl.ScriptPackageImpl#getPortEntree()
		 * @generated
		 */
		EClass PORT_ENTREE = eINSTANCE.getPortEntree();

		/**
		 * The meta object literal for the '<em><b>PEto BU</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ENTREE__PETO_BU = eINSTANCE.getPortEntree_PEtoBU();

		/**
		 * The meta object literal for the '<em><b>PEto BB</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ENTREE__PETO_BB = eINSTANCE.getPortEntree_PEtoBB();

		/**
		 * The meta object literal for the '<em><b>PEto BF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ENTREE__PETO_BF = eINSTANCE.getPortEntree_PEtoBF();

		/**
		 * The meta object literal for the '{@link script.impl.PortSortieImpl <em>Port Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.PortSortieImpl
		 * @see script.impl.ScriptPackageImpl#getPortSortie()
		 * @generated
		 */
		EClass PORT_SORTIE = eINSTANCE.getPortSortie();

		/**
		 * The meta object literal for the '<em><b>PSto BU</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SORTIE__PSTO_BU = eINSTANCE.getPortSortie_PStoBU();

		/**
		 * The meta object literal for the '<em><b>PSto BB</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SORTIE__PSTO_BB = eINSTANCE.getPortSortie_PStoBB();

		/**
		 * The meta object literal for the '<em><b>PSto BF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SORTIE__PSTO_BF = eINSTANCE.getPortSortie_PStoBF();

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
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__ARG = eINSTANCE.getEntree_Arg();

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
		 * The meta object literal for the '<em><b>Res</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE__RES = eINSTANCE.getSortie_Res();

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
		 * The meta object literal for the '<em><b>BBto S</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_BINAIRE__BBTO_S = eINSTANCE.getBloc_Binaire_BBtoS();

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
		 * The meta object literal for the '<em><b>BUto S</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_UNAIRE__BUTO_S = eINSTANCE.getBloc_Unaire_BUtoS();

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
		 * The meta object literal for the '<em><b>BFto S</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_FONCTION__BFTO_S = eINSTANCE.getBloc_Fonction_BFtoS();

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
		 * The meta object literal for the '<em><b>Cto S</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANTE__CTO_S = eINSTANCE.getConstante_CtoS();

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
