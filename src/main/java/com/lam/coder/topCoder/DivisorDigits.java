package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Create a class DivDigits containing a method howMany which takes as
 *         an argument an int number and returns how many digits in number that
 *         number itself is divisible by. Count all occurences of such digits in
 *         the number, not just the first. See examples for more information.
 * 
 *         Definition
 * 
 *         Class: DivDigits Method: howMany Parameters: int Returns: int Method
 *         signature: int howMany(int number) (be sure your method is public)
 * 
 * 
 *         Notes - No number is divisible by 0.
 * 
 *         Constraints - number will be an int between 10000 and 999999999,
 *         inclusive (between 5 and 9 digits, inclusive).
 * 
 *         Examples 0)
 * 
 * 
 *         12345
 * 
 *         Returns: 3
 * 
 *         12345 is divisible by 1, 3, and 5. 1)
 * 
 * 
 *         661232
 * 
 *         Returns: 3
 * 
 *         661232 is divisible by 1 and 2. 2)
 * 
 * 
 *         52527
 * 
 *         Returns: 0
 * 
 *         52527 is not divisible by 5, 2, or 7. 
 *         
 *         3)
 *         730000000
 * 
 *         Returns: 0
 * 
 *         Nothing is divisible by 0. In this case, the number is also not
 *         divisible by 7 or 3.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 148 Round 1 - Division
 *         II, Level One Single Round Match 215 Round 1 - Division II, Level One
 */

public class DivisorDigits {
	public int howMany(int number) {
		List<Integer> list = new ArrayList<Integer>();
		int digit;
		int numberCopy = number;

		while (number > 0) {
			digit = number % 10;
			number = number / 10;

			if (digit == 0) {
				continue;
			}

			if (list.contains(digit) || numberCopy % digit == 0) {
				list.add(digit);
			}
		}
		return list.size();
	}
}
