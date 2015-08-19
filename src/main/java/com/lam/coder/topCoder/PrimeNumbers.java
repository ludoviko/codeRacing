package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Usuario
 * 
 *         Problem Statement
 * 
 *         Implement a class PrimeNumbers that contains a method pairwisePrimes.
 *         The method inputs an int (num) and returns the number of ways the
 *         number can be written as the sum of three distinct integers that are
 *         pairwise relatively prime; that is no pair of the three integers has
 *         a common factor greater than 1.
 * 
 *         Note:
 * 
 *         - num is greater than 0 and less than or equal to 40. - One of the
 *         three distinct integer can be 1; Numbers are Pairwise Relatively
 *         Prime if they share no factor GREATER than 1.
 * 
 *         Method Signature:
 * 
 *         public int pairwisePrimes( int );
 * 
 *         Examples:
 * 
 *         For num=8: 8 can be written as 1+2+5 and 1+3+4 and the method should
 *         return 2. For num=18, the method should return 14
 * 
 *         Definition
 * 
 *         Class: PrimeNumbers Method: pairwisePrimes Parameters: int Returns:
 *         int Method signature: int pairwisePrimes(int param0) (be sure your
 *         method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 1 Round 1 - Division I,
 *         Level Three Single Round Match 1 Round 1 - Division II, Level Three
 * 
 */

public class PrimeNumbers {
	// Brute force approach
	public int pairwisePrimes(int n) {
		int count = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < n - 2; i++) {
			list.add(i);
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				for (int k = j + 1; k < list.size(); k++) {
					if (list.get(i) + list.get(j) + list.get(k) == n) {
						if (relativePrime(list.get(i), list.get(j))
								&& relativePrime(list.get(i), list.get(k))
								&& relativePrime(list.get(j), list.get(k))) {
							count++;
						}
					}
				}
			}

		}

		return count;
	}

	private static long find(long m, long n) {
		long a = Math.max(m, n);
		long b = Math.min(m, n);

		if (a % b == 0) {
			return b;
		} else {
			return find(b, a % b);
		}
	}

	private static boolean relativePrime(int m, int n) {
		return find(m, n) == 1;
	}
}
