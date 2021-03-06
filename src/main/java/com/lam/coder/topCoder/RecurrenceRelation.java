package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Consider a sequence {x0, x1, x2, ...}. A relation that defines some
 *         term xn in terms of previous terms is called a recurrence relation. A
 *         linear recurrence relation is one where the recurrence is of the form
 *         xn = ck-1xn-1 + ck-2xn-2 + ... + c0xn-k, where all the ci are
 *         real-valued constants, k is the length of the recurrence relation,
 *         and n is an arbitrary positive integer which is greater than or equal
 *         to k.
 * 
 *         You will be given a int[] coefficients, indicating, in order, c0, c1,
 *         ..., ck-1. You will also be given a int[] initial, giving the values
 *         of x0, x1, ..., xk-1, and an int N. Your method should return xN
 *         modulo 10.
 * 
 *         Note that the value of X modulo 10 equals the last digit of X if X is
 *         non-negative. However, if X is negative, this is not true; instead, X
 *         modulo 10 equals ((10 - ((-X) modulo 10)) modulo 10). For example,
 *         (-16) modulo 10 = ((10 - (16 modulo 10)) modulo 10) = (10 - 6) modulo
 *         10 = 4.
 * 
 *         More specifically, if coefficients is of size k, then the recurrence
 *         relation will be
 * 
 *         xn = coefficients[k - 1] * xn-1 + coefficients[k - 2] * xn-2 + ... +
 *         coefficients[0] * xn-k.
 * 
 *         For example, if coefficients = {2,1}, initial = {9,7}, and N = 6,
 *         then our recurrence relation is xn = xn-1 + 2 * xn-2 and we have x0 =
 *         9 and x1 = 7. Then x2 = x1 + 2 * x0 = 7 + 2 * 9 = 25, and similarly,
 *         x3 = 39, x4 = 89, x5 = 167, and x6 = 345, so your method would return
 *         (345 modulo 10) = 5.
 * 
 *         Definition
 * 
 *         Class: RecurrenceRelation Method: moduloTen Parameters: int[], int[],
 *         int Returns: int
 * 
 *         Method signature: public int moduloTen(int[] coefficients, int[]
 *         initial, int N)
 * 
 *         Notes - (a + b) modulo x = ( (a modulo x) + (b modulo x) ) modulo x
 *         for any values of a, b, and x.
 * 
 *         Constraints - coefficients will have between 1 and 10 elements,
 *         inclusive. - initial will have the same number of elements as
 *         coefficients. - Each element of coefficients will be between -1000
 *         and 1000, inclusive. - Each element of initial will be between -1000
 *         and 1000, inclusive. - N will be between 0 and 100000, inclusive.
 * 
 *         Examples 0) {2,1} {9,7} 6
 * 
 *         Returns: 5
 * 
 *         As described in the problem statement.
 * 
 *         1) {1,1} {0,1} 9
 * 
 *         Returns: 4
 * 
 *         This is the famous Fibonacci sequence, which goes 0, 1, 1, 2, 3, 5,
 *         8, 13, 21, 34, ...
 * 
 *         2) {2} {1} 20
 * 
 *         Returns: 6
 * 
 *         This sequence is 1, 2, 4, 8, 16, ...
 * 
 *         3) {2} {1} 64
 * 
 *         Returns: 6
 * 
 *         Watch out for overflow.
 * 
 *         4) {25,143} {0,0} 100000
 * 
 *         Returns: 0
 * 
 *         This sequence will always be zero.
 * 
 *         5) {9,8,7,6,5,4,3,2,1,0} {1,2,3,4,5,6,7,8,9,10} 654
 * 
 *         Returns: 5
 * 
 *         6) {901,492,100} {-6,-15,-39} 0
 * 
 *         Returns: 4
 * 
 *         Watch out for negative numbers.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 170 Round 1 - Division
 *         I, Level One Single Round Match 170 Round 1 - Division II, Level Two
 * 
 *         Time: 3,141. Time is correct. It is within the order expected by most algorithms.
 */

public class RecurrenceRelation {

	public int moduloTen(int[] coefficients, int[] x, int n) {
		return findNthElement(coefficients, x, n);
	}

	private static int formula(int[] coefficients, int[] x, int n) {
		int value = 0;

		for (int i = 0; i < coefficients.length; i++) {
			value += coefficients[i] * x[i];
		}

		return value;
	}

	private static int findNthElement(int[] c, int[] x, int n) {
		int limit = c.length;
		int value = 0;

		if (n <= c.length - 1) {
			value = modulo10(x[n]);
			return value;
		}

		while (limit <= n) {
			value = formula(c, x, n);
			value = modulo10(value);
			System.arraycopy(x, 1, x, 0, x.length - 1);
			x[x.length - 1] = value;
			limit++;
		}

		return value;
	}

	private static int modulo10(double n) {
		if (n >= 0) {
			return (int) (n % 10);
		}

		return (int) ((10 - ((-n) % 10)) % 10);
	}
}
