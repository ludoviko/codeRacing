package com.lam.coder.sortStd.comparator;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NaturalComparatorTest extends TestCase {

	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testLessThan() {
		Assert.assertTrue(NaturalComparator.INSTANCE.compare("A", "B") < 0 );
	}

	@Test
	public void testGreaterThan() {
		Assert.assertTrue(NaturalComparator.INSTANCE.compare("C", "B") > 0 );
	}
	
	@Test
	public void testEquals() {
		Assert.assertTrue(NaturalComparator.INSTANCE.compare("A", "A") == 0 );
	}

}
