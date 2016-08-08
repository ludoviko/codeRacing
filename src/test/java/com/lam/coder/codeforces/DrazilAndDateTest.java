package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.DrazilAndDate;

public class DrazilAndDateTest {
	DrazilAndDate drazilAndDate;
	
	@Before
	public void setUp() throws Exception {
		drazilAndDate = new DrazilAndDate();
	}

	@After
	public void tearDown() throws Exception {
		drazilAndDate  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("NO", drazilAndDate.find(5, 5, 11));
		Assert.assertEquals("YES", drazilAndDate.find(10, 15, 25));
		Assert.assertEquals("NO", drazilAndDate.find(0, 5, 1));
		Assert.assertEquals("YES", drazilAndDate.find(0, 0, 2 ));
//		Assert.assertEquals("", drazilAndDate.find(, , ));
	}
}
