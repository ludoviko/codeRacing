package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: GoodWord Method Name: isValid Parameters: String Returns:
 *         boolean
 * 
 *         In a certain language, words are valid if and only if each group of
 *         vowels in the word is followed by exactly the same number of
 *         consonants (no more, no less) and the first letter is capital and all
 *         other letters are lowercase.
 * 
 *         Implement a class GoodWord, which contains a method isValid. isValid
 *         takes a String as a parameter and returns a boolean that is true if
 *         the String is a valid word in the language and false otherwise.
 * 
 *         Vowels are a, e, i, o, and u (and their capital equivalents). All
 *         other letters are consonants.
 * 
 *         Here is the method signature: boolean isValid(String word);
 * 
 *         TopCoder will ensure the following: - word contains between 1 and 50
 *         letters.
 * 
 *         Examples: "Hi" returns false. "Hih" returns true. "Baaaiedddffaigg"
 *         returns true. "H" returns true.
 * 
 *         Definition
 * 
 *         Class: GoodWord Method: isValid Parameters: String Returns: boolean
 *         Method signature: boolean isValid(String param0) (be sure your method
 *         is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 13 Round 1 - Division I, Level One
 * 
 *         Single Round Match 13 Round 1 - Division II, Level One
 */

public class GoodWord {

	/**
	 * @param word
	 * @return boolean
	 */
	public boolean isValid(String word) {
		int v = 0;
		int c = 0;
		int i = 0;

		if (!word.isEmpty() && Character.isLowerCase(word.charAt(0))) {
			return false;
		} else if (word.isEmpty()) {
			return true;
		}

		if (GoodWord.isConsonant(word.charAt(0))) {
			i++;
		}

		while (i < word.length() && GoodWord.isConsonant(word.charAt(i))
				&& Character.isLowerCase(word.charAt(i))) {
			i++;
		}

		for (; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)) && i > 0) {
				return false;
			}

			if (GoodWord.isVowel(word.charAt(i))) {
				v++;
				c = 0;
			} else if (GoodWord.isConsonant(word.charAt(i))) {
				c++;
			}

			if (c > 0) {
				if (c > v) {
					return false;
				} else if (c == v) {
					c = 0;
					v = 0;
				} else {
				}
			}
		}
		return c == v;
	}

	private static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}

	private static boolean isConsonant(char c) {
		return !isVowel(c);
	}
}
