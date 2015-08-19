package com.lam.coder.codility.tmp;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.Brackets;

public class BracketsTest extends TestCase {

	Brackets syntax;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		syntax = new Brackets();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		syntax = null;
	}

	@Test
	public void testMatchTrue() {
        Assert.assertEquals(1, syntax.solution("")); 		
        Assert.assertEquals(1, syntax.solution("(()(())())")); 		
        Assert.assertEquals(1, syntax.solution("x(y(z{test})abc)")); 		
        Assert.assertEquals(1,  syntax.solution("()")); 		
        Assert.assertEquals(1, syntax.solution("[[]](()){{{}}}")); 		
	}

	@Test
	public void testMatchFalse() {
        Assert.assertEquals(0, syntax.solution("())")); 		
        Assert.assertEquals(0, syntax.solution(")))))")); 		
        Assert.assertEquals(0, syntax.solution("abc(def(ghi)")); 		
        Assert.assertEquals(0, syntax.solution("([)]")); 		
        Assert.assertEquals(0, syntax.solution("([)]]]]]")); 		
	}
}
