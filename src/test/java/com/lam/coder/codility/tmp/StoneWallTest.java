package com.lam.coder.codility.tmp;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.StoneWall;

public class StoneWallTest extends TestCase {

	StoneWall wall;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		wall = new StoneWall();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSolutionListOfIntegerAllTheSame() {
		Assert.assertEquals(1, wall.solution(new int[] {1}) );
		Assert.assertEquals(1, wall.solution(new int[] {8,8,8,8}) );
	}
	
	@Test
	public void testSolutionLisDecreasing() {
		Assert.assertEquals(3, wall.solution(new int[] {3,2,1}) );
	}

	@Test
	public void testSolutionLisIncreasing() {
		Assert.assertEquals(3, wall.solution(new int[] {3,2,1}) );
	}
	
	@Test
	public void testSolutionLisIncreasingAndDecreasing() {
		Assert.assertEquals(3, wall.solution(new int[] {1, 2, 3, 3, 2, 1}) );
	}

	@Test
	public void testSolutionListOfInteger() {
		Assert.assertEquals(7, wall.solution(new int[] {8,8,5,7,9,8,7,4,8}) );
	}
}


