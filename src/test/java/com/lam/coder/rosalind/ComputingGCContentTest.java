package com.lam.coder.rosalind;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.rosalind.ComputingGCContent;

public class ComputingGCContentTest {
	ComputingGCContent computingGCContent;
	
	@Before
	public void setUp() throws Exception {
		this.computingGCContent = new ComputingGCContent();
	}

	@After
	public void tearDown() throws Exception {
		this.computingGCContent  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("60.919540", this.computingGCContent.find("CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGACTGGGAACCTGCGGGCAGTAGGTGGAAT").toString());
//		Assert.assertEquals("", computingGCContent.);
//		Assert.assertArrayEquals(new int[] {}, computingGCContent.);
//		Assert.assertArrayEquals(new String[] {}, computingGCContent.);
	}
}
