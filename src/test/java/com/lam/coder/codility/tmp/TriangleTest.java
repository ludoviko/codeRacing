package com.lam.coder.codility.tmp;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.Triangle;

public class TriangleTest extends TestCase {

	Triangle triangle;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		triangle = new Triangle();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		triangle = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(1,
				triangle.solution(new int[] { 10, 2, 5, 1, 8, 20 }));

		Assert.assertEquals(0, triangle.solution(new int[] { 10, 50, 5, 1 }));

		Assert.assertEquals(0, triangle.solution(new int[] { 10, 50 }));

		Assert.assertEquals(0, triangle.solution(new int[] { 10 }));

		Assert.assertEquals(0, triangle.solution(new int[] {}));
		Assert.assertEquals(
				1,
				triangle.solution(new int[] { Integer.MAX_VALUE,
						Integer.MAX_VALUE, Integer.MAX_VALUE }));

	}

}
