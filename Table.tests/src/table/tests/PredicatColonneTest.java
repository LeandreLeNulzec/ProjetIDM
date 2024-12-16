/**
 */
package table.tests;

import junit.textui.TestRunner;

import table.PredicatColonne;
import table.TableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predicat Colonne</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicatColonneTest extends PredicatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredicatColonneTest.class);
	}

	/**
	 * Constructs a new Predicat Colonne test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatColonneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Predicat Colonne test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PredicatColonne getFixture() {
		return (PredicatColonne)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableFactory.eINSTANCE.createPredicatColonne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PredicatColonneTest
