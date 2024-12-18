/**
 */
package table.tests;

import junit.textui.TestRunner;

import table.Et;
import table.TableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Et</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtTest extends ContrainteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EtTest.class);
	}

	/**
	 * Constructs a new Et test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Et test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Et getFixture() {
		return (Et)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableFactory.eINSTANCE.createEt());
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

} //EtTest
