package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement for HuffmanDecoding
 * 
 * 
 *         Problem Statement
 * 
 *         When text is encoded using Huffman codes, each symbol is replaced by
 *         a string of 0s and 1s called a bit string representation. The
 *         replacement is done in such a way that the bit string representation
 *         of a symbol is never the prefix of the bit string representation of
 *         any other symbol. This property allows us to unambiguously decode the
 *         encoded text.
 * 
 *         You will be given a String archive and a String[] dictionary. The
 *         i-th element of dictionary will be the bit string representation of
 *         the i-th uppercase letter. Decode archive using dictionary and return
 *         the result as a single String.
 * 
 * 
 *         Definition
 * 
 *         Class: HuffmanDecoding Method: decode Parameters: String, String[]
 *         Returns: String Method signature: String decode(String archive,
 *         String[] dictionary) (be sure your method is public)
 * 
 * 
 *         Constraints - archive will contain between 1 and 50 characters,
 *         inclusive. - archive will contain only the characters '0' (zero) and
 *         '1' (one). - dictionary will contain between 1 and 26 elements,
 *         inclusive. - Each element of dictionary will contain between 1 and 50
 *         characters, inclusive. - Each element of dictionary will contain only
 *         the characters '0' (zero) and '1' (one). - No element of dictionary
 *         will be a prefix of any other element of dictionary. - archive will
 *         be decodable using dictionary
 * 
 *         Examples 0)
 * 
 *         "101101" {"00","10","01","11"} Returns: "BDC" Because there are no
 *         elements in dictionary that are prefixes of other elements, only one
 *         element of dictionary will be a prefix of archive. In this case, it
 *         is the second element ("10") which represents 'B'. The rest of the
 *         text can be decoded using the same logic. 1)
 * 
 *         "10111010" {"0","111","10"} Returns: "CBAC" Note that elements of
 *         dictionary can be of different lengths. 2)
 * 
 *         "0001001100100111001" {"1","0"} Returns: "BBBABBAABBABBAAABBA" '1' is
 *         replaced by 'A', '0' is replaced by 'B'. 3)
 * 
 *         "111011011000100110" {"010","00","0110","0111","11","100","101"}
 *         Returns: "EGGFAC" 4)
 * 
 *         "001101100101100110111101011001011001010"
 *         {"110","011","10","0011","00011","111","00010","0010","010","0000"}
 *         Returns: "DBHABBACAIAIC" This problem statement is the exclusive and
 *         proprietary property of TopCoder, Inc. Any unauthorized use or
 *         reproduction of this information without the prior written consent of
 *         TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All
 *         rights reserved.
 * 
 *         This problem was used for: Single Round Match 308 Round 1 - Division
 *         I, Level One Single Round Match 308 Round 1 - Division II, Level Two
 * 
 */

public class HuffmanDecoding {

	private static final String	CHARS	= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public String decode(String archive, String[] dictionary) {
		int len = archive.length();
		int offset = 0;
		String output = "";

		while (offset < len) {
			for (int i = 0; i < dictionary.length; i++) {
				if (archive.startsWith(dictionary[i], offset)) {
					output += CHARS.charAt(i);
					offset += dictionary[i].length();
					break;
				}
			}
		}
		return output;
	}

}
