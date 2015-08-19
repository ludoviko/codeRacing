package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Bonuses;

import junit.framework.TestCase;

public class BonusesTest extends TestCase {

	Bonuses bonus;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		bonus = new Bonuses();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		bonus = null;
	}

	@Test
	public void testGetDivision() {
         Assert.assertArrayEquals(new int[] { 6, 13, 20, 27, 34 } , bonus.getDivision(new int[]  {1,2,3,4,5} ) );		
       Assert.assertArrayEquals(new int[] { 17,  17,  17,  17,  16,  16 } , bonus.getDivision( new int[] {5,5,5,5,5,5}) );
     
//                                          [7, 5,  4,  2,  7,  4,  4,  3,  1,  4,  4,  4,  5,  3,  4,  4,  1,  7,  1,  5,  3,  7]
//       Assert.assertArrayEquals(new int[] { 8,  6,  4,  2,  8,  5,  5,  3,  1,  4,  5,  4,  6,  3,  5,  4,  1,  8,  1,  6,  3,  8 } ,
//    		   bonus.getDivision(
//    		   new int[] {485, 324, 263, 143, 470, 292, 304, 188, 100, 254, 296,
//    		    	   255, 360, 231, 311, 275,  93, 463, 115, 366, 197, 470} ) );
	}

}
