package com.lam.coder.topCoder;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Class Name: StringCompressor Method Name: compress Parameters: String
 *         Returns: String
 * 
 *         Implement a class StringCompressor, which contains a method compress.
 *         The method takes a String as a parameter and replaces all
 *         successively duplicated letters in the String with a number that is
 *         the number of duplications followed by the repeated character. The
 *         method returns this resulting String.
 * 
 *         The method signature is (be sure your method is public): String
 *         compress(String toCompress)
 * 
 *         TopCoder will ensure the following: - toCompress is a String of at
 *         most 100 letters. Each character is a lowercase or capital letter
 *         ('a' - 'z' or 'A' - 'Z').
 * 
 *         Note: -This compressor is case sensative. 'A' is a different
 *         character than 'a'. -Single letters (its neighbors are not duplicates
 *         of itself) are left alone.
 * 
 *         Examples: "AAAABBBBCDDDDDD" compresses to "4A4BC6D" "SDFJaAAAAaaaass"
 *         compresses to "SDFJa4A4a2s" "AAAAAAAAAAAf" compresses to "11Af"
 * 
 * 
 *         Definition
 * 
 *         Class: StringCompressor Method: compress Parameters: String Returns:
 *         String Method signature: String compress(String param0) (be sure your
 *         method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 5 Round 1 - Division I,
 *         Level One Single Round Match 5 Round 1 - Division II, Level One
 * 
 * 
 */

public class StringCompressor {
	public String compress(String string) {
		int count = 1;
		boolean clear = false;
		StringBuilder out = new StringBuilder();
		int i = 0;

		for (i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == string.charAt(i + 1)) {
				count++;
			} else {
				clear = true;
			}
			if (clear) {
				if (count > 1) {
					out.append(count);
					out.append(string.charAt(i));
				} else {
					out.append(string.charAt(i));
				}
				count = 1;
				clear = false;
			} else {
			}
		}

		if (!clear && string.length() > 0) {
			if (count > 1) {
				out.append(count);
			}
			out.append(string.charAt(i));
		}

		return out.toString();
	}
}
