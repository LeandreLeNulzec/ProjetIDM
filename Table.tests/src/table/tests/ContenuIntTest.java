/**
 */
package table.tests;

import junit.textui.TestRunner;

import table.ContenuInt;
import table.TableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contenu Int</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenuIntTest extends ContenuTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContenuIntTest.class);
	}

	/**
	 * Constructs a new Contenu Int test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenuIntTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Contenu Int test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContenuInt getFixture() {
		return (ContenuInt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableFactory.eINSTANCE.createContenuInt());
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

} //ContenuIntTest
