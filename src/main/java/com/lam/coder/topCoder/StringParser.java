package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: StringParser Method Name: parse Parameters: String
 *         Returns: ArrayList
 * 
 *         Implement a class StringParser, which contains a method parse. The
 *         method takes a String as a parameter. The first(left-most) character
 *         of the String is the delimiting character and the String is broken at
 *         each occurrence of the delimiter and each occurrence of the delimiter
 *         is removed. The method returns an ArrayList of the pieces of non-zero
 *         length in the reverse order of their occurrence.
 * 
 *         For example, if the String is ".period.is.the..delimiter" the method
 *         returns the ArrayList {"delimiter","the","is","period"}.
 * 
 *         Here is the method signature: public ArrayList parse(String toParse);
 * 
 *         toParse is a String with length between 1 and 50 characters,
 *         inclusive. toParse contains letters, digits, spaces, and simple
 *         punctuation ('.',',','?','!','-'). Note the pipe is not valid.
 * 
 *         Note: -If there are no pieces of non-zero length after breaking the
 *         String, the method returns an empty instance of an ArrayList.
 *         Examples: -If toParse="AAthisAAAisAaAAtestAAA" the method returns
 *         {"test","a","is","this"}.
 * 
 *         If you are not familiar with java.util.ArrayList, they are used to
 *         hold objects, such as Integers and Strings. ArrayList.add(obj) will
 *         add obj to the end of an Array List. ArrayList.get(n) will return the
 *         nth object. ArrayList.remove(n) will remove the nth object and shift
 *         forward all objects behind it. ArrayList.size() returns the number of
 *         objects in the ArrayList.
 * 
 *         Definition
 * 
 *         Class: StringParser 
 *         Method: parse 
 *         Parameters: String Returns: ArrayList 
 *         Method signature: public ArrayList parse(String param0) 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 
 *         Single Round Match 7 Round 1 - Division I, Level One
 */

public class StringParser {

	public List<String> parse(String string) {
		char delimiter = string.charAt(0);
		StringBuilder word = new StringBuilder();
		List<String> words = new ArrayList<String>();

		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == delimiter) {
				if (word.length() > 0) {
					words.add(0, word.toString());
				}
				word.delete(0, word.length());
			} else {
				word.append(string.charAt(i));
			}
		}

		if (word.length() > 0) {
			words.add(0, word.toString());
		}

		return words;
	}
}
