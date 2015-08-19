package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Julius Caesar used a system of cryptography, now known as Caesar
 *         Cipher, which shifted each letter 2 places further through the
 *         alphabet (e.g. 'A' shifts to 'C', 'R' shifts to 'T', etc.). At the
 *         end of the alphabet we wrap around, that is 'Y' shifts to 'A'.
 * 
 *         We can, of course, try shifting by any number. Given an encoded text
 *         and a number of places to shift, decode it.
 * 
 *         For example, "TOPCODER" shifted by 2 places will be encoded as
 *         "VQREQFGT". In other words, if given (quotes for clarity) "VQREQFGT"
 *         and 2 as input, you will return "TOPCODER". See example 0 below.
 * 
 *         Definition
 * 
 *         Class: CCipher 
 *         Method: decode 
 *         Parameters: String, int Returns: String
 *         Method signature: 
 *         public String decode(String cipherText, int shift) 
 * 
 * 
 *         Constraints - cipherText has between 0 to 50 characters inclusive -
 *         each character of cipherText is an uppercase letter 'A'-'Z' - shift
 *         is between 0 and 25 inclusive
 * 
 *         Examples 
 *         
 *         0)
 *         "VQREQFGT"
 * 
 *         2
 * 
 *         Returns: "TOPCODER"
 * 
 *         1)
 *         "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 * 
 *         10
 * 
 *         Returns: "QRSTUVWXYZABCDEFGHIJKLMNOP"
 * 
 *         2)
 *         "TOPCODER"
 * 
 *         0
 * 
 *         Returns: "TOPCODER"
 * 
 *         3)
 *         "ZWBGLZ"
 * 
 *         25
 * 
 *         Returns: "AXCHMA"
 * 
 *         4)
 *         "DBNPCBQ"
 * 
 *         1
 * 
 *         Returns: "CAMOBAP"
 * 
 *         5)
 *         "LIPPSASVPH"
 * 
 *         4
 * 
 *         Returns: "HELLOWORLD"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 147 Round 1 - Division
 *         II, Level One
 * 
 *         Score: 249.61/250
 */

public class CCipher {
	private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	                                     
	public String decode(String cipherText, int shift) {
		String decode = "";  

		String charsShifted =   CHARS.substring(CHARS.length() - shift) + CHARS.substring(0, CHARS.length() - shift);

		char a = 'A';
		int aInt = (int)a;
		
		char letter;
		int  letterInt;
		int  position;
		
		for (int i= 0; i < cipherText.length(); i ++ ) {
			letter = cipherText.charAt(i);
			letterInt = (char)letter;
			position = letterInt - aInt;
			decode += charsShifted.charAt(position); 
		}
		return decode;
	}
}
