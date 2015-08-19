package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Combiner;

public class CombinerTest {
	Combiner combiner;
	
	@Before
	public void setUp() throws Exception {
		combiner = new Combiner();
	}

	@After
	public void tearDown() throws Exception {
		combiner = null;
	}

	@Test
	public void testCombine() {
		Assert.assertEquals("TopCoder", combiner.combine("Tpo", "oCder"));
		Assert.assertEquals("abab", combiner.combine("aa", "bb"));
		Assert.assertEquals("abc", combiner.combine("ac", "b"));
		Assert.assertEquals("", combiner.combine("", ""));
	}

	@Test
	public void combineSystemTest() {
		Assert.assertEquals("Fbirstislonger" 	, combiner.combine("Firstislonger", "b"));
		Assert.assertEquals("siesCsoonmdewhatlongeR" 	, combiner.combine("seCond", "issomewhatlongeR"));
		Assert.assertEquals("slaemnegxtxh" 	, combiner.combine("samexx", "length"));
		Assert.assertEquals("ab" 	, combiner.combine("a", "b"));
		Assert.assertEquals("lloonnggssaammee" 	, combiner.combine("longsame", "longsame"));
		Assert.assertEquals("abc" 	, combiner.combine("a", "bc"));
		Assert.assertEquals("absrdrfagcbasdf" 	, combiner.combine("asdfgbasdf", "brrac"));
		Assert.assertEquals("adbec" 	, combiner.combine("abc", "de"));
	}
}
