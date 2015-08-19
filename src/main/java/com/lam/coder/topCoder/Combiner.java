package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: Combiner Method Name: combine Parameters: String,String
 *         Returns: String
 * 
 *         Implement a class Combiner, which contains a method combine. The
 *         method takes two Strings as parameters and combines them, alternating
 *         letters, starting with the first letter of the first String, followed
 *         by the first letter of the second String, then second letter of first
 *         String, etc. The remaining letters of the longer String are then
 *         appended to the end of the combination String and this combination
 *         String is returned.
 * 
 *         Here is the method signature: public String combine(String s1,String
 *         s2);
 * 
 *         s1 and s2 are Strings of length between 1 and 50 letters, inclusive.
 * 
 *         Examples: If s1="Tpo" and s2="oCder" the method returns "TopCoder".
 *         If s1="aa" and s2="bb" the method returns "abab".
 * 
 * 
 *         Definition
 * 
 *         Class: Combiner Method: combine Parameters: String, String Returns:
 *         String Method signature: String combine(String param0, String param1)
 *         (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 
 *         
 *         Single Round Match 12 Round 1 - Division I,  Level One
 *         Single Round Match 12 Round 1 - Division II, Level One
 *         
 */

public class Combiner {
	public String combine(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		char[] c3 = new char[s1.length() + s2.length()];

		int c = 0;
		int i = 0;
		while (i < c1.length && i < c2.length) {
			c3[c++] = c1[i];
			c3[c++] = c2[i];
			i++;
		}

		while (i < c1.length) {
			c3[c++] = c1[i];
			i++;
		}

		while (i < c2.length) {
			c3[c++] = c2[i];
			i++;
		}

		return new String(c3);
	}
}
