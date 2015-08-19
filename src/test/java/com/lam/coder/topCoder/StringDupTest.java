/**
 * 
 */
package com.lam.coder.topCoder;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.StringDup;


public class StringDupTest extends TestCase {
	StringDup stringDup;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		stringDup = new StringDup();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		stringDup = null;
	}

	@Test
	public void testGetMax() {
		StringDupTest.assertEquals('c', stringDup.getMax("aaiicccnn"));
		StringDupTest.assertEquals('a', stringDup.getMax("aabbccdd"));
		StringDupTest.assertEquals('2', stringDup.getMax("ab2sbf2dj2skl"));
		StringDupTest.assertEquals('L',
				stringDup.getMax("tantomontamontatantoLLLLLLLmJJJJJJJl"));
       }

	@Test
	public void testGetMaxSystemTest() {
		StringDupTest.assertEquals('8', stringDup.getMax("fjk8lfdw8uio8432shjk3297883"));
		StringDupTest.assertEquals('3', stringDup.getMax("ure4397fds30"));
		StringDupTest.assertEquals('q', stringDup.getMax("qwertyuiopasdfjkl2346789"));
		StringDupTest.assertEquals('7', stringDup.getMax("777888333555"));
		StringDupTest.assertEquals('5', stringDup.getMax("778833555"));
       }
}

