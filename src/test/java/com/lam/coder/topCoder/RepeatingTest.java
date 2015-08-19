package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.Repeating;
@Ignore
public class RepeatingTest {

	Repeating repeat;
	
	@Before
	public void setUp() throws Exception {
		repeat = new Repeating();
	}

	@After
	public void tearDown() throws Exception {
		repeat = null;
	}

	@Test
	public void testFindRepeating() {
		Assert.assertEquals("0.(3)", repeat.findRepeating("0.3333333333"));
//		Assert.assertEquals("0.8(3)", repeat.findRepeating("0.8333333333"));
//		Assert.assertEquals("0.25(0)", repeat.findRepeating("0.2500000000"));
//		Assert.assertEquals("0.0(32)", repeat.findRepeating("0.0323232323"));

//				Assert.assertEquals(, repeat.findRepeating());
//				Assert.assertEquals(, repeat.findRepeating());
//		Assert.assertEquals(, repeat.findRepeating());
	}

}
