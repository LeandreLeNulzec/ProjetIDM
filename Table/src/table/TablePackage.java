/**
 */
package table;

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
 * @see table.TableFactory
 * @model kind="package"
 * @generated
 */
public interface TablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "table";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://table";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "table";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablePackage eINSTANCE = table.impl.TablePackageImpl.init();

	/**
	 * The meta object id for the '{@link table.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.TableImpl
	 * @see table.impl.TablePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLONNES = 1;

	/**
	 * The feature id for the '<em><b>Id Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID_COLONNE = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link table.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ColonneImpl
	 * @see table.impl.TablePackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTRAINTES = 3;

	/**
	 * The feature id for the '<em><b>Nb Lignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NB_LIGNES = 4;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTENU = 5;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link table.impl.ColonneProvientImpl <em>Colonne Provient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ColonneProvientImpl
	 * @see table.impl.TablePackageImpl#getColonneProvient()
	 * @generated
	 */
	int COLONNE_PROVIENT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__TABLE = COLONNE__TABLE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__ELEMENT_TYPE = COLONNE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__CONTRAINTES = COLONNE__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Nb Lignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__NB_LIGNES = COLONNE__NB_LIGNES;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__CONTENU = COLONNE__CONTENU;

	/**
	 * The feature id for the '<em><b>Table Origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__TABLE_ORIGINE = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__REF_COLONNE = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne Provient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne Provient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.ColonneDeriveeImpl <em>Colonne Derivee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ColonneDeriveeImpl
	 * @see table.impl.TablePackageImpl#getColonneDerivee()
	 * @generated
	 */
	int COLONNE_DERIVEE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__TABLE = COLONNE__TABLE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__ELEMENT_TYPE = COLONNE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__CONTRAINTES = COLONNE__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Nb Lignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__NB_LIGNES = COLONNE__NB_LIGNES;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__CONTENU = COLONNE__CONTENU;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__ALGORITHME = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colonnes Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__COLONNES_ENTREE = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne Derivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne Derivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.ContenuImpl <em>Contenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContenuImpl
	 * @see table.impl.TablePackageImpl#getContenu()
	 * @generated
	 */
	int CONTENU = 4;

	/**
	 * The number of structural features of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link table.impl.ContenuFloatImpl <em>Contenu Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContenuFloatImpl
	 * @see table.impl.TablePackageImpl#getContenuFloat()
	 * @generated
	 */
	int CONTENU_FLOAT = 5;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FLOAT__CONTENU = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contenu Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FLOAT_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contenu Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FLOAT_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.ContenuIntImpl <em>Contenu Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContenuIntImpl
	 * @see table.impl.TablePackageImpl#getContenuInt()
	 * @generated
	 */
	int CONTENU_INT = 6;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_INT__CONTENU = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contenu Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_INT_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contenu Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_INT_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.ContenuBoolImpl <em>Contenu Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContenuBoolImpl
	 * @see table.impl.TablePackageImpl#getContenuBool()
	 * @generated
	 */
	int CONTENU_BOOL = 7;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_BOOL__CONTENU = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contenu Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_BOOL_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contenu Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_BOOL_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.ContenuStringImpl <em>Contenu String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContenuStringImpl
	 * @see table.impl.TablePackageImpl#getContenuString()
	 * @generated
	 */
	int CONTENU_STRING = 8;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_STRING__CONTENU = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contenu String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_STRING_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contenu String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_STRING_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContrainteImpl
	 * @see table.impl.TablePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 9;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link table.impl.OuImpl <em>Ou</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.OuImpl
	 * @see table.impl.TablePackageImpl#getOu()
	 * @generated
	 */
	int OU = 10;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU__VARIABLES = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.EtImpl <em>Et</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.EtImpl
	 * @see table.impl.TablePackageImpl#getEt()
	 * @generated
	 */
	int ET = 11;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET__VARIABLES = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Et</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Et</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.PredicatImpl <em>Predicat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.PredicatImpl
	 * @see table.impl.TablePackageImpl#getPredicat()
	 * @generated
	 */
	int PREDICAT = 12;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT__CONDITION = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.PredicatValeurImpl <em>Predicat Valeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.PredicatValeurImpl
	 * @see table.impl.TablePackageImpl#getPredicatValeur()
	 * @generated
	 */
	int PREDICAT_VALEUR = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_VALEUR__CONDITION = PREDICAT__CONDITION;

	/**
	 * The feature id for the '<em><b>Comparant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_VALEUR__COMPARANT = PREDICAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicat Valeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_VALEUR_FEATURE_COUNT = PREDICAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicat Valeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_VALEUR_OPERATION_COUNT = PREDICAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.impl.PredicatColonneImpl <em>Predicat Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.PredicatColonneImpl
	 * @see table.impl.TablePackageImpl#getPredicatColonne()
	 * @generated
	 */
	int PREDICAT_COLONNE = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_COLONNE__CONDITION = PREDICAT__CONDITION;

	/**
	 * The feature id for the '<em><b>Colonne Comparante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_COLONNE__COLONNE_COMPARANTE = PREDICAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicat Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_COLONNE_FEATURE_COUNT = PREDICAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicat Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_COLONNE_OPERATION_COUNT = PREDICAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link table.ColonnesElementsType <em>Colonnes Elements Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.ColonnesElementsType
	 * @see table.impl.TablePackageImpl#getColonnesElementsType()
	 * @generated
	 */
	int COLONNES_ELEMENTS_TYPE = 15;


	/**
	 * The meta object id for the '{@link table.Condition <em>Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.Condition
	 * @see table.impl.TablePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;


	/**
	 * Returns the meta object for class '{@link table.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see table.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link table.Table#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see table.Table#getNom()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Nom();

	/**
	 * Returns the meta object for the reference list '{@link table.Table#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colonnes</em>'.
	 * @see table.Table#getColonnes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Colonnes();

	/**
	 * Returns the meta object for the reference '{@link table.Table#getIdColonne <em>Id Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Colonne</em>'.
	 * @see table.Table#getIdColonne()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IdColonne();

	/**
	 * Returns the meta object for class '{@link table.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see table.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link table.Colonne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see table.Colonne#getNom()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Nom();

	/**
	 * Returns the meta object for the reference '{@link table.Colonne#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see table.Colonne#getTable()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Table();

	/**
	 * Returns the meta object for the attribute '{@link table.Colonne#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see table.Colonne#getElementType()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_ElementType();

	/**
	 * Returns the meta object for the reference '{@link table.Colonne#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contraintes</em>'.
	 * @see table.Colonne#getContraintes()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contraintes();

	/**
	 * Returns the meta object for the attribute '{@link table.Colonne#getNbLignes <em>Nb Lignes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Lignes</em>'.
	 * @see table.Colonne#getNbLignes()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_NbLignes();

	/**
	 * Returns the meta object for the reference '{@link table.Colonne#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contenu</em>'.
	 * @see table.Colonne#getContenu()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contenu();

	/**
	 * Returns the meta object for class '{@link table.ColonneProvient <em>Colonne Provient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Provient</em>'.
	 * @see table.ColonneProvient
	 * @generated
	 */
	EClass getColonneProvient();

	/**
	 * Returns the meta object for the reference '{@link table.ColonneProvient#getTableOrigine <em>Table Origine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Origine</em>'.
	 * @see table.ColonneProvient#getTableOrigine()
	 * @see #getColonneProvient()
	 * @generated
	 */
	EReference getColonneProvient_TableOrigine();

	/**
	 * Returns the meta object for the attribute '{@link table.ColonneProvient#getRefColonne <em>Ref Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Colonne</em>'.
	 * @see table.ColonneProvient#getRefColonne()
	 * @see #getColonneProvient()
	 * @generated
	 */
	EAttribute getColonneProvient_RefColonne();

	/**
	 * Returns the meta object for class '{@link table.ColonneDerivee <em>Colonne Derivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Derivee</em>'.
	 * @see table.ColonneDerivee
	 * @generated
	 */
	EClass getColonneDerivee();

	/**
	 * Returns the meta object for the reference '{@link table.ColonneDerivee#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithme</em>'.
	 * @see table.ColonneDerivee#getAlgorithme()
	 * @see #getColonneDerivee()
	 * @generated
	 */
	EReference getColonneDerivee_Algorithme();

	/**
	 * Returns the meta object for the reference list '{@link table.ColonneDerivee#getColonnesEntree <em>Colonnes Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colonnes Entree</em>'.
	 * @see table.ColonneDerivee#getColonnesEntree()
	 * @see #getColonneDerivee()
	 * @generated
	 */
	EReference getColonneDerivee_ColonnesEntree();

	/**
	 * Returns the meta object for class '{@link table.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu</em>'.
	 * @see table.Contenu
	 * @generated
	 */
	EClass getContenu();

	/**
	 * Returns the meta object for class '{@link table.ContenuFloat <em>Contenu Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu Float</em>'.
	 * @see table.ContenuFloat
	 * @generated
	 */
	EClass getContenuFloat();

	/**
	 * Returns the meta object for the attribute list '{@link table.ContenuFloat#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contenu</em>'.
	 * @see table.ContenuFloat#getContenu()
	 * @see #getContenuFloat()
	 * @generated
	 */
	EAttribute getContenuFloat_Contenu();

	/**
	 * Returns the meta object for class '{@link table.ContenuInt <em>Contenu Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu Int</em>'.
	 * @see table.ContenuInt
	 * @generated
	 */
	EClass getContenuInt();

	/**
	 * Returns the meta object for the attribute list '{@link table.ContenuInt#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contenu</em>'.
	 * @see table.ContenuInt#getContenu()
	 * @see #getContenuInt()
	 * @generated
	 */
	EAttribute getContenuInt_Contenu();

	/**
	 * Returns the meta object for class '{@link table.ContenuBool <em>Contenu Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu Bool</em>'.
	 * @see table.ContenuBool
	 * @generated
	 */
	EClass getContenuBool();

	/**
	 * Returns the meta object for the attribute list '{@link table.ContenuBool#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contenu</em>'.
	 * @see table.ContenuBool#getContenu()
	 * @see #getContenuBool()
	 * @generated
	 */
	EAttribute getContenuBool_Contenu();

	/**
	 * Returns the meta object for class '{@link table.ContenuString <em>Contenu String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu String</em>'.
	 * @see table.ContenuString
	 * @generated
	 */
	EClass getContenuString();

	/**
	 * Returns the meta object for the attribute list '{@link table.ContenuString#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contenu</em>'.
	 * @see table.ContenuString#getContenu()
	 * @see #getContenuString()
	 * @generated
	 */
	EAttribute getContenuString_Contenu();

	/**
	 * Returns the meta object for class '{@link table.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see table.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for class '{@link table.Ou <em>Ou</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ou</em>'.
	 * @see table.Ou
	 * @generated
	 */
	EClass getOu();

	/**
	 * Returns the meta object for the reference list '{@link table.Ou#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see table.Ou#getVariables()
	 * @see #getOu()
	 * @generated
	 */
	EReference getOu_Variables();

	/**
	 * Returns the meta object for class '{@link table.Et <em>Et</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Et</em>'.
	 * @see table.Et
	 * @generated
	 */
	EClass getEt();

	/**
	 * Returns the meta object for the reference list '{@link table.Et#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see table.Et#getVariables()
	 * @see #getEt()
	 * @generated
	 */
	EReference getEt_Variables();

	/**
	 * Returns the meta object for class '{@link table.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicat</em>'.
	 * @see table.Predicat
	 * @generated
	 */
	EClass getPredicat();

	/**
	 * Returns the meta object for the attribute '{@link table.Predicat#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see table.Predicat#getCondition()
	 * @see #getPredicat()
	 * @generated
	 */
	EAttribute getPredicat_Condition();

	/**
	 * Returns the meta object for class '{@link table.PredicatValeur <em>Predicat Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicat Valeur</em>'.
	 * @see table.PredicatValeur
	 * @generated
	 */
	EClass getPredicatValeur();

	/**
	 * Returns the meta object for the attribute '{@link table.PredicatValeur#getComparant <em>Comparant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparant</em>'.
	 * @see table.PredicatValeur#getComparant()
	 * @see #getPredicatValeur()
	 * @generated
	 */
	EAttribute getPredicatValeur_Comparant();

	/**
	 * Returns the meta object for class '{@link table.PredicatColonne <em>Predicat Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicat Colonne</em>'.
	 * @see table.PredicatColonne
	 * @generated
	 */
	EClass getPredicatColonne();

	/**
	 * Returns the meta object for the reference '{@link table.PredicatColonne#getColonneComparante <em>Colonne Comparante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne Comparante</em>'.
	 * @see table.PredicatColonne#getColonneComparante()
	 * @see #getPredicatColonne()
	 * @generated
	 */
	EReference getPredicatColonne_ColonneComparante();

	/**
	 * Returns the meta object for enum '{@link table.ColonnesElementsType <em>Colonnes Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colonnes Elements Type</em>'.
	 * @see table.ColonnesElementsType
	 * @generated
	 */
	EEnum getColonnesElementsType();

	/**
	 * Returns the meta object for enum '{@link table.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition</em>'.
	 * @see table.Condition
	 * @generated
	 */
	EEnum getCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableFactory getTableFactory();

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
		 * The meta object literal for the '{@link table.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.TableImpl
		 * @see table.impl.TablePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NOM = eINSTANCE.getTable_Nom();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLONNES = eINSTANCE.getTable_Colonnes();

		/**
		 * The meta object literal for the '<em><b>Id Colonne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ID_COLONNE = eINSTANCE.getTable_IdColonne();

		/**
		 * The meta object literal for the '{@link table.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ColonneImpl
		 * @see table.impl.TablePackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NOM = eINSTANCE.getColonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__TABLE = eINSTANCE.getColonne_Table();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__ELEMENT_TYPE = eINSTANCE.getColonne_ElementType();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTRAINTES = eINSTANCE.getColonne_Contraintes();

		/**
		 * The meta object literal for the '<em><b>Nb Lignes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NB_LIGNES = eINSTANCE.getColonne_NbLignes();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTENU = eINSTANCE.getColonne_Contenu();

		/**
		 * The meta object literal for the '{@link table.impl.ColonneProvientImpl <em>Colonne Provient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ColonneProvientImpl
		 * @see table.impl.TablePackageImpl#getColonneProvient()
		 * @generated
		 */
		EClass COLONNE_PROVIENT = eINSTANCE.getColonneProvient();

		/**
		 * The meta object literal for the '<em><b>Table Origine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_PROVIENT__TABLE_ORIGINE = eINSTANCE.getColonneProvient_TableOrigine();

		/**
		 * The meta object literal for the '<em><b>Ref Colonne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE_PROVIENT__REF_COLONNE = eINSTANCE.getColonneProvient_RefColonne();

		/**
		 * The meta object literal for the '{@link table.impl.ColonneDeriveeImpl <em>Colonne Derivee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ColonneDeriveeImpl
		 * @see table.impl.TablePackageImpl#getColonneDerivee()
		 * @generated
		 */
		EClass COLONNE_DERIVEE = eINSTANCE.getColonneDerivee();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_DERIVEE__ALGORITHME = eINSTANCE.getColonneDerivee_Algorithme();

		/**
		 * The meta object literal for the '<em><b>Colonnes Entree</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_DERIVEE__COLONNES_ENTREE = eINSTANCE.getColonneDerivee_ColonnesEntree();

		/**
		 * The meta object literal for the '{@link table.impl.ContenuImpl <em>Contenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContenuImpl
		 * @see table.impl.TablePackageImpl#getContenu()
		 * @generated
		 */
		EClass CONTENU = eINSTANCE.getContenu();

		/**
		 * The meta object literal for the '{@link table.impl.ContenuFloatImpl <em>Contenu Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContenuFloatImpl
		 * @see table.impl.TablePackageImpl#getContenuFloat()
		 * @generated
		 */
		EClass CONTENU_FLOAT = eINSTANCE.getContenuFloat();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_FLOAT__CONTENU = eINSTANCE.getContenuFloat_Contenu();

		/**
		 * The meta object literal for the '{@link table.impl.ContenuIntImpl <em>Contenu Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContenuIntImpl
		 * @see table.impl.TablePackageImpl#getContenuInt()
		 * @generated
		 */
		EClass CONTENU_INT = eINSTANCE.getContenuInt();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_INT__CONTENU = eINSTANCE.getContenuInt_Contenu();

		/**
		 * The meta object literal for the '{@link table.impl.ContenuBoolImpl <em>Contenu Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContenuBoolImpl
		 * @see table.impl.TablePackageImpl#getContenuBool()
		 * @generated
		 */
		EClass CONTENU_BOOL = eINSTANCE.getContenuBool();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_BOOL__CONTENU = eINSTANCE.getContenuBool_Contenu();

		/**
		 * The meta object literal for the '{@link table.impl.ContenuStringImpl <em>Contenu String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContenuStringImpl
		 * @see table.impl.TablePackageImpl#getContenuString()
		 * @generated
		 */
		EClass CONTENU_STRING = eINSTANCE.getContenuString();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_STRING__CONTENU = eINSTANCE.getContenuString_Contenu();

		/**
		 * The meta object literal for the '{@link table.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContrainteImpl
		 * @see table.impl.TablePackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '{@link table.impl.OuImpl <em>Ou</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.OuImpl
		 * @see table.impl.TablePackageImpl#getOu()
		 * @generated
		 */
		EClass OU = eINSTANCE.getOu();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OU__VARIABLES = eINSTANCE.getOu_Variables();

		/**
		 * The meta object literal for the '{@link table.impl.EtImpl <em>Et</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.EtImpl
		 * @see table.impl.TablePackageImpl#getEt()
		 * @generated
		 */
		EClass ET = eINSTANCE.getEt();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ET__VARIABLES = eINSTANCE.getEt_Variables();

		/**
		 * The meta object literal for the '{@link table.impl.PredicatImpl <em>Predicat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.PredicatImpl
		 * @see table.impl.TablePackageImpl#getPredicat()
		 * @generated
		 */
		EClass PREDICAT = eINSTANCE.getPredicat();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICAT__CONDITION = eINSTANCE.getPredicat_Condition();

		/**
		 * The meta object literal for the '{@link table.impl.PredicatValeurImpl <em>Predicat Valeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.PredicatValeurImpl
		 * @see table.impl.TablePackageImpl#getPredicatValeur()
		 * @generated
		 */
		EClass PREDICAT_VALEUR = eINSTANCE.getPredicatValeur();

		/**
		 * The meta object literal for the '<em><b>Comparant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICAT_VALEUR__COMPARANT = eINSTANCE.getPredicatValeur_Comparant();

		/**
		 * The meta object literal for the '{@link table.impl.PredicatColonneImpl <em>Predicat Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.PredicatColonneImpl
		 * @see table.impl.TablePackageImpl#getPredicatColonne()
		 * @generated
		 */
		EClass PREDICAT_COLONNE = eINSTANCE.getPredicatColonne();

		/**
		 * The meta object literal for the '<em><b>Colonne Comparante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICAT_COLONNE__COLONNE_COMPARANTE = eINSTANCE.getPredicatColonne_ColonneComparante();

		/**
		 * The meta object literal for the '{@link table.ColonnesElementsType <em>Colonnes Elements Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.ColonnesElementsType
		 * @see table.impl.TablePackageImpl#getColonnesElementsType()
		 * @generated
		 */
		EEnum COLONNES_ELEMENTS_TYPE = eINSTANCE.getColonnesElementsType();

		/**
		 * The meta object literal for the '{@link table.Condition <em>Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.Condition
		 * @see table.impl.TablePackageImpl#getCondition()
		 * @generated
		 */
		EEnum CONDITION = eINSTANCE.getCondition();

	}

} //TablePackage
