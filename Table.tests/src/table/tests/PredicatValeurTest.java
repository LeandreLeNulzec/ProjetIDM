/**
 */
package table.tests;

import junit.textui.TestRunner;

import table.PredicatValeur;
import table.TableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predicat Valeur</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicatValeurTest extends PredicatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredicatValeurTest.class);
	}

	/**
	 * Constructs a new Predicat Valeur test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatValeurTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Predicat Valeur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PredicatValeur getFixture() {
		return (PredicatValeur)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableFactory.eINSTANCE.createPredicatValeur());
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

} //PredicatValeurTest
