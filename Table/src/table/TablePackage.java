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
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTRAINTES = 3;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__CONTRAINTES = COLONNE__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Colonne Origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT__COLONNE_ORIGINE = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colonne Provient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_PROVIENT_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__CONTRAINTES = COLONNE__CONTRAINTES;

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
	 * The meta object id for the '{@link table.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.impl.ContrainteImpl
	 * @see table.impl.TablePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 4;

	/**
	 * The feature id for the '<em><b>Parametre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__PARAMETRE = 0;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link table.ColonnesElementsType <em>Colonnes Elements Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see table.ColonnesElementsType
	 * @see table.impl.TablePackageImpl#getColonnesElementsType()
	 * @generated
	 */
	int COLONNES_ELEMENTS_TYPE = 5;


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
	 * Returns the meta object for the reference list '{@link table.Colonne#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contraintes</em>'.
	 * @see table.Colonne#getContraintes()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contraintes();

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
	 * Returns the meta object for the reference '{@link table.ColonneProvient#getColonneOrigine <em>Colonne Origine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne Origine</em>'.
	 * @see table.ColonneProvient#getColonneOrigine()
	 * @see #getColonneProvient()
	 * @generated
	 */
	EReference getColonneProvient_ColonneOrigine();

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
	 * Returns the meta object for class '{@link table.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see table.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for the attribute '{@link table.Contrainte#getParametre <em>Parametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametre</em>'.
	 * @see table.Contrainte#getParametre()
	 * @see #getContrainte()
	 * @generated
	 */
	EAttribute getContrainte_Parametre();

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
		 * The meta object literal for the '<em><b>Contraintes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTRAINTES = eINSTANCE.getColonne_Contraintes();

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
		 * The meta object literal for the '<em><b>Colonne Origine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_PROVIENT__COLONNE_ORIGINE = eINSTANCE.getColonneProvient_ColonneOrigine();

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
		 * The meta object literal for the '{@link table.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.impl.ContrainteImpl
		 * @see table.impl.TablePackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '<em><b>Parametre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAINTE__PARAMETRE = eINSTANCE.getContrainte_Parametre();

		/**
		 * The meta object literal for the '{@link table.ColonnesElementsType <em>Colonnes Elements Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see table.ColonnesElementsType
		 * @see table.impl.TablePackageImpl#getColonnesElementsType()
		 * @generated
		 */
		EEnum COLONNES_ELEMENTS_TYPE = eINSTANCE.getColonnesElementsType();

	}

} //TablePackage
