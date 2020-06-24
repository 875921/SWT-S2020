package junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tino B�hmke
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514997@beuth-hochschule.de
 * @MatrikelNummer: 776097
 * @Datum 21.06.2019
 */

public class TDDBeispielEuroText {

	/**
	 * kleines Beispiel zu zwei m�glichen Test f�r Ihren Buchautor dem die
	 * Buchstaben bezahlt werden soll
	 */

	@Test
	public final void whenStringIsSubmittedThenNoExceptionIsThrown() {
		Assert.assertEquals(true, Character.isLetter('A'));
		// pr�fen ob �bergebenes Value ein Buchstabe ist
		Assert.assertTrue(true);

	}

	@Test
	public final void whenWhitespacesareSubmittedThenNoExceptionIsThrown() {
		Assert.assertEquals(true, Character.isSpaceChar(' '));
		// pr�fen ob �bergebenes Value ein Leerzeichen ist, die bezahle ich nicht
		Assert.assertTrue(true);

	}

}
