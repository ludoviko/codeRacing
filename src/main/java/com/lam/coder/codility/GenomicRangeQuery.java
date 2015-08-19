package com.lam.coder.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A non-empty zero-indexed string S is given. String S consists of N
 *         characters from the set of upper-case English letters A, C, G, T.
 * 
 *         This string actually represents a DNA sequence, and the upper-case
 *         letters represent single nucleotides.
 * 
 *         You are also given non-empty zero-indexed arrays P and Q consisting
 *         of M integers. These arrays represent queries about minimal
 *         nucleotides. We represent the letters of string S as integers 1, 2,
 *         3, 4 in arrays P and Q, where A = 1, C = 2, G = 3, T = 4, and we
 *         assume that A < C < G < T.
 * 
 *         Query K requires you to find the minimal nucleotide from the range
 *         (P[K], Q[K]), 0 ≤ P[i] ≤ Q[i] < N.
 * 
 *         For example, consider string S = GACACCATA and arrays P, Q such that:
 * 
 *         P[0] = 0 Q[0] = 8 P[1] = 0 Q[1] = 2 P[2] = 4 Q[2] = 5 P[3] = 7 Q[3] =
 *         7
 * 
 *         The minimal nucleotides from these ranges are as follows:
 * 
 *         (0, 8) is A identified by 1, (0, 2) is A identified by 1, (4, 5) is C
 *         identified by 2, (7, 7) is T identified by 4.
 * 
 *         Write a function:
 * 
 *         class Solution { public int[] solution(String S, int[] P, int[] Q); }
 * 
 *         that, given a non-empty zero-indexed string S consisting of N
 *         characters and two non-empty zero-indexed arrays P and Q consisting
 *         of M integers, returns an array consisting of M characters specifying
 *         the consecutive answers to all queries.
 * 
 *         The sequence should be returned as:
 * 
 *         a Results structure (in C), or a vector of integers (in C++), or a
 *         Results record (in Pascal), or an array of integers (in any other
 *         programming language).
 * 
 *         For example, given the string S = GACACCATA and arrays P, Q such
 *         that:
 * 
 *         P[0] = 0 Q[0] = 8 P[1] = 0 Q[1] = 2 P[2] = 4 Q[2] = 5 P[3] = 7 Q[3] =
 *         7
 * 
 *         the function should return the values [1, 1, 2, 4], as explained
 *         above.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [1..100,000]; M is an integer within
 *         the range [1..50,000]; each element of array P, Q is an integer
 *         within the range [0..N − 1]; P[i] ≤ Q[i]; string S consists only of
 *         upper-case English letters A, C, G, T.
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N+M); expected worst-case
 *         space complexity is O(N), beyond input storage (not counting the
 *         storage required for input arguments).
 * 
 *         Elements of input arrays can be modified. Copyright 2009–2013 by
 *         Codility Limited. All Rights Reserved. Unauthorized copying,
 *         publication or disclosure prohibited. + add your test case(s)
 * 
 *         Score: 100 %.
 */

public class GenomicRangeQuery {
	public int[] solution(String string, int[] p, int[] q) {
		int[] all = this.convert(string);

		List<Integer> out = new ArrayList<Integer>(1);

		int[] a = findPrefixSum(1, all);
		int[] c = findPrefixSum(2, all);
		int[] g = findPrefixSum(3, all);
		int[] t = findPrefixSum(4, all);

		for (int i = 0; i < p.length; i++) {
			if ((a[q[i] + 1] - a[p[i]]) > 0) {
				out.add(1);
			} else if (c[q[i] + 1] - c[p[i]] > 0) {
				out.add(2);
			} else if (g[q[i] + 1] - g[p[i]] > 0) {
				out.add(3);
			} else if (t[q[i] + 1] - t[p[i]] > 0) {
				out.add(4);
			}
		}

		Integer[] result = out.toArray(new Integer[out.size()]);
		int[] resultInt = new int[result.length];

		for (int i = 0; i < result.length; i++) {
			resultInt[i] = result[i].intValue();
		}

		return resultInt;
	}

	private static int[] findPrefixSum(int n, int... array) {
		int[] prefix = new int[1 + array.length];

		for (int i = 1; i < prefix.length; i++) {
			if (array[i - 1] == n) {
				prefix[i] = 1 + prefix[i - 1];
			} else {
				prefix[i] = prefix[i - 1];
			}
		}
		return prefix;
	}

	private int[] convert(String string) {
		int[] out = new int[string.length()];
		int n = 0;

		for (int i = 0; i < string.length(); i++) {
			switch (string.charAt(i)) {
			case 'A': {
				n = 1;
				break;
			}
			case 'C': {
				n = 2;
				break;
			}
			case 'G': {
				n = 3;
				break;
			}
			case 'T': {
				n = 4;
				break;
			}

			}

			out[i] = n;
		}

		return out;
	}
}
