package com.lam.coder.topCoder;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.PeopleCircle;
@Ignore
public class PeopleCircleTest extends TestCase {
	PeopleCircle circle;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		circle = new PeopleCircle();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testOrder() {
		Assert.assertEquals("MFMFMFMM", circle.order(5, 3, 2));
		Assert.assertEquals("FFFMMMMMMM" , circle.order(7, 3, 1));
		Assert.assertEquals("M" , circle.order(1, 0, 245));
		Assert.assertEquals("MFFMMFFMFM" , circle.order(5, 5, 3));
//		                     [f, f, M, M, f, f, M, f, M, M]
	
//		Assert.assertEquals( , circle.order(, , ));
		

	}

}
