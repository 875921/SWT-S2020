package junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Tino B�hmke
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514997@beuth-hochschule.de
 * @MatrikelNummer: 776097
 * @Datum 21.06.2019
 */

public class BeispielPotenzierenTest {

	/**
	 * zweites kleier Test f�r meine potenzierte Rechenoperationen
	 */

	private BeispielPotenzieren beispielPotenzieren;

	@Before
	public void setUp() {
		beispielPotenzieren = new BeispielPotenzieren();
	}

	@Test
	public void testKonstruktor() {
		assertEquals("Durch den Konstruktor darf keine Aufgabe gesetzt sein.", null,
				// pr�ft ob der Konstruktur wirklich keine weiteren Augaben ausf�hren soll
				beispielPotenzieren.getAufgabe());
	}

	@Test

	public void testgetAndSetAufgabe() {
		beispielPotenzieren.setAufgabe("Quadrat");
		// pr�ft ob die Methode getAufgabe die gew�nschte myMethod (Quadrat) zur�ck gibt
		assertEquals("Produkt muss 'Quadrat' sein.", "Quadrat", beispielPotenzieren.getAufgabe());
	}

	@Test
	/**
	 * @throws Exception
	 */
	public void testProdukt() throws Exception {
		beispielPotenzieren.setAufgabe("Produkt");
		// pr�ft die Berechnung eines Produktes mit einer in die Methode gegebenen Zahl
		// * 2
		assertTrue("Produkt von '4x2' muss '8' sein.", 8 == beispielPotenzieren.myMethod(4));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testQuadrat() throws Exception {
		beispielPotenzieren.setAufgabe("Quadrat");
		// pr�ft die Berechnung des Quadrats einer gegebenen Zahl
		assertTrue("Quadrat von '4' muss '16' sein.", 16 == beispielPotenzieren.myMethod(4));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testWurzel() throws Exception {
		beispielPotenzieren.setAufgabe("Wurzel");
		// pr�ft das Ziehen der Wurzel aus einer gegebenen Zahl
		assertTrue("Wurzel von '4' muss '2' sein.", 2 == beispielPotenzieren.myMethod(4));
	}

	/**
	 * @throws Exception
	 */
	@Test(expected = Exception.class)
	public void testUnbekannteAufgabe() throws Exception {
		beispielPotenzieren.setAufgabe("Undefiniert");
		// pr�ft das Handling von Unbekannten Aufgaben
		beispielPotenzieren.myMethod(4);
	}
}