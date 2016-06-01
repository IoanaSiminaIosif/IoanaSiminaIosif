package ro.ase.cts.junit;

import ro.ase.cts.prototype.Director;
import ro.ase.cts.prototype.Functie;
import ro.ase.cts.prototype.Manager;
import junit.framework.TestCase;

public class TestIdFunctie extends TestCase {
	Manager functie;

	public TestIdFunctie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		  functie = new Manager();
			System.out.println("______ SET UP ---- teste setIdFunctie______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		functie=null;
		System.out.println("______ TEAR DOWN ---- teste setIdFunctie______");
	}

	
	public void testFunctieValoareNormala(){
		String id="3";
		functie.setId(id);
		assertEquals("Valoare normala", id,functie.getId());
	}
	
	public void testIdFunctieNul(){
		String id=null;
		try {
			functie.setId(id);
			fail("Lipsa exceptie id = null");
		}catch(Exception e){
		}
	}
	
	public void testIdFunctieNepermis(){
		String id="123";
		try {
			functie.setId(id);
			fail("Lipsa exceptie id = nepermis");
		}catch(Exception e){
		}
	}
}
