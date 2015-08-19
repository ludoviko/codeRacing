package com.lam.coder.topCoder;

import java.util.Stack;

import java.util.EmptyStackException;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Reverse Polish Notation (RPN) is a notation for writing arithmetic
 *         expressions that is famous for not needing parentheses. Perhaps best
 *         known for its use in certain calculators, RPN is also commonly used
 *         in virtual machines such as the JVM. The distinguishing feature of
 *         RPN is that arithmetic operators are written after their arguments.
 *         For example, the infix expression "3 - 4" would be written in RPN as
 *         "3 4 -" (all quotes for clarity only). Similarly, the infix
 *         expression "(3 - 4) * 5" would be written in RPN as "3 4 - 5 *".
 *         Notice how no parentheses were necessary in the RPN expression. No
 *         confusion is possible, because the infix expression "3 - (4 * 5)"
 *         would be written in RPN as "3 4 5 * -".
 * 
 *         An RPN expression is evaluated using a stack. The expression is
 *         processed from left to right. Each number is pushed onto the stack as
 *         it is encountered. When an operator is encountered, the appropriate
 *         number of arguments are popped off the stack, the operation is
 *         performed, and the result is pushed back onto the stack. The final
 *         answer is the value on the top of the stack when the end of the
 *         expression is reached. The supported arithmetic operators are
 *         addition ('+'), subtraction ('-'), multiplication ('*'), and unary
 *         negation ('~')
 * 
 *         For example, the RPN expression "2 3 + 6 ~ 7 * -" would be evaluated
 *         as shown in the following table:
 * 
 *         Remaining Expression Stack New Stack 2 3 + 6 ~ 7 * - [] [2] 3 + 6 ~ 7
 *         * - [2] [2 3] <---- Stacks grow to the right + 6 ~ 7 * - [2 3] [5] 6
 *         ~ 7 * - [5] [5 6] ~ 7 * - [5 6] [5 -6] 7 * - [5 -6] [5 -6 7] - [5 -6
 *         7] [5 -42] - [5 -42] [47] <---- Final answer is 47
 * 
 *         You will write a method that takes an RPN expression expr as a
 *         String, evaluates it, and returns its final value. The expression
 *         will contain only digits ('0'-'9'), arithmetic operators ('+', '-',
 *         '*', '~'), and spaces (' '). Only single-digit numbers will be
 *         allowed, and all numbers and operators will be separated by single
 *         spaces, with no leading or trailing spaces.
 * 
 *         An RPN expression is malformed if evaluating it would leave more than
 *         one value on the stack, or if evaluating it would cause some operator
 *         to try to pop an empty stack. Your method should return -999 if expr
 *         is malformed.
 * 
 *         Definition
 * 
 *         Class: RPN Method: evaluate Parameters: String Returns: int Method
 *         signature: int evaluate(String expr) (be sure your method is public)
 * 
 * 
 *         Constraints - expr contains an odd number of characters between 1 and
 *         33, inclusive. - Every character in a (zero-based) odd position in
 *         expr is a space (' '). - Every character in a (zero-based) even
 *         position in expr is either a digit ('0'-'9') or one of the characters
 *         '+', '-', '*', or '~'.
 * 
 *         Examples 0)
 * 
 * 
 *         "2 3 + 6 ~ 7 * -"
 * 
 *         Returns: 47
 * 
 *         The example above. 1)
 * 
 * 
 *         "5 ~ ~ ~"
 * 
 *         Returns: -5
 * 
 *         Multiple negations are allowed. 2)
 * 
 * 
 *         "9 8 7 * * 4 5 - -"
 * 
 *         Returns: 505
 * 
 *         3)
 * 
 * 
 *         "1 + 2 + 3"
 * 
 *         Returns: -999
 * 
 *         4)
 * 
 * 
 *         "1 9 ~ 2 8 * +"
 * 
 *         Returns: -999
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: TopCoder Collegiate Challenge Semifinal
 *         Round 2 - Division I, Level One
 */

public class RPN {
	public int evaluate(String expression) {
		Stack<String> stack = new Stack<String>();
		int op1, op2, op3 = 0;

		try {

			for (int i = 0; i < expression.length(); i++) {
				if (expression.charAt(i) <= '9' && expression.charAt(i) >= '0') {
					stack.push(expression.charAt(i) + "");
				} else if (expression.charAt(i) == '+'
						|| expression.charAt(i) == '-'
						|| expression.charAt(i) == '*'
						|| expression.charAt(i) == '/') {
					op2 = Integer.parseInt(stack.pop());
					op1 = Integer.parseInt(stack.pop());
					if (expression.charAt(i) == '+') {
						op3 = op1 + op2;
					} else if (expression.charAt(i) == '-') {
						op3 = op1 - op2;
					} else if (expression.charAt(i) == '*') {
						op3 = op1 * op2;
					} else if (expression.charAt(i) == '/') {
						op3 = op1 / op2;
					}
					stack.push(op3 + "");
				} else if (expression.charAt(i) == '~') {
					op1 = Integer.parseInt(stack.pop());
					op1 = op1 * (-1);
					stack.push(op1 + "");
				}
			}
		} catch (EmptyStackException e) {
			return -999;
		}

		if (stack.size() == 2) {
			return -999;
		}

		return Integer.parseInt(stack.pop());
	}

	// Remaining Expression Stack New Stack
	// 2 3 + 6 ~ 7 * - [] [2]
	// 3 + 6 ~ 7 * - [2] [2 3] <---- Stacks grow to the right
	// + 6 ~ 7 * - [2 3] [5]
	// 6 ~ 7 * - [5] [5 6]
	// ~ 7 * - [5 6] [5 -6]
	// 7 * - [5 -6] [5 -6 7]
	// * - [5 -6 7] [5 -42]
	// - [5 -42] [47] <---- Final answer is 47

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
