package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Numerology;

public class NumerologyTest {
	Numerology numerology;
	
	@Before
	public void setUp() throws Exception {
		numerology = new Numerology();
	}

	@After
	public void tearDown() throws Exception {
		numerology = null;
	}

	@Test
	public void testGetMagicNumber() {
		Assert.assertEquals(3, numerology.getMagicNumber("Mandy Dean Thompson"));
		Assert.assertEquals(3, numerology.getMagicNumber("Nate Tina Tanner"));
		Assert.assertEquals(2, numerology.getMagicNumber("Paul Tim Brown"));
		Assert.assertEquals(6, numerology.getMagicNumber("Ralph Amber Black"));
		Assert.assertEquals(1, numerology.getMagicNumber("Bill Susan Burton"));
	}
	
	@Test
	public void testGetMagicNumberSystemTest() {
		Assert.assertEquals(2 	, numerology.getMagicNumber("Adria Andrew Whitley"));
		Assert.assertEquals(6 	, numerology.getMagicNumber("Angie Oliver Goldstein"));
		Assert.assertEquals(9 	, numerology.getMagicNumber("Daryl Sean Burton"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("Ike Karl Whitfield"));
		Assert.assertEquals(3 	, numerology.getMagicNumber("Zack Donna Penn"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("pAT"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("j"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("ADAD"));
		Assert.assertEquals(8 	, numerology.getMagicNumber("z"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("Bill Susan Burton"));
		Assert.assertEquals(2 	, numerology.getMagicNumber("zzzzzzzzzzzzzzzz"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("abcd"));
		Assert.assertEquals(5 	, numerology.getMagicNumber("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
		Assert.assertEquals(5 	, numerology.getMagicNumber("don schwarz"));
		Assert.assertEquals(1 	, numerology.getMagicNumber("aaaaaaaaaa"));
	}
}
