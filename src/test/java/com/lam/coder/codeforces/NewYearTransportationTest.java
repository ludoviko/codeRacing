package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.NewYearTransportation;

public class NewYearTransportationTest {
	NewYearTransportation newYearTransportation;
	
	@Before
	public void setUp() throws Exception {
		newYearTransportation = new NewYearTransportation();
	}

	@After
	public void tearDown() throws Exception {
		newYearTransportation  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("YES", newYearTransportation.find(new int [] {1, 1, 2, 1, 2, 1, 2, 1} , 4));
		Assert.assertEquals("NO", newYearTransportation.find(new int [] {1, 1, 2, 1, 2, 1, 1, 1} , 5));
//		Assert.assertEquals("", newYearTransportation.find(new int [] {} , ));
	}
}
