package com.lam.coder.codeChef;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeChef.Kayaks;

import junit.framework.Assert;
import junit.framework.TestCase;

public class KayaksTest extends TestCase {
	
	Kayaks kayaks;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		kayaks = new Kayaks();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		kayaks = null;
	}

	@Test
	public void testFindSlowestPair() {
		
	   List<String> list = new ArrayList<String>(); 	
		list.add("50 50");
		list.add("50 60");
		list.add("70 100");
		list.add("100 60");
       Assert.assertTrue(  (Math.abs(0.842105 - kayaks.findSlowestPair(list) )) < 0.000001 );		
	}

}
