package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         PROBLEM STATEMENT
 * 
 *         A letter range is a set of alphabetically consecutive letters taken
 *         from the lowercase alphabetic characters 'a' through 'z'. The lowest
 *         and highest letters of the range, separated by a colon (the character
 *         ':'), are used to represent a letter range. For example, the range
 *         "a:c" represents the consecutive letters 'a', 'b', and 'c'. (quotes
 *         are not part of the range). The range "w:z" represents the letters
 *         'w', 'x', 'y', and 'z'. The range "m:m" respresents the single letter
 *         'm'.
 * 
 *         Given an input String, return the letter ranges ordered
 *         alphabetically by the low value of each range. Letter ranges
 *         contained in the result must represent the largest possible sequences
 *         of increasing consecutive letters found in the input text. The
 *         letters of the input do not have to appear in alphabetical order.
 *         Ignore space characters and duplicate letters contained in the input.
 *         For example, the text "fb xee ac" has three letter ranges, "a:c" (the
 *         letters a, b, and c), "e:f" (the letters e and f) and "x:x" (the
 *         letter x). Please refer to the examples.
 * 
 *         DEFINITION Class: LetterRange Parameters: String Returns: String[]
 *         Method signature: String[] ranges(String text);
 * 
 *         (be sure your method is public)
 * 
 *         TopCoder will ensure the validity of the inputs. Inputs are valid if
 *         all of the following criteria are met:
 * 
 *         text may only contain lowercase letters (a-z) and the space
 *         character, ' '. text will contain between 0 and 50 characters,
 *         inclusive.
 * 
 *         NOTES - When determining a letter range, please keep in mind that the
 *         alphabet ends with 'z' and does not wrap (i.e. 'a' does not come
 *         after 'z'). Since the range must be increasing you cannot have a
 *         range that begins with a letter located near or at end of the
 *         alphabet and ends with a letter at or near the beginning of the
 *         alphabet.
 * 
 *         EXAMPLES (Note that the quote characters are for clarity only.) E1:
 *         "" ==> {} E2: "  " ==> {} E3: "aha" ==> {"a:a","h:h"} E4: "xyzzy" ==>
 *         {"x:z"} E5: "and toto too" ==> {"a:a","d:d","n:o","t:t"} E6:
 *         "topcoder quiz" ==> {"c:e","i:i","o:r","t:u","z:z"} E7:
 *         "the quick brown fox jumps over the lazy dog" ==> {"a:z"}
 * 
 *         Definition
 * 
 *         Class: LetterRange Method: ranges Parameters: String Returns:
 *         String[] Method signature: String[] ranges(String param0) (be sure
 *         your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Sun Microsystems / TopCoder Collegiate
 *         Challenge Regional Quarterfinal W/MW - Division I, Level One
 * 
 * 
 */

public class LetterRange {
	public String[] ranges(String string) {
		
		Set<Character> set = new TreeSet<Character>();
		
		for (int i = 0; i < string.length(); i++) {
			if ( string.charAt(i) != ' ' ) { 
			  set.add(string.charAt(i));
			}
		}
		
		List<String> list = new ArrayList<String>();
		String range = new String();
		
		Iterator<Character> itera = set.iterator();
		
		char oldChar = ' ' ;
		char leadChar = ' ' ;
		
		if (itera.hasNext()) {
			leadChar = itera.next();
			range = leadChar + ":";
			oldChar = leadChar; 
		} else {
		  return new String[] {};	
		}
		
		while (itera.hasNext()) {
			char aChar = itera.next();
			if ( aChar == oldChar + 1 ) {
				leadChar = aChar;
			} else {
			  range += oldChar;	
			  list.add(range);
			  range = aChar + ":";	
			}
			oldChar = aChar;
		}
		
		range += oldChar;	
		list.add(range);
	
		String[] ranges = new String[list.size()]; 
		return list.toArray(ranges);
	}
}
