package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.LetterSort;

public class LetterSortTest {
	LetterSort sort;
	
	@Before
	public void setUp() throws Exception {
		sort = new LetterSort();
	}

	@After
	public void tearDown() throws Exception {
		sort = null;
	}

	@Test
	public void testDoSort() {
		Assert.assertEquals("CCCCAABB", sort.doSort("CABCACCB"));
		Assert.assertEquals("ToopCder", sort.doSort("TopCoder"));
		Assert.assertEquals("HHioowAreYu", sort.doSort("HiHowAreYou"));
		}

	@Test
	public void testDoSortSystemTest() {
		Assert.assertEquals("TThisssIAet", sort.doSort("ThisIsATest"));
		Assert.assertEquals("abcdeABCDE", sort.doSort("abcdeABCDE"));
		Assert.assertEquals("SSlipperyam", sort.doSort("SlipperySam"));
		Assert.assertEquals("AAbbCCddEE", sort.doSort("AbCdEEdCbA"));
		Assert.assertEquals("nnnaaacchhoom112", sort.doSort("nachonachoma1n21"));
	}
}
