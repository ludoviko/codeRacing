package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.FizzBuzz;

public class FizzBuzzTest {
	FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		this.fizzBuzz = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
		this.fizzBuzz  = null;
	}

	@Test(timeout = 10000)
	public void test() {
		Assert.assertEquals("1 2 F 4 B F 7 8 F B", this.fizzBuzz.find("3 5 10"));
		Assert.assertEquals("1 F 3 F 5 F B F 9 F 11 F 13 FB 15", this.fizzBuzz.find("2 7 15"));
	}
}
