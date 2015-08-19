package com.lam.coder.topCoder.dp;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


@Ignore
public class SimpleDPTest  {
	
	SimpleDP simple;

	public void setUp() throws Exception {
		this.simple = new SimpleDP(0);
	}

	public void tearDown() throws Exception {
		this.simple = null;
	}

	@Test
	public void testGetMinSteps() {
		this.simple.reset(1);
		Assert.assertEquals(0, this.simple.getMinSteps(1));
		this.simple.reset(4);
		Assert.assertEquals(2, this.simple.getMinSteps(4));
		this.simple.reset(7);
		Assert.assertEquals(3, this.simple.getMinSteps(7));
		this.simple.reset(10);
		Assert.assertEquals(3, this.simple.getMinSteps(10));
//		Assert.assertEquals(0, simple.getMinSteps(1));
	}

	@Test
	public void testGetMinStepsBU() {
		this.simple.reset(1);
		Assert.assertEquals(0, this.simple.getMinStepsBottomUp(1));
		this.simple.reset(4);
		Assert.assertEquals(2, this.simple.getMinStepsBottomUp(4));
		this.simple.reset(7);
		Assert.assertEquals(3, this.simple.getMinStepsBottomUp(7));
		this.simple.reset(10);
		Assert.assertEquals(3, this.simple.getMinStepsBottomUp(10));
//		Assert.assertEquals(0, simple.getMinSteps(1));
	}

}
