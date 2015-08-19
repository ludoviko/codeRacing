package com.lam.coder.codility;


import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.TapeEquilibrium;

public class TapeEquilibriumTest  {
	TapeEquilibrium split;
	
	@Before
	public void setUp() throws Exception {
		split = new TapeEquilibrium();
	}

	@After
	public void tearDown() throws Exception {
		split = null;
		
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(1, split.solution(new int[] {3,1,2,4,3} ));
	}

	@Test
	public void testSolution2() {
		Assert.assertEquals(2, split.solution(new int[] {3,1} ));
	}
	
	
//	@Test
//	public void testFindDifference() {
//		int[] array = {3,1,2,4,3};
//		Assert.assertEquals(7, split.findDifference(array, 1 ));
//		Assert.assertEquals(5, split.findDifference(array, 2 ));
//		Assert.assertEquals(1, split.findDifference(array, 3 ));
//		Assert.assertEquals(7, split.findDifference(array, 4 ));
//	}

}
