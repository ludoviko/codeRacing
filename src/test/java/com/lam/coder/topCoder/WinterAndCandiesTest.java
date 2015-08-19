package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.WinterAndCandies;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WinterAndCandiesTest extends TestCase {
	
	WinterAndCandies winter;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		winter = new WinterAndCandies();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		winter = null;
	}

	@Test
	public void testGetNumber() {
		Assert.assertEquals(3, winter.getNumber(new int[] {1,3,2}));
//		Assert.assertEquals(, winter.getNumber(new int[] {}));
//		Assert.assertEquals(, winter.getNumber(new int[] {}));
//		Assert.assertEquals(, winter.getNumber(new int[] {}));
	}

}
