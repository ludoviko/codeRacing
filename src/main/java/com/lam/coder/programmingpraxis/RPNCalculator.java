package com.lam.coder.programmingpraxis;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         RPN Calculator February 19, 2009
 * 
 *         Implement an RPN calculator that takes an expression like 19 2.14 +
 *         4.5 2 4.3 / - * which is usually expressed as (19 + 2.14) * (4.5 - 2/
 *         4.3) and responds with 85.2974. The program should read expressions
 *         from standard input and print the top of the stack to standard output
 *         when a newline is encountered. The program should retain the state of
 *         the operand stack between expressions.
 * 
 */

public class RPNCalculator {
	public float evaluate(String expression) throws Exception {
		String[] data = expression.split(" ");

		Stack<String> stack = new Stack<String>();
		float op1, op2, op3 = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i].matches("\\+|\\*|\\/|\\-")) {
				op2 = Float.parseFloat(stack.pop());
				op1 = Float.parseFloat(stack.pop());
				if (data[i].equals("+")) {
					op3 = op1 + op2;
				} else if (data[i].equals("-")) {
					op3 = op1 - op2;
				} else if (data[i].equals("*")) {
					op3 = op1 * op2;
				} else if (data[i].equals("/")) {
					op3 = op1 / op2;
				}
				stack.push(op3 + "");

			} else if (data[i].equals("~")) {
				op1 = Float.parseFloat(stack.pop());
				op1 = op1 * (-1);
				stack.push(op1 + "");
			} else {
				stack.push(data[i]);
			}
		}

		if (stack.size() == 2) {
			throw new Exception("Data malformed");
		}

		return Float.parseFloat(stack.pop());
	}

	// XXX Problems with scale and rounding mode 
	public BigDecimal evaluateBD(String expression) throws Exception {
		String[] data = expression.split(" ");

		Stack<String> stack = new Stack<String>();
		BigDecimal op1 = null, op2 = null, op3 = null;

		for (int i = 0; i < data.length; i++) {

			if (data[i].matches("\\+|\\*|\\/|\\-")) {
				op2 = new BigDecimal(stack.pop());
				op1 = new BigDecimal(stack.pop());
				if (data[i].equals("+")) {
					op3 = op1.add(op2);
				} else if (data[i].equals("-")) {
					op3 = op1.subtract(op2);
				} else if (data[i].equals("*")) {
					op3 = op1.multiply(op2);
				} else if (data[i].equals("/")) {
					op3 = op1.divide(op2, 4,  RoundingMode.CEILING);
				}

				stack.push(op3.toString());

			} else if (data[i].equals("~")) {
				op2 = new BigDecimal(stack.pop());
				op2 = op2.multiply(new BigDecimal(-1));
				stack.push(op2.toString());
			} else {
				stack.push(data[i]);
			}
		}

		if (stack.size() == 2) {
			throw new Exception("Data malformed");
		}

		return new BigDecimal(stack.pop());
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*".matches("\\+|\\*|\\/|\\-"));
		System.out.println("/".matches("\\+|\\*|\\/|\\-"));
		System.out.println("+".matches("\\+|\\*|\\/|\\-"));
		System.out.println("-".matches("\\+|\\*|\\/|\\-"));

	}

}
