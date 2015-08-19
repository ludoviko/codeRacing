package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.VowelLatin;

public class VowelLatinTest {
	VowelLatin vowelLatin;

	@Before
	public void setUp() throws Exception {
		vowelLatin = new VowelLatin(); 
	}

	@After
	public void tearDown() throws Exception {
		vowelLatin = null;
	}

	@Test
	public void testTranslate() {
		Assert.assertEquals("aeiou", vowelLatin.translate("aeiou"));
		Assert.assertEquals("xyz", vowelLatin.translate("xyz"));
		Assert.assertEquals("hrsoe", vowelLatin.translate("horse"));
		Assert.assertEquals("crcsaaa", vowelLatin.translate("caracas"));
		Assert.assertEquals("vwloe", vowelLatin.translate("vowel"));
		Assert.assertEquals("bcdfghaei", vowelLatin.translate("abcdefghi"));
		Assert.assertEquals("XYz", vowelLatin.translate("XYz"));
		Assert.assertEquals("pplctnaiaio", vowelLatin.translate("application"));
		Assert.assertEquals("qwcvb", vowelLatin.translate("qwcvb"));
		Assert.assertEquals("aeioOa", vowelLatin.translate("aeioOa"));
	}
	
	@Test
	public void testTranslateSystemTest() {
		Assert.assertEquals("XYz", vowelLatin.translate("XYz"));
		Assert.assertEquals("pplctnaiaio", vowelLatin.translate("application"));
		Assert.assertEquals("qwcvb", vowelLatin.translate("qwcvb"));
		Assert.assertEquals("aeioOa", vowelLatin.translate("aeioOa"));
		Assert.assertEquals("i", vowelLatin.translate("i"));
		Assert.assertEquals("Y", vowelLatin.translate("Y"));
		Assert.assertEquals("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXaeiouAEIOU", vowelLatin.translate("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX"));
		Assert.assertEquals("vvaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA", vowelLatin.translate("aAaAaAaAaAaAaAaAaAaAaAaAavAvaAaAaAaAaAaAaAaAaAaAaA"));
		Assert.assertEquals("ntrdctnIouio", vowelLatin.translate("Introduction"));
		Assert.assertEquals("gPytnLyiaaia", vowelLatin.translate("igPayatinLay"));
		Assert.assertEquals("bcdfghjklmnaeIou", vowelLatin.translate("aeIoubcdfghjklmn"));
		Assert.assertEquals("Xa", vowelLatin.translate("aX"));
		Assert.assertEquals("xrYa", vowelLatin.translate("xraY"));
		Assert.assertEquals("ntrntnlztnieaioaiaio", vowelLatin.translate("internationalization"));
		Assert.assertEquals("scRTeE", vowelLatin.translate("secRET"));
		Assert.assertEquals("ybb", vowelLatin.translate("ybb"));
		Assert.assertEquals("ca", vowelLatin.translate("ac"));
		Assert.assertEquals("bA", vowelLatin.translate("Ab"));
		Assert.assertEquals("sssdsaiauuu", vowelLatin.translate("asiasuuusds"));
		Assert.assertEquals("nnkmknuaUUuu", vowelLatin.translate("nunaUUkuumkn"));
		Assert.assertEquals("HLOA", vowelLatin.translate("HOLA"));
		Assert.assertEquals("aeiouaeioaeioauaeuoiiiii", vowelLatin.translate("aeiouaeioaeioauaeuoiiiii"));
	}

}
