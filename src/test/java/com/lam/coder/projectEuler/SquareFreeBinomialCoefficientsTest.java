package com.lam.coder.projectEuler;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.projectEuler.SquareFreeBinomialCoefficients;

@Ignore
public class SquareFreeBinomialCoefficientsTest {
	SquareFreeBinomialCoefficients data;
	
	@Before
	public void setUp() throws Exception {
		data = new SquareFreeBinomialCoefficients();
	}

	@After
	public void tearDown() throws Exception {
		data = null;
	}

	@Test
	public void testFindSumElementsSquareFree() {
	//	Assert.assertEquals(105, data.findSumElementsSquareFree(7));
		Assert.assertEquals(null, data.findSumElementsSquareFree(50));
	}

}
