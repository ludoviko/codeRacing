package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement A common word-processing task is capitalizing the
 *         first letter of each word in a title. Write a class TitleString with
 *         a method toFirstUpperCase that takes a String title containing
 *         lowercase words separated by one or more space characters and returns
 *         a String that is identical to title except with the first character
 *         of each word capitalized.
 * 
 *         Definition
 * 
 *         Class: TitleString Method: toFirstUpperCase Parameters: String
 *         Returns: String Method signature: String toFirstUpperCase(String
 *         title) (be sure your method is public)
 * 
 * 
 *         Notes - title may have leading or trailing spaces.
 * 
 *         Constraints - title will contain between 0 and 50 characters,
 *         inclusive. - Each character of title will either be a space or a
 *         lowercase letter ('a' to 'z').
 * 
 *         Examples 0)
 * 
 * 
 *         "introduction to algorithms"
 * 
 *         Returns: "Introduction To Algorithms"
 * 
 *         1)
 * 
 * 
 *         "more than  one   space    between     words"
 * 
 *         Returns: "More Than  One   Space    Between     Words"
 * 
 *         2)
 * 
 * 
 *         "  lord of the rings   the fellowship of the ring  "
 * 
 *         Returns: "  Lord Of The Rings   The Fellowship Of The Ring  "
 * 
 *         3)
 * 
 * 
 *         "  "
 * 
 *         Returns: "  "
 * 
 *         4)
 * 
 * 
 *         "i"
 * 
 *         Returns: "I"
 * 
 *         5)
 * 
 * 
 *         "the king and i"
 * 
 *         Returns: "The King And I"
 * 
 *         6)
 * 
 * 
 *         ""
 * 
 *         Returns: ""
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 210 Round 1 - Division
 *         II, Level One
 */

public class TitleString {
	private static final char SPACE = ' ';
	
	public String toFirstUpperCase(String title) {
		char[] output = title.toCharArray();
		boolean space = true;
		
		for (int i = 0; i < output.length; i++) {
			if ( output[i] ==  SPACE) {
				space = true;
				continue;
			}
			
			if (space) {
				output[i] = Character.toUpperCase(output[i]);
				space = false;
			}
			
		}

		return new String(output);
	}
}
