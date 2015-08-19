package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.InsomniaCure;

public class InsomniaCureTest {
	InsomniaCure insomniaCure;
	
	@Before
	public void setUp() throws Exception {
		this.insomniaCure = new InsomniaCure();
	}

	@After
	public void tearDown() throws Exception {
		this.insomniaCure  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(17, this.insomniaCure.find(2, 3, 4, 5, 24));
		Assert.assertEquals(12, this.insomniaCure.find(1, 2, 3, 4, 12));
		Assert.assertEquals(59392, this.insomniaCure.find(8, 4, 1, 10, 59392));
		Assert.assertEquals(0, this.insomniaCure.find(10, 9, 8, 7, 6));
		
		Assert.assertEquals(35246, this.insomniaCure.find(2, 7, 4, 9, 56937));
	}
}
