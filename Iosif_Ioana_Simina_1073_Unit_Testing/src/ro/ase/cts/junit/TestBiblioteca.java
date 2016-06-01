package ro.ase.cts.junit;

import ro.ase.cts.singleton.Biblioteca;
import junit.framework.TestCase;

public class TestBiblioteca extends TestCase {
	//Fixture
	Biblioteca biblioteca;
	
	public TestBiblioteca(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("______ SET UP ---- teste metoda getBiblioteca ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("______ TEAR DOWN ---- teste metoda setAutor ______");
	}

	public void testBibliotecaValoriNormale(){
		String denumire="Centrala";
		biblioteca=Biblioteca.getBiblioteca(denumire);
		assertEquals("Valoare normala", denumire,biblioteca.getDenumire());
	}
	
	public void testDenumireNull(){
		String denumire=null;
		try {
			biblioteca=Biblioteca.getBiblioteca(denumire);
			fail("Lipsa exceptie pe denumire = null");
		}catch(Exception e){}
	}
}
