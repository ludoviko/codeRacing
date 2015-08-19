package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.LetterRange;

import junit.framework.TestCase;

public class LetterRangeTest extends TestCase {

	LetterRange range;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		range = new LetterRange();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		range = null;
	}

	@Test
	public void testRanges() {
        Assert.assertArrayEquals("Not equals. ", new String[] {}, range.ranges(""));
        Assert.assertArrayEquals("Not equals. ", new String[] {}, range.ranges(" "));
        Assert.assertArrayEquals("Not equals. ", new String[] {"a:a","h:h"}, range.ranges("aha"));
        Assert.assertArrayEquals("Not equals. ", new String[] {"x:z"}, range.ranges("xyzzy"));
        Assert.assertArrayEquals("Not equals. ", new String[] {"a:a","d:d","n:o","t:t"}, range.ranges("and toto too"));
        Assert.assertArrayEquals("Not equals. ", new String[] {"c:e","i:i","o:r","t:u","z:z"}, range.ranges("topcoder quiz"));
        Assert.assertArrayEquals("Not equals. ", new String[] {"a:z"}, range.ranges("the quick brown fox jumps over the lazy dog"));
	}

}
