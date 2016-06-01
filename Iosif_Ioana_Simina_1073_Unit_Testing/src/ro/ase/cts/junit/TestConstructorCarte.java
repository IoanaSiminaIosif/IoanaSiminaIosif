package ro.ase.cts.junit;

import ro.ase.cts.factory.Carte;
import junit.framework.TestCase;

public class TestConstructorCarte extends TestCase {

	Carte carte;

	public TestConstructorCarte(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("______ SET UP ---- teste constructor Carte ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("______ TEAR DOWN ---- teste constructor Carte ______");
	}
	
	public void testConstructorNormal(){
		String denumire="Urzeala tronurilor";
		String autor="George RR Martin";
		String isbn="10-3-10-90";
		int anLansare=2008;
		String editura="Humanitas";
		carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
		assertEquals("Verificare denumire", denumire,carte.getDenumire());
		assertEquals("Verificare autor", autor,carte.getAutor());
		assertEquals("Verificare isbn", isbn,carte.getIsbn());
		assertEquals("Verificare an lansare", anLansare,carte.getAnLansare());
		assertEquals("Verificare editura", editura,carte.getEditura());
	}

	public void testConstructorDenumireNula(){
		String denumire=null;
		String autor="George RR Martin";
		String isbn="77-66-82-13";
		int anLansare=2008;
		String editura="Humanitas";
		try {
			carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
			fail("Lipsa exceptie pe denumire =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorAutorNul(){
		String denumire="Urzeala tronurilor";
		String autor=null;
		String isbn="77-66-82-13";
		int anLansare=2008;
		String editura="Humanitas";
		try {
			carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
			fail("Lipsa exceptie pe autor =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorIsbnNul(){
		String denumire="Urzeala tronurilor";	
		String autor="George RR Martin";
		String isbn=null;
		int anLansare=2008;
		String editura="Humanitas";
		try {
			carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
			fail("Lipsa exceptie pe isbn =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorEdituraNula(){
		String denumire="Urzeala tronurilor";
		String autor="George RR Martin";
		String isbn="77-66-82-13";
		int anLansare=2008;
		String editura=null;
		try {
			carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
			fail("Lipsa exceptie pe editura =  null");
		}catch(Exception e){}
	}
}
