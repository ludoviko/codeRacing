package com.lam.coder.topCoder;

import com.lam.coder.topCoder.PiCalculator;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PiCalculatorTest {
	PiCalculator piCalculator;
	
	@Before
	public void setUp() throws Exception {
		piCalculator = new PiCalculator();
	}

	@After
	public void tearDown() throws Exception {
		piCalculator  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", piCalculator.calculate(2) , CoreMatchers.is("3.14"));
        Assert.assertThat("Should be the same.", piCalculator.calculate(4) , CoreMatchers.is("3.1416"));
        Assert.assertThat("Should be the same.", piCalculator.calculate(12) , CoreMatchers.is("3.141592653590"));
        Assert.assertThat("Should be the same.", piCalculator.calculate(1) , CoreMatchers.is("3.1"));
//        Assert.assertThat("Should be the same.", piCalculator.calculate() , CoreMatchers.is(""));
    }
}
