package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.InsertZ;

public class InsertZTest {
	InsertZ insertZ;
	
	@Before
	public void setUp() throws Exception {
		insertZ = new InsertZ();
	}

	@After
	public void tearDown() throws Exception {
		insertZ = null;
	}

	@Test
	public void testCanTransform() {
		Assert.assertEquals("Yes", insertZ.canTransform("fox", "fozx"));
		Assert.assertEquals("Yes", insertZ.canTransform("fox", "zfzoxzz"));
		Assert.assertEquals("Yes", insertZ.canTransform("foon", "foon"));
		Assert.assertEquals("No", insertZ.canTransform("topcoder", "zopzoder"));
		Assert.assertEquals("No", insertZ.canTransform("aaaaaaaaaa", "a"));
		Assert.assertEquals("Yes", insertZ.canTransform("mvixrdnrpxowkasufnvxaq", "mvizzxzzzrdzznzrpxozzwzzkazzzszzuzzfnvxzzzazzq"));
		Assert.assertEquals("No", insertZ.canTransform("opdlfmvuicjsierjowdvnx", "zzopzdlfmvzuicjzzsizzeijzowvznxzz"));
	}
}
