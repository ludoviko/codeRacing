package com.lam.coder.projectEuler;

import java.math.BigInteger;

import com.lam.mathematics.FractionBI;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 57: Square root convergents
 * 
 *         It is possible to show that the square root of two can be expressed
 *         as an infinite continued fraction.
 * 
 *         √ 2 = 1 + 1/(2 + 1/(2 + 1/(2 + ... ))) = 1.414213...
 * 
 *         By expanding this for the first four iterations, we get:
 * 
 *         1 + 1/2 = 3/2 = 1.5 1 + 1/(2 + 1/2) = 7/5 = 1.4 1 + 1/(2 + 1/(2
 *         +1/2)) = 17/12 = 1.41666... 1 + 1/(2 + 1/(2 + 1/(2 + 1/2))) = 41/29 =
 *         1.41379...
 * 
 *         The next three expansions are 99/70, 239/169, and 577/408, but the
 *         eighth expansion, 1393/985, is the first example where the number of
 *         digits in the numerator exceeds the number of digits in the
 *         denominator.
 * 
 *         In the first one-thousand expansions, how many fractions contain a
 *         numerator with more digits than denominator?
 *         
 *         Answer: 153.
 * 
 */

public class SquareRootConvergents {
	public static int find(int expansion) {
		FractionBI total;
		FractionBI data = new FractionBI(BigInteger.ZERO);
		FractionBI one = new FractionBI(BigInteger.ONE);
		FractionBI two = new FractionBI(BigInteger.valueOf(2));
		int count = 0;

		for (int i = 1; i <= expansion; i++) {
			data = one.divide(two.add(data));
			total = one.add(data);
			if ( total.getNumerator().toString().length() > total.getDenominator().toString().length() ) {
				count++;
			//	System.out.println(i + ": **** " + total);
			}
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(find(1000));
	}
}
