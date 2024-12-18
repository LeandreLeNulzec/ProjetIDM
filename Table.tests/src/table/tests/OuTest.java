/**
 */
package table.tests;

import junit.textui.TestRunner;

import table.Ou;
import table.TableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ou</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OuTest extends ContrainteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OuTest.class);
	}

	/**
	 * Constructs a new Ou test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ou test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ou getFixture() {
		return (Ou)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableFactory.eINSTANCE.createOu());
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

} //OuTest
