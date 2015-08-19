package com.lam.coder.codility.tmp;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.StringBorder;

public class StringBorderTest extends TestCase {

	StringBorder border; 
	
	@Before
	public void setUp() throws Exception {
	   border = new StringBorder();	
	}

	@After
	public void tearDown() throws Exception {
		border = null;
	}

	@Test
	public void testAssertEquals() {
		  TestCase.assertEquals(0, border.solution("baaab"));
		  TestCase.assertEquals(1, border.solution("barbararhubarb"));
		  TestCase.assertEquals(2, border.solution("ababaab"));
		  TestCase.assertEquals(4, border.solution("barbZXXbarbYbarbYZbarb"));
	      
	}

}
