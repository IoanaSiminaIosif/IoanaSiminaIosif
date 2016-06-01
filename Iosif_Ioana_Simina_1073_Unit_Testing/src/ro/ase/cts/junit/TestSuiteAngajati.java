package ro.ase.cts.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteAngajati {

	public static Test suite() {
		TestSuite suiteAngajati = new TestSuite(TestSuiteAngajati.class.getName());
		suiteAngajati.addTestSuite(TestConstructorAngajat.class);
		suiteAngajati.addTestSuite(TestIdFunctie.class);
		return suiteAngajati;
	}

}
