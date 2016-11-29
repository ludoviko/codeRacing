package com.lam.coder.usaco;

import com.lam.coder.usaco.Main;
import org.junit.*;
import org.hamcrest.CoreMatchers;

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
//        Assert.assertThat("Should be the same.", main , CoreMatchers.is("expected"));
//		Assert.assertEquals("", main.);
//		Assert.assertArrayEquals(new int[] {}, main.);
//		Assert.assertArrayEquals(new String[] {}, main.);
	}
}

