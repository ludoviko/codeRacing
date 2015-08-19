package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.PetyaAndStrings;

public class PetyaAndStringsTest {
	PetyaAndStrings petyaAndStrings;
	
	@Before
	public void setUp() throws Exception {
		this.petyaAndStrings = new PetyaAndStrings();
	}

	@After
	public void tearDown() throws Exception {
		this.petyaAndStrings  = null;
	}

	
	@Test
	public void test() {
		Assert.assertEquals(0, this.petyaAndStrings.find("aaaa", "aaaA"));
		Assert.assertEquals(-1, this.petyaAndStrings.find("abs", "Abz"));
		Assert.assertEquals(1, this.petyaAndStrings.find("abcdefg", "AbCdEfF"));
	}
}
