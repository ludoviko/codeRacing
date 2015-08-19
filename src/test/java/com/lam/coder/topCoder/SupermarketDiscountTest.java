package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.SupermarketDiscount;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SupermarketDiscountTest extends TestCase {
	SupermarketDiscount discount;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		discount = new SupermarketDiscount();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		discount = null; 
	}

	@Test
	public void testMinAmount() {
		Assert.assertEquals(97, discount.minAmount(new int[] {46, 62, 9}));
		Assert.assertEquals(175, discount.minAmount(new int[] {50, 62, 93}));
		Assert.assertEquals(41, discount.minAmount(new int[] {5, 31, 15}));
		Assert.assertEquals(23, discount.minAmount(new int[] {5, 3, 15}));
	}

	@Test
	public void testMinAmountSysteTest() {
		Assert.assertEquals(97, discount.minAmount(new int[]  {46, 62, 9}));
		Assert.assertEquals(175, discount.minAmount(new int[]  {50, 62, 93}));
		Assert.assertEquals(41, discount.minAmount(new int[]  {5, 31, 15}));
		Assert.assertEquals(23, discount.minAmount(new int[]  {5, 3, 15}));
		Assert.assertEquals(3, discount.minAmount(new int[]  {1, 1, 1}));
		Assert.assertEquals(267, discount.minAmount(new int[]  {99, 99, 99}));
		Assert.assertEquals(137, discount.minAmount(new int[]  {49, 49, 49}));
		Assert.assertEquals(120, discount.minAmount(new int[]  {50, 50, 50}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {40, 5, 5}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {5, 40, 5}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {5, 5, 40}));
		Assert.assertEquals(75, discount.minAmount(new int[]  {40, 40, 5}));
		Assert.assertEquals(75, discount.minAmount(new int[]  {5, 40, 40}));
		Assert.assertEquals(75, discount.minAmount(new int[]  {40, 5, 40}));
		Assert.assertEquals(110, discount.minAmount(new int[]  {40, 40, 40}));
		Assert.assertEquals(15, discount.minAmount(new int[]  {5, 5, 5}));
		Assert.assertEquals(102, discount.minAmount(new int[]  {6, 50, 66}));
		Assert.assertEquals(190, discount.minAmount(new int[]  {33, 80, 97}));
		Assert.assertEquals(112, discount.minAmount(new int[]  {50, 69, 13}));
		Assert.assertEquals(144, discount.minAmount(new int[]  {77, 47, 40}));
		Assert.assertEquals(166, discount.minAmount(new int[]  {92, 86, 8}));
		Assert.assertEquals(89, discount.minAmount(new int[]  {23, 23, 53}));
		Assert.assertEquals(174, discount.minAmount(new int[]  {91, 56, 57}));
		Assert.assertEquals(93, discount.minAmount(new int[]  {7, 1, 95}));
		Assert.assertEquals(153, discount.minAmount(new int[]  {91, 74, 8}));
		Assert.assertEquals(169, discount.minAmount(new int[]  {75, 60, 64}));
		Assert.assertEquals(121, discount.minAmount(new int[]  {86, 3, 52}));
		Assert.assertEquals(83, discount.minAmount(new int[]  {25, 20, 48}));
		Assert.assertEquals(112, discount.minAmount(new int[]  {63, 19, 50}));
		Assert.assertEquals(109, discount.minAmount(new int[]  {7, 36, 76}));
		Assert.assertEquals(223, discount.minAmount(new int[]  {62, 92, 99}));
		Assert.assertEquals(180, discount.minAmount(new int[]  {96, 85, 19}));
		Assert.assertEquals(171, discount.minAmount(new int[]  {86, 35, 70}));
		Assert.assertEquals(240, discount.minAmount(new int[]  {95, 80, 95}));
		Assert.assertEquals(160, discount.minAmount(new int[]  {50, 82, 48}));
		Assert.assertEquals(152, discount.minAmount(new int[]  {75, 73, 24}));
		Assert.assertEquals(72, discount.minAmount(new int[]  {49, 11, 22}));
		Assert.assertEquals(93, discount.minAmount(new int[]  {12, 45, 56}));
		Assert.assertEquals(169, discount.minAmount(new int[]  {43, 75, 71}));
		Assert.assertEquals(125, discount.minAmount(new int[]  {34, 94, 17}));
		Assert.assertEquals(133, discount.minAmount(new int[]  {32, 48, 73}));
		Assert.assertEquals(117, discount.minAmount(new int[]  {24, 69, 44}));
		Assert.assertEquals(101, discount.minAmount(new int[]  {1, 51, 69}));
		Assert.assertEquals(186, discount.minAmount(new int[]  {80, 31, 95}));
		Assert.assertEquals(129, discount.minAmount(new int[]  {99, 30, 10}));
		Assert.assertEquals(131, discount.minAmount(new int[]  {13, 61, 77}));
		Assert.assertEquals(58, discount.minAmount(new int[]  {24, 35, 9}));
		Assert.assertEquals(63, discount.minAmount(new int[]  {39, 11, 23}));
		Assert.assertEquals(75, discount.minAmount(new int[]  {53, 9, 23}));
		Assert.assertEquals(20, discount.minAmount(new int[]  {15, 2, 3}));
		Assert.assertEquals(131, discount.minAmount(new int[]  {53, 50, 58}));
		Assert.assertEquals(89, discount.minAmount(new int[]  {53, 28, 18}));
		Assert.assertEquals(84, discount.minAmount(new int[]  {58, 22, 14}));
		Assert.assertEquals(91, discount.minAmount(new int[]  {54, 20, 37}));
		Assert.assertEquals(58, discount.minAmount(new int[]  {32, 6, 30}));
		Assert.assertEquals(48, discount.minAmount(new int[]  {42, 12, 4}));
		Assert.assertEquals(57, discount.minAmount(new int[]  {8, 6, 53}));
		Assert.assertEquals(122, discount.minAmount(new int[]  {52, 56, 34}));
		Assert.assertEquals(78, discount.minAmount(new int[]  {21, 19, 48}));
		Assert.assertEquals(34, discount.minAmount(new int[]  {15, 4, 15}));
		Assert.assertEquals(46, discount.minAmount(new int[]  {1, 20, 35}));
		Assert.assertEquals(82, discount.minAmount(new int[]  {31, 52, 9}));
		Assert.assertEquals(62, discount.minAmount(new int[]  {44, 8, 20}));
		Assert.assertEquals(51, discount.minAmount(new int[]  {44, 12, 5}));
		Assert.assertEquals(82, discount.minAmount(new int[]  {42, 18, 32}));
		Assert.assertEquals(53, discount.minAmount(new int[]  {41, 15, 7}));
		Assert.assertEquals(54, discount.minAmount(new int[]  {43, 4, 17}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {13, 36, 41}));
		Assert.assertEquals(68, discount.minAmount(new int[]  {9, 15, 54}));
		Assert.assertEquals(79, discount.minAmount(new int[]  {32, 1, 56}));
		Assert.assertEquals(77, discount.minAmount(new int[]  {44, 5, 38}));
		Assert.assertEquals(53, discount.minAmount(new int[]  {15, 5, 43}));
		Assert.assertEquals(31, discount.minAmount(new int[]  {20, 3, 8}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {12, 29, 9}));
		Assert.assertEquals(75, discount.minAmount(new int[]  {45, 10, 30}));
		Assert.assertEquals(129, discount.minAmount(new int[]  {59, 51, 39}));
		Assert.assertEquals(91, discount.minAmount(new int[]  {99, 1, 1}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {30, 10, 10}));
		Assert.assertEquals(55, discount.minAmount(new int[]  {20, 35, 10}));
		Assert.assertEquals(41, discount.minAmount(new int[]  {1, 1, 49}));
		Assert.assertEquals(120, discount.minAmount(new int[]  {50, 50, 50}));
		Assert.assertEquals(120, discount.minAmount(new int[]  {50, 50, 40}));
		Assert.assertEquals(218, discount.minAmount(new int[]  {99, 99, 40}));
		Assert.assertEquals(98, discount.minAmount(new int[]  {35, 36, 37}));
		Assert.assertEquals(137, discount.minAmount(new int[]  {49, 49, 49}));
		Assert.assertEquals(89, discount.minAmount(new int[]  {1, 49, 49}));
		Assert.assertEquals(65, discount.minAmount(new int[]  {25, 25, 25}));
		Assert.assertEquals(177, discount.minAmount(new int[]  {98, 98, 1}));
		Assert.assertEquals(3, discount.minAmount(new int[]  {1, 1, 1}));
		Assert.assertEquals(89, discount.minAmount(new int[]  {50, 48, 1}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {10, 10, 30}));
		Assert.assertEquals(179, discount.minAmount(new int[]  {1, 99, 99}));
		Assert.assertEquals(42, discount.minAmount(new int[]  {50, 1, 1}));
		Assert.assertEquals(179, discount.minAmount(new int[]  {99, 99, 1}));
		Assert.assertEquals(240, discount.minAmount(new int[]  {90, 90, 90}));
		Assert.assertEquals(42, discount.minAmount(new int[]  {1, 50, 1}));
		Assert.assertEquals(81, discount.minAmount(new int[]  {1, 50, 50}));
		Assert.assertEquals(267, discount.minAmount(new int[]  {99, 99, 99}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {10, 20, 20}));
		Assert.assertEquals(100, discount.minAmount(new int[]  {10, 10, 90}));
		Assert.assertEquals(130, discount.minAmount(new int[]  {60, 50, 40}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {50, 25, 25}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {40, 30, 20}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {30, 50, 10}));
		Assert.assertEquals(175, discount.minAmount(new int[]  {50, 62, 93}));
		Assert.assertEquals(92, discount.minAmount(new int[]  {25, 62, 25}));
		Assert.assertEquals(85, discount.minAmount(new int[]  {20, 20, 55}));
		Assert.assertEquals(41, discount.minAmount(new int[]  {49, 1, 1}));
		Assert.assertEquals(89, discount.minAmount(new int[]  {33, 33, 33}));
		Assert.assertEquals(110, discount.minAmount(new int[]  {40, 40, 40}));
		Assert.assertEquals(90, discount.minAmount(new int[]  {40, 11, 49}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {50, 20, 30}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {20, 20, 50}));
		Assert.assertEquals(188, discount.minAmount(new int[]  {99, 99, 10}));
		Assert.assertEquals(180, discount.minAmount(new int[]  {99, 99, 2}));
		Assert.assertEquals(50, discount.minAmount(new int[]  {20, 20, 20}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {5, 10, 35}));
		Assert.assertEquals(186, discount.minAmount(new int[]  {98, 98, 10}));
		Assert.assertEquals(52, discount.minAmount(new int[]  {30, 30, 2}));
		Assert.assertEquals(185, discount.minAmount(new int[]  {80, 80, 45}));
		Assert.assertEquals(120, discount.minAmount(new int[]  {90, 20, 20}));
		Assert.assertEquals(123, discount.minAmount(new int[]  {51, 51, 51}));
		Assert.assertEquals(97, discount.minAmount(new int[]  {99, 3, 5}));
		Assert.assertEquals(100, discount.minAmount(new int[]  {50, 50, 20}));
		Assert.assertEquals(41, discount.minAmount(new int[]  {20, 15, 16}));
		Assert.assertEquals(92, discount.minAmount(new int[]  {34, 34, 34}));
		Assert.assertEquals(130, discount.minAmount(new int[]  {49, 51, 50}));
		Assert.assertEquals(40, discount.minAmount(new int[]  {20, 20, 10}));
		Assert.assertEquals(177, discount.minAmount(new int[]  {99, 49, 49}));
		Assert.assertEquals(80, discount.minAmount(new int[]  {40, 10, 40}));
	}
}
