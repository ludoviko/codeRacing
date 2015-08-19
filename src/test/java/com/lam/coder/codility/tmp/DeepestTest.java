package com.lam.coder.codility.tmp;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.Deepest;

public class DeepestTest extends TestCase {

	Deepest deepest;
	
	@Before
	public void setUp() throws Exception {
		deepest = new Deepest();
	}

	@After
	public void tearDown() throws Exception {
		deepest = null;
	}
	
	@Test
	public void testArray() {
			int[] a = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };
			int n = deepest.find(a);
			DeepestTest.assertEquals(4, n);   
	}

}
