package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.Combinatorics;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 74: Digit factorial chains
 * 
 *         The number 145 is well known for the property that the sum of the
 *         factorial of its digits is equal to 145:
 * 
 *         1! + 4! + 5! = 1 + 24 + 120 = 145
 * 
 *         Perhaps less well known is 169, in that it produces the longest chain
 *         of numbers that link back to 169; it turns out that there are only
 *         three such loops that exist:
 * 
 *         169 → 363601 → 1454 → 169 871 → 45361 → 871 872 → 45362 → 872
 * 
 *         It is not difficult to prove that EVERY starting number will
 *         eventually get stuck in a loop. For example,
 * 
 *         69 → 363600 → 1454 → 169 → 363601 (→ 1454) 78 → 45360 → 871 → 45361
 *         (→ 871) 540 → 145 (→ 145)
 * 
 *         Starting with 69 produces a chain of five non-repeating terms, but
 *         the longest non-repeating chain with a starting number below one
 *         million is sixty terms.
 * 
 *         How many chains, with a starting number below one million, contain
 *         exactly sixty non-repeating terms?
 * 
 *         Answer: 402.
 */

public class DigitalFactorialChains {
	private static final int UPTO = 1000000;

	private static long findSumFactorials(long n) {
		long sum = 0;
		long digit;

		while (n > 0) {
			digit = n % 10;
			sum += Combinatorics.factorial(digit);
			// System.out.println(digit);
			n = n / 10;
		}
		return sum;
	}

	private static List<Long> findList(long n) {
		List<Long> list = new ArrayList<Long>();
		long sum = n;
		list.add(n);

		do {
			sum = findSumFactorials(sum);
			if (list.contains(sum)) {
				break;
			} else {
				list.add(sum);
			}
		} while (true);
		return list;
	}

	public static int find() {
		List<Long> list;

		int sum = 0;
		long i = 0;
		do {
			list = findList(++i);
			if (list.size() == 60) {
				sum++;
			}
		} while (i < UPTO);

		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sum: " + find());
	}
}
