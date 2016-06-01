package ro.ase.cts.junit;

import ro.ase.cts.composite.Angajat;
import ro.ase.cts.factory.Carte;
import ro.ase.cts.prototype.ColectieFunctii;
import ro.ase.cts.prototype.Functie;
import junit.framework.TestCase;

public class TestConstructorAngajat extends TestCase {
	//Fixture
	Angajat angajat;
	public TestConstructorAngajat(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("______ SET UP ---- teste constructor Angajat ______");

	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("______ TEAR DOWN ---- teste constructor Angajat ______");

	}

	public void testConstructorNormal(){
		String nume="Ionescu";
		String prenume="Andrei";
		ColectieFunctii.incarcaInColectie();
	    Functie functie = (Functie) ColectieFunctii.getFunctie("3");
		angajat=new Angajat(nume, prenume, functie);
		assertEquals("Verificare denumire", nume,angajat.getNume());
		assertEquals("Verificare autor", prenume,angajat.getPrenume());
		assertEquals("Verificare isbn", functie,angajat.getFunctie());
	}
	
	public void testConstructorNumeNull(){
		String nume=null;
		String prenume="Andrei";
		ColectieFunctii.incarcaInColectie();
	    Functie functie = (Functie) ColectieFunctii.getFunctie("3");
		try {
			angajat=new Angajat(nume, prenume, functie);
			fail("Lipsa exceptie pe nume =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorPrenumeNull(){
		String nume="Ionescu";
		String prenume=null;
		ColectieFunctii.incarcaInColectie();
	    Functie functie = (Functie) ColectieFunctii.getFunctie("3");
		try {
			angajat=new Angajat(nume, prenume, functie);
			fail("Lipsa exceptie pe prenume =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorFunctieNull(){
		String nume="Ionescu";
		String prenume="Andrei";
	    Functie functie = null;
		try {
			angajat=new Angajat(nume, prenume, functie);
			fail("Lipsa exceptie pe functie =  null");
		}catch(Exception e){}
	}
}
