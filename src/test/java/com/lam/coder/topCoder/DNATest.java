package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.DNA;

public class DNATest {
	DNA dna;
	
	@Before
	public void setUp() throws Exception {
		dna = new DNA();
	}

	@After
	public void tearDown() throws Exception {
		dna = null;
	}

	@Test
	public void testGetComplement() {
		Assert.assertEquals("CTTTGA", dna.getComplement("GAAACT"));
		Assert.assertEquals("TGGTTTTCGACGTCATACT", dna.getComplement("ACCAAAAGCTGCAGTATGA"));
		Assert.assertEquals("ATCCAGAGTGAATCGAAAGCAGGGATATCATATATCGAGGGTTGGTAGGT", dna.getComplement("TAGGTCTCACTTAGCTTTCGTCCCTATAGTATATAGCTCCCAACCATCCA"));
	}

	@Test
	public void testGetComplementSystemTest() {
		Assert.assertEquals("ATCG", dna.getComplement("TAGC"));
		Assert.assertEquals("TTTTTTTTA", dna.getComplement("AAAAAAAAT"));
		Assert.assertEquals("CCAA", dna.getComplement("GGTT"));
		Assert.assertEquals("TGTG", dna.getComplement("ACAC"));
		Assert.assertEquals("ATC", dna.getComplement("TAG"));
		Assert.assertEquals("AT", dna.getComplement("TA"));
	}
}
