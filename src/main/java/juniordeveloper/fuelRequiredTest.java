package main.java.juniordeveloper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fuelRequiredTest {

	@Test
	void test() {
		FuelRequirement test = new FuelRequirement();
		int output = test.totalFuelRequired(14);
		assertEquals(2, output);
		
	}

}
