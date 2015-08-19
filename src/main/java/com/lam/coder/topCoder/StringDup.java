/**
 * 
 */
package com.lam.coder.topCoder;


/**
 * @author lazuajemolle
 * 
 *         Problem Statement
 * 
 *         Create a class called StringDup. Given a string made up of ONLY
 *         letters and digits, determine which character is repeated the most in
 *         the string ('A' is different than 'a'). If there is a tie, the
 *         character which appears first in the string (from left to right)
 *         should be returned.
 * 
 *         Examples :
 * 
 *         aaiicccnn = c 
 *         aabbccdd = a 
 *         ab2sbf2dj2skl = 2
 * 
 *         Here is the method signature :
 * 
 *         public char getMax(String input);
 * 
 *         We will check to make sure that the input contains only letters and
 *         digits (no punctuation marks or spaces).
 * 
 * 
 *         Definition
 * 
 *         Class: StringDup Method: getMax Parameters: String Returns: char
 *         Method signature: char getMax(String param0) (be sure your method is
 *         public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Collegiate Challenge Round 2 - Division I,
 *         Level One
 */

public class StringDup {
	public char getMax(String string) {

		char[] cadena = string.toCharArray();
		char[] cadena_copia = string.toCharArray();
		char char_searched;
		char max_char = cadena[0];
		int counter = 0;
		int max_counter = 0;

		while (cadena_copia.length > 0) {
			char_searched = cadena_copia[0];
			for (int j = 0; j < cadena_copia.length; j++) {
				char char_next = cadena_copia[j];
				if (char_next == char_searched) {
					counter += 1;
				}
			}

			if (counter > max_counter) {
				max_counter = counter;
				max_char = char_searched;
			} else {
			}

			string = string.replace(char_searched, ' ').trim();
			cadena_copia = string.toCharArray();
			counter = 0;
		}
//		System.out.println("max cha: " + max_char);
		return max_char;
	};


}
