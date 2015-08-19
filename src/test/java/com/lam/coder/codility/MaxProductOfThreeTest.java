package com.lam.coder.codility;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.MaxProductOfThree;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaxProductOfThreeTest extends TestCase {

	MaxProductOfThree product;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		product = new MaxProductOfThree();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		product = null;
	}

	@Test
	public void testSolution() {
	
		Assert.assertEquals(-4, product.solution(new int[] { -3, -1, -2, -2,
				-5, -6 })); 

		Assert.assertEquals(60, product.solution(new int[] { -3, 1, 2, -2,
				5, 6 })); 

		Assert.assertEquals(36, product.solution(new int[] { -3, -1, -2, 0,
				5, 6 })); 

		Assert.assertEquals(144, product.solution(new int[] { -3, -1, -2, -8,
				5, 6 })); 
		
		Assert.assertEquals(224, product.solution(new int[] { -8, -7, -1, 3, 4 })); 

		Assert.assertEquals(8000, product.solution(new int[] { -80, -10, -4, -2, 10 })); 

	}
}
