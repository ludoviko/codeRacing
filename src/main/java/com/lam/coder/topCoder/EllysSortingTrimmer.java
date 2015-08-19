package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement Elly has a String S of uppercase letters and a
 *         magic device that can modify the string. The strength of the device
 *         is an int L.
 * 
 *         The device is used in the following way. The user enters a 0-based
 *         index i such that 0 <= i <= length(S)-L. The device then performs the
 *         following changes:
 * 
 *         It leaves the first i characters (i.e., characters with indices 0
 *         through i-1) untouched. It rearranges the next L characters (i.e.,
 *         characters with indices i through i+L-1) into alphabetical order. It
 *         erases all the remaining characters (i.e., characters with indices
 *         i+L and more). Note that for i=length(S)-L no characters are erased.
 * 
 *         The girl can use this "sorting trimmer" as many times as she likes.
 *         After each use she is left with the new version of the string.
 * 
 *         In the examples below we use brackets to highlight the region that
 *         shall be sorted. For example, "ABRA[CADAB]RA" means that L=5 and Elly
 *         chose i=4. The device keeps the letters in front of the brackets,
 *         sorts the letters in the brackets, and throws away the rest. Here is
 *         one way how Elly could have used a device with L = 5, starting with
 *         the string S = "ABRACADABRA":
 * 
 *         "ABRAC[ADABR]A" -> "ABRACAABDR" "ABR[ACAAB]DR" -> "ABRAAABC"
 *         "A[BRAAA]BC" -> "AAAABR"
 * 
 *         You are given the String S and the int L. Return the
 *         lexicographically smallest string Elly can obtain.
 * 
 *         Definition
 * 
 *         Class: EllysSortingTrimmer Method: getMin Parameters: String, int
 *         Returns: String Method signature: String getMin(String S, int L) (be
 *         sure your method is public)
 * 
 *         Notes - A string A is lexicographically smaller than string B if A
 *         contains a smaller character in the first position where they differ.
 *         In case one of the strings ends before they have a different
 *         character, the shorter one is considered smaller.
 * 
 *         Constraints - S will contain between 2 and 50 characters, inclusive.
 *         - L will be between 2 and |S|, inclusive, where |S| denotes the
 *         number of characters in S. - S will consist of uppercase characters
 *         of the English alphabet, only ('A'-'Z').
 * 
 *         Examples 0)
 * 
 *         "ABRACADABRA"
 * 
 *         5
 * 
 *         Returns: "AAAAA"
 * 
 *         Please note that the example in the problem statement does not obtain
 *         the lexicographically smallest string. In fact, it is optimal to
 *         start by using the device on the last five characters of the string,
 *         transforming it from ABRACA[DABRA] to ABRACAAABDR. 
 *         
 *         1)
 *         "ESPRIT"
 *         3
 * 
 *         Returns: "EIP"
 * 
 *         We can obtain the answer in the following steps:
 * 
 *         ES[PRI]T -> ESIPR E[SIP]R -> EIPS [EIP]S -> EIP
 * 
 *         2)
 *         "BAZINGA"
 *         7
 * 
 *         Returns: "AABGINZ"
 * 
 *         We can use the sorting trimmer on the entire word. 
 *         
 *         3)
 *         "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 *         13
 * 
 *         Returns: "ABCDEFGHIJKLM"
 * 
 *         Even though the string is already sorted, shorter strings are
 *         considered lexicographically smaller, so we can use the device once
 *         to make the string as short as possible. 
 *         
 *         4)
 *         "GOODLUCKANDHAVEFUN"
 *         10
 *         Returns: "AACDDEFGHK"
 * 
 *         5)
 *         "AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD"
 *         21
 * 
 *         Returns: "AAAAAAAAABBDDDDDDDEEI"
 * 
 *         6)
 *         "TOPCODER"
 *         3
 * 
 *         Returns: "CDT"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 2014 TCO Algorithm Round 1A - Division I,
 *         Level One
 * 
 */

public class EllysSortingTrimmer {
	public String getMin(String string, int len) {
		int size = string.length() - len;
		String sub;
		char[] chars;

		for (int i = 0; i <= size; i++) {
			sub = string.substring(size - i, size + len - i);
			string = string.substring(0, size - i);

			chars = sub.toCharArray();
			Arrays.sort(chars);

			for (int j = 0; j < sub.length(); j++) {
				string += chars[j];
			}
		}

		return string;
	}
}
