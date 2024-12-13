/**
 */
package script.tests;

import junit.textui.TestRunner;

import script.Racine;
import script.ScriptFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Racine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RacineTest extends Bloc_FonctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RacineTest.class);
	}

	/**
	 * Constructs a new Racine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RacineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Racine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Racine getFixture() {
		return (Racine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScriptFactory.eINSTANCE.createRacine());
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

} //RacineTest
