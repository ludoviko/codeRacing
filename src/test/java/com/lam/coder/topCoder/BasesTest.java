package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Bases;

public class BasesTest {
	Bases bases;

	@Before
	public void setUp() throws Exception {
		bases = new Bases();
	}

	@After
	public void tearDown() throws Exception {
		bases = null;
	}

	@Test
	public void adderTest() {
		Assert.assertEquals("165.63", bases.adder("102.4", "63.23", 10));
		Assert.assertEquals("1021.26", bases.adder("613.56", "104.4", 7));
		Assert.assertEquals("1020", bases.adder("613", "104", 7));
		Assert.assertEquals("D30.A02", bases.adder("1D.EE", "D11.A12", 15));
		 Assert.assertEquals("1", bases.adder(".4", ".4", 8));
		// Assert.assertEquals("", bases.adder("", "", ));
	}

	@Test
	public void adderSysteTest() {
		 Assert.assertEquals("100011.11111", bases.adder("1001.111", "11010.00011", 2));
		 Assert.assertEquals("322.223", bases.adder("321.123", "1.1", 5));
		 Assert.assertEquals("125023.265", bases.adder("123456.066", "001234.166", 7));
		 Assert.assertEquals("19.91", bases.adder("A.92", "D.EE", 15));
		 Assert.assertEquals("3.2", bases.adder("3", ".2", 4));
	}

	@Test
	public void testAdderChar() {
		Assert.assertEquals("1", bases.adder('1', '0', '0', 7));
		Assert.assertEquals("10", bases.adder('3', '4', '0', 7));
		Assert.assertEquals("12", bases.adder('4', '5', '0', 7));
		Assert.assertEquals("14", bases.adder('A', 'A', '0', 16));
	}
}
