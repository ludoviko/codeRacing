package com.lam.coder.topCoder;

import java.util.Stack;

public class ProblemWriting {

	public static final String ERROR  = "dotForm is not in dot notation, check character n."; 
	public static final String ERROR_25 =  "dotForm must contain between 1 and 25 characters, inclusive.";
			
	public 	String myCheckData(String dotForm) {
		
		return "";
		
//		Stack<Character> stack = new Stack<Character>();
//		
//		if (dotForm.length() > 25 ) {
//			return ERROR_25;
//		}
//		
//		for (int i = 0; i < dotForm.length(); i++) {
//			if ( dotForm.charAt(i) == '.' ) {
//				if (stack.empty()) {
//				   stack.push('.'); 
//					while (dotForm.charAt(i) == '.' && i < dotForm.length()) {
//						i++;
//					}
//					if ( dotForm.charAt(i) == '+' || dotForm.charAt(i) == '-' || 
//							dotForm.charAt(i) == '*' || dotForm.charAt(i) == '/'  ) {
//						stack.push(dotForm.charAt(i));
//					}    
//				} else {
//					   stack.pop(); 
//					   stack.pop(); 
//						while (dotForm.charAt(i) == '.' && i < dotForm.length()) {
//							i++;
//						}
//				}
//			} else if ( dotForm.charAt(i) == '+' || dotForm.charAt(i) == '-' || 
//					dotForm.charAt(i) == '*' || dotForm.charAt(i) == '/'  ) {
//				stack.push(dotForm.charAt(i));
//			}    
//		}
//
//		if (stack.contains('.')) { 
//			return ERROR;
//		} else {
//			return "";
//		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
