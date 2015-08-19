package com.lam.coder.topCoder;


import org.junit.*;

import com.lam.coder.topCoder.SumOfPower;
@Ignore
public class SumOfPowerTest {
	SumOfPower sumOfPower;
	
	@Before
	public void setUp() throws Exception {
		sumOfPower = new SumOfPower();
	}

	@After
	public void tearDown() throws Exception {
		sumOfPower = null;
	}

	@Test
	public void testFindSum() {
		Assert.assertEquals(10, sumOfPower.findSum(new int[] {1,1,1}));
		Assert.assertEquals(6, sumOfPower.findSum(new int[] {1,2}));
	}

}
