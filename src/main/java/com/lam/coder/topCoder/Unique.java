package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         You are given a String S of lowercase English letters.
 * 
 *         Some of the letters may occur multiple times in S. For example, there
 *         are three 'a's and two 'n's in "banana".
 * 
 *         You dislike duplicates. For each letter, you want to keep only its
 *         first occurrence and delete all the others. Return the String
 *         obtained from S by deleting the duplicates of each letter, as
 *         described above.
 * 
 *         Definition
 * 
 *         Class: Unique Method: removeDuplicates Parameters: String Returns:
 *         String Method signature: String removeDuplicates(String S) (be sure
 *         your method is public)
 * 
 * 
 *         Constraints - S will contain between 1 and 1000 characters,
 *         inclusive. - Each character of S will be a lowercase English letter
 *         ('a'-'z').
 * 
 *         Examples 0)
 *         "banana"
 * 
 *         Returns: "ban"
 * 
 *         1)
 *         "aardvark"
 * 
 *         Returns: "ardvk"
 * 
 *         2)
 *         "xxxxx"
 * 
 *         Returns: "x"
 * 
 *         3)
 *         "topcoder"
 * 
 *         Returns: "topcder"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 2014 TCO Algorithm Round 1C - Division I,
 *         Level One
 */

public class Unique {
	public String removeDuplicates(String data) {
		StringBuilder builder = new StringBuilder();
		int i = 0;

		while (i < data.length()) {
			if (builder.toString().contains(data.charAt(i) + "")) {
			} else {
				builder.append(data.charAt(i));
			}
			i++;
		}

		return builder.toString();
	}
}
