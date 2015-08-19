/**
 * 
 */
/**
 * 
 */
package com.lam.coder.topCoder;

/**
 * @author lazuajemolle
 *
 *Problem Statement


 Create a class called Syntax. Given a String that contains, among other
 characters, parentheses '()', square brackets '[ ]' and curly
 braces '{}',
 create a solution that will determine if the string is balanced.  The String is
 considered balanced if all of the parentheses,
 brackets, and braces are
 nested, opened, and closed properly.  The rules are as follows:

 There must be equal numbers of beginning and ending delimiters for each type.
 Any time a closing delimiter occurs, it must match the most recent unmatched
 open delimiter.
 An ending delimiter can never occur without a corresponding beginning delimiter
 of the same type.

 EXAMPLES:

 x(y(z{test})abc)  - should return true
 ()                - should return true
 ([)]              - should return false
 [[]](()){{{}}}    - should return true
 abc(def(ghi)      - should return false

 Here is the method signature:
 boolean match(String input)

 We will check to make sure the input is valid.


 Definition

 Class:	Syntax
 Method:	match
 Parameters:	String
 Returns:	boolean
 Method signature:	boolean match(String param0)
 (be sure your method is public)


 This problem statement is the exclusive and proprietary property of TopCoder, Inc. 
 Any unauthorized use or reproduction of this information without the prior written consent 
 of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 This problem was used for:
 Collegiate Challenge Round 2 - Division I, Level Two

 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Syntax {
	public final static char OPEN_ROUND_BRACKET = '(';
	public final static char CLOSE_ROUND_BRACKET = ')';

	public final static char OPEN_SQUARE_BRACKET = '[';
	public final static char CLOSE_SQUARE_BRACKET = ']';

	public final static char OPEN_CURLY_BRACKET = '{';
	public final static char CLOSE_CURLY_BRACKET = '}';

	private List<Character> openingChars;
	private List<Character> closingChars;

	public Syntax() {
		openingChars = new ArrayList<Character>();
		openingChars.add(OPEN_ROUND_BRACKET);
		openingChars.add(OPEN_SQUARE_BRACKET);
		openingChars.add(OPEN_CURLY_BRACKET);

		closingChars = new ArrayList<Character>();
		closingChars.add(CLOSE_ROUND_BRACKET);
		closingChars.add(CLOSE_SQUARE_BRACKET);
		closingChars.add(CLOSE_CURLY_BRACKET);
	};

	public boolean match(String string) {
		boolean result = false;

		result = this.checkBalance(string);
		return result;
	};

	private boolean checkBalance(String string) {
		Stack<Character> stack = new Stack<Character>();
		char expected;
		
		for (int i = 0; i < string.length(); i++) {
			if (openingChars.contains(string.charAt(i))) {
				stack.add(string.charAt(i));
			} else if (closingChars.contains(string.charAt(i))) {
				expected = matchingForClosingChars(string.charAt(i));
				if ( stack.isEmpty() ) {
					return false;
				} else if ( expected == stack.peek() ) {
					stack.pop();
				}  
			}
		}
		return stack.size() == 0 ? true: false;
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
