package com.lam.coder.projectEuler;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.PythagoreanTriplet;

public class PythagoreanTripletTest extends TestCase {
	
	PythagoreanTriplet triplet;

	@Before
	public void setUp() throws Exception {
		triplet = new PythagoreanTriplet(); 
	}

	@After
	public void tearDown() throws Exception {
		triplet = null;
	}

	@Test
	public void testAssertEqualsLongLong() {
		PythagoreanTripletTest.assertEquals(31875000, triplet.go());
	}

}
