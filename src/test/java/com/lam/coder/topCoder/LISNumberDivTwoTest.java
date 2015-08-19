package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.LISNumberDivTwo;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LISNumberDivTwoTest extends TestCase {

	LISNumberDivTwo data;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		data = new LISNumberDivTwo();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		data = null;
	}

	@Test
	public void testCalculate() {
		Assert.assertEquals(4, data.calculate(new int[] {1, 4, 4, 2, 6, 3}));
		Assert.assertEquals(1, data.calculate(new int[] {5, 8, 9, 12, 16, 32, 50}));
		Assert.assertEquals(6, data.calculate(new int[] {1, 1, 9, 9, 2, 2, 3, 3}));
		Assert.assertEquals(5, data.calculate(new int[] {50, 40, 30, 20, 10}));
		Assert.assertEquals(1, data.calculate(new int[] {42}));
	}

	@Test
	public void testCalculateSystemTest() {
		Assert.assertEquals(4, data.calculate(new int[] {1, 4, 4, 2, 6, 3}));
		Assert.assertEquals(1, data.calculate(new int[] {5, 8, 9, 12, 16, 32, 50}));
		Assert.assertEquals(6, data.calculate(new int[] {1, 1, 9, 9, 2, 2, 3, 3}));
		Assert.assertEquals(5, data.calculate(new int[] {50, 40, 30, 20, 10}));
		Assert.assertEquals(1, data.calculate(new int[] {42}));
		Assert.assertEquals(17, data.calculate(new int[] {11, 19, 9, 19, 25, 30, 19, 35, 14, 23, 22, 21, 24, 19, 38, 21, 33, 33, 47, 49, 45, 47, 13, 50, 34, 4, 13, 29, 10, 16, 41, 47, 19, 40, 32, 9, 11}));
		Assert.assertEquals(24, data.calculate(new int[] {16, 43, 1, 43, 4, 8, 41, 8, 3, 47, 20, 49, 48, 12, 9, 1, 1, 30, 37, 49, 47, 47, 10, 47, 21, 10, 11, 15, 7, 2, 23, 45, 27, 4, 43, 47, 11, 13, 13, 19, 2, 34, 23, 48}));
		Assert.assertEquals(22, data.calculate(new int[] {39, 38, 13, 18, 6, 3, 16, 17, 17, 50, 17, 28, 7, 38, 5, 38, 30, 3, 45, 1, 4, 42, 27, 16, 34, 20, 40, 50, 26, 25, 10, 22, 16, 13, 34, 33, 11}));
		Assert.assertEquals(10, data.calculate(new int[] {40, 7, 39, 44, 3, 19, 25, 5, 28, 2, 50, 3, 17, 38, 4, 24, 11, 43, 36, 13, 31}));
		Assert.assertEquals(13, data.calculate(new int[] {46, 46, 31, 25, 35, 35, 2, 45, 37, 21, 23, 48, 26, 32, 23, 33, 30, 9, 16, 16, 34}));
		Assert.assertEquals(6, data.calculate(new int[] {13, 47, 28, 16, 32, 47, 18, 18, 3, 7}));
		Assert.assertEquals(11, data.calculate(new int[] {42, 33, 15, 20, 50, 49, 47, 43, 24, 12, 40, 8, 29, 28, 25, 43}));
		Assert.assertEquals(6, data.calculate(new int[] {23, 46, 6, 43, 18, 15, 28, 45, 15, 23, 39, 3}));
		Assert.assertEquals(12, data.calculate(new int[] {19, 43, 38, 42, 42, 43, 38, 43, 6, 9, 26, 4, 1, 37, 26, 50, 31, 37, 35, 33, 8, 48}));
		Assert.assertEquals(4, data.calculate(new int[] {9, 20, 22, 18, 31, 41, 13, 33, 4, 17, 41}));
		Assert.assertEquals(26, data.calculate(new int[] {25, 15, 34, 34, 46, 30, 46, 40, 9, 37, 41, 31, 2, 17, 17, 32, 40, 27, 2, 5, 42, 37, 27, 43, 15, 21, 50, 47, 39, 20, 7, 41, 15, 36, 25, 49, 4, 8, 23, 29, 23, 4, 28, 6, 47, 5, 21, 40, 14, 31}));
		Assert.assertEquals(28, data.calculate(new int[] {11, 22, 18, 8, 6, 25, 2, 26, 10, 16, 8, 39, 30, 13, 47, 41, 19, 35, 11, 42, 14, 20, 10, 50, 7, 35, 25, 24, 8, 6, 40, 39, 23, 36, 45, 38, 6, 46, 26, 49, 31, 39, 50, 31, 11, 24, 35, 42, 2, 9}));
		Assert.assertEquals(27, data.calculate(new int[] {48, 10, 23, 10, 29, 30, 45, 20, 38, 41, 33, 39, 25, 7, 22, 3, 41, 43, 13, 43, 29, 30, 12, 34, 19, 13, 33, 19, 11, 35, 21, 23, 21, 9, 45, 41, 10, 25, 18, 4, 20, 47, 26, 13, 37, 41, 31, 14, 47, 2}));
		Assert.assertEquals(22, data.calculate(new int[] {5, 32, 11, 7, 21, 50, 14, 25, 33, 18, 38, 13, 31, 49, 11, 8, 40, 46, 48, 38, 26, 11, 31, 7, 21, 27, 27, 18, 26, 9, 10, 32, 10, 7, 40, 12, 47, 24, 42, 7, 15, 16, 30, 32, 49, 26, 44, 46, 8, 36}));
		Assert.assertEquals(28, data.calculate(new int[] {32, 32, 47, 38, 32, 29, 12, 28, 31, 32, 23, 6, 29, 12, 48, 37, 3, 12, 50, 20, 5, 13, 43, 35, 8, 9, 39, 16, 8, 17, 41, 28, 24, 40, 11, 46, 47, 28, 33, 39, 2, 13, 21, 13, 9, 45, 39, 25, 16, 8}));
		Assert.assertEquals(1, data.calculate(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
		Assert.assertEquals(2, data.calculate(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 29, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
		Assert.assertEquals(4, data.calculate(new int[] {1, 10, 3, 4, 5, 6, 7, 8, 9, 50, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 2}));
		Assert.assertEquals(7, data.calculate(new int[] {1, 2, 3, 4, 5, 6, 47, 8, 9, 10, 17, 12, 13, 14, 15, 16, 11, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 35, 30, 31, 32, 33, 34, 29, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 7, 48, 49, 50}));
		Assert.assertEquals(7, data.calculate(new int[] {1, 2, 3, 4, 34, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 29, 27, 28, 25, 30, 31, 32, 33, 5, 35, 36, 41, 38, 39, 40, 37, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
		Assert.assertEquals(7, data.calculate(new int[] {1, 2, 3, 23, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 4, 24, 25, 26, 27, 47, 36, 30, 31, 32, 33, 34, 35, 29, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 28, 48, 49, 50}));
		Assert.assertEquals(12, data.calculate(new int[] {50, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 34, 14, 15, 27, 17, 18, 19, 20, 21, 40, 29, 24, 25, 26, 16, 28, 44, 30, 31, 32, 33, 13, 35, 36, 37, 38, 39, 22, 41, 42, 43, 23, 45, 46, 47, 48, 49, 1}));
		Assert.assertEquals(13, data.calculate(new int[] {1, 2, 23, 4, 49, 45, 7, 8, 28, 10, 11, 20, 13, 14, 15, 16, 17, 18, 19, 12, 21, 22, 3, 24, 25, 26, 41, 9, 29, 30, 31, 32, 6, 34, 35, 36, 37, 38, 39, 40, 27, 42, 43, 44, 33, 46, 47, 48, 5, 50}));
		Assert.assertEquals(12, data.calculate(new int[] {1, 41, 5, 4, 3, 6, 7, 8, 47, 15, 11, 12, 13, 14, 43, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 50, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 2, 42, 10, 44, 45, 46, 49, 48, 9, 30}));
		Assert.assertEquals(11, data.calculate(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 11, 12, 10, 14, 15, 16, 18, 17, 47, 23, 21, 22, 20, 24, 25, 26, 27, 28, 29, 30, 31, 32, 35, 34, 49, 19, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 36, 48, 33, 50}));
		Assert.assertEquals(50, data.calculate(new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
		Assert.assertEquals(48, data.calculate(new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 25, 26, 27, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
		Assert.assertEquals(46, data.calculate(new int[] {50, 49, 48, 47, 46, 40, 44, 43, 42, 41, 45, 39, 38, 37, 36, 35, 34, 33, 32, 31, 20, 29, 28, 27, 26, 25, 24, 23, 22, 21, 30, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
		Assert.assertEquals(45, data.calculate(new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 33, 34, 35, 32, 31, 30, 29, 27, 28, 26, 25, 24, 23, 6, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 22, 5, 4, 3, 2, 1}));
		Assert.assertEquals(44, data.calculate(new int[] {50, 49, 48, 27, 46, 45, 8, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 47, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 6, 44, 10, 9, 11, 7, 12, 5, 4, 3, 2, 1}));
		Assert.assertEquals(43, data.calculate(new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 29, 37, 36, 35, 34, 33, 32, 15, 30, 3, 28, 27, 26, 14, 24, 23, 22, 21, 20, 19, 18, 17, 5, 31, 25, 13, 12, 11, 10, 9, 8, 7, 6, 16, 4, 38, 2, 1}));
		Assert.assertEquals(42, data.calculate(new int[] {50, 49, 48, 47, 46, 41, 23, 43, 42, 20, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 44, 22, 8, 45, 19, 18, 17, 16, 15, 14, 13, 6, 11, 10, 12, 21, 7, 9, 5, 4, 3, 2, 1}));
		Assert.assertEquals(39, data.calculate(new int[] {50, 10, 7, 47, 46, 45, 44, 43, 42, 41, 40, 39, 29, 1, 23, 35, 34, 33, 32, 31, 30, 38, 28, 27, 26, 25, 24, 3, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 49, 5, 8, 48, 6, 9, 4, 36, 2, 37}));
		Assert.assertEquals(38, data.calculate(new int[] {50, 49, 48, 47, 5, 18, 44, 43, 42, 4, 40, 39, 38, 31, 11, 35, 34, 33, 32, 37, 30, 29, 23, 27, 26, 25, 24, 36, 22, 14, 20, 19, 45, 17, 16, 15, 21, 13, 12, 28, 10, 9, 8, 7, 6, 46, 41, 3, 2, 1}));
		Assert.assertEquals(39, data.calculate(new int[] {50, 41, 48, 47, 46, 45, 14, 43, 42, 49, 40, 32, 16, 37, 36, 44, 34, 33, 22, 4, 30, 29, 28, 27, 26, 25, 24, 23, 39, 21, 35, 19, 18, 17, 38, 15, 31, 13, 12, 11, 10, 9, 8, 7, 6, 5, 20, 3, 2, 1}));
		Assert.assertEquals(14, data.calculate(new int[] {14, 21, 20, 10, 5, 1, 12, 25, 4, 2, 3, 23, 13, 18, 16, 24, 26, 28, 8, 22, 19, 27, 11, 7, 6, 9, 15, 17}));
		Assert.assertEquals(15, data.calculate(new int[] {9, 6, 3, 15, 30, 14, 28, 21, 20, 4, 1, 2, 5, 22, 18, 29, 10, 27, 8, 11, 13, 23, 17, 7, 19, 12, 16, 24, 26, 25}));
		Assert.assertEquals(3, data.calculate(new int[] {3, 4, 2, 1}));
		Assert.assertEquals(11, data.calculate(new int[] {2, 20, 18, 19, 8, 6, 1, 12, 17, 9, 11, 14, 13, 10, 15, 5, 16, 7, 3, 4}));
		Assert.assertEquals(4, data.calculate(new int[] {5, 3, 2, 4, 7, 1, 6}));
		Assert.assertEquals(15, data.calculate(new int[] {17, 20, 8, 25, 27, 22, 23, 28, 1, 19, 4, 5, 3, 12, 14, 13, 11, 2, 24, 10, 9, 7, 6, 16, 26, 15, 21, 18}));
		Assert.assertEquals(11, data.calculate(new int[] {1, 8, 16, 17, 15, 14, 3, 9, 4, 10, 18, 12, 7, 6, 5, 2, 13, 11, 19}));
		Assert.assertEquals(22, data.calculate(new int[] {3, 17, 34, 11, 19, 8, 32, 6, 16, 15, 10, 9, 5, 4, 31, 13, 22, 21, 18, 28, 14, 36, 12, 20, 29, 25, 30, 35, 27, 26, 23, 7, 33, 2, 37, 38, 24, 1}));
		Assert.assertEquals(18, data.calculate(new int[] {31, 39, 8, 24, 16, 22, 34, 14, 23, 40, 27, 35, 18, 30, 26, 37, 38, 20, 12, 36, 10, 19, 9, 21, 29, 15, 1, 7, 17, 4, 13, 25, 3, 28, 6, 5, 11, 32, 2, 33}));
		Assert.assertEquals(13, data.calculate(new int[] {24, 14, 7, 9, 2, 11, 4, 20, 3, 25, 5, 8, 18, 6, 15, 19, 10, 21, 12, 16, 17, 1, 26, 27, 22, 13, 23}));
		Assert.assertEquals(1, data.calculate(new int[] {1, 2}));
		Assert.assertEquals(2, data.calculate(new int[] {1, 1}));
		Assert.assertEquals(2, data.calculate(new int[] {2, 1}));
		Assert.assertEquals(2, data.calculate(new int[] {1, 2, 1}));
		Assert.assertEquals(2, data.calculate(new int[] {1, 1, 2}));
		Assert.assertEquals(3, data.calculate(new int[] {2, 1, 1}));
		Assert.assertEquals(2, data.calculate(new int[] {2, 1, 2}));
		Assert.assertEquals(50, data.calculate(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(4, data.calculate(new int[] {1, 4, 4, 2, 6, 3}));
		Assert.assertEquals(2, data.calculate(new int[] {1, 1}));
		Assert.assertEquals(7, data.calculate(new int[] {4, 4, 4, 4, 4, 4, 4}));
		Assert.assertEquals(1, data.calculate(new int[] {42}));
		Assert.assertEquals(3, data.calculate(new int[] {2, 1, 2, 1}));
		Assert.assertEquals(50, data.calculate(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(4, data.calculate(new int[] {14, 14, 28, 36, 36, 4}));
		Assert.assertEquals(2, data.calculate(new int[] {1, 2, 2, 3}));
		Assert.assertEquals(4, data.calculate(new int[] {1, 1, 4, 2, 6, 3}));
		Assert.assertEquals(1, data.calculate(new int[] {5, 8, 9, 12, 16, 32, 50}));
		Assert.assertEquals(1, data.calculate(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
		Assert.assertEquals(3, data.calculate(new int[] {1, 4, 4, 6, 1}));
		Assert.assertEquals(4, data.calculate(new int[] {5, 4, 3, 1, 2}));
		Assert.assertEquals(1, data.calculate(new int[] {1, 2}));
		Assert.assertEquals(2, data.calculate(new int[] {5, 8, 9, 12, 16, 32, 50, 37, 45}));
		Assert.assertEquals(2, data.calculate(new int[] {4, 3, 5}));
		Assert.assertEquals(4, data.calculate(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3}));
		Assert.assertEquals(2, data.calculate(new int[] {2, 3, 1, 4}));
		Assert.assertEquals(1, data.calculate(new int[] {1, 2, 3, 4}));
		Assert.assertEquals(2, data.calculate(new int[] {3, 2, 4}));
		Assert.assertEquals(4, data.calculate(new int[] {1, 2, 3, 3, 3, 3}));
		Assert.assertEquals(3, data.calculate(new int[] {1, 4, 4, 2, 6, 8}));
	}

}
