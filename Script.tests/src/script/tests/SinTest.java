/**
 */
package script.tests;

import junit.textui.TestRunner;

import script.ScriptFactory;
import script.Sin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinTest extends Bloc_FonctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinTest.class);
	}

	/**
	 * Constructs a new Sin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sin getFixture() {
		return (Sin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScriptFactory.eINSTANCE.createSin());
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

} //SinTest
