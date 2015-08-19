package com.lam.coder.usaco;


import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.PalindromicSquares;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PalindromicSquaresTest extends TestCase {

	PalindromicSquares pali;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		pali = new PalindromicSquares();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		pali = null;
	}

	@Test
	public void testFind() {
		Map<String, String> numbers = new HashMap<String, String>();

		numbers.put("1", "1");
		numbers.put("2", "4");
		numbers.put("3", "9");
		numbers.put("11", "121");
		numbers.put("22", "484");
		numbers.put("26", "676");
		numbers.put("101", "10201");
		numbers.put("111", "12321");
		numbers.put("121", "14641");
		numbers.put("202", "40804");
		numbers.put("212", "44944");
		numbers.put("264", "69696");

		pali.find(10);
		
		Assert.assertEquals(numbers, pali.getNumbers());
	}

}
