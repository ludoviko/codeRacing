package com.lam.coder.topCoder;

import com.lam.coder.topCoder.BearCheats;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BearCheatsTest {
	BearCheats bearCheats;
	
	@Before
	public void setUp() throws Exception {
		bearCheats = new BearCheats();
	}

	@After
	public void tearDown() throws Exception {
		bearCheats  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", bearCheats.eyesight(8072, 3072) , CoreMatchers.is("happy"));

        Assert.assertThat("Should be the same.", bearCheats.eyesight(508, 540), CoreMatchers.is("glasses"));
        Assert.assertThat("Should be the same.", bearCheats.eyesight(854000, 854000), CoreMatchers.is("happy"));
        Assert.assertThat("Should be the same.", bearCheats.eyesight(1, 6), CoreMatchers.is("happy"));
        Assert.assertThat("Should be the same.", bearCheats.eyesight(385900, 123000), CoreMatchers.is("glasses"));
//        Assert.assertThat("Should be the same.", bearCheats.eyesight(0, 0) , CoreMatchers.is(""));
	}
}
