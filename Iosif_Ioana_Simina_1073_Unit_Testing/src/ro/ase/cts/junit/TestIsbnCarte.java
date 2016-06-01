package ro.ase.cts.junit;

import ro.ase.cts.factory.Carte;
import junit.framework.TestCase;

public class TestIsbnCarte extends TestCase {
	Carte carte;
	public TestIsbnCarte(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		String denumire="Urzeala tronurilor";
		String autor="George RR Martin";
		String isbn="23-16-25-96";
		int anLansare=2003;
		String editura="Humanitas";
		carte= new Carte(denumire, autor, isbn, anLansare, editura, false, false, false);
		System.out.println("______ SET UP ---- teste setIsbn______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		carte=null;
		System.out.println("______ TEAR DOWN ---- teste setIsbn______");
	}

	public void testIsnbValNormala(){
		String isbn="66-22-99";
		carte.setIsbn(isbn);
		assertEquals("Valoare normala", isbn,carte.getIsbn());
	}
	
	public void testISBNNull(){
		String isbn=null;
		try {
			carte.setIsbn(isbn);
			fail("Lipsa exceptie isbn = null");
		}catch(Exception e){
		}
	}
}
