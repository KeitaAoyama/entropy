package com.example.app.entropy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EntropyTest {

	@Test
	void givenSameValues() {
		assertEquals(0.0, Math.abs(Entropy.calculate(10.0, 10.0)));
	}

	@Test
	void givenZeros() {
		assertEquals(0.0, Entropy.calculate(0.0, 0.0));
	}

	@Test
	void givenRandomValues() {
		final double entropy = Entropy.calculate(30.0, new double[] { 12.0, 8.0, 6.0, 4.0 });
		assertTrue(entropy > 1.88 && entropy < 1.89);
	}

}
