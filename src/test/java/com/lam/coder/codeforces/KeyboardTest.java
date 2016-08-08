package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.Keyboard;

public class KeyboardTest {
	Keyboard keyboard;
	
	@Before
	public void setUp() throws Exception {
		keyboard = new Keyboard();
	}

	@After
	public void tearDown() throws Exception {
		keyboard  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("allyouneedislove", keyboard.find("R", "s;;upimrrfod;pbr"));
		Assert.assertEquals("by", keyboard.find("L", "vt"));
//		Assert.assertEquals("", keyboard.find("", ""));
	}
}
