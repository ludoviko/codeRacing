package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.DominoPiling;

public class DominoPilingTest {
	DominoPiling dominoPiling;
	
	@Before
	public void setUp() throws Exception {
		dominoPiling = new DominoPiling();
	}

	@After
	public void tearDown() throws Exception {
		dominoPiling  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(4, dominoPiling.find(2, 4));
		Assert.assertEquals(4, dominoPiling.find(3, 3));
		Assert.assertEquals(7, dominoPiling.find(5, 3));
		Assert.assertEquals(1, dominoPiling.find(2, 1));
		Assert.assertEquals(0, dominoPiling.find(1, 1));
	}
}
