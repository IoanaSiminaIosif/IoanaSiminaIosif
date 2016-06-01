package ro.ase.cts.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteChainOfResponsabilityMesaje {

	public static Test suite() {
		TestSuite suiteMesaje = new TestSuite(
				TestSuiteChainOfResponsabilityMesaje.class.getName());
		suiteMesaje.addTestSuite(TestConstructorImprumutMesaj.class);
		suiteMesaje.addTestSuite(TestConstructorPenalitatiMesaj.class);
		suiteMesaje.addTestSuite(TestConstructorRestituireMesaj.class);
		return suiteMesaje;
	}

}
