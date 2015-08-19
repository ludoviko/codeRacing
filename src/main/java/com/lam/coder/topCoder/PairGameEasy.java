package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement You have an ordered pair of integers. You can now
 *         make zero or more steps. In each step, you can change your pair into
 *         a new pair of integers by adding one of them to the other. That is,
 *         if your current pair is (x, y), then your next pair will be either
 *         (x+y, y), or (x, x+y).
 * 
 * 
 *         For example, you can start with (1, 2), change it to (3, 2), change
 *         that to (3, 5), and then change that again to (3, 8).
 * 
 *         You are given four ints: a, b, c, and d. Return "Able to generate"
 *         (quotes for clarity) if it is possible to start with the pair (a, b)
 *         and end with the pair (c, d). Otherwise, return
 *         "Not able to generate".
 * 
 *         Definition
 * 
 *         Class: PairGameEasy Method: able Parameters: int, int, int, int
 *         Returns: String Method signature: String able(int a, int b, int c,
 *         int d) (be sure your method is public)
 * 
 * 
 *         Constraints - a will be between 1 and 1,000, inclusive. - b will be
 *         between 1 and 1,000, inclusive. - c will be between 1 and 1,000,
 *         inclusive. - d will be between 1 and 1,000, inclusive.
 * 
 *         Examples 0)
 *         1
 *         2
 *         3
 * 
 *         5
 * 
 *         Returns: "Able to generate"
 * 
 *         (1, 2) -> (3, 2) -> (3, 5). 1)
 * 
 * 
 *         1
 * 
 *         2
 * 
 *         2
 * 
 *         1
 * 
 *         Returns: "Not able to generate"
 * 
 *         Note that order matters: (1, 2) and (2, 1) are two different pairs.
 *         
 *         2)
 *         2
 * 
 *         2
 * 
 *         2
 * 
 *         999
 * 
 *         Returns: "Not able to generate"
 * 
 *         3)
 *         2
 * 
 *         2
 * 
 *         2
 * 
 *         1000
 * 
 *         Returns: "Able to generate"
 * 
 *         4)
 *         47
 * 
 *         58
 * 
 *         384
 * 
 *         221
 * 
 *         Returns: "Able to generate"
 * 
 *         5)
 *         1000
 * 
 *         1000
 * 
 *         1000
 * 
 *         1000
 * 
 *         Returns: "Able to generate"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 620 Round 1 - Division
 *         II, Level Two
 */

public class PairGameEasy {
	public static String ABLE = "Able to generate";
	public static String NOT_ABLE = "Not able to generate";

	public String able(int a, int b, int c, int d) {
		return check(a, b, c, d) == true ? ABLE : NOT_ABLE;
	}

	private static boolean check(int a, int b, int c, int d) {
		if (a == c && b == d) {
			return true;
		} else if (a > c || b > d) {
			return false;
		} else if (a == c && b < d) {
			return check(a, a + b, c, d);
		} else if (a < c && b == d) {
			return check(a + b, b, c, d);
		} else {
			return check(a, a + b, c, d) || check(a + b, b, c, d);
		}
	}
}
