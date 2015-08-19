package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.CalendarRecycle;

@Ignore
public class CalendarRecycleTest {

	CalendarRecycle calendar;
	
	@Before
	public void setUp() throws Exception {
		calendar = new CalendarRecycle();
	}

	@After
	public void tearDown() throws Exception {
		calendar = null;
	}

	@Test
	public void testUseAgain() {
		Assert.assertEquals(2019, calendar.useAgain(2013));
		Assert.assertEquals(2013, calendar.useAgain(2002));
		Assert.assertEquals(2036, calendar.useAgain(2008));
	//	Assert.assertEquals(10010, calendar.useAgain(9999));
	//	Assert.assertEquals(2531, calendar.useAgain(2525));
	//	Assert.assertEquals(, calendar.useAgain());
	}

}
