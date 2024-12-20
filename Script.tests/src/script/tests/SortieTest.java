/**
 */
package script.tests;

import junit.textui.TestRunner;

import script.ScriptFactory;
import script.Sortie;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SortieTest extends ScriptElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SortieTest.class);
	}

	/**
	 * Constructs a new Sortie test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortieTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sortie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sortie getFixture() {
		return (Sortie)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScriptFactory.eINSTANCE.createSortie());
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

} //SortieTest
