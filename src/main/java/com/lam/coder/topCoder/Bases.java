package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: Bases Method Name: adder Parameters: String,String,int
 *         Returns: String
 * 
 *         Implement a class Bases, which contains a method adder. The method
 *         takes two Strings as parameters representing numbers in a certain
 *         number base and an int that is that base. The method returns the sum
 *         of the numbers, also in the same base.
 * 
 *         Adding numbers in bases other than 10 is similar to adding numbers in
 *         base 10. Start at the least significant digit, add, and carry...
 *         There is a carry when the sum is greater than or equal to the number
 *         base.
 * 
 *         The base will be at most 16. For base 16, the digits in order are: 0,
 *         1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F For any base b less than
 *         16, the digits are the first b digits in the list above.
 * 
 *         For example, add 613.56 and 104.4 in base 7:
 * 
 *         11 104.40 613.56 ------- 1021.26 (When adding the 4 and the 5 to the
 *         right of the decimal, the sum is 2 more than the base, so there is a
 *         carry (1) and the sum minus the base (2) is written below...)
 * 
 *         For example. add 1D.8 and 2.A in base 16:
 * 
 *         11 1D.8 02.A ---- 20.2
 * 
 *         When returning the sum, all leading 0s are truncated, unless the
 *         result is 0. If the result is 0, the method returns "0". If the
 *         fractional part is 0, the point and all 0s to its right are
 *         truncated. If the fractional part is non-zero, all trailing 0s are
 *         truncated.
 * 
 *         Here is the method signature (be sure your method is public): String
 *         adder(String arg1, String arg2, int base)
 * 
 *         TopCoder will ensure the following: base is between 2 and 16,
 *         inclusive. arg1 and arg2 have length at least 1 and at most 50. arg1
 *         and arg2 correctly represent non-negative numbers in the specified
 *         base and contain only the characters '0' - '9' and 'A' - 'F' and '.'.
 * 
 *         NOTES: arg1 and arg2 may or may not have a '.', fractional part, or
 *         integer part. The left most digit of arg1 and arg2 is the most
 *         significant digit. The right most digit is least significant.
 * 
 *         Examples: If arg1 = 102.4, arg2 = 63.23, and base=10, the method
 *         returns 165.63 If arg1 = 1D.EE, arg2 = D11.A12, and base=15, the
 *         method returns D30.A02 If arg1 = .4, arg2 = .4, and base=8, the
 *         method returns 1
 * 
 * 
 *         Definition
 * 
 *         Class: Bases Method: adder Parameters: String, String, int Returns:
 *         String Method signature: String adder(String param0, String param1,
 *         int param2) (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 6 Round 1 - Division I,
 *         Level Two Single Round Match 6 Round 1 - Division II, Level Two
 */


public class Bases {
	private static final String DOT = ".";
	private static final char DOT_CHAR = '.';
	private static final String REGEX_DOT = "\\.";
	
	public String adder(String operand1, String operand2, int base) {
		String[] s1, s2;
	    int len1 = 0, len2 = 0, len_b1, len_b2; 	
	    String summa = "";

	    len_b1 = operand1.length();
	    len_b2 = operand2.length();

	    if (operand1.contains(DOT)) { 
		    s1 = operand1.split(REGEX_DOT);
		    len1 = s1[1].length();  
		    len_b1 = s1[0].length();
	    } else if ( ! operand1.contains(DOT) &&  operand2.contains(DOT)) {
	    	operand1 += DOT; 
	    }
	    
	    if (operand2.contains(DOT)) { 
		    s2 = operand2.split(REGEX_DOT);
		    len2 = s2[1].length();  
		    len_b2 = s2[0].length();
	    } else if ( ! operand2.contains(DOT) &&  operand1.contains(DOT)) {
	    	operand2 += DOT; 
	    }
	    
	    if (len1 > len2) {
	    	for (int i = 0; i < len1 - len2; i++ ) {
		    	operand2 += "0"; 
	    	}
	    } else if (len2 > len1) {
	    	for (int i = 0; i < len2 - len1; i++ ) {
		    	operand1 += "0"; 
	    	}
	    }
	    
	    if (len_b1 > len_b2) {
	    	for (int i = 0; i < len_b1 - len_b2; i++ ) {
		    	operand2 = "0" + operand2; 
	    	}
	    } else if (len_b2 > len_b1) {
	    	for (int i = 0; i < len_b2 - len_b1; i++ ) {
		    	operand1 = "0" + operand1; 
	    	}
	    }

	    int i = 0, j = 0;
	    char op1, op2, c = '0';
	    
	    while (true) {
	    	if (i < operand1.length()) {
	    	} else {
	    		if ( c != '0' ) { 
	    			summa = c + summa;
	    		}
	    		break;
	    	}
	    	if (j < operand2.length()) {
	    	} else {
	    		if ( c != '0' ) { 
	    			summa = c + summa;
	    		}
	    		break;
	    	}

    		op1 = operand1.charAt(operand1.length() - 1 - i);	
    		op2 = operand2.charAt(operand2.length() - 1 - j);	
    		
    		String temp = this.adder(op1, op2, c, base);
    	    
    		if ( temp.length() > 1 ) {
    			c = temp.charAt(0);
        		summa = temp.charAt(1) + summa;
    		} else {
    			c = '0';
        		summa = temp.charAt(0) + summa;
    		}
	    	i++; j++;
	    }
	    
		return summa.replaceAll("\\.0+$", "");
	}
	
	public String adder(char operand1, char operand2, char carry, int base) { 
		int op1 = this.toDecimal(operand1); 
		int op2 = this.toDecimal(operand2); 
		int c = this.toDecimal(carry);
		
		String carryOp = "";
		
		int summa = op1  + op2 + c;
		char summaBase = '0'; 
		int remainder = summa % base;
		
		if ( operand1 == DOT_CHAR ) {
		  return carry + DOT ;	
		} 
		
		if ( remainder >= 0  &&  summa / base >= 1 ) {
			summa -= base;
			carryOp = "1";
			summaBase =  this.toBase(summa);
		} else  {
			carryOp = "";
			summaBase = this.toBase(summa);
		}
		
		return carryOp + "" + summaBase ;
	}

	private int toDecimal(char digit) {
		int out = 0;
		
		switch (digit) {
		case '0':
			out = 0;
			break;
		case '1':
			out = 1;
			break;
		case '2':
			out = 2;
			break;
		case '3':
			out = 3;
			break;
		case '4':
			out = 4;
			break;
		case '5':
			out = 5;
			break;
		case '6':
			out = 6;
			break;
		case '7':
			out = 7;
			break;
		case '8':
			out = 8;
			break;
		case '9':
			out = 9;
			break;
		case 'A':
			out = 10;
			break;
		case 'B':
			out = 11;
			break;
		case 'C':
			out = 12;
			break;
		case 'D':
			out = 13;
			break;
		case 'E':
			out = 14;
			break;
		case 'F':
			out = 15;
			break;
		default:
			break;
		}
		
		return out;
	}

	private char toBase(int decimal) {
		char out = '0';
		
		switch (decimal) {
		case 0:
			out = '0';
			break;
		case 1:
			out = '1';
			break;
		case 2:
			out = '2';
			break;
		case 3:
			out = '3';
			break;
		case 4:
			out = '4';
			break;
		case 5:
			out = '5';
			break;
		case 6:
			out = '6';
			break;
		case 7:
			out = '7';
			break;
		case 8:
			out = '8';
			break;
		case 9:
			out = '9';
			break;
		case 10:
			out = 'A';
			break;
		case 11:
			out = 'B';
			break;
		case 12:
			out = 'C';
			break;
		case 13:
			out = 'D';
			break;
		case 14:
			out = 'E';
			break;
		case 15:
			out = 'F';
			break;
		default:
			break;
		}
		
		return out;
	}
}
