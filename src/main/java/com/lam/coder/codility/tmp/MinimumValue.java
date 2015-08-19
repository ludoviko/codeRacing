package com.lam.coder.codility.tmp;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         For a given array A of N integers and a sequence S of N integers from
 *         the set {−1, 1}, we define val(A, S) as follows:
 * 
 *         val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
 * 
 *         (Assume that the sum of zero elements equals zero.)
 * 
 *         For a given array A, we are looking for such a sequence S that
 *         minimizes val(A,S).
 * 
 *         Write a function:
 * 
 *         int solution(int A[], int N);
 * 
 *         that, given an array A of N integers, computes the minimum value of
 *         val(A,S) from all possible values of val(A,S) for all possible
 *         sequences S of N integers from the set {−1, 1}.
 * 
 *         For example, given array:
 * 
 *         A[0] = 1 A[1] = 5 A[2] = 2 A[3] = -2
 * 
 *         your function should return 0, since for S = [−1, 1, −1, 1], val(A,
 *         S) = 0, which is the minimum possible value.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [0..20,000]; each element of array A
 *         is an integer within the range [−100..100].
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N*max(abs(A))2); expected
 *         worst-case space complexity is O(N+sum(abs(A))), beyond input storage
 *         (not counting the storage required for input arguments).
 * 
 *         Elements of input arrays can be modified.
 * 
 *         Score: 67 %.
 *         There are three wrong test. Difficult to reproduce the failed errors.
 *        
 *         One time out.
 *         
 *         It might be necessary to take into account dynamic programming.
 *          
 */

public class MinimumValue {

	public int findGreatestAbsoluteValueByIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) >= max) {
				max = Math.abs(array[i]);
				index = i;
			}
		}
		return index;
	}

	public int solution(int a[]) {
	//	int[] A = Arrays.copyOf(a, a.length);
		int len = a.length;
		int[] out = new int[len];
		int index;
		int value;
		int partial = 0;

		int i = 0;

		do {
			index = findGreatestAbsoluteValueByIndex(a);
			if ( index == -1 ) {
				return 0;
			}
			value = a[index];
			
			if (partial > 0) {
				if (value > 0) {
					out[index] = -1;
				} else {
					out[index] = 1;
				}
			} else {
				if (value > 0) {
					out[index] = 1;
				} else {
					out[index] = -1;
				}
			}
			partial += out[index] * value;
			a[index] = 0;
			i++;
		} while (i < len);

		return partial;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinimumValue minimum = new MinimumValue();
		int[] a = { 1, -5, -2, -2 };
		System.out.println(minimum.solution(a));
		int[] b = { -2, -3, 5, 8, 13, 21 };
		System.out.println("Answer: " + minimum.solution(b));
		int[] c = { 2, 3, 5, 8, 13, 21 };
		System.out.println("Answer: " + minimum.solution(c));
		int[] d = { -2, -3, -5, -8, -13, -21 };
		System.out.println("Answer: " + minimum.solution(d));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, 5, 8, 13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { -2, 3, 5, 8, 13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, -3, 5, 8, 13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, -5, 8, 13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, 5, -8, -13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, 5, -8, -13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, 5, -8, -13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, 5, -8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { -2, -3, -5, -8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, -3, 5, -8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, -3, 5, -8, -13, 33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, -5, -8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, 3, 5, -8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { 2, -3, -5, 8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { -2, -3, 5, 8, -13, -33 }));
		System.out.println("Answer: " + minimum.solution(new int[] { -5, -5, 5, 5, -5, -5 }));
	}
}
