package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.PascalCount;

import junit.framework.TestCase;

public class PascalCountTest {
	PascalCount pascal; 
	
	@Before
	public void setUp() throws Exception {
		pascal = new PascalCount();
	}

	@After
	public void tearDown() throws Exception {
		pascal = null;
	}

	@Test
	public void testHowMany() {
		Assert.assertEquals(2, pascal.howMany(3, 3));
		Assert.assertEquals(0 , pascal.howMany(3, 4));
		Assert.assertEquals(3 , pascal.howMany(4, 2));
		Assert.assertEquals(1 , pascal.howMany(4, 6));
		Assert.assertEquals(0 , pascal.howMany(0, 3));
	}

	@Ignore
	@Test
	public void testHowManySystemTest() {
		Assert.assertEquals(2, pascal.howMany(3, 3));
		Assert.assertEquals(0, pascal.howMany(3, 4));
		Assert.assertEquals(3, pascal.howMany(4, 2));
		Assert.assertEquals(1, pascal.howMany(4, 6));
		Assert.assertEquals(4999315, pascal.howMany(5000000, 6));
		Assert.assertEquals(4999745, pascal.howMany(5000000, 2));
		Assert.assertEquals(4999569, pascal.howMany(5000000, 3));
		Assert.assertEquals(4998977, pascal.howMany(5000000, 4));
		Assert.assertEquals(4999956, pascal.howMany(5000000, 5));
		Assert.assertEquals(0, pascal.howMany(0, 3));
		Assert.assertEquals(2499745, pascal.howMany(2500000, 2));
		Assert.assertEquals(2499425, pascal.howMany(2500000, 3));
		Assert.assertEquals(2498977, pascal.howMany(2500000, 4));
		Assert.assertEquals(2499989, pascal.howMany(2500000, 5));
		Assert.assertEquals(2499173, pascal.howMany(2500000, 6));
		Assert.assertEquals(3325142, pascal.howMany(3333333, 2));
		Assert.assertEquals(3332470, pascal.howMany(3333333, 3));
		Assert.assertEquals(3296470, pascal.howMany(3333333, 4));
		Assert.assertEquals(3284182, pascal.howMany(3333333, 5));
		Assert.assertEquals(3324286, pascal.howMany(3333333, 6));
		Assert.assertEquals(86, pascal.howMany(101, 2));
		Assert.assertEquals(84, pascal.howMany(101, 3));
		Assert.assertEquals(70, pascal.howMany(101, 4));
		Assert.assertEquals(92, pascal.howMany(101, 5));
		Assert.assertEquals(72, pascal.howMany(101, 6));
		Assert.assertEquals(1670743, pascal.howMany(1671174, 3));
		Assert.assertEquals(2529375, pascal.howMany(2545758, 4));
		Assert.assertEquals(1696860, pascal.howMany(1741859, 5));
		Assert.assertEquals(4690975, pascal.howMany(4852974, 5));
		Assert.assertEquals(1599119, pascal.howMany(1743118, 5));
		Assert.assertEquals(684690, pascal.howMany(718439, 5));
		Assert.assertEquals(2198070, pascal.howMany(2199093, 2));
		Assert.assertEquals(3671422, pascal.howMany(3675517, 2));
		Assert.assertEquals(550432, pascal.howMany(552351, 5));
		Assert.assertEquals(2269795, pascal.howMany(2298594, 5));
		Assert.assertEquals(3555004, pascal.howMany(3556885, 6));
		Assert.assertEquals(2440238, pascal.howMany(2456621, 4));
		Assert.assertEquals(28640, pascal.howMany(28977, 6));
		Assert.assertEquals(3050794, pascal.howMany(3056625, 3));
		Assert.assertEquals(2886065, pascal.howMany(2892268, 6));
		Assert.assertEquals(3233796, pascal.howMany(3249155, 5));
		Assert.assertEquals(3953534, pascal.howMany(3969917, 2));
		Assert.assertEquals(4484637, pascal.howMany(4599836, 5));
		Assert.assertEquals(2756200, pascal.howMany(2774631, 4));
		Assert.assertEquals(3031339, pascal.howMany(3044694, 6));
		Assert.assertEquals(1623488, pascal.howMany(1626425, 6));
		Assert.assertEquals(2540738, pascal.howMany(2541633, 4));
		Assert.assertEquals(3786277, pascal.howMany(3788324, 2));
		Assert.assertEquals(205532, pascal.howMany(206421, 6));
		Assert.assertEquals(3947732, pascal.howMany(3951827, 2));
		Assert.assertEquals(1376741, pascal.howMany(1378788, 4));
		Assert.assertEquals(1325085, pascal.howMany(1326812, 3));
		Assert.assertEquals(2501522, pascal.howMany(2502673, 3));
		Assert.assertEquals(4788798, pascal.howMany(4794629, 3));
		Assert.assertEquals(4924181, pascal.howMany(4924436, 2));
		Assert.assertEquals(4999315, pascal.howMany(5000000, 6));
		Assert.assertEquals(484449, pascal.howMany(500000, 3));
		Assert.assertEquals(4998977, pascal.howMany(5000000, 4));
		Assert.assertEquals(4999745, pascal.howMany(5000000, 2));
		Assert.assertEquals(4999956, pascal.howMany(5000000, 5));
		Assert.assertEquals(499617, pascal.howMany(500000, 4));
		Assert.assertEquals(4983884, pascal.howMany(4987451, 6));
		Assert.assertEquals(4991552, pascal.howMany(4999999, 6));
		Assert.assertEquals(4979119, pascal.howMany(4983214, 4));
		Assert.assertEquals(484329, pascal.howMany(500000, 6));
		Assert.assertEquals(49993, pascal.howMany(50000, 5));
		Assert.assertEquals(3449640, pascal.howMany(3489965, 6));
		Assert.assertEquals(99507, pascal.howMany(100000, 6));
		Assert.assertEquals(0, pascal.howMany(3, 6));
		Assert.assertEquals(4980284, pascal.howMany(4987451, 4));
		Assert.assertEquals(1, pascal.howMany(4, 6));
		Assert.assertEquals(7, pascal.howMany(12, 4));
		Assert.assertEquals(1, pascal.howMany(8, 5));
	}
}
