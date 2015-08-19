package com.lam.coder.codility;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.PassingCars;

import org.junit.Assert;

public class PassingCarsTest {
	PassingCars cars;
	
	@Before
	public void setUp() throws Exception {
		cars = new PassingCars();
	}

	@After
	public void tearDown() throws Exception {
		cars = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(5, cars.solution(0,1,0,1,1));
		Assert.assertEquals(6, cars.solution(0,1,0,1,0,1));
	}
}
