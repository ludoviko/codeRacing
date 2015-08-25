package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.Buttons;

@Ignore
public class ButtonsTest {
	Buttons buttons;
	
	@Before
	public void setUp() throws Exception {
		buttons = new Buttons();
	}

	@After
	public void tearDown() throws Exception {
		buttons  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(1, buttons.find(1));
		Assert.assertEquals(3, buttons.find(2));
		Assert.assertEquals(7, buttons.find(3));
		Assert.assertEquals(14, buttons.find(4));
		Assert.assertEquals(25, buttons.find(5));
	}
}
