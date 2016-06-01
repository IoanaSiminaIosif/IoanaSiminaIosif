package ro.ase.cts.junit;

import ro.ase.cts.factory.Carte;
import junit.framework.TestCase;

public class TestEdituraCarte extends TestCase {
	//FIXTURE
	Carte carte;
	public TestEdituraCarte(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		String denumire="Urzeala tronurilor";
		String autor="George RR Martin";
		String isbn="77-23-85-69";
		int anLansare=2003;
		String editura="Humanitas";
		carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
		System.out.println("______ SET UP ---- teste setEditura ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		carte=null;
		System.out.println("______ TEAR DOWN ---- teste setEditura ______");
	}
	
	public void testEdituraValoareNormala(){
		String editura="Humanitas";
		carte.setEditura(editura);
		assertEquals("Valoare normala", editura,carte.getEditura());
	}
	
	public void testEdituraNull(){
		String editura=null;
		try {
			carte.setEditura(editura);
			fail("Lipsa exceptie editura = null");
		}catch(Exception e){
		}
	}

}
