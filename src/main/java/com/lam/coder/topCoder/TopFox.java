package com.lam.coder.topCoder;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         TopCoder Single Round Match 584 is scheduled for Wednesday, July 10,
 *         2013 at 07:00 UTC -4 hours.
 * 
 *         Problem Statement      Fox Ciel is planning to register on TopFox.
 *         Her family name is familyName and her given name is givenName. She
 *         will choose a TopFox handle according to the following rule.
 * 
 *         Let s be a non-empty prefix of her family name and let t be a
 *         non-empty prefix of her given name. Now Fox Ciel may choose the
 *         concatenation of s and t as her handle.
 * 
 *         For example, suppose Fox Ciel's family name is "fox" and her given
 *         name is "ciel".
 * 
 *         She may choose the handle "foxciel", "fc", or "foxc". She may not
 *         choose "ox", "ciel", or "jiro". You are told Fox Ciel's family name
 *         and given name. Return the number of possible handles Fox Ciel may
 *         choose.
 * 
 *         Definition      Class: TopFox Method: possibleHandles Parameters:
 *         String, String Returns: int Method signature: int
 *         possibleHandles(String familyName, String givenName) (be sure your
 *         method is public)     
 * 
 *         Constraints
 * 
 *         - familyName will contain between 2 and 10 characters,inclusive. -
 *         Each character in familyName will be a lowercase English letter,
 *         i.e., 'a'-'z'. - givenName will contain between 2 and 10 characters,
 *         inclusive. - Each character in givenName will be a lowercase English
 *         letter, i.e., 'a'-'z'.
 * 
 *         Examples 0)
 * 
 *              "ab" "cd" Returns: 4 There are 4 possible handles: "a" + "c" =
 *         "ac", "a" + "cd" = "acd", "ab" + "c" = "abc" and "ab" + "cd" =
 *         "abcd".
 * 
 *         1)
 * 
 *              "abb" "bbc" Returns: 7 There are 7 possible handles: "ab",
 *         "abb", "abbc", "abbb", "abbbc", "abbbb", "abbbbc".
 * 
 *         2)
 * 
 *              "fox" "ciel" Returns: 12
 * 
 *         3)
 * 
 *              "abbbb" "bbbbbbbc" Returns: 16
 * 
 *         4)
 * 
 *              "abxy" "xyxyxc" Returns: 21
 * 
 *         5)
 * 
 *              "ababababab" "bababababa" Returns: 68
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 584 Round 1 - Division II, Level One
 * 
 */

public class TopFox {
	public int possibleHandles(String familyName, String givenName) {
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < familyName.length(); i++) {
			for (int j = 0; j < givenName.length(); j++) {
				set.add(familyName.substring(0, i + 1)
						+ givenName.substring(0, j + 1));
			}
		}
		return set.size();
	}
}
