package ro.ase.cts.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteFunctionalitatiBiblioteca {

	public static Test suite() {
		TestSuite suiteAllTests = new TestSuite(
				TestSuiteFunctionalitatiBiblioteca.class.getName());
		suiteAllTests.addTestSuite(TestBiblioteca.class);
		suiteAllTests.addTest(TestSuiteAngajati.suite());
		suiteAllTests.addTest(TestSuiteCarte.suite());
		suiteAllTests.addTest(TestSuiteChainOfResponsabilityMesaje.suite());
		return suiteAllTests;
	}

}
