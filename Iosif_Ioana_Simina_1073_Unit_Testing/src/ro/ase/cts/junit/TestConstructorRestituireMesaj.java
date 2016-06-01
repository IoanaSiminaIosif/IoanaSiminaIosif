package ro.ase.cts.junit;

import ro.ase.cts.builder.BuilderCarte;
import ro.ase.cts.chainOfResponsability.ImprumutMesaj;
import ro.ase.cts.chainOfResponsability.Mesaje;
import ro.ase.cts.chainOfResponsability.PenalitatiMesaj;
import ro.ase.cts.chainOfResponsability.RestituireMesaj;
import ro.ase.cts.factory.Carte;
import ro.ase.cts.strategy.Strategy;
import junit.framework.TestCase;

public class TestConstructorRestituireMesaj extends TestCase {
	//FIXTURE
	RestituireMesaj restituireMsg;
	public TestConstructorRestituireMesaj(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("______ SET UP ---- teste constructor RestituireMesaj ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("______ TEAR DOWN ---- teste constructor RestituireMesaj ______");
	}
	
	public void testConstructorNormal(){
		int zileIntarziate=10;
		Carte carte=new Carte();
		restituireMsg=new RestituireMesaj(Mesaje.RESTITUIRE, zileIntarziate,carte);
		assertEquals("Verificare denumire", zileIntarziate,restituireMsg.getNrZileIntarziate());
	}

	public void testConstructorNrZileNegativ(){
		int zileIntarziate=-30;
		Carte carte=new Carte();

		try {
			restituireMsg=new RestituireMesaj(Mesaje.RESTITUIRE, zileIntarziate,carte);
			fail("Lipsa exceptie pe numar zile intarziere =  negativ");
		}catch(Exception e){}
	}

	public void testConstructorCarteNula(){
		int zileIntarziate=-30;
		Carte carte=null;

		try {
			restituireMsg=new RestituireMesaj(Mesaje.RESTITUIRE, zileIntarziate,carte);
			fail("Lipsa exceptie pe carte = null");
		}catch(Exception e){}
	}
}
