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
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__NOM = 0;

	/**
	 * The feature id for the '<em><b>Entree Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__ENTREE_GLOBALE = 1;

	/**
	 * The feature id for the '<em><b>Sortie Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__SORTIE_GLOBALE = 2;

	/**
	 * The feature id for the '<em><b>Algorithme Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__ALGORITHME_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 4;

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
	int ALGORITHME_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__NOM = ALGORITHME__NOM;

	/**
	 * The feature id for the '<em><b>Entree Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__ENTREE_GLOBALE = ALGORITHME__ENTREE_GLOBALE;

	/**
	 * The feature id for the '<em><b>Sortie Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__SORTIE_GLOBALE = ALGORITHME__SORTIE_GLOBALE;

	/**
	 * The feature id for the '<em><b>Algorithme Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__ALGORITHME_ELEMENTS = ALGORITHME__ALGORITHME_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_ELEMENTS__ALGORITHME = ALGORITHME_FEATURE_COUNT + 0;

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
	int RESSOURCES = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__NOM = ALGORITHME_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Entree Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__ENTREE_GLOBALE = ALGORITHME_ELEMENTS__ENTREE_GLOBALE;

	/**
	 * The feature id for the '<em><b>Sortie Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__SORTIE_GLOBALE = ALGORITHME_ELEMENTS__SORTIE_GLOBALE;

	/**
	 * The feature id for the '<em><b>Algorithme Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__ALGORITHME_ELEMENTS = ALGORITHME_ELEMENTS__ALGORITHME_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__ALGORITHME = ALGORITHME_ELEMENTS__ALGORITHME;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__CHEMIN = ALGORITHME_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES__SCRIPT = ALGORITHME_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_FEATURE_COUNT = ALGORITHME_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_OPERATION_COUNT = ALGORITHME_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.DocumentationImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__NOM = ALGORITHME_ELEMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Entree Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ENTREE_GLOBALE = ALGORITHME_ELEMENTS__ENTREE_GLOBALE;

	/**
	 * The feature id for the '<em><b>Sortie Globale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SORTIE_GLOBALE = ALGORITHME_ELEMENTS__SORTIE_GLOBALE;

	/**
	 * The feature id for the '<em><b>Algorithme Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ALGORITHME_ELEMENTS = ALGORITHME_ELEMENTS__ALGORITHME_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ALGORITHME = ALGORITHME_ELEMENTS__ALGORITHME;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXTE = ALGORITHME_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docu Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DOCU_ELEMENT = ALGORITHME_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = ALGORITHME_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = ALGORITHME_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.EntreeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__VALEUR = 1;

	/**
	 * The feature id for the '<em><b>Entree Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ENTREE_SCRIPT = 2;

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
	int SORTIE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Sortie Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SORTIE_SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__VALEUR = 2;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link algorithme.Algorithme#getEntreeGlobale <em>Entree Globale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entree Globale</em>'.
	 * @see algorithme.Algorithme#getEntreeGlobale()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_EntreeGlobale();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Algorithme#getSortieGlobale <em>Sortie Globale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortie Globale</em>'.
	 * @see algorithme.Algorithme#getSortieGlobale()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_SortieGlobale();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithme.Algorithme#getAlgorithmeElements <em>Algorithme Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithme Elements</em>'.
	 * @see algorithme.Algorithme#getAlgorithmeElements()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_AlgorithmeElements();

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
	 * Returns the meta object for the reference '{@link algorithme.Ressources#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see algorithme.Ressources#getScript()
	 * @see #getRessources()
	 * @generated
	 */
	EReference getRessources_Script();

	/**
	 * Returns the meta object for class '{@link algorithme.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see algorithme.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Documentation#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see algorithme.Documentation#getTexte()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Texte();

	/**
	 * Returns the meta object for the reference '{@link algorithme.Documentation#getDocuElement <em>Docu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Docu Element</em>'.
	 * @see algorithme.Documentation#getDocuElement()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_DocuElement();

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
	 * Returns the meta object for the attribute '{@link algorithme.Entree#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithme.Entree#getNom()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Nom();

	/**
	 * Returns the meta object for the attribute list '{@link algorithme.Entree#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valeur</em>'.
	 * @see algorithme.Entree#getValeur()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Valeur();

	/**
	 * Returns the meta object for the reference list '{@link algorithme.Entree#getEntreeScript <em>Entree Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree Script</em>'.
	 * @see algorithme.Entree#getEntreeScript()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_EntreeScript();

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
	 * Returns the meta object for the reference '{@link algorithme.Sortie#getSortieScript <em>Sortie Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortie Script</em>'.
	 * @see algorithme.Sortie#getSortieScript()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_SortieScript();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Sortie#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see algorithme.Sortie#getValeur()
	 * @see #getSortie()
	 * @generated
	 */
	EAttribute getSortie_Valeur();

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
	 * Returns the meta object for the container reference '{@link algorithme.AlgorithmeElements#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see algorithme.AlgorithmeElements#getAlgorithme()
	 * @see #getAlgorithmeElements()
	 * @generated
	 */
	EReference getAlgorithmeElements_Algorithme();

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
		 * The meta object literal for the '<em><b>Entree Globale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__ENTREE_GLOBALE = eINSTANCE.getAlgorithme_EntreeGlobale();

		/**
		 * The meta object literal for the '<em><b>Sortie Globale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__SORTIE_GLOBALE = eINSTANCE.getAlgorithme_SortieGlobale();

		/**
		 * The meta object literal for the '<em><b>Algorithme Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__ALGORITHME_ELEMENTS = eINSTANCE.getAlgorithme_AlgorithmeElements();

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
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCES__CHEMIN = eINSTANCE.getRessources_Chemin();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCES__SCRIPT = eINSTANCE.getRessources_Script();

		/**
		 * The meta object literal for the '{@link algorithme.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.DocumentationImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__TEXTE = eINSTANCE.getDocumentation_Texte();

		/**
		 * The meta object literal for the '<em><b>Docu Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION__DOCU_ELEMENT = eINSTANCE.getDocumentation_DocuElement();

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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__NOM = eINSTANCE.getEntree_Nom();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__VALEUR = eINSTANCE.getEntree_Valeur();

		/**
		 * The meta object literal for the '<em><b>Entree Script</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__ENTREE_SCRIPT = eINSTANCE.getEntree_EntreeScript();

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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE__NOM = eINSTANCE.getSortie_Nom();

		/**
		 * The meta object literal for the '<em><b>Sortie Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__SORTIE_SCRIPT = eINSTANCE.getSortie_SortieScript();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE__VALEUR = eINSTANCE.getSortie_Valeur();

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
		 * The meta object literal for the '<em><b>Algorithme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME_ELEMENTS__ALGORITHME = eINSTANCE.getAlgorithmeElements_Algorithme();

	}

} //AlgorithmePackage
