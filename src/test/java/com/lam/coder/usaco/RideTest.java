package com.lam.coder.usaco;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.Ride;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RideTest extends TestCase {

	Ride ride;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		ride = new Ride();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		ride = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals("GO", ride.find("COMETQ", "HVNGAT"));
		Assert.assertEquals("STAY", ride.find("ABSTAR", "USACO"));
	}

}
