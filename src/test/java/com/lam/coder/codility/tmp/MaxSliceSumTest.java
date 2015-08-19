package com.lam.coder.codility.tmp;

import org.junit.*;


@Ignore
public class MaxSliceSumTest  {
	MaxSliceSum slice; 
	
	@Before
	public void setUp() throws Exception {
		this.slice = new MaxSliceSum();
	}

	@After
	public void tearDown() throws Exception {
		this.slice = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(10, this.slice.solution(5, -7, 3, 5, -2, 4, -1));
		Assert.assertEquals(5, this.slice.solution(3,2,-6,4,0));
		Assert.assertEquals(-7, this.slice.solution(-7));
	}
}
