package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.JumpFurther;

public class JumpFurtherTest {
	JumpFurther jump;
	
	@Before
	public void setUp() throws Exception {
		jump = new JumpFurther();
	}

	@After
	public void tearDown() throws Exception {
		jump = null;
	}

	@Test
	public void testFurthest() {
		Assert.assertEquals(1998999, jump.furthest(1999, 1999000));
		Assert.assertEquals(2000999, jump.furthest(2000, 2001000));
		Assert.assertEquals(3, jump.furthest(2, 2));
		Assert.assertEquals(2, jump.furthest(2, 1));
		Assert.assertEquals(5, jump.furthest(3, 3));
		Assert.assertEquals(862641, jump.furthest(1313, 5858));
		Assert.assertEquals(1, jump.furthest(1, 757065));
	}
}
