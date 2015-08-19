package com.lam.coder.codility.tmp;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * http://codility.com/
 * 
 * A non-empty zero-indexed array A consisting of N integers is given. A pit in
 * this array is any triplet of integers (P, Q, R) such that:
 * 
 * 0 ≤ P < Q < R < N; sequence [A[P], A[P+1], ..., A[Q]] is strictly decreasing,
 * i.e. A[P] > A[P+1] > ... > A[Q]; sequence A[Q], A[Q+1], ..., A[R] is strictly
 * increasing, i.e. A[Q] < A[Q+1] < ... < A[R].
 * 
 * The depth of a pit (P, Q, R) is the number min{A[P] − A[Q], A[R] − A[Q]}.
 * 
 * For example, consider array A consisting of 10 elements such that:
 * 
 * A[0] = 0 A[1] = 1 A[2] = 3 A[3] = -2 A[4] = 0 A[5] = 1 A[6] = 0 A[7] = -3
 * A[8] = 2 A[9] = 3
 * 
 * Triplet (2, 3, 4) is one of pits in this array, because sequence [A[2], A[3]]
 * is stricly decreasing (3 > −2) and sequence [A[3], A[4]] is strictly
 * increasing (−2 < 0). Its depth is min{A[2] − A[3], A[4] − A[3]} = 2. Triplet
 * (2, 3, 5) is another pit with depth 3. Triplet (5, 7, 8) is yet another pit
 * with depth 4. There is no pit in this array deeper (i.e. having depth
 * greater) than 4.
 * 
 * Write a function:
 * 
 * class Solution { public int deepest_pit(int[] A); }
 * 
 * that, given a non-empty zero-indexed array A consisting of N integers,
 * returns the depth of the deepest pit in array A. The function should return
 * −1 if there are no pits in array A.
 * 
 * For example, consider array A consisting of 10 elements such that:
 * 
 * A[0] = 0 A[1] = 1 A[2] = 3 A[3] = -2 A[4] = 0 A[5] = 1 A[6] = 0 A[7] = -3
 * A[8] = 2 A[9] = 3
 * 
 * the function should return 4, as explained above.
 * 
 * Assume that:
 * 
 * N is an integer within the range [1..1,000,000]; each element of array A is
 * an integer within the range [−100,000,000..100,000,000].
 * 
 * Complexity:
 * 
 * expected worst-case time complexity is O(N); expected worst-case space
 * complexity is O(N), beyond input storage (not counting the storage required
 * for input arguments).
 * 
 * Elements of input arrays can be modified.
 * 
 * Copyright 2009–2013 by Codility Limited. All Rights Reserved. Unauthorized
 * copying, publication or disclosure prohibited. + add test case
 * 
 * */

public class Deepest {

	public int find(int[] a) {

		int len = a.length;
		List<Integer> list = new ArrayList<Integer>();
		boolean decrease = false;
		boolean increase = false;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len - 1; k++) {
					for (int m = i; m < j; m++) {
						if (a[m] > a[m + 1]) {
							decrease = true;
						} else {
							decrease = false;
							break;
						}
					}
					for (int m = j; m < k; m++) {
						if (a[m] < a[m + 1]) {
							increase = true;
						} else {
							increase = false;
							break;
						}
					}
					if (decrease && increase) {
						// System.out.println("Triplet: " + i + "" + j + "" +
						// k);
						// System.out.println("Its deepest: " +
						// this.calculate(a[i], a[j], a[k]));
						list.add(this.calculate(a[i], a[j], a[k]));
					} else {
					}
				}
			}
		}

		Collections.sort(list);
		if (list.isEmpty()) {
			return 0;
		} else {
			return (Integer) list.get(list.size() - 1);
		}
	}

	private int calculate(int i, int j, int k) {
		int min = Math.min(i - j, k - j);
		return min;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4 Expected
		int[] a = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };
		Deepest solution = new Deepest();
		int deepest = solution.find(a);
		System.out.println("Result: " + deepest);
	}

}
