/**
 */
package script.tests;

import junit.textui.TestRunner;

import script.Constante;
import script.ScriptFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstanteTest extends ScriptElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstanteTest.class);
	}

	/**
	 * Constructs a new Constante test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstanteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constante test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Constante getFixture() {
		return (Constante)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScriptFactory.eINSTANCE.createConstante());
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

} //ConstanteTest
