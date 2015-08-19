package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Vigenere;

public class VigenereTest {
	Vigenere vigenere;
	
	@Before
	public void setUp() throws Exception {
		vigenere = new Vigenere();
	}

	@After
	public void tearDown() throws Exception {
		vigenere = null;
	}

	@Test
	public void testCode() {
		 Assert.assertEquals("VCSGQRHVKGJVGOW", vigenere.coder("TOPCODERISGREAT", "CODE", Vigenere.ENCODE)); 
		 Assert.assertEquals("HRWCQYRORWSCGKUO", vigenere.coder("THISCODEDMESSAGE", "OK", Vigenere.ENCODE)); 
	}

	@Test
	public void testDecode() {
		 Assert.assertEquals("TOPCODERISGREAT", vigenere.coder("VCSGQRHVKGJVGOW", "CODE", Vigenere.DECODE)); 
		 Assert.assertEquals("THISCODEDMESSAGE", vigenere.coder("HRWCQYRORWSCGKUO", "OK", Vigenere.DECODE)); 
	}

	@Test
	public void testValidationCapitalization() {
		Assert.assertEquals(Vigenere.ERROR, vigenere.coder("VCSGQRHVKGJVGOW", "code", Vigenere.DECODE)); 
		Assert.assertEquals(Vigenere.ERROR, vigenere.coder("abbc", "CODE", Vigenere.DECODE)); 
		Assert.assertEquals(Vigenere.ERROR, vigenere.coder("vcsg", "code", Vigenere.DECODE)); 
	}

	@Test
	public void testValidationSwitch() {
		 Assert.assertEquals(Vigenere.ERROR, vigenere.coder("VCSGQRHVKGJVGOW", "CODE", -1)); 
		 Assert.assertEquals(Vigenere.ERROR, vigenere.coder("VCSGQRHVKGJVGOW", "CODE", 4)); 
	}

	@Test
	public void testValidationMessageIsEmpty() {
		 Assert.assertEquals("", vigenere.coder("", "CODE", Vigenere.ENCODE)); 
		 Assert.assertEquals("", vigenere.coder("", "OK", Vigenere.ENCODE)); 
	}

	@Test
	public void testValidationCodeWordIsEmpty() {
		 Assert.assertEquals(Vigenere.ERROR, vigenere.coder("VCSGQRHVKGJVGOW", "", Vigenere.DECODE)); 
		 Assert.assertEquals(Vigenere.ERROR, vigenere.coder("HRWCQYRORWSCGKUO", "", Vigenere.DECODE)); 
	}
	
	@Test
	public void systemTest() {
		 Assert.assertEquals(Vigenere.ERROR, vigenere.coder("THISSHOULDGIVEANERROr", "WRONG", Vigenere.ENCODE)); 
		 Assert.assertEquals("WSWLBUOLQWLANMXAGKS", vigenere.coder("DOESTHISMESSAGEWORK", "TESTING", Vigenere.ENCODE)); 
		 Assert.assertEquals("YYYY", vigenere.coder("ZZZZ", "Z", Vigenere.ENCODE)); 

		 Assert.assertEquals("DOESTHISMESSAGEWORK", vigenere.coder("WSWLBUOLQWLANMXAGKS", "TESTING", Vigenere.DECODE)); 
		 Assert.assertEquals("DOESTHISMESSAGEWORK", vigenere.coder("WSWLBUOLQWLANMXAGKS", "TESTING", Vigenere.DECODE)); 
		 Assert.assertEquals("NODECODE", vigenere.coder("NODECODE", "A", Vigenere.DECODE)); 
	}
}
