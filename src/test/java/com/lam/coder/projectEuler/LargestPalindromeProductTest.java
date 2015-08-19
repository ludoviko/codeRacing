package com.lam.coder.projectEuler;

import junit.framework.TestCase;

import org.junit.Test;

import com.lam.coder.projectEuler.LargestPalindromeProduct;

public class LargestPalindromeProductTest extends TestCase {

	LargestPalindromeProduct palindrome;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		palindrome = new LargestPalindromeProduct();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.setUp();
		palindrome = null;
	};
	
	@Test
	public void testRuntimeException() {
		try {
		 palindrome.find(); 
		 LargestPalindromeProductTest.fail("Wrong, exception expected");
		 } catch ( RuntimeException exception ) {
			 System.out.println("Ok, exception expected: " + exception.getLocalizedMessage());
		 }
	}

	@Test
	public void testCalculation() {
		palindrome.setOrder(3);
		LargestPalindromeProductTest.assertEquals("Error in calculation", 906609, palindrome.find());
	}
	
}
