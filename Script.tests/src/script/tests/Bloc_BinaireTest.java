/**
 */
package script.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import script.Bloc_Binaire;
import script.ScriptFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bloc Binaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bloc_BinaireTest extends TestCase {

	/**
	 * The fixture for this Bloc Binaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bloc_Binaire fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Bloc_BinaireTest.class);
	}

	/**
	 * Constructs a new Bloc Binaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc_BinaireTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bloc Binaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Bloc_Binaire fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bloc Binaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bloc_Binaire getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScriptFactory.eINSTANCE.createBloc_Binaire());
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

} //Bloc_BinaireTest
