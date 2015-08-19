package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.ArrivalOfTheGeneral;

public class ArrivalOfTheGeneralTest {
	ArrivalOfTheGeneral arrivalOfTheGeneral;
	
	@Before
	public void setUp() throws Exception {
		this.arrivalOfTheGeneral = new ArrivalOfTheGeneral();
	}

	@After
	public void tearDown() throws Exception {
		this.arrivalOfTheGeneral  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(10, this.arrivalOfTheGeneral.find("10 10 58 31 63 40 76"));
		Assert.assertEquals(2, this.arrivalOfTheGeneral.find("33 44 11 22"));
//		Assert.assertEquals(0, arrivalOfTheGeneral.find(""));
	}
}
