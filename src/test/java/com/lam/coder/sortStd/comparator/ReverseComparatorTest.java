package com.lam.coder.sortStd.comparator;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseComparatorTest extends TestCase {

	ReverseComparator reverse;
	
	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		this.reverse = new ReverseComparator(NaturalComparator.INSTANCE);
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		this.reverse = null;
	}

	@Test
	public void testLessThanBecomesGreaterThan() {
		Assert.assertTrue(this.reverse.compare("A", "B") > 0 );
	}

	@Test
	public void testGreaterThanBecomesLessThan() {
		Assert.assertTrue(this.reverse.compare("B", "A") < 0 );
	}
	
	@Test
	public void testEquals() {
		Assert.assertTrue(this.reverse.compare("A", "A") == 0 );
	}

}
