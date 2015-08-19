package com.lam.coder.projectEuler;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 63: Powerful digit counts
 * 
 *         The 5-digit number, 16807=7^5, is also a fifth power. Similarly, the
 *         9-digit number, 134 217 728=8^9, is a ninth power.
 * 
 *         How many n-digit positive integers exist which are also an nth power?
 * 
 *         Answer: 49.
 */

public class PowerfulDigitCounts {
	public static int find() {
		int sum = 0;
		String power;

		for (int i = 9; i >= 1; i--) {
			for (int j = 21; j >= 1; j--) {
				power = new BigInteger(i + "").pow(j).toString();
				if (j == power.length()) {
				//	System.out.println(power + ", " + i + "^" + j);
					// System.out.println(i + "/" + j);
					sum++;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Answer: " + PowerfulDigitCounts.find());
	}
}
