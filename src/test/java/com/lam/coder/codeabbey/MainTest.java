package com.lam.coder.codeabbey;

import com.lam.coder.codeabbey.Main;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertThat("Should be the same.", main , CoreMatchers.is("expected"));
//		Assert.assertEquals("", main.);
//		Assert.assertArrayEquals(new int[] {}, main.);
//		Assert.assertArrayEquals(new String[] {}, main.);
	}
}

