package com.lam.coder.codeChef;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeChef.CielAndReceipt;

import org.junit.Assert;
import junit.framework.TestCase;

public class CielAndReceiptTest extends TestCase {

	CielAndReceipt ciel;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		ciel = new CielAndReceipt();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		ciel = null;
	}

	@Test
	public void testMinimumNumberOfMenus() {
		Assert.assertEquals(0, ciel.minimumNumberOfMenus(0));
		Assert.assertEquals(52, ciel.minimumNumberOfMenus(100000));

		Assert.assertEquals(1, ciel.minimumNumberOfMenus(256));
		Assert.assertEquals(2, ciel.minimumNumberOfMenus(4096));
		Assert.assertEquals(2, ciel.minimumNumberOfMenus(10));
		Assert.assertEquals(8, ciel.minimumNumberOfMenus(255));
		Assert.assertEquals(3, ciel.minimumNumberOfMenus(4098));

		Assert.assertEquals(1, ciel.minimumNumberOfMenus(1));
		Assert.assertEquals(1, ciel.minimumNumberOfMenus(2048));
		Assert.assertEquals(2, ciel.minimumNumberOfMenus(2049));
		Assert.assertEquals(4, ciel.minimumNumberOfMenus(1696));

		Assert.assertEquals(16, ciel.minimumNumberOfMenus(32768));
		Assert.assertEquals(3, ciel.minimumNumberOfMenus(515));
		Assert.assertEquals(6, ciel.minimumNumberOfMenus(2000));
		Assert.assertEquals(6, ciel.minimumNumberOfMenus(111));
		Assert.assertEquals(3, ciel.minimumNumberOfMenus(88));
	}

}
