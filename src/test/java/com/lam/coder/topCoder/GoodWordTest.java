package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.GoodWord;

public class GoodWordTest {
    GoodWord word;
	
	@Before
	public void setUp() throws Exception {
		word = new GoodWord();
	}

	@After
	public void tearDown() throws Exception {
		word = null;
	}

	@Test
	public void testIsValidTrue() {
		Assert.assertTrue(word.isValid(""));
		Assert.assertTrue(word.isValid( "H" ));
		Assert.assertTrue(word.isValid("Aabb" ));
		Assert.assertTrue(word.isValid("Ih"));
		Assert.assertTrue(word.isValid("Hih"));
		Assert.assertTrue(word.isValid("Baaaiedddffaigg"));
		Assert.assertTrue(word.isValid("H"));
		Assert.assertTrue(word.isValid("Aeioubxxxyaceeiddd"));
		Assert.assertTrue(word.isValid("It" ));
		Assert.assertTrue(word.isValid("Ab" ));
		Assert.assertTrue(word.isValid("Uihhih" ));
	}

	@Test
	public void testIsValidFalse() {
		Assert.assertFalse(word.isValid("IH"));
		Assert.assertFalse(word.isValid("IHh"));
		Assert.assertFalse(word.isValid("ih"));
		Assert.assertFalse(word.isValid("Hihh"));
		Assert.assertFalse(word.isValid("Hi"));
		Assert.assertFalse(word.isValid("i"));
		Assert.assertFalse(word.isValid("AeioDddd"));
		Assert.assertFalse(word.isValid("Oraadveiocccc"));
		Assert.assertFalse(word.isValid("Hia"));
		Assert.assertFalse(word.isValid("AAbb"));
		Assert.assertFalse(word.isValid("HAhaaahhh"));
		Assert.assertFalse(word.isValid("BbBb"));
		Assert.assertFalse(word.isValid("AAbb"));
		Assert.assertFalse(word.isValid("Abb"));
		Assert.assertFalse(word.isValid("hhih"));
		Assert.assertFalse(word.isValid("Uux"));
		Assert.assertFalse(word.isValid("HaB"));
		Assert.assertFalse(word.isValid("Aab"));
		Assert.assertFalse(word.isValid("A"));
		Assert.assertFalse(word.isValid("A"));
		Assert.assertFalse(word.isValid("Core"));
		Assert.assertFalse(word.isValid("A"));
		Assert.assertFalse(word.isValid("E"));
		Assert.assertFalse(word.isValid("Aaj"));
		Assert.assertFalse(word.isValid("AABB"));
		Assert.assertFalse(word.isValid("HiH"));
		Assert.assertFalse(word.isValid("HiH"));
		Assert.assertFalse(word.isValid("Abb"));
	}
}
