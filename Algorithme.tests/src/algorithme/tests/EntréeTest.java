/**
 */
package algorithme.tests;

import algorithme.AlgorithmeFactory;
import algorithme.Entrée;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entrée</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntréeTest extends E_STest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntréeTest.class);
	}

	/**
	 * Constructs a new Entrée test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntréeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entrée test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Entrée getFixture() {
		return (Entrée)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgorithmeFactory.eINSTANCE.createEntrée());
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

} //EntréeTest
