package com.lam.coder.kattis;

import com.lam.coder.kattis.Main;
import org.hamcrest.CoreMatchers;
import org.junit.*;

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
//        Assert.assertThat("Should be the same.", main , CoreMatchers.is("expected"));
//		Assert.assertEquals("", main.);
//		Assert.assertArrayEquals(new int[] {}, main.);
//		Assert.assertArrayEquals(new String[] {}, main.);
	}
}

