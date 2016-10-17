package com.lam.coder.topCoder;

import com.lam.coder.topCoder.CalcTest;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTestTest {
	CalcTest calcTest;
	
	@Before
	public void setUp() throws Exception {
		calcTest = new CalcTest();
	}

	@After
	public void tearDown() throws Exception {
		calcTest  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", calcTest.uniform(new String[] {"1.5", "2$ 3", "12 3"} ) , CoreMatchers.is(new String[] {"1.5", "2.3", "123" } ));
        Assert.assertThat("Should be the same.", calcTest.uniform(new String[]  {",5", "3,", ".5", "3.", "000,000", "000 000"} ) ,
                CoreMatchers.is(new String[] {".5", "3.", ".5", "3.", "000.000", "000000" } ));
        Assert.assertThat("Should be the same.", calcTest.uniform(new String[] {"263C45233 ", " 2364A56", "B273664"}  ) , CoreMatchers.is(new String[] {"263.45233", "2364.56", ".273664" }  ));
//        Assert.assertThat("Should be the same.", calcTest.uniform(new String[]  ) , CoreMatchers.is(new String[]  ));
	}
}
