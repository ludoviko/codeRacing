package com.lam.coder.topCoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Usuario
 * 
 *         Problem Statement An Apple Word is a word that consists of only the
 *         letters A, P, L, and E, in that exact relative order. There must be
 *         exactly one A, two or more Ps, exactly one L and exactly one E. Case
 *         does not matter. For example, "Apple" and "apPpPPlE" are Apple Words,
 *         while "APLE", "Apples", "Aplpe" and "coconut" are not.
 * 
 *         You are given a String word which you must turn into an Apple Word.
 *         For each character in word, you can either replace it with a
 *         different letter or leave it unchanged. No other operations, like
 *         inserting new characters or deleting existing characters, are
 *         allowed. Return the minimal number of characters you must replace to
 *         get an Apple Word. If it's impossible, return -1.
 * 
 *         Definition
 * 
 *         Class: AppleWord Method: minRep Parameters: String Returns: int
 *         Method signature: 
 *         
 *         public int minRep(String word) (be sure your method is
 *         public)
 * 
 * 
 *         Constraints - word will contain between 1 and 50 characters,
 *         inclusive. - Each character in word will be an uppercase letter
 *         ('A'-'Z') or a lowercase letter ('a'-'z').
 * 
 *         Examples 0)
 * 
 * 
 *         "Apple"
 * 
 *         Returns: 0
 * 
 *         This is an Apple Word. 1)
 * 
 * 
 *         "apPpPPlE"
 * 
 *         Returns: 0
 * 
 *         This is also an Apple Word. 2)
 * 
 * 
 *         "APLE"
 * 
 *         Returns: -1
 * 
 *         An Apple Word must contain at least two 'P's. 3)
 * 
 * 
 *         "TopCoder"
 * 
 *         Returns: 7
 * 
 *         For example, if you replace 7 characters, you can get "Appppple".
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 456 Round 1 - Division
 *         II, Level One
 */

public class AppleWord {
	private static final String REGEX = "ap{2,}le";
	private static final String APPLE = "apple";
	private static final int SIZE = "apple".length();
	private static final Pattern PATTERN = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
	
	public int minRep(String word) {
		 Matcher m = PATTERN.matcher(word);
		 boolean b = m.matches();
		 if (b) {
			 return 0;
		 } else {
			 if ( word.length() >= SIZE ) {
				 return count(word.toLowerCase());
			 }
		 }
		return -1;
	}
	
	private int count(String word) {
		int count = 0;

		if ( word.charAt(0) == APPLE.charAt(0) ) {
		} else {
           count++;			
		}
		
		for (int i = 1; i < word.length() - 2; i++) {
		   	if ( word.charAt(i) == APPLE.charAt(1) ) {
		   	} else {
		   		count++;
		   	}
		}
		
		int j = SIZE - 2;
		for (int i = word.length() - 2; i < word.length(); i++) {
		   	if ( word.charAt(i) == APPLE.charAt(j++) ) {
		   	} else {
		   		count++;
		   	}
		}
		return count;
	}
}
