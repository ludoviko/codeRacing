package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Problem 30: Digit fifth powers
 * 
 * Surprisingly there are only three numbers that can be written as the sum of
 * fourth powers of their digits:
 * 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4 8208 = 8^4 + 2^4 + 0^4 + 8^4 9474 = 9^4 + 4^4 +
 * 7^4 + 4^4
 * 
 * As 1 = 1^4 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth
 * powers of their digits.
 * 
 * Answer: 443839.
 * 
 */

public class DigitFifthsPowers {
	public static int LIMIT = 295245;
	public static int FIVE = 5;

	public static int find() {
		List<Integer> list = new ArrayList<Integer>();
		long sum = 0;
		int n;

		for (int i = 2; i <= LIMIT; i++) {
			n = i;
			while (n > 0) {
				sum += Math.pow(n % 10, FIVE);
				n /= 10;
			}
			if (sum == i) {
				list.add(i);
			}
			sum = 0;
		}

		int total = 0;
		for (Integer number : list) {
			total += number;
		}
		return total;
	}

	public static void main(String[] args) {
		int total = find();
		System.out.println("Total: " + total);
	}
}
