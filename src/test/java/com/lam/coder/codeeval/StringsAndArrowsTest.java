package com.lam.coder.codeeval;

import org.junit.*;

import com.lam.coder.codeeval.StringsAndArrows;

@Ignore
public class StringsAndArrowsTest {
	StringsAndArrows stringsAndArrows;
	
	@Before
	public void setUp() throws Exception {
		this.stringsAndArrows = new StringsAndArrows();
	}

	@After
	public void tearDown() throws Exception {
		this.stringsAndArrows  = null;
	}

	@Test(timeout = 10000)
	public void test() {
		Assert.assertEquals(2, this.stringsAndArrows.find("<--<<--<<"));
		Assert.assertEquals(4, this.stringsAndArrows.find("<<>>--><--<<--<<>>>--><"));
		Assert.assertEquals(0, this.stringsAndArrows.find("<-->>"));
	}
}
