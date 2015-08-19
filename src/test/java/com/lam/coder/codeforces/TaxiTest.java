package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.Taxi;

public class TaxiTest {
	Taxi taxi;
	
	@Before
	public void setUp() throws Exception {
		taxi = new Taxi();
	}

	@After
	public void tearDown() throws Exception {
		taxi  = null;
	}

	@Test
	public void test() {
	    Assert.assertEquals(4, taxi.find(new Integer[] {1, 2, 4, 3, 3}));;
		Assert.assertEquals(5, taxi.find(new Integer[] {2, 3, 4, 4, 2, 1, 3, 1}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {2}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {2,2}));;
		Assert.assertEquals(2, taxi.find(new Integer[] {2,2,2}));;
		Assert.assertEquals(2, taxi.find(new Integer[] {2,2,2,2}));;
		Assert.assertEquals(3, taxi.find(new Integer[] {2,2,2,2,2}));;
		Assert.assertEquals(4, taxi.find(new Integer[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));;
		Assert.assertEquals(3, taxi.find(new Integer[] {3, 3, 2}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {2, 1, 1}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {1}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {2}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {3}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {4}));;
		Assert.assertEquals(3, taxi.find(new Integer[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));;
		Assert.assertEquals(1, taxi.find(new Integer[] {2, 2}));;
	}
}
