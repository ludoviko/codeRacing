package com.lam.coder.topCoder;

import com.lam.coder.topCoder.PalindromePrime;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromePrimeTest {
	PalindromePrime palindromePrime;
	
	@Before
	public void setUp() throws Exception {
		palindromePrime = new PalindromePrime();
	}

	@After
	public void tearDown() throws Exception {
		palindromePrime  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", palindromePrime.count(100, 150) , CoreMatchers.is(2));
        Assert.assertThat("Should be the same.", palindromePrime.count(1, 9) , CoreMatchers.is(4));
        Assert.assertThat("Should be the same.", palindromePrime.count(929, 929) , CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", palindromePrime.count(1, 1) , CoreMatchers.is(0));
        Assert.assertThat("Should be the same.", palindromePrime.count(1, 1000) , CoreMatchers.is(20));
//        Assert.assertThat("Should be the same.", palindromePrime.count() , CoreMatchers.is(0));
	}
}
