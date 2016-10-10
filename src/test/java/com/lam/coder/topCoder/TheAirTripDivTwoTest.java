package com.lam.coder.topCoder;

import com.lam.coder.topCoder.TheAirTripDivTwo;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheAirTripDivTwoTest {
	TheAirTripDivTwo theAirTripDivTwo;
	
	@Before
	public void setUp() throws Exception {
		theAirTripDivTwo = new TheAirTripDivTwo();
	}

	@After
	public void tearDown() throws Exception {
		theAirTripDivTwo  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", theAirTripDivTwo.find(new int[] {1, 2, 3, 4, 5, 6, 7}, 10 ), CoreMatchers.is(4));
        Assert.assertThat("Should be the same.", theAirTripDivTwo.find( new int[] {7, 6, 5, 4, 3, 2, 1}, 10 ), CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", theAirTripDivTwo.find( new int[] {1}, 1000 ), CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", theAirTripDivTwo.find( new int[] {8, 7, 7, 1, 5, 7, 9}, 21 ), CoreMatchers.is(2));
//        Assert.assertThat("Should be the same.", theAirTripDivTwo.find( new int[] ,  ) , CoreMatchers.is());
	}
}
