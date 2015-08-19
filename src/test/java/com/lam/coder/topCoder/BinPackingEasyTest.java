package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BinPackingEasy;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BinPackingEasyTest extends TestCase {

	BinPackingEasy bin;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		bin = new BinPackingEasy();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		bin = null;
	}

	@Test
	public void testMinBins() {
		Assert.assertEquals(3, bin.minBins(new int[] {150, 150, 150, 150, 150} ));
		Assert.assertEquals(2, bin.minBins(new int[] {130, 140, 150, 160}));;
		
//		Assert.assertEquals(, bin.minBins(new int[] ));
//		Assert.assertEquals(, bin.minBins(new int[] ));
//		Assert.assertEquals(, bin.minBins(new int[] ));
	}

}
