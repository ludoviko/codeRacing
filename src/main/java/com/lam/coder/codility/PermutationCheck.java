package com.lam.coder.codility;

import com.lam.mathematics.array.ArrayUtil;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A non-empty zero-indexed array A consisting of N integers is given.
 * 
 *         A permutation is a sequence containing each element from 1 to N once,
 *         and only once.
 * 
 *         For example, array A such that:
 * 
 *         A[0] = 4 A[1] = 1 A[2] = 3 A[3] = 2
 * 
 *         is a permutation, but array A such that:
 * 
 *         A[0] = 4 A[1] = 1 A[2] = 3
 * 
 *         is not a permutation.
 * 
 *         The goal is to check whether array A is a permutation.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given a zero-indexed array A, returns 1 if array A is a
 *         permutation and 0 if it is not.
 * 
 *         For example, given array A such that:
 * 
 *         A[0] = 4 A[1] = 1 A[2] = 3 A[3] = 2
 * 
 *         the function should return 1.
 * 
 *         Given array A such that:
 * 
 *         A[0] = 4 A[1] = 1 A[2] = 3
 * 
 *         the function should return 0.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [1..100,000]; each element of array
 *         A is an integer within the range [1..1,000,000,000].
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N); expected worst-case
 *         space complexity is O(N), beyond input storage (not counting the
 *         storage required for input arguments).
 * 
 *         Elements of input arrays can be modified. Copyright 2009–2013 by
 *         Codility Limited. All Rights Reserved. Unauthorized copying,
 *         publication or disclosure prohibited. + add your test case(s)
 *         
 *         Score: 100 %.
 *         
 */

public class PermutationCheck {
	public int solution(int[] array) {
		int max = findGreatest(array);
		if (max == array.length ) {
			// go on
		} else {
			return 0;
		}
		
		int[] data = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			data[array[i]] += 1;
		}
		
	    boolean ok = true; 
		for (int i = 1; i < data.length; i++) {
			if (data[i] == 1) {
			} else {
				ok = false;
				break;
			}
		}

		if (ok) {
			return 1;
		} else {
		    return 0;
		}
	}

	public static int findGreatest(int... array) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}
		}
		return max;
	}
}
