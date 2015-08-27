package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.Pangrams;

public class PangramsTest {
	Pangrams pangrams;
	
	@Before
	public void setUp() throws Exception {
		this.pangrams = new Pangrams();
	}

	@After
	public void tearDown() throws Exception {
		this.pangrams  = null;
	}

	@Test(timeout = 10000)
	public void test() {
		Assert.assertEquals("NULL", pangrams.find("A quick brown fox jumps over the lazy dog"));
		Assert.assertEquals("bjkmqz", pangrams.find("A slow yellow fox crawls under the proactive dog"));
	}
}
