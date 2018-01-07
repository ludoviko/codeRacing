package com.lam.coder.programmingpraxis;

import java.util.Stack;

/**
 *
 * @author programmingpraxis.com
 *
 * Solution by: L.Azuaje.
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
    /**
     * @param args
     */
    public static void main(String[] args) {
    }

    // XXX Problems with scale and rounding mode
// 	public BigDecimal evaluateBD(String expression) throws Exception {

    public double evaluate(String expression) throws Exception {
        String[] data = expression.split(" ");

        Stack<Double> stack = new Stack<Double>();
        double op1, op2, op3 = -1;

		for (int i = 0; i < data.length; i++) {
			if (data[i].matches("\\+|\\*|\\/|\\-")) {
                op2 = stack.pop();
                op1 = stack.pop();
                if (data[i].equals("+")) {
					op3 = op1 + op2;
				} else if (data[i].equals("-")) {
					op3 = op1 - op2;
				} else if (data[i].equals("*")) {
					op3 = op1 * op2;
				} else if (data[i].equals("/")) {
					op3 = op1 / op2;
                }
                stack.push(op3);
            } else if (data[i].equals("~")) {
                // Unary operation: negation.
                op1 = stack.pop();
                op1 = op1 * (-1);
                stack.push(op1);
            } else {
                stack.push(Double.parseDouble(data[i]));
            }
        }

        if (stack.size() > 1) {
            throw new Exception("Data malformed");
        }

        return stack.pop();
    }

}
