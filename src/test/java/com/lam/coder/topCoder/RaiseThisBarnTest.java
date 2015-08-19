package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.RaiseThisBarn;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RaiseThisBarnTest extends TestCase {
	RaiseThisBarn barn;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		barn = new RaiseThisBarn();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		barn = null;
	}

	@Test
	public void testCalc() {
		Assert.assertEquals(11, barn.calc("............"));
		Assert.assertEquals(2, barn.calc("..."));
		Assert.assertEquals(3, barn.calc("cc..c.c"));
		Assert.assertEquals(0, barn.calc("cc..c.cc"));
		Assert.assertEquals(3, barn.calc(".c.c...c..ccc.c..c.c.cc..ccc"));
	}

	@Test
	public void testCalcSystemTest() {
		Assert.assertEquals(3, barn.calc("cc..c.c"));
		Assert.assertEquals(0, barn.calc("c....c....c"));
		Assert.assertEquals(11, barn.calc("............"));
		Assert.assertEquals(3, barn.calc(".c.c...c..ccc.c..c.c.cc..ccc"));
		Assert.assertEquals(1, barn.calc(".."));
		Assert.assertEquals(0, barn.calc("c."));
		Assert.assertEquals(0, barn.calc(".c"));
		Assert.assertEquals(1, barn.calc("cc"));
		Assert.assertEquals(2, barn.calc("..."));
		Assert.assertEquals(0, barn.calc("c.."));
		Assert.assertEquals(0, barn.calc(".c."));
		Assert.assertEquals(1, barn.calc("cc."));
		Assert.assertEquals(0, barn.calc("..c"));
		Assert.assertEquals(2, barn.calc("c.c"));
		Assert.assertEquals(1, barn.calc(".cc"));
		Assert.assertEquals(0, barn.calc("ccc"));
		Assert.assertEquals(3, barn.calc("...."));
		Assert.assertEquals(0, barn.calc("c..."));
		Assert.assertEquals(0, barn.calc(".c.."));
		Assert.assertEquals(1, barn.calc("cc.."));
		Assert.assertEquals(0, barn.calc("..c."));
		Assert.assertEquals(2, barn.calc("c.c."));
		Assert.assertEquals(1, barn.calc(".cc."));
		Assert.assertEquals(0, barn.calc("ccc."));
		Assert.assertEquals(0, barn.calc("...c"));
		Assert.assertEquals(3, barn.calc("c..c"));
		Assert.assertEquals(2, barn.calc(".c.c"));
		Assert.assertEquals(0, barn.calc("cc.c"));
		Assert.assertEquals(1, barn.calc("..cc"));
		Assert.assertEquals(0, barn.calc("c.cc"));
		Assert.assertEquals(0, barn.calc(".ccc"));
		Assert.assertEquals(1, barn.calc("cccc"));
		Assert.assertEquals(1, barn.calc("c.ccc"));
		Assert.assertEquals(0, barn.calc("c.cccc"));
		Assert.assertEquals(0, barn.calc("cc.ccc."));
		Assert.assertEquals(0, barn.calc(".c.cccc."));
		Assert.assertEquals(0, barn.calc(".cc....c."));
		Assert.assertEquals(0, barn.calc(".c..cc.c.c"));
		Assert.assertEquals(1, barn.calc("......cccc."));
		Assert.assertEquals(0, barn.calc("....c....cc."));
		Assert.assertEquals(0, barn.calc("c.cc.ccc...c."));
		Assert.assertEquals(0, barn.calc("..cc..c..ccc.c"));
		Assert.assertEquals(0, barn.calc("c..cc..c..c.c.c"));
		Assert.assertEquals(1, barn.calc(".cc..c.cc.c.cc.."));
		Assert.assertEquals(0, barn.calc("ccccccc.c...c..cc"));
		Assert.assertEquals(0, barn.calc("c..c.ccccc.cc....."));
		Assert.assertEquals(0, barn.calc("c.c....ccc.c..c.cc."));
		Assert.assertEquals(2, barn.calc("c.c...ccc.c.c...ccc."));
		Assert.assertEquals(2, barn.calc("c...cc....c.c.cccc.c."));
		Assert.assertEquals(1, barn.calc("ccc.ccc.cc..cc.ccc.c.."));
		Assert.assertEquals(2, barn.calc("c...cc...cccc.ccccc.cc."));
		Assert.assertEquals(0, barn.calc("........c....cc..cc.c..c"));
		Assert.assertEquals(0, barn.calc("..ccc.c.c..c.cccc.c...c.c"));
		Assert.assertEquals(2, barn.calc("cc...cc.c.c.c.c.cccc......"));
		Assert.assertEquals(1, barn.calc(".c.c....cc.c.cc..c..ccc..c."));
		Assert.assertEquals(2, barn.calc("cccc.c..c.cc.....c.c.....cc."));
		Assert.assertEquals(0, barn.calc("cc.cc.cc....c..cc.c.c.c.cc.c."));
		Assert.assertEquals(1, barn.calc("ccc....c..c..ccc..c.c.c.cc..c."));
		Assert.assertEquals(0, barn.calc("..c..cc...c...c.ccc..c.ccc..ccc"));
		Assert.assertEquals(1, barn.calc(".c..cc.c..c..c.c..ccc...ccc..ccc"));
		Assert.assertEquals(3, barn.calc("cc.c.cccc.c.c..cc.c.c....c..cccc."));
		Assert.assertEquals(2, barn.calc("c.....cccc.c..ccc..c.ccc..cc.ccccc"));
		Assert.assertEquals(6, barn.calc("..ccc..cc...c.c.....c.c.c....ccc..c"));
		Assert.assertEquals(3, barn.calc("ccccc....cc..c..ccc.....c..cc...c..c"));
		Assert.assertEquals(0, barn.calc("....c.cccc....ccccc.c.ccc..cccccc.ccc"));
		Assert.assertEquals(2, barn.calc("..c.c.....c.cccc...c.c..c.....cc.cccc."));
		Assert.assertEquals(2, barn.calc(".c......ccccc...cc...c.c.cccc.ccccc.c.."));
		Assert.assertEquals(0, barn.calc("c.cc.c.c.c.c.cccccc.c..c.....c..cc.cc.c."));
		Assert.assertEquals(1, barn.calc("c.cc...c..cc......c.cccc..ccc...c.cc..ccc"));
		Assert.assertEquals(0, barn.calc("c..cc.c.c...c...c..c.....c.c.cc.ccc.cccc.."));
		Assert.assertEquals(1, barn.calc(".cc.ccccc.cccc.cc..cccc....c...cc..c....ccc"));
		Assert.assertEquals(1, barn.calc("cc....cc..ccc.c...c.ccc.cc.ccc..ccccc.cccc.."));
		Assert.assertEquals(1, barn.calc("c.cccccc.cc.c.ccc.ccccc.cc.cccc.....c.c.cc.cc"));
		Assert.assertEquals(1, barn.calc("c..c...cc.c.c.cc..c..cc.c.c.cc.c.ccc......c..."));
		Assert.assertEquals(0, barn.calc(".cccccccc....c....ccc..c.c...c..c..c..ccc.ccc.."));
		Assert.assertEquals(1, barn.calc("ccc...cc.cc.c.cc..c..ccccc.c.c..c.cc..c....c...c"));
		Assert.assertEquals(1, barn.calc("c.c.c...cc..cccc....c.cccc....c.c..ccccc.c.c..ccc"));
		Assert.assertEquals(4, barn.calc(".cccc...........ccc.cc.c.c....c...cc.ccc.cc.cccc.c"));
		Assert.assertEquals(49, barn.calc(".................................................."));
		Assert.assertEquals(1, barn.calc("cccccccccccccccccccccccccccccccccccccccccccccccccc"));
		Assert.assertEquals(10, barn.calc("..........."));
		Assert.assertEquals(1, barn.calc("..cc.."));
		Assert.assertEquals(2, barn.calc("c.c.c.c"));
		Assert.assertEquals(4, barn.calc("c...c"));
		Assert.assertEquals(2, barn.calc("c.c................."));
		Assert.assertEquals(2, barn.calc("cc.cc"));
		Assert.assertEquals(4, barn.calc("c..c....cc...cccc"));
	}
}
