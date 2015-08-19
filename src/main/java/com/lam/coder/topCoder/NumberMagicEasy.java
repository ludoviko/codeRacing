package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement 
 *         
 *         Taro shows a magic trick to Hanako.
 * 
 *         Taro: Hello Hanako. I'll show you a magic trick. Please imagine a
 *         positive integer less than or equal to 16.
 * 
 *         Hanako: OK. I imagined it.
 * 
 *         Taro: (Taro shows card 1 to Hanako.) Does this card contain your
 *         number?
 * 
 *         Hanako: Yes.
 * 
 *         Taro: (Taro shows card 2 to Hanako.) Does this card contain your
 *         number?
 * 
 *         Hanako: No.
 * 
 *         Taro: (Taro shows card 3 to Hanako.) Does this card contain your
 *         number?
 * 
 *         Hanako: Yes.
 * 
 *         Taro: (Taro shows card 4 to Hanako.) Does this card contain your
 *         number?
 * 
 *         Hanako: Yes.
 * 
 *         Taro: Your number is 5!
 * 
 * 
 * 
 * 
 * 
 *         (Card 1 contains 1, 2, 3, 4, 5, 6, 7 and 8. Card 2 contains 1, 2, 3,
 *         4, 9, 10, 11 and 12. Card 3 contains 1, 2, 5, 6, 9, 10, 13 and 14.
 *         Card 4 contains 1, 3, 5, 7, 9, 11, 13 and 15.)
 * 
 * 
 * 
 *         Your task is to write a program that simulates this magic trick. You
 *         are given Hanako's answers in the String answer. The i-th character
 *         is 'Y' if she answered "yes" to the i-th question, and 'N' if she
 *         answered "no" to the i-th question. Return the integer Hanako
 *         imagined. Definition Class: NumberMagicEasy Method: theNumber
 *         Parameters: String Returns: int Method signature: int
 *         theNumber(String answer) (be sure your method is public)
 * 
 *         Limits Time limit (s): 2.000 Memory limit (MB): 64
 * 
 *         Constraints - answer will contain exactly 4 characters. - Each
 *         character in answer will be 'Y' or 'N'. Examples 0) "YNYY"
 * 
 * 
 *         Returns: 5
 * 
 *         The example from the statement.
 * 
 * 
 *         1) "YNNN"
 * 
 * 
 *         Returns: 8
 * 
 *         8 is the only number that exists on the first card and does not exist
 *         on any other cards.
 * 
 * 
 *         2) "NNNN"
 * 
 * 
 *         Returns: 16
 * 
 * 
 * 
 * 
 *         3) "YYYY"
 * 
 * 
 *         Returns: 1
 * 
 * 
 * 
 * 
 *         4) "NYNY"
 * 
 * 
 *         Returns: 11
 * 
 * 
 * 
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *
 */

public class NumberMagicEasy {
	public NumberMagicEasy() {
	}

	public int theNumber(String answer) {
		answer = answer.replace('N', '1');
		answer = answer.replace('Y', '0');

		int i = Integer.parseInt(answer, 2) + 1;

		return i;
	}
}
