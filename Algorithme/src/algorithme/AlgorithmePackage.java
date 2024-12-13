/**
 */
package algorithme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see algorithme.AlgorithmeFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://algorithme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmePackage eINSTANCE = algorithme.impl.AlgorithmePackageImpl.init();

	/**
	 * The meta object id for the '{@link algorithme.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.AlgorithmeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getAlgorithme()
	 * @generated
	 */
	int ALGORITHME = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__NOM = 0;

	/**
	 * The feature id for the '<em><b>Ato AE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__ATO_AE = 1;

	/**
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.AlgorithmeElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.AlgorithmeElementsImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getAlgorithmeElements()
	 * @generated
	 */
	int ALGORITHME_ELEMENTS = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__NOM = ALGORITHME__NOM;

	/**
	 * The feature id for the '<em><b>Ato AE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__ATO_AE = ALGORITHME__ATO_AE;

	/**
	 * The feature id for the '<em><b>AEto A</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__AETO_A = ALGORITHME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS_FEATURE_COUNT = ALGORITHME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS_OPERATION_COUNT = ALGORITHME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.RessourcesImpl <em>Ressources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.RessourcesImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getRessources()
	 * @generated
	 */
	int RESSOURCES = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__NOM = ALGORITHME_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Ato AE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__ATO_AE = ALGORITHME_ELEMENTS__ATO_AE;

	/**
	 * The feature id for the '<em><b>AEto A</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__AETO_A = ALGORITHME_ELEMENTS__AETO_A;

	/**
	 * The feature id for the '<em><b>Rto P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__RTO_P = ALGORITHME_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__CHEMIN = ALGORITHME_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__TYPE_RES = ALGORITHME_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rto Scr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__RTO_SCR = ALGORITHME_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_FEATURE_COUNT = ALGORITHME_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_OPERATION_COUNT = ALGORITHME_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.ScriptImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Scrto S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__SCRTO_S = 0;

	/**
	 * The feature id for the '<em><b>Scrto SE</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__SCRTO_SE = 1;

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
	 * The meta object id for the '{@link algorithme.impl.GuidanceImpl <em>Guidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.GuidanceImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getGuidance()
	 * @generated
	 */
	int GUIDANCE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__NOM = ALGORITHME_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Ato AE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__ATO_AE = ALGORITHME_ELEMENTS__ATO_AE;

	/**
	 * The feature id for the '<em><b>AEto A</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__AETO_A = ALGORITHME_ELEMENTS__AETO_A;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__TEXTE = ALGORITHME_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gto AE</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__GTO_AE = ALGORITHME_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_FEATURE_COUNT = ALGORITHME_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_OPERATION_COUNT = ALGORITHME_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.PortImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Pto R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PTO_R = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NOM = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.EntreeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 5;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__VALEUR = 0;

	/**
	 * The feature id for the '<em><b>Eto S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ETO_S = 1;

	/**
	 * The feature id for the '<em><b>Port Sortie S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PORT_SORTIE_S = 2;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.SortieImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 6;

	/**
	 * The feature id for the '<em><b>Sto PS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__STO_PS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Sto Scr</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__STO_SCR = 2;

	/**
	 * The feature id for the '<em><b>Sto E</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__STO_E = 3;

	/**
	 * The feature id for the '<em><b>Port Entree S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__PORT_ENTREE_S = 4;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link algorithme.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.ArgumentImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 7;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALEUR = ENTREE__VALEUR;

	/**
	 * The feature id for the '<em><b>Eto S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ETO_S = ENTREE__ETO_S;

	/**
	 * The feature id for the '<em><b>Port Sortie S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__PORT_SORTIE_S = ENTREE__PORT_SORTIE_S;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NOM = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.PortEntreeImpl <em>Port Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.PortEntreeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getPortEntree()
	 * @generated
	 */
	int PORT_ENTREE = 8;

	/**
	 * The feature id for the '<em><b>Pto R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__PTO_R = PORT__PTO_R;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__NOM = PORT__NOM;

	/**
	 * The feature id for the '<em><b>PEto E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__PETO_E = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PSto Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE__PSTO_ARG = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.PortSortieImpl <em>Port Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.PortSortieImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getPortSortie()
	 * @generated
	 */
	int PORT_SORTIE = 9;

	/**
	 * The feature id for the '<em><b>Pto R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE__PTO_R = PORT__PTO_R;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE__NOM = PORT__NOM;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE__VALEUR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Calculs</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see algorithme.impl.AlgorithmePackageImpl#getCalculs()
	 * @generated
	 */
	int CALCULS = 11;


	/**
	 * Returns the meta object for class '{@link algorithme.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithme</em>'.
	 * @see algorithme.Algorithme
	 * @generated
	 */
	EClass getAlgorithme();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Algorithme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithme.Algorithme#getNom()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithme.Algorithme#getAtoAE <em>Ato AE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ato AE</em>'.
	 * @see algorithme.Algorithme#getAtoAE()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_AtoAE();

	/**
	 * Returns the meta object for class '{@link algorithme.Ressources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources</em>'.
	 * @see algorithme.Ressources
	 * @generated
	 */
	EClass getRessources();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithme.Ressources#getRtoP <em>Rto P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rto P</em>'.
	 * @see algorithme.Ressources#getRtoP()
	 * @see #getRessources()
	 * @generated
	 */
	EReference getRessources_RtoP();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Ressources#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see algorithme.Ressources#getChemin()
	 * @see #getRessources()
	 * @generated
	 */
	EAttribute getRessources_Chemin();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Ressources#getTypeRes <em>Type Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Res</em>'.
	 * @see algorithme.Ressources#getTypeRes()
	 * @see #getRessources()
	 * @generated
	 */
	EAttribute getRessources_TypeRes();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Ressources#getRtoScr <em>Rto Scr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rto Scr</em>'.
	 * @see algorithme.Ressources#getRtoScr()
	 * @see #getRessources()
	 * @generated
	 */
	EReference getRessources_RtoScr();

	/**
	 * Returns the meta object for class '{@link algorithme.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see algorithme.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link algorithme.Script#getScrtoS <em>Scrto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scrto S</em>'.
	 * @see algorithme.Script#getScrtoS()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_ScrtoS();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.Script#getScrtoSE <em>Scrto SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scrto SE</em>'.
	 * @see algorithme.Script#getScrtoSE()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_ScrtoSE();

	/**
	 * Returns the meta object for class '{@link algorithme.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guidance</em>'.
	 * @see algorithme.Guidance
	 * @generated
	 */
	EClass getGuidance();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Guidance#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see algorithme.Guidance#getTexte()
	 * @see #getGuidance()
	 * @generated
	 */
	EAttribute getGuidance_Texte();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.Guidance#getGtoAE <em>Gto AE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gto AE</em>'.
	 * @see algorithme.Guidance#getGtoAE()
	 * @see #getGuidance()
	 * @generated
	 */
	EReference getGuidance_GtoAE();

	/**
	 * Returns the meta object for class '{@link algorithme.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see algorithme.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link algorithme.Port#getPtoR <em>Pto R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pto R</em>'.
	 * @see algorithme.Port#getPtoR()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PtoR();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Port#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithme.Port#getNom()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Nom();

	/**
	 * Returns the meta object for class '{@link algorithme.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see algorithme.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Entree#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see algorithme.Entree#getValeur()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Valeur();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Entree#getEtoS <em>Eto S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eto S</em>'.
	 * @see algorithme.Entree#getEtoS()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_EtoS();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Entree#getPortSortieS <em>Port Sortie S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Sortie S</em>'.
	 * @see algorithme.Entree#getPortSortieS()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_PortSortieS();

	/**
	 * Returns the meta object for class '{@link algorithme.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see algorithme.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Sortie#getStoPS <em>Sto PS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sto PS</em>'.
	 * @see algorithme.Sortie#getStoPS()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_StoPS();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Sortie#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithme.Sortie#getNom()
	 * @see #getSortie()
	 * @generated
	 */
	EAttribute getSortie_Nom();

	/**
	 * Returns the meta object for the container reference '{@link algorithme.Sortie#getStoScr <em>Sto Scr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sto Scr</em>'.
	 * @see algorithme.Sortie#getStoScr()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_StoScr();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.Sortie#getStoE <em>Sto E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sto E</em>'.
	 * @see algorithme.Sortie#getStoE()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_StoE();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Sortie#getPortEntreeS <em>Port Entree S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Entree S</em>'.
	 * @see algorithme.Sortie#getPortEntreeS()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_PortEntreeS();

	/**
	 * Returns the meta object for class '{@link algorithme.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see algorithme.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Argument#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithme.Argument#getNom()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Nom();

	/**
	 * Returns the meta object for class '{@link algorithme.PortEntree <em>Port Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Entree</em>'.
	 * @see algorithme.PortEntree
	 * @generated
	 */
	EClass getPortEntree();

	/**
	 * Returns the meta object for the reference '{@link algorithme.PortEntree#getPEtoE <em>PEto E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PEto E</em>'.
	 * @see algorithme.PortEntree#getPEtoE()
	 * @see #getPortEntree()
	 * @generated
	 */
	EReference getPortEntree_PEtoE();

	/**
	 * Returns the meta object for the reference '{@link algorithme.PortEntree#getPStoArg <em>PSto Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PSto Arg</em>'.
	 * @see algorithme.PortEntree#getPStoArg()
	 * @see #getPortEntree()
	 * @generated
	 */
	EReference getPortEntree_PStoArg();

	/**
	 * Returns the meta object for class '{@link algorithme.PortSortie <em>Port Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Sortie</em>'.
	 * @see algorithme.PortSortie
	 * @generated
	 */
	EClass getPortSortie();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.PortSortie#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see algorithme.PortSortie#getValeur()
	 * @see #getPortSortie()
	 * @generated
	 */
	EAttribute getPortSortie_Valeur();

	/**
	 * Returns the meta object for class '{@link algorithme.AlgorithmeElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see algorithme.AlgorithmeElements
	 * @generated
	 */
	EClass getAlgorithmeElements();

	/**
	 * Returns the meta object for the container reference '{@link algorithme.AlgorithmeElements#getAEtoA <em>AEto A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>AEto A</em>'.
	 * @see algorithme.AlgorithmeElements#getAEtoA()
	 * @see #getAlgorithmeElements()
	 * @generated
	 */
	EReference getAlgorithmeElements_AEtoA();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Calculs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calculs</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getCalculs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmeFactory getAlgorithmeFactory();

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
		 * The meta object literal for the '{@link algorithme.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.AlgorithmeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getAlgorithme()
		 * @generated
		 */
		EClass ALGORITHME = eINSTANCE.getAlgorithme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__NOM = eINSTANCE.getAlgorithme_Nom();

		/**
		 * The meta object literal for the '<em><b>Ato AE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__ATO_AE = eINSTANCE.getAlgorithme_AtoAE();

		/**
		 * The meta object literal for the '{@link algorithme.impl.RessourcesImpl <em>Ressources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.RessourcesImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getRessources()
		 * @generated
		 */
		EClass RESSOURCES = eINSTANCE.getRessources();

		/**
		 * The meta object literal for the '<em><b>Rto P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCES__RTO_P = eINSTANCE.getRessources_RtoP();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCES__CHEMIN = eINSTANCE.getRessources_Chemin();

		/**
		 * The meta object literal for the '<em><b>Type Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCES__TYPE_RES = eINSTANCE.getRessources_TypeRes();

		/**
		 * The meta object literal for the '<em><b>Rto Scr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCES__RTO_SCR = eINSTANCE.getRessources_RtoScr();

		/**
		 * The meta object literal for the '{@link algorithme.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.ScriptImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Scrto S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__SCRTO_S = eINSTANCE.getScript_ScrtoS();

		/**
		 * The meta object literal for the '<em><b>Scrto SE</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__SCRTO_SE = eINSTANCE.getScript_ScrtoSE();

		/**
		 * The meta object literal for the '{@link algorithme.impl.GuidanceImpl <em>Guidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.GuidanceImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getGuidance()
		 * @generated
		 */
		EClass GUIDANCE = eINSTANCE.getGuidance();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIDANCE__TEXTE = eINSTANCE.getGuidance_Texte();

		/**
		 * The meta object literal for the '<em><b>Gto AE</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUIDANCE__GTO_AE = eINSTANCE.getGuidance_GtoAE();

		/**
		 * The meta object literal for the '{@link algorithme.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.PortImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Pto R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PTO_R = eINSTANCE.getPort_PtoR();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NOM = eINSTANCE.getPort_Nom();

		/**
		 * The meta object literal for the '{@link algorithme.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.EntreeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__VALEUR = eINSTANCE.getEntree_Valeur();

		/**
		 * The meta object literal for the '<em><b>Eto S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__ETO_S = eINSTANCE.getEntree_EtoS();

		/**
		 * The meta object literal for the '<em><b>Port Sortie S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__PORT_SORTIE_S = eINSTANCE.getEntree_PortSortieS();

		/**
		 * The meta object literal for the '{@link algorithme.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.SortieImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '<em><b>Sto PS</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__STO_PS = eINSTANCE.getSortie_StoPS();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE__NOM = eINSTANCE.getSortie_Nom();

		/**
		 * The meta object literal for the '<em><b>Sto Scr</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__STO_SCR = eINSTANCE.getSortie_StoScr();

		/**
		 * The meta object literal for the '<em><b>Sto E</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__STO_E = eINSTANCE.getSortie_StoE();

		/**
		 * The meta object literal for the '<em><b>Port Entree S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__PORT_ENTREE_S = eINSTANCE.getSortie_PortEntreeS();

		/**
		 * The meta object literal for the '{@link algorithme.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.ArgumentImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NOM = eINSTANCE.getArgument_Nom();

		/**
		 * The meta object literal for the '{@link algorithme.impl.PortEntreeImpl <em>Port Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.PortEntreeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getPortEntree()
		 * @generated
		 */
		EClass PORT_ENTREE = eINSTANCE.getPortEntree();

		/**
		 * The meta object literal for the '<em><b>PEto E</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ENTREE__PETO_E = eINSTANCE.getPortEntree_PEtoE();

		/**
		 * The meta object literal for the '<em><b>PSto Arg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ENTREE__PSTO_ARG = eINSTANCE.getPortEntree_PStoArg();

		/**
		 * The meta object literal for the '{@link algorithme.impl.PortSortieImpl <em>Port Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.PortSortieImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getPortSortie()
		 * @generated
		 */
		EClass PORT_SORTIE = eINSTANCE.getPortSortie();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SORTIE__VALEUR = eINSTANCE.getPortSortie_Valeur();

		/**
		 * The meta object literal for the '{@link algorithme.impl.AlgorithmeElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.AlgorithmeElementsImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getAlgorithmeElements()
		 * @generated
		 */
		EClass ALGORITHME_ELEMENTS = eINSTANCE.getAlgorithmeElements();

		/**
		 * The meta object literal for the '<em><b>AEto A</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME_ELEMENTS__AETO_A = eINSTANCE.getAlgorithmeElements_AEtoA();

		/**
		 * The meta object literal for the '<em>Calculs</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see algorithme.impl.AlgorithmePackageImpl#getCalculs()
		 * @generated
		 */
		EDataType CALCULS = eINSTANCE.getCalculs();

	}

} //AlgorithmePackage
