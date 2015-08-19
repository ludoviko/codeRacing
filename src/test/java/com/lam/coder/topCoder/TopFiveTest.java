package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.TopFive;

import junit.framework.Assert;
import junit.framework.TestCase;
@Ignore
public class TopFiveTest extends TestCase {
	
	TopFive top;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		top = new TopFive();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		top = null;
	}

	@Test
	public void testFindProbability() {
//		Assert.assertEquals(0.0, top.findProbability(new String[] {"200 200 200", "200 200 200",
//				"200 200 200","200 200 200","200 200 200"}, 
//				new String[] {"100 100 100", "100 100 100","100 100 100", "100 100 100",
//				"100 100 100"}, 100));
//
//		Assert.assertEquals(100.0, top.findProbability(new String[] {"200 200 200", "200 200 200",
//				"200 200 200","200 200 200","200 200 200"}, 
//				new String[] {"100 100 100", "100 100 100","100 100 100", "100 100 100",
//				"100 100 100"}, 1000));
	
		
		Assert.assertEquals(0.5, top.findProbability(new String[] {"200 200 200", "200 200 200",
				"200 200 200","200 200 200","200 200 200"}, 
				new String[] {"100 100 100", "100 100 100","100 100 100", "100 100 100",
				"0 0 50"}, 100));

//		Assert.assertEquals(0.0, top.findProbability(new String[] {
//				
//		}, 
//		new String[] {
//		}, 100));

		//		Assert.assertEquals(0.5, top.findProbability(new String[] {
//				
//				}, 
//				new String[] {
//				}, 100));

		/*
		 * 	

{"200 200 200",
"200 200 200",
"200 200 200",
"200 200 200",
"200 200 200"}

{"100 100 100",
"100 100 100",
"100 100 100",
"100 100 100",
"100 100 100"}

100

Returns: 0.0
		 */
		
	}

}
