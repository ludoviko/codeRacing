package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.IntSplit;
@Ignore
public class IntSplitTest {
	IntSplit split;
	
	@Before
	public void setUp() throws Exception {
		split = new IntSplit();
	}

	@After
	public void tearDown() throws Exception {
		split = null;
	}

	@Test
	public void testMaxSplit() {
		Assert.assertEquals(986, split.maxSplit(19967, 1000));
		Assert.assertEquals(95, split.maxSplit(19967, 100));
		Assert.assertEquals(219, split.maxSplit(22215, 225));
//		Assert.assertEquals(, split.maxSplit(, ));
//		Assert.assertEquals(, split.maxSplit(, ));
	}

}
