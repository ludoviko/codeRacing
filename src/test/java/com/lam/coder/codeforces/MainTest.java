package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.Main;

@Ignore
public class MainTest {
	Main main;
	
	@Before
	public void setUp() throws Exception {
		main = new Main();
	}

	@After
	public void tearDown() throws Exception {
		main  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(0, main);
//		Assert.assertEquals("", main.);
//		Assert.assertArrayEquals(new int[] {}, main.);
//		Assert.assertArrayEquals(new String[] {}, main.);
	}
}

