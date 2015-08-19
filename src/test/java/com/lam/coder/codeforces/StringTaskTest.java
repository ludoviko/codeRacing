package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.StringTask;

public class StringTaskTest {
	StringTask stringTask;
	
	@Before
	public void setUp() throws Exception {
		stringTask = new StringTask();
	}

	@After
	public void tearDown() throws Exception {
		stringTask  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(".t.r", stringTask.transform("tour"));
		Assert.assertEquals("", stringTask.transform("a"));
		Assert.assertEquals(".c", stringTask.transform("c"));
		Assert.assertEquals(".c.d.f.r.c.s", stringTask.transform("Codeforces"));
		Assert.assertEquals(".b.c.b", stringTask.transform("aBAcAba"));
//		Assert.assertEquals("", stringTask.transform(""));
	}
}
