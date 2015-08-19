package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: CommonChar Method Name: compare parameters: String,
 *         String returns: int
 * 
 *         Create a class CommonChar containing the method compare. This method
 *         will take two Strings as inputs and return the number of characters
 *         in the second String that are contained in the first string, in a
 *         one-to-one relationship. That is, if a character is repeated in the
 *         second string, it must be repeated in the first string to count more
 *         than once.
 * 
 *         Here is the method signature: public int compare(String input1,
 *         String input2);
 * 
 *         BOth Strings will have fewer than 100 characters.
 * 
 *         Note: -The method is case sensitive. A is a different character than
 *         a.
 * 
 *         Examples: ("java", "abava") -> 3 (two of the (a)s and the (v))
 *         ("TopCoder", "code guru") -> 4 ("foobar", "sing") -> 0
 * 
 *         Definition
 * 
 *         Class: CommonChar Method: compare Parameters: String, String Returns:
 *         int Method signature: int compare(String param0, String param1) (be
 *         sure your method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 3 Round 1 - Division I,
 *         Level One Single Round Match 3 Round 1 - Division II, Level One
 * 
 */

public class CommonChar {

	public int compare(String input1, String input2) {
		char c;
		int i = 0;
		int count = 0;
		
		while (  i < input2.length()) {
			c = input2.charAt(i);
			if (input1.contains(c + "")) {
				count++;
				input1 = input1.replaceFirst(c + "", "");
			}
			i++;
		}
		
		return count;
	}
	
}
