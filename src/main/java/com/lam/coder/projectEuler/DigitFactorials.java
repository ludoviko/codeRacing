package com.lam.coder.projectEuler;

import com.lam.mathematics.Combinatorics;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 34: Digit factorials
 * 
 *         145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * 
 *         Find the sum of all numbers which are equal to the sum of the
 *         factorial of their digits.
 * 
 *         Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 * 
 *         Answer: 40730.
 */

public class DigitFactorials {
	public static int LIMIT = 1000000;

	public long getSum() {
		long number = 0;
		long sum = 0;

		for (int i = 3; i < LIMIT; i++) {
			number = this.getSumFactorialDigits(i);
			if (number == i) {
				sum += number;
			}
		}
		return sum;
	}

	private long getSumFactorialDigits(int number) {
		int digit = 0;
		long sum = 0;

		while (number > 0) {
			digit = number % 10;
			sum += Combinatorics.factorial(digit);
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		DigitFactorials facs = new DigitFactorials();
		System.out.println(facs.getSum());
	}
}
