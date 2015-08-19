package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.NumbersChallenge;

public class NumbersChallengeTest {
	NumbersChallenge challenge;
	
	@Before
	public void setUp() throws Exception {
		challenge = new NumbersChallenge();
	}

	@After
	public void tearDown() throws Exception {
		challenge = null;
	}

	@Test
	public void testMinNumber() {
		Assert.assertEquals(4, challenge.minNumber(new int[] {5, 1, 2}));
	}
}
