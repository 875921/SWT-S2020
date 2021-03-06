package de.boehmke.beispielrechner;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author TiXX BoehXXX 
 * Softwaretechnik (BHTB MIB 13 S20)
 * s514XXX@beuth-hochschule.de
 * MatrikelNummer: 776XXX
 * Datum 21.06.2019
 */

public class BeispielRechnerTest {

	private BeispielRechner x;

	@Before
	public void setUp() {
		x = new BeispielRechner();
	}

	/**
	 * Testmethode for Addition (long+long)
	 */
	@Test
	public final void testAdd() {
		assertEquals("error in add()", 12, x.Add(4, 8));
		assertEquals("error in add()", -6, x.Add(-2, -4));
		assertEquals("error in add()", 5, x.Add(5, 0));
	}

	@Test
	public void testAddFail() {
		assertNotEquals("error in add()", 0, x.Add(1, 2));
	}

	/**
	 * Testmethode for Subtraktion (long-long)
	 */
	@Test
	public final void testSub() {
		assertEquals("error in sub()", 1, x.Sub(2, 1));
		assertEquals("error in sub()", -1, x.Sub(-2, -1));
		assertEquals("error in sub()", 0, x.Sub(2, 2));
	}

	@Test
	public void testSubFail() {
		assertNotEquals("error in sub()", 0, x.Sub(2, 1));
	}

	/**
	 * Testmethode for Multiplitation (long*long)
	 */
	
	@Test
	public void testMal() {
		Assert.assertTrue(x.Mal(5, 2) == 10);
		Assert.assertTrue(x.Mal(10, 3) == 30);
		Assert.assertTrue(x.Mal(2, 4) == 8);
	}


	@Test
	public void testMalZero() {

		Assert.assertTrue(x.Mal(10, 0) == 0);
		Assert.assertTrue(x.Mal(0, 10) == 0);
		Assert.assertTrue(x.Mal(0, 0) == 0);
	}

	/**
	 * Testmethode for Division (long/long)
	 */
	@Test
	public final void testDiv() {
		assertEquals("error in div()", 3, x.div(9, 3));
		assertEquals("error in div()", 0, x.div(1, 9));
	}

	@Test
	public void testDivFail() {
		assertNotEquals("error in div()", 1, x.div(9, 3));
	}
	
	/**
	 * Testmethode for Division (long/long) with the required Exception 
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivByZero() {
		x.div(9, 0); 
	}

}

