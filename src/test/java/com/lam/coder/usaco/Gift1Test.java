package com.lam.coder.usaco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.Gift1;

import org.junit.Assert;

import junit.framework.TestCase;

public class Gift1Test extends TestCase {

	Gift1 give;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		give = new Gift1();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		give = null;
	}

	@Test
	public void testMoneyTotal() {
		Assert.assertArrayEquals(
				new int[] { 302, 66, -359, 141, -150 },
				give.moneyTotal(new String[] { "dave", "laura", "owen", "vick",
						"amr" }, new String[] { "200 laura owen vick",
						"0 amr vick ", "500 dave", "0", "150 vick owen" }));
//		[200 laura owen vick , 0 amr vick , 500 dave , 0 , 150 vick owen ]
	}

}
