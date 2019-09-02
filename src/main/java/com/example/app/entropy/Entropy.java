package com.example.app.entropy;

/**
 * Class for calculation of entropy.
 */
public final class Entropy {

	/**
	 * Prohibits instantiation.
	 */
	private Entropy() {

	}

	/**
	 * Returns the base 2 logarithm of a double value.
	 * 
	 * @param a
	 * @return
	 */
	private static double log2(final double a) {
		return Math.log(a) / Math.log(2);
	}

	/**
	 * Returns the entropy of a given double value.
	 * 
	 * @param n
	 * @param ai
	 * @return
	 */
	public static double calculate(final double n, final double ai) {
		if (0.0 == n && 0.0 == ai) {
			return 0.0;
		}

		final double pi = ai / n;

		return -pi * log2(pi);
	}

	/**
	 * Returns the entropy of given double values.
	 * 
	 * @param n
	 * @param args
	 * @return
	 */
	public static double calculate(final double n, final double[] args) {
		double h3 = 0.0;

		for (final double ai : args) {
			h3 += Entropy.calculate(n, ai);
		}

		return h3;
	}

}
