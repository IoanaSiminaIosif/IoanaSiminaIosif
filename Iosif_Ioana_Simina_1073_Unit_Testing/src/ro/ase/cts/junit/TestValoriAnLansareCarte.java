package ro.ase.cts.junit;

import ro.ase.cts.factory.Carte;
import junit.framework.TestCase;

public class TestValoriAnLansareCarte extends TestCase {
	//Fixture
	Carte carte;
	
	public TestValoriAnLansareCarte(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		String denumire="Urzeala tronurilor";
		String autor="George RR Martin";
		String isbn="765ddsfhsg3";
		int anLansare=2003;
		String editura="Humanitas";
		carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
		System.out.println("______ SET UP ---- teste setAnLansare______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		carte=null;
		System.out.println("______ TEAR DOWN ---- teste setAnLansare______");

	}
	public void testAnAparitieValNormala(){
		int anNormal=2007;
		carte.setAnLansare(anNormal);
		assertEquals("Valoare normala", anNormal,carte.getAnLansare());
	}
	
	public void testAnAparitieNegativ(){
		int an=-4445;
		try {
			carte.setAnLansare(an);
			fail("Lipsa exceptie pe an aparitie este negativ");
		}catch(Exception e){
		}
	}
	
	public void testAnAparitieValoriAnormale(){
		int anAberant=20;
		try {
			carte.setAnLansare(anAberant);
			fail("Lipsa exceptie pe an aparitie - valori aberante");
		}catch(Exception e){
		}
	}
}
