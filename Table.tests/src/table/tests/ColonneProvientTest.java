/**
 */
package table.tests;

import junit.textui.TestRunner;

import table.ColonneProvient;
import table.TableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne Provient</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneProvientTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneProvientTest.class);
	}

	/**
	 * Constructs a new Colonne Provient test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneProvientTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne Provient test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColonneProvient getFixture() {
		return (ColonneProvient)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TableFactory.eINSTANCE.createColonneProvient());
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

} //ColonneProvientTest
