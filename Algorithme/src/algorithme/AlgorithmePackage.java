/**
 */
package algorithme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Rto A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__RTO_A = 0;

	/**
	 * The feature id for the '<em><b>Rto ES</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__RTO_ES = 1;

	/**
	 * The number of structural features of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.ProgrammeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 2;

	/**
	 * The feature id for the '<em><b>Rto A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__RTO_A = RESSOURCES__RTO_A;

	/**
	 * The feature id for the '<em><b>Rto ES</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__RTO_ES = RESSOURCES__RTO_ES;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = RESSOURCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = RESSOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.FichierImpl <em>Fichier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.FichierImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getFichier()
	 * @generated
	 */
	int FICHIER = 3;

	/**
	 * The feature id for the '<em><b>Rto A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__RTO_A = RESSOURCES__RTO_A;

	/**
	 * The feature id for the '<em><b>Rto ES</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__RTO_ES = RESSOURCES__RTO_ES;

	/**
	 * The number of structural features of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_FEATURE_COUNT = RESSOURCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_OPERATION_COUNT = RESSOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.GuidanceImpl <em>Guidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.GuidanceImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getGuidance()
	 * @generated
	 */
	int GUIDANCE = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__ELEMENTS = ALGORITHME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__TEXTE = ALGORITHME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_FEATURE_COUNT = ALGORITHME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_OPERATION_COUNT = ALGORITHME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.E_SImpl <em>ES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.E_SImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getE_S()
	 * @generated
	 */
	int ES = 5;

	/**
	 * The feature id for the '<em><b>ESto A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ES__ESTO_A = 0;

	/**
	 * The number of structural features of the '<em>ES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.EntréeImpl <em>Entrée</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.EntréeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getEntrée()
	 * @generated
	 */
	int ENTRÉE = 6;

	/**
	 * The feature id for the '<em><b>ESto A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRÉE__ESTO_A = ES__ESTO_A;

	/**
	 * The feature id for the '<em><b>Paramètre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRÉE__PARAMÈTRE = ES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entrée</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRÉE_FEATURE_COUNT = ES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entrée</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRÉE_OPERATION_COUNT = ES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.SortieImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 7;

	/**
	 * The feature id for the '<em><b>ESto A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__ESTO_A = ES__ESTO_A;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = ES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = ES_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link algorithme.Ressources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources</em>'.
	 * @see algorithme.Ressources
	 * @generated
	 */
	EClass getRessources();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.Ressources#getRtoA <em>Rto A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rto A</em>'.
	 * @see algorithme.Ressources#getRtoA()
	 * @see #getRessources()
	 * @generated
	 */
	EReference getRessources_RtoA();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.Ressources#getRtoE_S <em>Rto ES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rto ES</em>'.
	 * @see algorithme.Ressources#getRtoE_S()
	 * @see #getRessources()
	 * @generated
	 */
	EReference getRessources_RtoE_S();

	/**
	 * Returns the meta object for class '{@link algorithme.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see algorithme.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for class '{@link algorithme.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier</em>'.
	 * @see algorithme.Fichier
	 * @generated
	 */
	EClass getFichier();

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
	 * Returns the meta object for the reference list '{@link algorithme.Guidance#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see algorithme.Guidance#getElements()
	 * @see #getGuidance()
	 * @generated
	 */
	EReference getGuidance_Elements();

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
	 * Returns the meta object for class '{@link algorithme.E_S <em>ES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ES</em>'.
	 * @see algorithme.E_S
	 * @generated
	 */
	EClass getE_S();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.E_S#getE_StoA <em>ESto A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESto A</em>'.
	 * @see algorithme.E_S#getE_StoA()
	 * @see #getE_S()
	 * @generated
	 */
	EReference getE_S_E_StoA();

	/**
	 * Returns the meta object for class '{@link algorithme.Entrée <em>Entrée</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrée</em>'.
	 * @see algorithme.Entrée
	 * @generated
	 */
	EClass getEntrée();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Entrée#getParamètre <em>Paramètre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paramètre</em>'.
	 * @see algorithme.Entrée#getParamètre()
	 * @see #getEntrée()
	 * @generated
	 */
	EAttribute getEntrée_Paramètre();

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
		 * The meta object literal for the '{@link algorithme.impl.RessourcesImpl <em>Ressources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.RessourcesImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getRessources()
		 * @generated
		 */
		EClass RESSOURCES = eINSTANCE.getRessources();

		/**
		 * The meta object literal for the '<em><b>Rto A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCES__RTO_A = eINSTANCE.getRessources_RtoA();

		/**
		 * The meta object literal for the '<em><b>Rto ES</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCES__RTO_ES = eINSTANCE.getRessources_RtoE_S();

		/**
		 * The meta object literal for the '{@link algorithme.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.ProgrammeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '{@link algorithme.impl.FichierImpl <em>Fichier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.FichierImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getFichier()
		 * @generated
		 */
		EClass FICHIER = eINSTANCE.getFichier();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUIDANCE__ELEMENTS = eINSTANCE.getGuidance_Elements();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIDANCE__TEXTE = eINSTANCE.getGuidance_Texte();

		/**
		 * The meta object literal for the '{@link algorithme.impl.E_SImpl <em>ES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.E_SImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getE_S()
		 * @generated
		 */
		EClass ES = eINSTANCE.getE_S();

		/**
		 * The meta object literal for the '<em><b>ESto A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ES__ESTO_A = eINSTANCE.getE_S_E_StoA();

		/**
		 * The meta object literal for the '{@link algorithme.impl.EntréeImpl <em>Entrée</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.EntréeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getEntrée()
		 * @generated
		 */
		EClass ENTRÉE = eINSTANCE.getEntrée();

		/**
		 * The meta object literal for the '<em><b>Paramètre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRÉE__PARAMÈTRE = eINSTANCE.getEntrée_Paramètre();

		/**
		 * The meta object literal for the '{@link algorithme.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.SortieImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

	}

} //AlgorithmePackage
