/**
 */
package script.tests;

import junit.textui.TestRunner;

import script.Max;
import script.ScriptFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Max</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaxTest extends Bloc_BinaireTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaxTest.class);
	}

	/**
	 * Constructs a new Max test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Max test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Max getFixture() {
		return (Max)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScriptFactory.eINSTANCE.createMax());
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

} //MaxTest
