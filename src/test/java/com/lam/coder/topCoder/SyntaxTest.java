package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Syntax;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SyntaxTest extends TestCase {

	Syntax syntax;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		syntax = new Syntax();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		syntax = null;
	}

	@Test
	public void testMatchTrue() {
        Assert.assertTrue(syntax.match("x(y(z{test})abc)")); 		
        Assert.assertTrue(syntax.match("()")); 		
        Assert.assertTrue(syntax.match("{[()()]}")); 		
        Assert.assertTrue(syntax.match("[[]](()){{{}}}")); 		
	}

	@Test
	public void testMatchFalse() {
        Assert.assertFalse(syntax.match("abc(def(ghi)")); 		
        Assert.assertFalse(syntax.match("]]]]")); 		
        Assert.assertFalse(syntax.match("([)]")); 		
        Assert.assertFalse(syntax.match("([)()]")); 		
	}

	@Test
	public void testMatchSystemTest() {
		   Assert.assertTrue(syntax.match("xfds{fdsly[(test)fdsj]abc}")); 		
		   Assert.assertTrue(syntax.match("[]")); 		
		   Assert.assertTrue(syntax.match("[[]]{{{}}}(())")); 		
	       Assert.assertFalse(syntax.match("{fds(fd}fds)")); 		
	       Assert.assertFalse(syntax.match("fdc{fdf{gfdjkli}}}")); 		
	}
}

