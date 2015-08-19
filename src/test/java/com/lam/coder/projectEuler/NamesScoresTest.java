package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.NamesScores;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NamesScoresTest extends TestCase {

	NamesScores scores;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		scores = new NamesScores();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		scores = null;
	}

	@Test
	public void testFindScores() {
		scores.setNames();
		Assert.assertEquals(871198282, scores.findScores());
	}
}
