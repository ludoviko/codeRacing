package com.lam.coder.codeforces;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.TheaterSquare;

public class TheaterSquareTest {

	TheaterSquare theater;
	
	@Before
	public void setUp() throws Exception {
		theater = new TheaterSquare();
	}

	@After
	public void tearDown() throws Exception {
		theater = null;
	}

    @Test(timeout = 2000)
	public void test() {
		Assert.assertEquals(4, theater.find(6, 6, 4));
	}

}
