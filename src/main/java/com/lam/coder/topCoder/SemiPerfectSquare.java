package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 *
 *         Problem Statement for SemiPerfectSquare
 * 
 *         Magical Girl Iris loves perfect squares. A positive integer n is a
 *         perfect square if and only if there is a positive integer b >= 1 such
 *         that b*b = n. For example, 1 (=1*1), 16 (=4*4), and 169 (=13*13) are
 *         perfect squares, while 2, 54, and 48 are not.
 * 
 *         Iris also likes semi-squares. A positive integer n is called a
 *         semi-square if and only if there are positive integers a >= 1 and b >
 *         1 such that a < b and a*b*b = n. For example, 81 (=1*9*9) and 48
 *         (=3*4*4) are semi-squares, while 24, 63, and 125 are not. (Note that
 *         we require that a < b. Even though 24 can be written as 6*2*2, that
 *         does not make it a semi-square.)
 * 
 *         You are given a int N. Return "Yes" (quotes for clarity) if N is a
 *         semi-square number. Otherwise, return "No".
 * 
 *         Definition
 * 
 *         Class: SemiPerfectSquare Method: check Parameters: int Returns:
 *         String Method signature: String check(int N) (be sure your method is
 *         public)
 * 
 * 
 *         Notes - The return value is case-sensitive. Make sure that you return
 *         the exact strings "Yes" and "No".
 * 
 *         Constraints - N will be between 2 and 1000, inclusive.
 * 
 *         Examples 0)
 * 
 *         48 Returns: "Yes" 48 can be expressed as 3 * 4 * 4. Therefore, 48 is
 *         a semi-square. 1)
 * 
 *         1000 Returns: "No" 1000 can be represented as 10 * 10 * 10, but it
 *         doesn't match the definition of semi-perfect squares. 2)
 * 
 *         25 Returns: "Yes" 3)
 * 
 *         47 Returns: "No" 4)
 * 
 *         847 Returns: "Yes"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 582 Round 1 - Division
 *         II, Level One
 * 
 */

public class SemiPerfectSquare {
	public static final String YES = "Yes";
	public static final String NO = "No";

	public String check(int n) {
		int upTo = (int) Math.sqrt(n);

		String answer = NO;

		out: for (int i = 1; i < upTo; i++) {
			for (int j = i + 1; j < upTo + 1; j++) {
				if (i * j * j == n) {
					answer = YES;
					break out;
				}
			}
		}

		return answer;
	}
}
