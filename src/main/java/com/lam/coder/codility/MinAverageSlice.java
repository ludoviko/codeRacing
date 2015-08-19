package com.lam.coder.codility;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A non-empty zero-indexed array A consisting of N integers is given. A
 *         pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice
 *         of array A. The average of a slice (P, Q) is the sum of A[P] + A[P +
 *         1] + ... + A[Q] divided by the length of the slice. To be precise,
 *         the average equates to (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
 * 
 *         The floor_average is the largest integer not greater than the
 *         average.
 * 
 *         For example, array A such that:
 * 
 *         A[0] = 4 A[1] = 3 A[2] = 2 A[3] = 2 A[4] = 2 A[5] = 5 A[6] = 8
 * 
 *         contains the following example slices:
 * 
 *         slice (0, 3), average is (4 + 3 + 2 + 2) / 4 = 2.75, floor_average =
 *         2 slice (2, 4), average is (2 + 2 + 2) / 3 = 2, floor_average = 2
 *         slice (5, 6), average is (5 + 8) / 2 = 6.5, floor_average = 6
 * 
 *         Write a function:
 * 
 *         int solution(int A[], int N);
 * 
 *         that, given a non-empty zero-indexed array A consisting of N
 *         integers, returns the minimal floor_average of any slice.
 * 
 *         For example, given:
 * 
 *         A[0] = 4 A[1] = 3 A[2] = 2 A[3] = 2 A[4] = 2 A[5] = 5 A[6] = 8
 * 
 *         the function should return 2, because no slice of array A has a
 *         floor_average of less than 2.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [1..100,000]; each element of array
 *         A is an integer within the range [−10,000..10,000].
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
 */

public class MinAverageSlice {

	public int solution(int[] array) {
		int[] prefix;
		int start = 0;
		int end = start;

		int rest = 0;
		int value = 0;
		int min = Integer.MAX_VALUE;

		while (end < array.length) {
			prefix = findPrefixSum(array, start, end);
			for (int n : prefix) {
				System.out.print(n + " ");
			}
			start++;
			end++;
			value = prefix[prefix.length - 1] / (prefix.length - 1);
			rest = prefix[prefix.length - 1] % (prefix.length - 1);
			if (value < 0 && rest != 0) {
				value--;
				// System.out.println("value: " + value);
			}
			if (value < min) {
				min = value;
			}
			System.out.println();
		}
		System.out.println(min);
		return min;
	}

	public static int[] findPrefixSum(int[] array, int start, int end) {
		int[] prefix = new int[2 + end - start];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + array[start + i - 1];
		}
		return prefix;
	}

	public static void main(String[] args) {
		new MinAverageSlice().solution(new int[] { 4, 3, 2, 2, 2, 5, 8 });
		new MinAverageSlice()
				.solution(new int[] { -1, -3, -2, -2, -2, -5, -8 });
		new MinAverageSlice().solution(new int[] { -8 });
	}

}
