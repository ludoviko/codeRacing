package com.lam.coder.projectEuler;

import java.math.BigInteger;

import com.lam.mathematics.Digits;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 16: Power digit sum
 * 
 *         2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 *         What is the sum of the digits of the number 2^1000?
 * 
 *         Answer: 1366.
 * 
 */

public class PowerDigitSum {
	public static int find(int base, int exponent) {
		BigInteger baseBig = new BigInteger(base + "");

		BigInteger result = baseBig.pow(exponent);
		String resultChars = result.toString();

		int sum = Digits.sum(resultChars);

		return sum;
	}

	public static void main(String[] args) {
		int sum = PowerDigitSum.find(2, 1000);
		System.out.println("Answer: " + sum);
	}
}
