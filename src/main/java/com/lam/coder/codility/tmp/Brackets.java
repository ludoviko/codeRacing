package com.lam.coder.codility.tmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 * 
 *         A string S consisting of N characters is considered to be properly
 *         nested if any of the following conditions is true:
 * 
 *         S is empty; S has the form "(U)" or "[U]" or "{U}" where U is a
 *         properly nested string; S has the form "VW" where V and W are
 *         properly nested strings.
 * 
 *         For example, the string "{[()()]}" is properly nested but "([)()]" is
 *         not.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(String S); }
 * 
 *         that, given a string S consisting of N characters, returns 1 if S is
 *         properly nested and 0 otherwise.
 * 
 *         For example, given S = "{[()()]}", the function should return 1 and
 *         given S = "([)()]", the function should return 0, as explained above.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [0..200,000]; string S consists only
 *         of the following characters: "(", "{", "[", "]", "}" and/or ")".
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N); expected worst-case
 *         space complexity is O(N) (not counting the storage required for input
 *         arguments).
 * 
 * 
 *         Score: 100 %.
 * 
 *         Copyright 2009–2013 by Codility Limited. All Rights Reserved.
 *         Unauthorized copying, publication or disclosure prohibited.
 */

public class Brackets {
	public final static char OPEN_ROUND_BRACKET = '(';
	public final static char CLOSE_ROUND_BRACKET = ')';

	public final static char OPEN_SQUARE_BRACKET = '[';
	public final static char CLOSE_SQUARE_BRACKET = ']';

	public final static char OPEN_CURLY_BRACKET = '{';
	public final static char CLOSE_CURLY_BRACKET = '}';

	private List<Character> openingChars;
	private List<Character> closingChars;

	public Brackets() {
		openingChars = new ArrayList<Character>();
		openingChars.add(OPEN_ROUND_BRACKET);
		openingChars.add(OPEN_SQUARE_BRACKET);
		openingChars.add(OPEN_CURLY_BRACKET);

		closingChars = new ArrayList<Character>();
		closingChars.add(CLOSE_ROUND_BRACKET);
		closingChars.add(CLOSE_SQUARE_BRACKET);
		closingChars.add(CLOSE_CURLY_BRACKET);
	}

	public int solution(String string) {
		Stack<Character> stack = new Stack<Character>();
		char expected;
		
		for (int i = 0; i < string.length(); i++) {
			if (openingChars.contains(string.charAt(i))) {
				stack.add(string.charAt(i));
			} else if (closingChars.contains(string.charAt(i))) {
				expected = matchingForClosingChars(string.charAt(i));
				if ( stack.isEmpty() ) {
					return 0;
				} else if ( expected == stack.peek() ) {
					stack.pop();
				}  
			}
		}
		return stack.size() == 0 ? 1: 0;
	}

	private char matchingForClosingChars(char close) {
		char open;
		switch (close) {
		case CLOSE_CURLY_BRACKET: {
			open = OPEN_CURLY_BRACKET;
			break;
		}
		case CLOSE_ROUND_BRACKET: {
			open = OPEN_ROUND_BRACKET;
			break;
		}
		case CLOSE_SQUARE_BRACKET: {
			open = OPEN_SQUARE_BRACKET;
			break;
		}
		default:
			open = ' ';
			break;
		}
		return open;
	}
}
