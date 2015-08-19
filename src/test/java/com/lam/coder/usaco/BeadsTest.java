package com.lam.coder.usaco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.Beads;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BeadsTest extends TestCase {

	Beads beads;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		beads = new Beads();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		beads = null;
	}

	@Test
	public void testFindMaxLength() {
		Assert.assertEquals(11,
				beads.findMaxLength("wwwbbrwrbrbrrbrbrwrwwrbwrwrrb"));

		Assert.assertEquals(5, beads.findMaxLength("bbrrr"));

		Assert.assertEquals(5, beads.findMaxLength("brrrb"));

		Assert.assertEquals(5, beads.findMaxLength("bbbbb"));

		Assert.assertEquals(5, beads.findMaxLength("rrrrr"));

		Assert.assertEquals(5, beads.findMaxLength("wwwww"));
		
		Assert.assertEquals(
				74,
				beads.findMaxLength("rwrwrwrwrwrwrwrwrwrwrwrwbwrwbwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwrwr"));

		Assert.assertEquals(8, beads.findMaxLength("rrwwwwbb"));
	}

}
