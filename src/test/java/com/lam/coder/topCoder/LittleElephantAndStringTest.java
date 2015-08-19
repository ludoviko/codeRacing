package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.LittleElephantAndString;

import junit.framework.Assert;
import junit.framework.TestCase;
@Ignore
public class LittleElephantAndStringTest extends TestCase {

	LittleElephantAndString ele;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		ele = new LittleElephantAndString();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		ele = null;
	}

	@Ignore
	@Test
	public void testGetNumber() {
//		Assert.assertEquals(0, ele.getNumber("A", "A"));
//		Assert.assertEquals(-1, ele.getNumber("A", "B"));
//		Assert.assertEquals(2, ele.getNumber("ABC", "CBA"));
		Assert.assertEquals(3, ele.getNumber("AAABBB", "BBBAAA"));
//		Assert.assertEquals(, ele.getNumber(, ));
	}

	
	
}
