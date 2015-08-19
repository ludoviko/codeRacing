package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.StringCompressor;

public class StringCompressorTest {
	StringCompressor compressor;
	
	@Before
	public void setUp() throws Exception {
		compressor = new StringCompressor();
	}

	@After
	public void tearDown() throws Exception {
		compressor = null;
	}

	@Test
	public void testCompress() {
		Assert.assertEquals("4A4BC6D", compressor.compress("AAAABBBBCDDDDDD"));
		Assert.assertEquals("11Af", compressor.compress("AAAAAAAAAAAf"));
		Assert.assertEquals("FA", compressor.compress("FA"));
		Assert.assertEquals("SDFJa4A4a2s", compressor.compress("SDFJaAAAAaaaass"));
	}
	@Test
	public void testCompressSystemTest() {
		Assert.assertEquals("", compressor.compress(""));
		Assert.assertEquals("abcAbC", compressor.compress("abcAbC"));
		Assert.assertEquals("2a2Ada3d", compressor.compress("aaAAdaddd"));
		Assert.assertEquals("abcd2a4c", compressor.compress("abcdaacccc"));
		Assert.assertEquals("z11x2z", compressor.compress("zxxxxxxxxxxxzz"));
//		Assert.assertEquals(, compressor.compress());
	}
}
