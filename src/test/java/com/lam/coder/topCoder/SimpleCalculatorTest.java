package com.lam.coder.topCoder;

import com.lam.coder.topCoder.SimpleCalculator;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {
	SimpleCalculator simpleCalculator;
	
	@Before
	public void setUp() throws Exception {
		simpleCalculator = new SimpleCalculator();
	}

	@After
	public void tearDown() throws Exception {
		simpleCalculator  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", simpleCalculator.calculate("5/3") , CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", simpleCalculator.calculate("15*3") , CoreMatchers.is(45));
        Assert.assertThat("Should be the same.", simpleCalculator.calculate("1-10000") , CoreMatchers.is(-9999));
        Assert.assertThat("Should be the same.", simpleCalculator.calculate("17+18") , CoreMatchers.is(35));
        Assert.assertThat("Should be the same.", simpleCalculator.calculate("0000000000000018/00000000000000000009") , CoreMatchers.is(2));
//        Assert.assertThat("Should be the same.", simpleCalculator.calculate() , CoreMatchers.is());
	}
}
