package com.lam.coder.codility;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.FrogJump;

public class FrogJumpTest {
	FrogJump jump;
	
	@Before
	public void setUp() throws Exception {
		jump = new FrogJump();
	}

	@After
	public void tearDown() throws Exception {
		jump = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(3, jump.solution(10, 85, 30));
	}

}
