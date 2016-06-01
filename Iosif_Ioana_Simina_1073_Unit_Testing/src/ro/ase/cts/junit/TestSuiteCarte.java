package ro.ase.cts.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteCarte {

	public static Test suite() {
		TestSuite suiteCarte = new TestSuite(TestSuiteCarte.class.getName());
		suiteCarte.addTestSuite(TestAutorCarte.class);
		suiteCarte.addTestSuite(TestConstructorCarte.class);
		suiteCarte.addTestSuite(TestEdituraCarte.class);
		suiteCarte.addTestSuite(TestIsbnCarte.class);
		suiteCarte.addTestSuite(TestValoriAnLansareCarte.class);
		return suiteCarte;
	}

}
