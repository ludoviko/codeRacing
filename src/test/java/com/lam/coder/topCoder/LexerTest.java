package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Lexer;

import junit.framework.TestCase;


public class LexerTest extends TestCase {
	Lexer lexer;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		lexer = new Lexer();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		lexer = null;
	}

	@Test
	public void testTokenize() {
		Assert.assertArrayEquals(new String[] { "aba", "A", "ab" }, 
				lexer.tokenize(new String[] {"ab","aba","A"}, "ababbbaAab"));
		Assert.assertArrayEquals(new String[] 		{ "aaaaa",
				  "aaaaa",
				  "aaaaa",
				  "aaaaa",
				  "aaaaa" }, 
				  lexer.tokenize(new String[] {"a","a","aa","aaa","aaaa","aaaaa","aa"}, 
				"aaaaaaaaaaaaaaaaaaaaaaaaa"));
		Assert.assertArrayEquals(new String[] 		 { "int",
				  "long",
				  "double",
				  "char",
				  "int",
				  "int",
				  "boolean" }
, lexer.tokenize(new String[] {"int","double","long","char","boolean","byte","float"},
				"intlongdoublecharintintboolean"));
		
		Assert.assertArrayEquals(new String[] {}, lexer.tokenize(new String[] {}, "Great"));
		Assert.assertArrayEquals(new String[] { "dEfG",  "AbCd",  "GhIj" }, 
				lexer.tokenize(new String[] {"AbCd","dEfG","GhIj"}, 
				"abCdEfGhIjAbCdEfGhIj"));
	}

	@Test
	public void testTokenizeComplex() {
		Assert.assertArrayEquals(new String[] { "wo",  "w",  "wo",  "w",   "wow",   "wow",  "w", 
		"wo" }, 
		lexer.tokenize(new String[] {"wow","wo","w"}, "awofwwofowwowowowwwooo"));
	}

	

}
