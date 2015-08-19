package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.Tram;

public class TramTest {
	Tram tram;
	
	@Before
	public void setUp() throws Exception {
		tram = new Tram();
	}

	@After
	public void tearDown() throws Exception {
		tram  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(6, tram.find( new String[] {"0 3", "2 5", "4 2", "4 0" } ));
	}
}
