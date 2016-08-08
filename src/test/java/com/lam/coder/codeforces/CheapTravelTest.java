package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.CheapTravel;

public class CheapTravelTest {
	CheapTravel cheapTravel;
	
	@Before
	public void setUp() throws Exception {
		cheapTravel = new CheapTravel();
	}

	@After
	public void tearDown() throws Exception {
		cheapTravel  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(6, cheapTravel.find( new int[] {6, 2, 1, 2} ));
		Assert.assertEquals(8, cheapTravel.find( new int[] {5, 2, 2, 3} ));
		Assert.assertEquals(100, cheapTravel.find( new int[] {101, 110, 1, 100} ));
//		Assert.assertEquals(0, cheapTravel.find( new int[] {} ));


	}
}
