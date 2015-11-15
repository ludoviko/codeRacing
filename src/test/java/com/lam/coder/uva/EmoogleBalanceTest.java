package com.lam.coder.uva;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.uva.EmoogleBalance;

public class EmoogleBalanceTest {
	EmoogleBalance emoogleBalance;
	
	@Before
	public void setUp() throws Exception {
		this.emoogleBalance = new EmoogleBalance();
	}

	@After
	public void tearDown() throws Exception {
		this.emoogleBalance  = null;
	}

	@Test
	public void test() {
        Assert.assertEquals(1, this.emoogleBalance.find(new int[] {3, 4, 0, 0, 1}));
        Assert.assertEquals(-2, this.emoogleBalance.find(new int[] {2, 0, 0, 0}));
        Assert.assertEquals(3, this.emoogleBalance.find(new int[] {1, 2, 3, 4, 5, 0, 0}));
	}
}


