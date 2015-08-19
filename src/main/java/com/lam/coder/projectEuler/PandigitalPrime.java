package com.lam.coder.projectEuler;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.PanDigital;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Pandigital prime Problem 41
 * 
 *         We shall say that an n-digit number is pandigital if it makes use of
 *         all the digits 1 to n exactly once. For example, 2143 is a 4-digit
 *         pandigital and is also prime.
 * 
 *         What is the largest n-digit pandigital prime that exists?
 * 
 *         Answer: 7652413.
 */

public class PandigitalPrime {
	public static int find() {
		int max = 0;

		for (int i = 7654321; i > 1; i = i - 2) {
			if (PanDigital.isPanDigital(i)) {
				// System.out.println(i);
				if (CheckIsPrime.go(i)) {
					if (i > max) {
						max = i;
						return max;
					}
				}
			}
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Answer: " + PandigitalPrime.find());
	}
}
