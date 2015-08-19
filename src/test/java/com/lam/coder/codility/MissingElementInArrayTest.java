package com.lam.coder.codility;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.MissingElementInArray;

public class MissingElementInArrayTest {
	MissingElementInArray missing;
	
	@Before
	public void setUp() throws Exception {
		missing = new MissingElementInArray();
	}

	@After
	public void tearDown() throws Exception {
		missing = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(4, missing.solution(new int[] {2,3,1,5}));
	}

}
