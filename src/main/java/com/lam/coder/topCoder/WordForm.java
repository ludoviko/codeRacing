package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         In English, the letters A, E, I, O and U are the vowels.
 * 
 *         Y is also considered to be a vowel if it's not preceded by another
 *         vowel and is not the first letter in a word (the fact that a vowel is
 *         defined to some extent in terms of itself does not make it
 *         ambiguous). If a letter is not a vowel then it is a consonant. So in
 *         "TOY" the consonants are T and Y, and in "SYZYGY" they are S, Z and
 *         G.
 * 
 *         A sequence of vowels will be denoted by uppercase letter 'V' and a
 *         sequence of consonants will be denoted by uppercase letter 'C'. A
 *         word can then be described as an alternating sequence of 'C' and 'V'.
 *         For instance, the word "WHEREABOUTS" has the sequence CVCVCVC, and
 *         the words "YORK" and "TOY" both have the sequence CVC. It's not
 *         permissible to have two or more consecutive 'V' or 'C' in the
 *         sequence.
 * 
 *         Create a class WordForm containing the method getSequence which takes
 *         a String word and returns a String containing the word's sequence as
 *         described above. The word may contain both uppercase and lowercase
 *         letters, but your method should be case insensitive (see example 2).
 * 
 *         Definition
 * 
 *         Class: WordForm Method: getSequence Parameters: String Returns:
 *         String
 * 
 *         Method signature: public String getSequence(String word)
 * 
 * 
 *         Notes - word may not be an English word, or a word in any language at
 *         all, but you should still use the rules defined above. See example 3.
 * 
 *         Constraints - word will contain between 1 and 50 characters,
 *         inclusive. - word will only contain the characters 'A'-'Z' and
 *         'a'-'z', both inclusive.
 * 
 *         Examples
 * 
 *         0) "WHEREABOUTS"
 * 
 *         Returns: "CVCVCVC"
 * 
 *         Here we have
 *         consonant-consonant-vowel-consonant-vowel-vowel-consonant
 *         -vowel-vowel-consonant-consonant. Putting together consecutive
 *         consonants and vowels gives us CVCVCVC.
 * 
 *         1) "yoghurt"
 * 
 *         Returns: "CVCVC"
 * 
 *         2) "YipPy"
 * 
 *         Returns: "CVCV"
 * 
 *         Mixing lowercase and uppercase does not affect the result.
 * 
 *         3) "AyYyEYye"
 * 
 *         Returns: "VCVCVCV"
 * 
 *         Even though this isn't an English word, we use the rules defined in
 *         the statement to find the consonant-vowel pattern.
 * 
 *         4) "yC"
 * 
 *         Returns: "C"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 173 Round 1 - Division
 *         I, Level One Single Round Match 173 Round 1 - Division II, Level Two
 * 
 *         Score: 249.81/250
 * 
 */

public class WordForm {
	public String getSequence(String word) {
		word = word.toLowerCase();
		StringBuilder out = new StringBuilder();
		String CV = "";

		for (int i = 0; i < word.length(); i++) {
			switch (word.charAt(i)) {
			case 'a': {
			}
			case 'e': {
			}
			case 'i': {
			}
			case 'o': {
			}
			case 'u': {
				if (CV.contains("C")) {
					out.append(CV);
				}
				CV = "V";
				break;
			}
			case 'y': {
				out.append(CV);
				if (i == 0) {
					CV = "C";
				} else if (out.length() > 0
						&& out.charAt(out.length() - 1) == 'V') {
					CV = "C";
				} else {
					CV = "V";
				}
				break;
			}
			default: {
				if (CV.contains("V")) {
					out.append(CV);
				}
				CV = "C";
			}
			}
		}

		out.append(CV);
		return out.toString();
	}
}
