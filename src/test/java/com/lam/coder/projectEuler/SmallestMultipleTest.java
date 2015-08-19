package com.lam.coder.projectEuler;

import org.junit.Test;

import com.lam.coder.projectEuler.SmallestMultiple;

import junit.framework.TestCase;

public class SmallestMultipleTest extends TestCase {

	 SmallestMultiple multiple;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		multiple = new SmallestMultiple(); 
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
        multiple = null;
	}

	
	@Test
	public void testUpTo20() {
		multiple.setNumber(20);
		multiple.start();
		SmallestMultipleTest.assertEquals(232792560, multiple.getAnswer());
	}
	
	@Test
	public void testUpTo10() {
		multiple.setNumber(10);
		multiple.start();
		SmallestMultipleTest.assertEquals(2520, multiple.getAnswer());
	}
	
	
}
