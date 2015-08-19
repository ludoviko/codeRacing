package com.lam.coder.projectEuler;

import java.util.HashSet;
import java.util.Set;

import com.lam.mathematics.PanDigital;
import com.lam.utilString.ExtractNumbers;

/**
 * 
 * Pandigital products Problem 32
 * 
 * We shall say that an n-digit number is pandigital if it makes use of all the
 * digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1
 * through 5 pandigital.
 * 
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing
 * multiplicand, multiplier, and product is 1 through 9 pandigital.
 * 
 * Find the sum of all products whose multiplicand/multiplier/product identity
 * can be written as a 1 through 9 pandigital. HINT: Some products can be
 * obtained in more than one way so be sure to only include it once in your sum.
 * 
 * Answer: 45228.
 * 
 */

public class PandigitalProducts {
	public static long find() {
		long sum = 0;
		Set<Long> set = new HashSet<Long>();
		String string;
		String string_bak;

		for (long i = 1; i <= 98; i++) {
			if (i % 10 == 0) {
				continue;
			}

			for (int j = 123; i <= 9876; j++) {
				if (j % 10 == 0) {
					continue;
				}
				;

				if (i * j > 9876) {
					break;
				}
				string_bak = string = i + "×" + j + " = " + i * j;

				if (!string.contains("1")) {
					continue;
				}

				string = ExtractNumbers.getNumbers(string);
				if (string.length() != 9) {
					continue;
				}

				if (PanDigital.isPanDigital(Long.parseLong(string))) {
					// System.out.println("Solution:" + string_bak);
					set.add(i * j);
				}
				;
			}
		}

		for (long number : set) {
			// System.out.println("Solution:" + number);
			sum += number;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(PandigitalProducts.find());
	}
}
