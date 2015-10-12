package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.ApplemanAndToastman;

@Ignore
public class ApplemanAndToastmanTest {
	ApplemanAndToastman applemanAndToastman;
	
	@Before
	public void setUp() throws Exception {
		applemanAndToastman = new ApplemanAndToastman();
	}

	@After
	public void tearDown() throws Exception {
		applemanAndToastman  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(0, applemanAndToastman);
//		Assert.assertEquals("", applemanAndToastman.);
//		Assert.assertArrayEquals(new int[] {}, applemanAndToastman.);
//		Assert.assertArrayEquals(new String[] {}, applemanAndToastman.);
	}
}
