package linprog.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolarRadiationTest {

	@Test
	public void testFloatingPointModulo() {
		double dividend = 25.2;
		double divisor = 24;
		double expectedResult = 1.2;
		double actualResult = dividend % divisor;
		assertEquals(expectedResult, actualResult, 0.1);
	}

}
