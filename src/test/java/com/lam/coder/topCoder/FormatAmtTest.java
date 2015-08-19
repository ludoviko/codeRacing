package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.FormatAmt;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FormatAmtTest extends TestCase {

	FormatAmt format;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		format = new FormatAmt();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		format = null;
	}

	@Test
	public void testAmount() {
		Assert.assertEquals("$123,456.00", format.amount(123456, 0));
		Assert.assertEquals("$49,734,321.09", format.amount(49734321, 9));
		Assert.assertEquals("$0.99", format.amount(0, 99));
		Assert.assertEquals("$249.30", format.amount(249, 30));
		Assert.assertEquals("$1,000.01", format.amount(1000, 1));
		Assert.assertEquals("$0.00", format.amount(0, 0));
		Assert.assertEquals("$2,000,000,000.99", format.amount(2000000000, 99));
		Assert.assertEquals("$2.02", format.amount(2,2));
		Assert.assertEquals("$29.69", format.amount(29, 69));
		Assert.assertEquals("$1,000.01", format.amount(1000, 1));
		Assert.assertEquals("$99,999.10", format.amount(99999, 10));
		Assert.assertEquals("$2,000,000,000.55", format.amount(2000000000, 55));
		Assert.assertEquals("$3,040,506.00", format.amount(3040506, 0));
		Assert.assertEquals("$0.05", format.amount(0, 5));
		Assert.assertEquals("$205.06", format.amount(205, 6));
		Assert.assertEquals("$20,502,030.70", format.amount(20502030, 70));
		Assert.assertEquals("$1,001,001,001.01", format.amount(1001001001, 1));
		Assert.assertEquals("$600.00", format.amount(600, 0));
		Assert.assertEquals("$12,345.00", format.amount(12345, 0));
		Assert.assertEquals("$1,010,001.01", format.amount(1010001, 1));
		Assert.assertEquals("$100,000.44", format.amount(100000, 44));
		Assert.assertEquals("$324,567,789.54", format.amount(324567789, 54));
		Assert.assertEquals("$29.29", format.amount(29, 29));
		Assert.assertEquals("$1,000.01", format.amount(1000, 1));
		Assert.assertEquals("$1,000.99", format.amount(1000, 99));
		Assert.assertEquals("$1,234.01", format.amount(1234, 1));
		Assert.assertEquals("$7.07", format.amount(7, 7));
		Assert.assertEquals("$0.98", format.amount(0, 98));
		Assert.assertEquals("$12,345.06", format.amount(12345, 6));
		Assert.assertEquals("$21.00", format.amount(21, 0));
	}

	@Test
	public void testAmount2() {
		Assert.assertEquals("$123,456.00", format.amount2(123456, 0));
		Assert.assertEquals("$49,734,321.09", format.amount2(49734321, 9));
		Assert.assertEquals("$0.99", format.amount2(0, 99));
		Assert.assertEquals("$249.30", format.amount2(249, 30));
		Assert.assertEquals("$1,000.01", format.amount2(1000, 1));
		Assert.assertEquals("$0.00", format.amount2(0, 0));
		Assert.assertEquals("$2,000,000,000.99", format.amount2(2000000000, 99));
		Assert.assertEquals("$2.02", format.amount2(2,2));
		Assert.assertEquals("$29.69", format.amount2(29, 69));
		Assert.assertEquals("$1,000.01", format.amount2(1000, 1));
		Assert.assertEquals("$99,999.10", format.amount2(99999, 10));
		Assert.assertEquals("$2,000,000,000.55", format.amount2(2000000000, 55));
		Assert.assertEquals("$3,040,506.00", format.amount2(3040506, 0));
		Assert.assertEquals("$0.05", format.amount2(0, 5));
		Assert.assertEquals("$205.06", format.amount2(205, 6));
		Assert.assertEquals("$20,502,030.70", format.amount2(20502030, 70));
		Assert.assertEquals("$1,001,001,001.01", format.amount2(1001001001, 1));
		Assert.assertEquals("$600.00", format.amount2(600, 0));
		Assert.assertEquals("$12,345.00", format.amount2(12345, 0));
		Assert.assertEquals("$1,010,001.01", format.amount2(1010001, 1));
		Assert.assertEquals("$100,000.44", format.amount2(100000, 44));
		Assert.assertEquals("$324,567,789.54", format.amount2(324567789, 54));
		Assert.assertEquals("$29.29", format.amount2(29, 29));
		Assert.assertEquals("$1,000.01", format.amount2(1000, 1));
		Assert.assertEquals("$1,000.99", format.amount2(1000, 99));
		Assert.assertEquals("$1,234.01", format.amount2(1234, 1));
		Assert.assertEquals("$7.07", format.amount2(7, 7));
		Assert.assertEquals("$0.98", format.amount2(0, 98));
		Assert.assertEquals("$12,345.06", format.amount2(12345, 6));
		Assert.assertEquals("$21.00", format.amount2(21, 0));
	}

}
