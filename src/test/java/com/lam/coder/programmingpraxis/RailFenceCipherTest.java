package com.lam.coder.programmingpraxis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.programmingpraxis.RailFenceCipher;

public class RailFenceCipherTest {

	RailFenceCipher rail;
	
	@Before
	public void setUp() throws Exception {
		rail = new RailFenceCipher();
	}

	@After
	public void tearDown() throws Exception {
		rail = null;
	}

	@Test
	public void testEncode() {
		Assert.assertEquals("WECRLTEERDSOEEFEAOCAIVDEN", rail.encode("WEAREDISCOVEREDFLEEATONCE", 3, 0));
		Assert.assertEquals("PMPRAM RSORIGAIGNX", rail.encode("PROGRAMMING PRAXIS", 4, 0));
		
		Assert.assertEquals("WLFBKTAFE O RAFSFSREA", rail.encode("WAFFLES FOR BREAKFAST", 3, 0));
		Assert.assertEquals("F  ASWFLSFRBEKATAEORF", rail.encode("WAFFLES FOR BREAKFAST", 3, 1));
		Assert.assertEquals("FSREAAFE O RAFSWLFBKT", rail.encode("WAFFLES FOR BREAKFAST", 3, 2));
		Assert.assertEquals("AEORFWFLSFRBEKATF  AS", rail.encode("WAFFLES FOR BREAKFAST", 3, 3));
		
		Assert.assertEquals("WLFBKTAFE O RAFSFSREA", rail.encode("WAFFLES FOR BREAKFAST", 3, 4));
		Assert.assertEquals("F  ASWFLSFRBEKATAEORF", rail.encode("WAFFLES FOR BREAKFAST", 3, 5));
		Assert.assertEquals("FSREAAFE O RAFSWLFBKT", rail.encode("WAFFLES FOR BREAKFAST", 3, 6));
		Assert.assertEquals("AEORFWFLSFRBEKATF  AS", rail.encode("WAFFLES FOR BREAKFAST", 3, 7));
		
		
		
//		Assert.assertEquals("", rail.encode("", 4));
//		Assert.assertEquals("", rail.encode("", 4));
	}

	@Test
	public void testDecode() {
	}
}
