package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Punnet;

public class PunnetTest {
	Punnet punnet;
	
	@Before
	public void setUp() throws Exception {
		punnet = new Punnet();
	}

	@After
	public void tearDown() throws Exception {
		punnet = null;
	}

	@Test
	public void testComputeProbability() {
		Assert.assertEquals(0.25, punnet.computeProbability("aA", "Aa", "a"));
		Assert.assertEquals(0.75, punnet.computeProbability("aA", "Aa", "A"));
		Assert.assertEquals(0.0, punnet.computeProbability("aa", "aa", "A"));
	}
	
	@Test
	public void computeProbabilitySystemTest() {
		Assert.assertEquals(0.125, punnet.computeProbability("AabbCcDdEe", "aaBbccDDEE", "ABCDE"));
		Assert.assertEquals(0.0, punnet.computeProbability("AA", "AA", "a"));
		Assert.assertEquals(1.0, punnet.computeProbability("", "", ""));
		Assert.assertEquals(0.0, punnet.computeProbability("AA", "AA", "a"));
		Assert.assertEquals(0.25, punnet.computeProbability("Aa", "Aa", "a"));
		Assert.assertEquals(1.0, punnet.computeProbability("AaBb", "AABB", " "));
		Assert.assertEquals(0.0, punnet.computeProbability("AaBBCcDdEe", "AABbccddEe", " bcd "));
		Assert.assertEquals(0.0234375, punnet.computeProbability("AaBbCCDdEeffgGHHiI", "aabbccddeeFfGghHII", "abCDEFG "));
		Assert.assertEquals(0.046875, punnet.computeProbability("AabBcCdDEe", "Aabbccddee", "ABCDE"));
//		Assert.assertEquals(, punnet.computeProbability());
	}
 }
