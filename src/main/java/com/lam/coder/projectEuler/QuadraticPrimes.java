package com.lam.coder.projectEuler;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.Primes;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 27: Quadratic primes
 * 
 *         Euler discovered the remarkable quadratic formula:
 * 
 *         n² + n + 41
 * 
 *         It turns out that the formula will produce 40 primes for the
 *         consecutive values n = 0 to 39. However, when n = 40, 402 + 40 + 41 =
 *         40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² +
 *         41 + 41 is clearly divisible by 41.
 * 
 * 
 *         The incredible formula n² − 79n + 1601 was discovered, which produces
 *         80 primes for the consecutive values n = 0 to 79. The product of the
 *         coefficients, −79 and 1601, is −126479.
 * 
 *         Considering quadratics of the form:
 * 
 *         n² + an + b, where |a| < 1000 and |b| < 1000
 * 
 *         where |n| is the modulus/absolute value of n e.g. |11| = 11 and |−4|
 *         = 4
 * 
 *         Find the product of the coefficients, a and b, for the quadratic
 *         expression that produces the maximum number of primes for consecutive
 *         values of n, starting with n = 0.
 * 
 *         Answer: Consecutive values: 71, b = -61, c = 971, bc =-59231.
 */

public class QuadraticPrimes {
	private long[] primes;

	private long calculate(int n, int a, long b) {
		return n * n + n * a + b;
	}

	private void findB(int upTo) {
		Primes primeFinder = new Primes();
		primeFinder.find(upTo);
		primes = primeFinder.getArray();
	}

	public long checkFormula(int upTo) {
		int counter = 0;
		int max = 0;
		String ab = null;
		long product = 1;

		this.findB(upTo);

		for (int a = -999; a < 1000; a++) {
			for (int b = 0; b < primes.length; b++) {
				for (int i = 0;; i++) {
					if (this.calculate(i, a, primes[b]) > 0) {
						if (CheckIsPrime.go(this.calculate(i, a, primes[b]))) {
							counter++;
						} else {
							if (max < counter) {
								max = counter;
								ab = max + "/" + a + "/" + primes[b] + "/" + a
										* primes[b];
								product = a * primes[b];
							}
							counter = 0;
							break;
						}
					} else {
					}
				}
			}
		}
		return product;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuadraticPrimes quadratic = new QuadraticPrimes();
		int upTo = 1000;
		System.out.println("Answer: " + quadratic.checkFormula(upTo));
	}
}
