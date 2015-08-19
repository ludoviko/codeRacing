package com.lam.coder.codility.tmp;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A non-empty zero-indexed array A consisting of N integers is given.
 *         The first covering prefix of array A is the smallest integer P such
 *         that 0≤P<N and such that every value that occurs in array A also
 *         occurs in sequence A[0], A[1], ..., A[P].
 * 
 *         For example, the first covering prefix of the following 5−element
 *         array A:
 * 
 *         A[0] = 2 A[1] = 2 A[2] = 1 A[3] = 0 A[4] = 1
 * 
 *         is 3, because sequence [ A[0], A[1], A[2], A[3] ] equal to [2, 2, 1,
 *         0], contains all values that occur in array A.
 * 
 *         Write a function
 * 
 *         int solution(int A[], int N);
 * 
 *         that, given a zero-indexed non-empty array A consisting of N
 *         integers, returns the first covering prefix of A.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [1..1,000,000]; each element of
 *         array A is an integer within the range [0..N−1].
 * 
 *         For example, given array A such that
 * 
 *         A[0] = 2 A[1] = 2 A[2] = 1 A[3] = 0 A[4] = 1
 * 
 *         the function should return 3, as explained above.
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N); expected worst-case
 *         space complexity is O(N), beyond input storage (not counting the
 *         storage required for input arguments).
 * 
 *         Elements of input arrays can be modified. Copyright 2009–2013 by
 *         Codility Limited. All Rights Reserved. Unauthorized copying,
 *         publication or disclosure prohibited.
 * 
 *         Score: 92 %. Notes: correct functionality, problems with scalability.
 * 
 */

public class PrefixSet {

	// 92
	public int ps3(int[] a) {
		int[] b;
		int i, j;

		int n = 1;
		b = new int[1];
		b[0] = a[0];
		for (i = 0; i < a.length; ++i) {
			for (j = 0; j < b.length; ++j) {
				if (a[i] == b[j]) {
					break;
				}
			}
			if (j == b.length) {
				b = new int[++n];
				System.arraycopy(a, 0, b, 0, n);
				i--;
			}
		}
		return b.length - 1;
	};

	
	// 92 %.
	public int ps2(int[] a) {
		int max = 0;
		int i, j;

		int n = 1;
		for (i = 0; i < a.length; ++i) {
			for (j = 0; j < a.length; ++j) {
				if (a[i] == a[j]) {
					break;
				}
			}
            n = j;
            if (n > max) {
            	max = n;
            }
		}
		return  max;
	};

	public int ps(int[] a) { 
		boolean[] ocurrences = new boolean[a.length + 1];
		
		int i;
		int memo = 0;
		for (i = 0; i < a.length; ++i) {
			if ( ocurrences[a[i]] == false ) {
				ocurrences[a[i]] = true;
				memo = i;
			}
		}
		
		return memo;
	}
	
}
