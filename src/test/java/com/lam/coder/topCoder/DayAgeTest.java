package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.DayAge;

public class DayAgeTest {
	DayAge age;

	@Before
	public void setUp() throws Exception {
		age = new DayAge();
	}

	@After
	public void tearDown() throws Exception {
		age = null;
	}

	@Test
	public void testGetDaysOld() {
		Assert.assertEquals(366, age.getDaysOld("10/10/1999", "10/10/2000"));
		Assert.assertEquals(21854, age.getDaysOld("02/03/1940", "12/04/1999"));
	}
	
	@Test
	public void testGetDaysOldSysteTest() {
		Assert.assertEquals(366, age.getDaysOld("10/10/1999", "10/10/2000"));
		Assert.assertEquals(21854, age.getDaysOld("02/03/1940", "12/04/1999"));
		Assert.assertEquals(2, age.getDaysOld("03/02/1999", "03/04/1999"));
		Assert.assertEquals(0, age.getDaysOld("10/12/1992", "10/12/1992"));
		Assert.assertEquals(14733, age.getDaysOld("12/31/1960", "05/03/2001"));
		Assert.assertEquals(772, age.getDaysOld("04/30/1999", "06/10/2001"));
		Assert.assertEquals(24657, age.getDaysOld("03/31/1910", "10/02/1977"));
	}
}
