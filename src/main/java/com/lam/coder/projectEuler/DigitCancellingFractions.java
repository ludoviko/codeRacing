package com.lam.coder.projectEuler;

import com.lam.mathematics.GCD;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 33: Digit canceling fractions
 * 
 *         The fraction 49/98 is a curious fraction, as an inexperienced
 *         mathematician in attempting to simplify it may incorrectly believe
 *         that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.
 * 
 *         We shall consider fractions like, 30/50 = 3/5, to be trivial
 *         examples.
 * 
 *         There are exactly four non-trivial examples of this type of fraction,
 *         less than one in value, and containing two digits in the numerator
 *         and denominator.
 * 
 *         If the product of these four fractions is given in its lowest common
 *         terms, find the value of the denominator.
 * 
 *         Answer: 8/800 ; 1/100. Reduction: 1/4 16/64 Reduction: 1/5 19/95
 *         Reduction: 2/5 26/65 Reduction: 4/8 49/98
 * 
 * 
 */

public class DigitCancellingFractions {
	private long numerator;
	private long denominator;

	public DigitCancellingFractions() {
		numerator = denominator = 1;
	}

	public void go() {
		long aux;
		long lcm = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int m = 1; m < 10; m++) {
					for (int n = 1; n < 10; n++) {
						if (i * 10 + j < m * 10 + n) {
							if (i == n) {
								if ((float) j / m == (float) (i * 10 + j)
										/ (m * 10 + n)) {
									numerator *= j;
									denominator *= m;
									System.out.println("Reduction: " + j + "/"
											+ m);
									System.out.println(i + "" + j + "/" + m
											+ "" + n);
								}
							} else if (j == m) {
								if ((float) i / n == (float) (i * 10 + j)
										/ (m * 10 + n)) {
									numerator *= i;
									denominator *= n;
//									System.out.println("Reduction: " + i + "/"
//											+ n);
//									System.out.println(i + "" + j + "/" + m
//											+ "" + n);
								}
							}

						}
					}
				}
			}
		}
		// System.out.println("Fraction's product: " + numerator + "/" +
		// denominator);
		lcm = GCD.findLCM(numerator, denominator);
		aux = numerator;
		numerator = lcm / denominator;
		denominator = lcm / aux;
		// System.out.println("Reduction: mcm = " + mcm + ", " + numerator +
		// " / " + denominator);
	}

	public long getNumerator() {
		return this.numerator;
	}

	public long getDenominator() {
		return this.denominator;
	}

	public static void main(String[] args) {
		DigitCancellingFractions fractions = new DigitCancellingFractions();
		fractions.go();
		System.out.println(fractions.getDenominator());
	}
}
