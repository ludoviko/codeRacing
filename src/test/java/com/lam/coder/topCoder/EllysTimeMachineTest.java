package com.lam.coder.topCoder;

import com.lam.coder.topCoder.EllysTimeMachine;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EllysTimeMachineTest {
	EllysTimeMachine ellysTimeMachine;
	
	@Before
	public void setUp() throws Exception {
		ellysTimeMachine = new EllysTimeMachine();
	}

	@After
	public void tearDown() throws Exception {
		ellysTimeMachine  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime("11:20") , CoreMatchers.is("04:55"));
        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime("02:25") , CoreMatchers.is("05:10"));
        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime("06:30") , CoreMatchers.is("06:30"));
        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime("05:55") , CoreMatchers.is("11:25"));
        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime("03:45") , CoreMatchers.is("09:15"));
        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime("01:00") , CoreMatchers.is("12:05"));
//        Assert.assertThat("Should be the same.", ellysTimeMachine.getTime() , CoreMatchers.is());
	}
}
