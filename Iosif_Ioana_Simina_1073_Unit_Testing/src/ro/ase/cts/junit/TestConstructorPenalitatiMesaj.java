package ro.ase.cts.junit;

import ro.ase.cts.builder.BuilderCarte;
import ro.ase.cts.chainOfResponsability.ImprumutMesaj;
import ro.ase.cts.chainOfResponsability.Mesaje;
import ro.ase.cts.chainOfResponsability.PenalitatiMesaj;
import ro.ase.cts.chainOfResponsability.RestituireMesaj;
import ro.ase.cts.factory.Carte;
import ro.ase.cts.strategy.FaraPenalizare;
import ro.ase.cts.strategy.Strategy;
import junit.framework.TestCase;

public class TestConstructorPenalitatiMesaj extends TestCase {
	//Fixture
	PenalitatiMesaj penMsg;
	public TestConstructorPenalitatiMesaj(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("______ SET UP ---- teste constructor PenalitatiMesaj ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("______ TEAR DOWN ---- teste constructor PenalitatiMesaj ______");
	}
	
	public void testConstructorNormal(){
		Carte carte= new Carte();
		RestituireMesaj rest= new RestituireMesaj(Mesaje.RESTITUIRE, 10,carte);
		penMsg= new PenalitatiMesaj(Mesaje.PENALIZARE, rest);
		assertEquals("Verificare denumire", rest,penMsg.getRestituire());
	}

	public void testConstructorRestituireNula(){
		RestituireMesaj rest= null;
		try {
			penMsg= new PenalitatiMesaj(Mesaje.PENALIZARE, rest);
			fail("Lipsa exceptie pe restituire =  null");
		}catch(Exception e){}
	}
}
