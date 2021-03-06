package com.lam.coder.rosalind;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.rosalind.ComplementingDNA;

public class ComplementingDNATest {
	ComplementingDNA complementingDNA;
	
	@Before
	public void setUp() throws Exception {
		this.complementingDNA = new ComplementingDNA();
	}

	@After
	public void tearDown() throws Exception {
		this.complementingDNA  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("ACCGGGTTTT", this.complementingDNA.getComplement("AAAACCCGGT"));
         Assert.assertEquals("AATGTGAGAGACCTAGGGGAGGTTCCAGAGCTATGCTGAAGCTTCTGCTGTGTGGTCATCTGCACCTTAGATACGCTGACTGTTAGAACATCGAAAGGCGTGAGCGAAGGGGGACCAGAGTTGTGCGATGCTACCTGAGGCGAGAGTGGTATACTTGACTAGACTTTGTAAAACTATTCTTAAATGAGTGAGCACCACGAATTTACGTCGCGTGGTCTGATTGAAAAGATAACGACAGGTCATGTCCAGTCCTGCTCTAGTTCCTGCAGACTTCACGTCAGGGAGGCACATGCGGCAGGTTAGCATCTTTTTCTGGATGAACGGGTGCGCATTGCATAGAACGGCTGGCACATTCCGAGCGGTTCTGTCCCCATGGCTTACGCTCTACGCCTGCAGATTGTTACATCTATAAGCCGTGCCCTGAAGAACCGGATATCGTAGTTACCACCTTCTGGCTGGAACTAGAATGCGTGTGCCGTAGAGCATGTAAATCTCTCATGGATTGTGTCAACGTGGTAGCACGTTTGATTCATCACCGGGGTGCCTCTGTGAGATGGTGCCCCGAAGTTTGCCCCGGGCACGCGATCAACCCGGAGCAGCGCCTAAATTTGTTAAGTGAACTCGTTTAGTGAGTGAGATTTATATCAACACATTATTCTCGTAAGGGTCCGCTACTCAAAACCAAAGGTACGAGGGTAGCTAGAAACGTTATTTTTGTCCTCAAGTCTGTGGGACTTATTACGAAAGATCGTCAGTCAAGGGACTACACAATGGGCAGTCTTCCTTCAGAACTTCGGCGCCCACCATACTACTTAACCACCTTTACGGAGACACATTCGAGCGGGCGGGCACCATAACCCGGCGTGCTTACGGCGGCCGCAACGTTCCCGTCTCCTTCTAATGTGATCTCAACGTCGTACTGGCCTCCAGTTCTGATTGAAGCACGCCATGCTCCTCCAGT", this.complementingDNA.getComplement("ACTGGAGGAGCATGGCGTGCTTCAATCAGAACTGGAGGCCAGTACGACGTTGAGATCACATTAGAAGGAGACGGGAACGTTGCGGCCGCCGTAAGCACGCCGGGTTATGGTGCCCGCCCGCTCGAATGTGTCTCCGTAAAGGTGGTTAAGTAGTATGGTGGGCGCCGAAGTTCTGAAGGAAGACTGCCCATTGTGTAGTCCCTTGACTGACGATCTTTCGTAATAAGTCCCACAGACTTGAGGACAAAAATAACGTTTCTAGCTACCCTCGTACCTTTGGTTTTGAGTAGCGGACCCTTACGAGAATAATGTGTTGATATAAATCTCACTCACTAAACGAGTTCACTTAACAAATTTAGGCGCTGCTCCGGGTTGATCGCGTGCCCGGGGCAAACTTCGGGGCACCATCTCACAGAGGCACCCCGGTGATGAATCAAACGTGCTACCACGTTGACACAATCCATGAGAGATTTACATGCTCTACGGCACACGCATTCTAGTTCCAGCCAGAAGGTGGTAACTACGATATCCGGTTCTTCAGGGCACGGCTTATAGATGTAACAATCTGCAGGCGTAGAGCGTAAGCCATGGGGACAGAACCGCTCGGAATGTGCCAGCCGTTCTATGCAATGCGCACCCGTTCATCCAGAAAAAGATGCTAACCTGCCGCATGTGCCTCCCTGACGTGAAGTCTGCAGGAACTAGAGCAGGACTGGACATGACCTGTCGTTATCTTTTCAATCAGACCACGCGACGTAAATTCGTGGTGCTCACTCATTTAAGAATAGTTTTACAAAGTCTAGTCAAGTATACCACTCTCGCCTCAGGTAGCATCGCACAACTCTGGTCCCCCTTCGCTCACGCCTTTCGATGTTCTAACAGTCAGCGTATCTAAGGTGCAGATGACCACACAGCAGAAGCTTCAGCATAGCTCTGGAACCTCCCCTAGGTCTCTCACATT"));
//		Assert.assertEquals("", this.complementingDNA.getComplement(""));
	}
}
