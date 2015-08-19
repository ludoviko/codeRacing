package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.CCipher;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CCipherTest extends TestCase {
	private CCipher cipher;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		cipher = new CCipher();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		cipher = null;
	}

	@Test
	public void testDecode() {
		Assert.assertEquals("TOPCODER", cipher.decode("VQREQFGT", 2));
		Assert.assertEquals("QRSTUVWXYZABCDEFGHIJKLMNOP", cipher.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10));
		Assert.assertEquals("TOPCODER", cipher.decode("TOPCODER", 0));
		Assert.assertEquals("AXCHMA", cipher.decode("ZWBGLZ", 25 ));
		Assert.assertEquals("CAMOBAP", cipher.decode("DBNPCBQ", 1));
		Assert.assertEquals("HELLOWORLD", cipher.decode("LIPPSASVPH", 4));
	}

	@Test
	public void testSystem() {
		Assert.assertEquals("TOPCODER" ,cipher.decode( "VQREQFGT", 2 ));
		Assert.assertEquals("QRSTUVWXYZABCDEFGHIJKLMNOP" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10 ));
		Assert.assertEquals("TOPCODER" ,cipher.decode( "TOPCODER", 0 ));
		Assert.assertEquals("AXCHMA" ,cipher.decode( "ZWBGLZ", 25 ));
		Assert.assertEquals("CAMOBAP" ,cipher.decode( "DBNPCBQ", 1 ));
		Assert.assertEquals("MMMMMNNNNNOOOOOPPPPPQQQQQRRRRRSSSSSTTTTTUUUUUVVVVV" ,cipher.decode( "AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJ", 14 ));
		Assert.assertEquals("DDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJKKKKKLLLLLMMMMM" ,cipher.decode( "AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJ", 23 ));
		Assert.assertEquals("JJJJJKKKKKLLLLLMMMMMNNNNNOOOOOPPPPPQQQQQRRRRRSSSSS" ,cipher.decode( "AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJ", 17 ));
		Assert.assertEquals("WWWWWXXXXXYYYYYZZZZZAAAAABBBBBCCCCCDDDDDEEEEEFFFFF" ,cipher.decode( "AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJ", 4 ));
		Assert.assertEquals("LDUVQFCUYQYT" ,cipher.decode( "ASJKFURJNFNI", 15 ));
		Assert.assertEquals("HACMOPK" ,cipher.decode( "GZBLNOJ", 25 ));
		Assert.assertEquals("HELLOWORLD" ,cipher.decode( "LIPPSASVPH", 4 ));
		Assert.assertEquals("HELLOWORLDIAMHAPPY" ,cipher.decode( "LIPPSASVPHMEQLETTC", 4 ));
		Assert.assertEquals("XYZABCDEFGHIJKLMNOPQRSTUVW" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3 ));
		Assert.assertEquals("VWXYZABCDEFGHIJKLMNOPQRSTU" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5 ));
		Assert.assertEquals("UVWXYZABCDEFGHIJKLMNOPQRST" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 6 ));
		Assert.assertEquals("TUVWXYZABCDEFGHIJKLMNOPQRS" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 7 ));
		Assert.assertEquals("CDEFGHIJKLMNOPQRSTUVWXYZAB" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 24 ));
		Assert.assertEquals("DEFGHIJKLMNOPQRSTUVWXYZABC" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 23 ));
		Assert.assertEquals("EFGHIJKLMNOPQRSTUVWXYZABCD" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 22 ));
		Assert.assertEquals("XX" ,cipher.decode( "AA", 3 ));
		Assert.assertEquals("MABLBLTMXLM" ,cipher.decode( "THISISATEST", 7 ));
		Assert.assertEquals("BCD" ,cipher.decode( "ABC", 25 ));
		Assert.assertEquals("GSHFH" ,cipher.decode( "AMBZB", 20 ));
		Assert.assertEquals("IJKLMNOPQRSTUVWXYZABCDEFGH" ,cipher.decode( "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 18 ));
		Assert.assertEquals("X" ,cipher.decode( "A", 3 ));
		Assert.assertEquals("AXCHMA" ,cipher.decode( "ZWBGLZ", 25 ));
		Assert.assertEquals("QRSTKNOP" ,cipher.decode( "ABCDUXYZ", 10 ));
		Assert.assertEquals("HELLOWORLD" ,cipher.decode( "LIPPSASVPH", 4 ));
		Assert.assertEquals("QJUNRNKZY" ,cipher.decode( "HALEIEBQP", 17 ));
	}
}
