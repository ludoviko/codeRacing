package com.lam.coder.projectEuler;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.lam.mathematics.Digits;
import com.lam.mathematics.FractionBI;
import com.lam.mathematics.SquareRoot;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 80: Square root digital expansion
 * 
 *         It is well known that if the square root of a natural number is not
 *         an integer, then it is irrational. The decimal expansion of such
 *         square roots is infinite without any repeating pattern at all.
 * 
 *         The square root of two is 1.41421356237309504880..., and the digital
 *         sum of the first one hundred decimal digits is 475.
 * 
 *         For the first one hundred natural numbers, find the total of the
 *         digital sums of the first one hundred decimal digits for all the
 *         irrational square roots.
 * 
 *         Answer: 40886.
 */

public class SquareRootDigitalExpansion {
	public static final int DECIMAL_SCALE = 100;
	public static final int ITERATIONS = 10;

	public static int findSumFirstHundredDigits(int inclusive) {
		BigDecimal num, den, data;
		String digits;
		int summa = 0;
		int temp = 0;
		
		for (int n = 2; n < inclusive + 1; n++) {
			FractionBI srF = SquareRoot.find(n, ITERATIONS);

			num = new BigDecimal(srF.getNumerator());
			den = new BigDecimal(srF.getDenominator());
			data = num.divide(den, DECIMAL_SCALE, RoundingMode.DOWN);
			
			digits = data.toString().substring(0, DECIMAL_SCALE + 1).replaceAll("\\.", "");
			temp = Digits.sum(digits);
			
			if ( temp <= 9 ) {
			} else {
				summa += Digits.sum(digits);
			}
			
		}
		return summa;
	}
}
