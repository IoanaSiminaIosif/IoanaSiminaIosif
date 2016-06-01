package ro.ase.cts.junit;

import ro.ase.cts.factory.Carte;
import junit.framework.TestCase;

public class TestAutorCarte extends TestCase {
	//Fixture
	Carte carte;
	
	public TestAutorCarte(String name) {
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
		System.out.println("______ SET UP ---- teste metoda setAutor ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		carte=null;
		System.out.println("______ TEAR DOWN ---- teste metoda setAutor ______");
	}
	
	
	public void testAutorValNormala(){
		String autor="Mihai Eminescu";
		carte.setAutor(autor);
		assertEquals("Valoare normala", autor,carte.getAutor());
	}
	
	public void testAutorNull(){
		String autor=null;
		try {
			carte.setAutor(autor);
			fail("Lipsa exceptie autor = null");
		}catch(Exception e){}
	}
	
	public void testAutorString(){
		String autor="Autor1234";
		try {
			carte.setAutor(autor);
			fail("Lipsa exceptie autor trebuie sa fie string");
		}catch(Exception e){}
	}

}
