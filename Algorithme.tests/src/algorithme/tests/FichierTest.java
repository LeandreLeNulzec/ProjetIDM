/**
 */
package algorithme.tests;

import algorithme.AlgorithmeFactory;
import algorithme.Fichier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FichierTest extends RessourcesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FichierTest.class);
	}

	/**
	 * Constructs a new Fichier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FichierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fichier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fichier getFixture() {
		return (Fichier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgorithmeFactory.eINSTANCE.createFichier());
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

} //FichierTest
