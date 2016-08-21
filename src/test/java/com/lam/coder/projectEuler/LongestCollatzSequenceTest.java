package com.lam.coder.projectEuler;


import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.LongestCollatzSequence;

import junit.framework.Assert;
import junit.framework.TestCase;

import static org.junit.Assert.assertThat;

public class LongestCollatzSequenceTest  {
	LongestCollatzSequence collatz; 
	
	@Before
	public void setUp() throws Exception {
		collatz = new LongestCollatzSequence();
	}

	@After
	public void tearDown() throws Exception {
		collatz = null;
	}

	@Test
	public void testFind() {
        assertThat("Error: Should be the same.", collatz.find().get(0), CoreMatchers.is(837799L));
    }
}
