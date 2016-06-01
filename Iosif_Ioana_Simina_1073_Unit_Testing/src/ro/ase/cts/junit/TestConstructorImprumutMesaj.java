package ro.ase.cts.junit;

import ro.ase.cts.builder.BuilderCarte;
import ro.ase.cts.chainOfResponsability.ImprumutMesaj;
import ro.ase.cts.chainOfResponsability.Mesaje;
import ro.ase.cts.factory.Carte;
import junit.framework.TestCase;

public class TestConstructorImprumutMesaj extends TestCase {
	//Fixture
	ImprumutMesaj imprMesaj;
	public TestConstructorImprumutMesaj(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("______ SET UP ---- teste constructor ImprumutMesaj ______");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("______ TEAR DOWN ---- teste constructor ImprumutMesaj ______");
	}
	
	public void testConstructorNormal(){
		BuilderCarte builder= new BuilderCarte("Codul lui Da Vinci", 
				"Dan Brown", "66-33-964-14", 2001, "Humanitas");
		Carte carte= new Carte();
		int zileImprumut=10;
		imprMesaj= new ImprumutMesaj(Mesaje.IMPRUMUT, builder, carte, zileImprumut);
		assertEquals("Verificare denumire", carte,imprMesaj.getCarte());
		assertEquals("Verificare isbn", builder,imprMesaj.getBuilder());
		assertEquals("Verificare editura", zileImprumut,imprMesaj.getNrZileDeImprumut());
	}

	public void testConstructorBuilderNul(){
		BuilderCarte builder=null;
		Carte carte= new Carte();
		int zileImprumut=10;
		try {
			imprMesaj= new ImprumutMesaj(Mesaje.IMPRUMUT, builder, carte, zileImprumut);
			fail("Lipsa exceptie pe builder =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorCarteNula(){
		BuilderCarte builder= new BuilderCarte("Codul lui Da Vinci", 
				"Dan Brown", "66-33-964-14", 2001, "Humanitas");
		Carte carte= null;
		int zileImprumut=10;
		try {
			imprMesaj= new ImprumutMesaj(Mesaje.IMPRUMUT, builder, carte, zileImprumut);
			fail("Lipsa exceptie pe carte =  null");
		}catch(Exception e){}
	}
	
	public void testConstructorNrZileNegativ(){
		BuilderCarte builder= new BuilderCarte("Codul lui Da Vinci",
				"Dan Brown", "66-33-964-14", 2001, "Humanitas");
		Carte carte= new Carte();
		int zileImprumut=-30;
		try {
			imprMesaj= new ImprumutMesaj(Mesaje.IMPRUMUT, builder, carte, zileImprumut);
			fail("Lipsa exceptie pe numar zile imprumut =  negativ");
		}catch(Exception e){}
	}
}
