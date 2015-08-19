package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.CommonChar;

public class CommonCharTest {
	CommonChar common;
	
	@Before
	public void setUp() throws Exception {
		common = new CommonChar();
	}

	@After
	public void tearDown() throws Exception {
		common = null;
	}

	@Test
	public void testCompare() {
		Assert.assertEquals(3, common.compare("java", "abava"));
		Assert.assertEquals(4, common.compare("TopCoder", "code guru"));
		Assert.assertEquals(0, common.compare("foobar", "sing"));
	}
	
	@Test
	public void testCompareSystemTest() {
		Assert.assertEquals(0, common.compare("", ""));
		Assert.assertEquals(3, common.compare("aAa", "aAaA"));
		Assert.assertEquals(6, common.compare("Hi1 how are you", "I am 1good"));
		Assert.assertEquals(5, common.compare(".,~~abcABC", "~~~efgaaABB"));
		Assert.assertEquals(4, common.compare("abc3", "abc3"));
	}
}
