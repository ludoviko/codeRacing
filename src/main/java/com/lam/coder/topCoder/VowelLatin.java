package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement Pig Latin is a simple way of encoding words. We
 *         have invented a competitor called "Vowel Latin". It just changes the
 *         order of the letters in a word by moving all the vowels to the end,
 *         keeping them in the same order as they appeared in the original word.
 *         Vowels are defined to be the letters 'a', 'e', 'i', 'o', and 'u' (in
 *         either uppercase or lowercase). The reordering of the letters in a
 *         word does not change their case. So the Vowel Latin version of
 *         "AmplifierX" would be "mplfrXAiie"
 * 
 *         Create a class VowelLatin that contains a method translate that is
 *         given a String word and that returns the Vowel Latin version of word.
 * 
 * 
 *         Definition
 * 
 *         Class: VowelLatin Method: translate Parameters: String Returns:
 *         String Method signature: String translate(String word) (be sure your
 *         method is public)
 * 
 * 
 *         Constraints - word contains between 1 and 50 characters, inclusive. -
 *         Each character in word is a letter ('A'-'Z', 'a'-'z').
 * 
 *         Examples 0)
 * 
 *         "XYz" Returns: "XYz" The word contains no vowels so it is unchanged
 *         by translating to Vowel Latin. 1)
 * 
 *         "application" Returns: "pplctnaiaio" The 5 vowels in this word are
 *         all moved to the end of the word. 2)
 * 
 *         "qwcvb" Returns: "qwcvb" 3)
 * 
 *         "aeioOa" Returns: "aeioOa" This problem statement is the exclusive
 *         and proprietary property of TopCoder, Inc. Any unauthorized use or
 *         reproduction of this information without the prior written consent of
 *         TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All
 *         rights reserved.
 * 
 *         This problem was used for: Single Round Match 336 Round 1 - Division
 *         II, Level One
 * 
 */

public class VowelLatin {
	public static final String VOWELS = "aeiouAEIOU";

	public String translate(String string) {
		StringBuilder vowels = new StringBuilder();
		StringBuilder consonants = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			if (VOWELS.contains((string.charAt(i) + ""))) {
				vowels.append(string.charAt(i));
			} else {
				consonants.append(string.charAt(i));
			}
		}

		return consonants.append(vowels).toString();
	}
}