package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         This program takes as input two strings. The first of which is the
 *         search string and the second is the buffer to search. The object of
 *         the program is to remove all traces of the search string in the
 *         search buffer. The program will perform the search starting at the
 *         beginning of the buffer and continue until either the end of the
 *         buffer is reached or the search string is found. If the search string
 *         is found, the string should be removed, and the search should restart
 *         again from the beginning of the buffer. This process should repeat
 *         until a full search through the buffer produces no more matches.
 * 
 *         Requirements :
 * 
 *         1. the search should be completely case-insensitive (ie "StRinG"
 *         should remove the phrase "sTrINg") 2. it should be a multi-pass
 *         filter (ie "string" should remove the phrase "strSTRINGing"
 * 
 *         Here is the method signature :
 * 
 *         public String strip(String str, String buf);
 * 
 *         We will check to make sure the input to this problem is valid.
 * 
 *         Here are some examples assuming the search string is "StRinG" :
 * 
 *         "ccccstring ssssssssss" -> "cccc ssssssssss"
 *         "ccccstrinstringgsssssssssss" -> "ccccsssssssssss"
 *         "ccccstring stringssssssssss" -> "cccc ssssssssss"
 * 
 *         Definition
 * 
 *         Class: WordFilter Method: strip Parameters: String, String Returns:
 *         String
 * 
 *         Method signature: String strip(String param0, String param1)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Collegiate Challenge Round 3 - Division I,
 *         Level Two
 */

public class WordFilter {
	public String strip(String searchFor, String buffer) {
		String[] strings;
		String stringHelper;

		buffer = buffer.toLowerCase();
		searchFor = searchFor.toLowerCase();

		do {
			stringHelper = "";
			strings = buffer.split(searchFor);

			for (int i = 0; i < strings.length; i++) {
				stringHelper += strings[i];
			}

			buffer = stringHelper;
		} while (stringHelper.contains(searchFor));

		// ! reduce repeated spaces to one space
		stringHelper = stringHelper.replaceAll("\\s+", " ");

		return stringHelper;
	}
}
