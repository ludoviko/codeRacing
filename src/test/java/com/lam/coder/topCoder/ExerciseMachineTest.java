package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ExerciseMachine;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ExerciseMachineTest extends TestCase {

	ExerciseMachine machine;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		machine = new ExerciseMachine();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		machine = null;
	}

	@Test
	public void testSystemPercentages() {
		Assert.assertEquals(99, machine.getPercentages("00:30:00"));
		Assert.assertEquals(3, machine.getPercentages( "00:19:16" ));
		Assert.assertEquals(3, machine.getPercentages("19:21:52"));
		Assert.assertEquals(99, machine.getPercentages("00:30:00"));
		Assert.assertEquals(19, machine.getPercentages("00:28:00"));
		Assert.assertEquals(0, machine.getPercentages("23:59:59"));
		Assert.assertEquals(49, machine.getPercentages("00:00:50"));
		Assert.assertEquals(49, machine.getPercentages("00:14:10"));
		Assert.assertEquals(3, machine.getPercentages("00:19:16"));
		Assert.assertEquals(3, machine.getPercentages("19:43:36"));
		Assert.assertEquals(4, machine.getPercentages("02:08:35"));
		Assert.assertEquals(9, machine.getPercentages("16:30:10"));
		Assert.assertEquals(3, machine.getPercentages("17:17:56"));
		Assert.assertEquals(3, machine.getPercentages("02:48:36"));
		Assert.assertEquals(99, machine.getPercentages("11:31:40"));
		Assert.assertEquals(3, machine.getPercentages("01:15:08"));
		Assert.assertEquals(1, machine.getPercentages("08:01:26"));
		Assert.assertEquals(1, machine.getPercentages("05:43:46"));
		Assert.assertEquals(49, machine.getPercentages("22:07:30"));
		Assert.assertEquals(1, machine.getPercentages("10:39:58"));
		Assert.assertEquals(1, machine.getPercentages("05:56:46"));
		Assert.assertEquals(1, machine.getPercentages("16:37:22"));
		Assert.assertEquals(1, machine.getPercentages("02:22:14"));
		Assert.assertEquals(4, machine.getPercentages("16:51:55"));
		Assert.assertEquals(3, machine.getPercentages("13:09:44"));
		Assert.assertEquals(4, machine.getPercentages("22:32:25"));
		Assert.assertEquals(1, machine.getPercentages("07:32:26"));
		Assert.assertEquals(3, machine.getPercentages("21:32:48"));
		Assert.assertEquals(3, machine.getPercentages("16:03:16"));
		Assert.assertEquals(1, machine.getPercentages("22:13:14"));
		Assert.assertEquals(3, machine.getPercentages("01:22:12"));
		Assert.assertEquals(1, machine.getPercentages("19:33:06"));
		Assert.assertEquals(99, machine.getPercentages("16:20:00"));
		Assert.assertEquals(4, machine.getPercentages("00:52:25"));
		Assert.assertEquals(99, machine.getPercentages("14:05:00"));
		Assert.assertEquals(19, machine.getPercentages("13:13:40"));
		Assert.assertEquals(24, machine.getPercentages("20:02:05"));
		Assert.assertEquals(4, machine.getPercentages("08:53:35"));
		Assert.assertEquals(1, machine.getPercentages("06:34:02"));
		Assert.assertEquals(3, machine.getPercentages("21:16:44"));
		Assert.assertEquals(1, machine.getPercentages("12:27:18"));
		Assert.assertEquals(19, machine.getPercentages("21:44:00"));
		Assert.assertEquals(4, machine.getPercentages("20:29:45"));
		Assert.assertEquals(1, machine.getPercentages("23:58:02"));
		Assert.assertEquals(1, machine.getPercentages("07:05:02"));
		Assert.assertEquals(1, machine.getPercentages("08:20:26"));
		Assert.assertEquals(1, machine.getPercentages("17:30:46"));
		Assert.assertEquals(3, machine.getPercentages("04:19:52"));
		Assert.assertEquals(9, machine.getPercentages("00:38:30"));
		Assert.assertEquals(1, machine.getPercentages("00:00:02"));
		Assert.assertEquals(49, machine.getPercentages("00:14:10"));
		Assert.assertEquals(1, machine.getPercentages("14:14:14"));
		Assert.assertEquals(0, machine.getPercentages("02:45:23"));
		Assert.assertEquals(3, machine.getPercentages("00:19:16"));
		Assert.assertEquals(99, machine.getPercentages("00:30:00"));
		Assert.assertEquals(1, machine.getPercentages("23:59:58"));
	}

	@Test
	public void testGetPercentages() {
		Assert.assertEquals(99, machine.getPercentages("00:30:00"));
		Assert.assertEquals(19, machine.getPercentages("00:28:00"));
		Assert.assertEquals(49, machine.getPercentages( "00:14:10" ));
		Assert.assertEquals(0, machine.getPercentages( "23:59:59" ));
	}
}
