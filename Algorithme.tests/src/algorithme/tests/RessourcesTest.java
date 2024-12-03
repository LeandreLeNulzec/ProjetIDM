/**
 */
package algorithme.tests;

import algorithme.AlgorithmeFactory;
import algorithme.Ressources;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourcesTest extends TestCase {

	/**
	 * The fixture for this Ressources test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ressources fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RessourcesTest.class);
	}

	/**
	 * Constructs a new Ressources test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ressources test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ressources fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ressources test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ressources getFixture() {
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
		setFixture(AlgorithmeFactory.eINSTANCE.createRessources());
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

} //RessourcesTest
