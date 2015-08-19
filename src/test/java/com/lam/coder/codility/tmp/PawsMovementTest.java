package com.lam.coder.codility.tmp;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.PawsMovement;

public class PawsMovementTest extends TestCase {
	PawsMovement moves;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		moves = new PawsMovement();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		moves = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(4, moves.solution(new int[] {2,3,-1,1,3}));
		Assert.assertEquals(3, moves.solution(new int[] {1,2,3,4,5}));
		Assert.assertEquals(-1, moves.solution(new int[] {1,1,-1,1}));
	}

}
