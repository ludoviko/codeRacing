package com.lam.coder.codility;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A non-empty zero-indexed array A consisting of N integers is given.
 *         The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P
 *         < Q < R < N).
 * 
 *         For example, array A such that:
 * 
 *         A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6
 * 
 *         contains the following example triplets:
 * 
 *         (0, 1, 2), product is −3 * 1 * 2 = −6 (1, 2, 4), product is 1 * 2 * 5
 *         = 10 (2, 4, 5), product is 2 * 5 * 6 = 60
 * 
 *         Your goal is to find the maximal product of any triplet.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given a non-empty zero-indexed array A, returns the value of
 *         the maximal product of any triplet.
 * 
 *         For example, given array A such that:
 * 
 *         A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6
 * 
 *         the function should return 60, as the product of triplet (2, 4, 5) is
 *         maximal.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [3..100,000]; each element of array
 *         A is an integer within the range [−1,000..1,000].
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N*log(N)); expected
 *         worst-case space complexity is O(1), beyond input storage (not
 *         counting the storage required for input arguments).
 * 
 *         Elements of input arrays can be modified. Copyright 2009–2013 by
 *         Codility Limited. All Rights Reserved. Unauthorized copying,
 *         publication or disclosure prohibited. + add your test case(s)
 *         
 *         Score: 100 %.
 */

public class MaxProductOfThree {
	public int solution(int[] array) {
		Arrays.sort(array);
		int len = array.length;

		int max = Integer.MIN_VALUE;

		int[] data = new int[5];

		if (len == 3) {
			return array[len - 3] * array[len - 2] * array[len - 1];
		}

		if (len > 5) {
			data[0] = array[0];
			data[1] = array[1];
			data[2] = array[len - 3];
			data[3] = array[len - 2];
			data[4] = array[len - 1];
		} else {
			data = array;
		}

		len = data.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					if (data[i] * data[j] * data[k] > max) {
						max = data[i] * data[j] * data[k];
					}
				}
			}
		}
		return max;
	}
}
