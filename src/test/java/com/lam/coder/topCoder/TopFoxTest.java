package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.TopFox;

public class TopFoxTest  {
	TopFox topFox;

	@Before
	public void setUp() throws Exception {
		topFox = new TopFox();
	}

	@After
	public void tearDown() throws Exception {
		topFox = null;
	}

	@Test
	public void testPossibleHandles() {
		Assert.assertEquals(4, topFox.possibleHandles("ab", "cd"));
		Assert.assertEquals(7, topFox.possibleHandles("abb", "bbc"));
		Assert.assertEquals(12, topFox.possibleHandles("fox", "ciel"));
		Assert.assertEquals(16, topFox.possibleHandles("abbbb", "bbbbbbbc"));
		Assert.assertEquals(21, topFox.possibleHandles("abxy", "xyxyxc"));
		Assert.assertEquals(68,
				topFox.possibleHandles("ababababab", "bababababa"));
	}

	@Test
	public void testPossibleHandlesSystemTest() {
		Assert.assertEquals(4, topFox.possibleHandles("ab", "cd"));
		Assert.assertEquals(7, topFox.possibleHandles("abb", "bbc"));
		Assert.assertEquals(12, topFox.possibleHandles("fox", "ciel"));
		Assert.assertEquals(16, topFox.possibleHandles("abbbb", "bbbbbbbc"));
		Assert.assertEquals(21, topFox.possibleHandles("abxy", "xyxyxc"));
		Assert.assertEquals(68,
				topFox.possibleHandles("ababababab", "bababababa"));
		Assert.assertEquals(29, topFox.possibleHandles("bba", "bbaabbbbba"));
		Assert.assertEquals(80,
				topFox.possibleHandles("cecebdceea", "dbbaccef"));
		Assert.assertEquals(32, topFox.possibleHandles("bcadbadaa", "aacd"));
		Assert.assertEquals(63, topFox.possibleHandles("ndanlhbaf", "hifbnml"));
		Assert.assertEquals(32, topFox.possibleHandles("ababacb", "ccccb"));
		Assert.assertEquals(40, topFox.possibleHandles("cbcbac", "bacbaba"));
		Assert.assertEquals(56, topFox.possibleHandles("mtskwilg", "ruabtek"));
		Assert.assertEquals(42, topFox.possibleHandles("abbaabb", "baaaaa"));
		Assert.assertEquals(21, topFox.possibleHandles("fjj", "njjhcak"));
		Assert.assertEquals(12, topFox.possibleHandles("ccca", "ade"));
		Assert.assertEquals(27, topFox.possibleHandles("qbrrlgmih", "ccm"));
		Assert.assertEquals(30, topFox.possibleHandles("dbbdbdbbbd", "dab"));
		Assert.assertEquals(20, topFox.possibleHandles("cbddbbcabc", "ab"));
		Assert.assertEquals(12, topFox.possibleHandles("ba", "cbbbbb"));
		Assert.assertEquals(19, topFox.possibleHandles("baabccaacc", "bb"));
		Assert.assertEquals(50, topFox.possibleHandles("adddc", "cabcbadcdd"));
		Assert.assertEquals(8, topFox.possibleHandles("ee", "mdfi"));
		Assert.assertEquals(12, topFox.possibleHandles("daacbc", "db"));
		Assert.assertEquals(42, topFox.possibleHandles("aaaaca", "bcbbbcb"));
		Assert.assertEquals(14, topFox.possibleHandles("aa", "cbcbcba"));
		Assert.assertEquals(64, topFox.possibleHandles("aaadbbe", "bbebbebebd"));
		Assert.assertEquals(64, topFox.possibleHandles("cabccbcc", "bccbccbaa"));
		Assert.assertEquals(49, topFox.possibleHandles("ldjemg", "emgemgeml"));
		Assert.assertEquals(56, topFox.possibleHandles("ddcbbbcaba", "bababa"));
		Assert.assertEquals(87,
				topFox.possibleHandles("fmbgeoana", "nananqgqad"));
		Assert.assertEquals(65, topFox.possibleHandles("cacabcb", "abcbabcbac"));
		Assert.assertEquals(75,
				topFox.possibleHandles("bfackmgh", "kmghkmghkj"));
		Assert.assertEquals(77,
				topFox.possibleHandles("fknprnkfil", "ililikfr"));
		Assert.assertEquals(77,
				topFox.possibleHandles("cjkmjsmgh", "mghmghmhc"));
		Assert.assertEquals(83,
				topFox.possibleHandles("ababbaaba", "abaabaabbb"));
		Assert.assertEquals(76,
				topFox.possibleHandles("baaabaacc", "accaccaca"));
		Assert.assertEquals(52,
				topFox.possibleHandles("aababbabbb", "bbbbbbbbba"));
		Assert.assertEquals(74,
				topFox.possibleHandles("bbabbabaa", "aaaaababab"));
		Assert.assertEquals(57, topFox.possibleHandles("leeckkkcbc", "bcbcbl"));
		Assert.assertEquals(57, topFox.possibleHandles("ccccccbcca", "cacacb"));
		Assert.assertEquals(87,
				topFox.possibleHandles("dkafiooln", "lnlnlfhgco"));
		Assert.assertEquals(72,
				topFox.possibleHandles("bcababaccb", "ccbccbcc"));
		Assert.assertEquals(61, topFox.possibleHandles("ebeaaaaf", "afafagee"));
		Assert.assertEquals(53, topFox.possibleHandles("bggeeb", "eebeebeeaf"));
		Assert.assertEquals(19,
				topFox.possibleHandles("aaaaaaaaaa", "aaaaaaaaaa"));
		Assert.assertEquals(15, topFox.possibleHandles("aaaaaaaa", "aaaaaaaa"));
		Assert.assertEquals(74,
				topFox.possibleHandles("aadcabbc", "bbcbbcbdbc"));
		Assert.assertEquals(24, topFox.possibleHandles("babb", "bbbbbaba"));
		Assert.assertEquals(67, topFox.possibleHandles("linktim", "imimitllqr"));
		Assert.assertEquals(33,
				topFox.possibleHandles("aaaaaaaaa", "aaaaaaacb"));
		Assert.assertEquals(53, topFox.possibleHandles("bcgnmhgk", "gkgkgfn"));
		Assert.assertEquals(62, topFox.possibleHandles("abbaaaaab", "aabaabaa"));
		Assert.assertEquals(51, topFox.possibleHandles("ccbddc", "ddcddcddcd"));
		Assert.assertEquals(77,
				topFox.possibleHandles("eeecdbad", "adadaaceca"));
		Assert.assertEquals(67, topFox.possibleHandles("ghkhdfk", "fkfkfjbckd"));
		Assert.assertEquals(5, topFox.possibleHandles("aaa", "aaa"));
		Assert.assertEquals(20, topFox.possibleHandles("aaaaaaaaaa", "bb"));
		Assert.assertEquals(39, topFox.possibleHandles("faohfuae", "eeafa"));
		Assert.assertEquals(4, topFox.possibleHandles("ji", "ro"));
		Assert.assertEquals(7, topFox.possibleHandles("aaa", "aab"));
	}
}
