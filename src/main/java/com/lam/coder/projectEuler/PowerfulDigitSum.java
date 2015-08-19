package com.lam.coder.projectEuler;

import java.math.BigInteger;

import com.lam.mathematics.Digits;

/***
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 56: Powerful digit sum
 * 
 *         A googol (10100) is a massive number: one followed by one-hundred
 *         zeros; 100100 is almost unimaginably large: one followed by
 *         two-hundred zeros. Despite their size, the sum of the digits in each
 *         number is only 1.
 * 
 *         Considering natural numbers of the form, ab, where a, b < 100, what
 *         is the maximum digital sum?
 * 
 *         Answer: 972.
 */

public class PowerfulDigitSum {
	public static int UPTO = 100;

	public static long find() {
		BigInteger power = new BigInteger("0");
		BigInteger base = new BigInteger("0");
		long sumDigits = 0;
		long max = 0;

		for (int i = 1; i < UPTO; i++) {
			base = new BigInteger(i + "");
			for (int j = 1; j < UPTO; j++) {
				power = base.pow(j);
				sumDigits = Digits.sum(power.toString());
				if (sumDigits > max) {
					max = sumDigits;
				}
			}
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Answer: " + PowerfulDigitSum.find());
	}
}
