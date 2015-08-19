package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.SpamDetector;

public class SpamDetectorTest {
	SpamDetector detector;
	
	@Before
	public void setUp() throws Exception {
		detector = new SpamDetector();
	}

	@After
	public void tearDown() throws Exception {
		detector = null;
	}

	@Test
	public void testCountKeywords() {
		Assert.assertEquals(4, detector.countKeywords("LoooW INTEREST RATES available dont BE slow", new String[] {"interest","rates","loan","available","LOW"}));
		Assert.assertEquals(2, detector.countKeywords("Dear Richard Get Rich Quick            no risk", new String[] {"rich","risk","Quicken","wealth","SAVE"}));
		Assert.assertEquals(0, detector.countKeywords("                                   ", new String[] {"empty","space","does","not","match"}));
		Assert.assertEquals(3, detector.countKeywords("in debbtt againn and aAgain and AGAaiIN", new String[] {"AGAIN","again","Again","again"}));
		Assert.assertEquals(3, detector.countKeywords("PlAyy ThEE Lottto     get Loottoo feever", new String[] {"play","lotto","lottery","looser"}));
	}
	
	@Test
	public void testMatchWords() {
		Assert.assertTrue(SpamDetector.wordMatch(null, null));
		Assert.assertTrue(SpamDetector.wordMatch(null, ""));
		Assert.assertTrue(SpamDetector.wordMatch("", null));
		Assert.assertTrue(SpamDetector.wordMatch("", ""));
		Assert.assertTrue(SpamDetector.wordMatch("lotto", "lotto"));
		Assert.assertTrue(SpamDetector.wordMatch("man", "man"));
		Assert.assertFalse(SpamDetector.wordMatch("true", "false"));
		Assert.assertFalse(SpamDetector.wordMatch("false", "fan"));
		Assert.assertTrue(SpamDetector.wordMatch("lotto", "lottto"));
		Assert.assertTrue(SpamDetector.wordMatch("lotto", "loottoo"));
		Assert.assertTrue(SpamDetector.wordMatch("lotto", "lllllllllloooooottttttoooooooooo"));
		Assert.assertFalse(SpamDetector.wordMatch("lotto", "ooolllllllllloooooottttttoooooooooolll"));
		Assert.assertFalse(SpamDetector.wordMatch("lottto", "lotto"));
		Assert.assertFalse(SpamDetector.wordMatch("loottoo", "lotto"));
		Assert.assertFalse(SpamDetector.wordMatch("lotto", ""));
		Assert.assertFalse(SpamDetector.wordMatch("", "lotto"));
		Assert.assertFalse(SpamDetector.wordMatch("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ab"));
		Assert.assertFalse(SpamDetector.wordMatch("ab", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}

	@Test
	public void matchWordsSystemTesy() {
		Assert.assertEquals(0, detector.countKeywords("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new String[] { "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab"}));
		Assert.assertEquals(4, detector.countKeywords("LoooW INTEREST RATES available dont BE slow", new String[] { "interest", "rates", "loan", "available", "LOW"}));
		Assert.assertEquals(2, detector.countKeywords("Dear Richard Get Rich Quick no risk", new String[] { "rich", "risk", "Quicken", "wealth", "SAVE"}));
		Assert.assertEquals(25, detector.countKeywords("a a a a a a a a a a a a a a a a a a a a a a a a a", new String[] { "aa", "b", "c", "d", "e", "f", "g", "a"}));
		Assert.assertEquals(3, detector.countKeywords("in debbtt againn and aAgain and AGAaiIN", new String[] { "AGAIN", "again", "Again", "again"}));
		Assert.assertEquals(3, detector.countKeywords("PlAyy ThEE Lottto get Loottoo feever", new String[] { "play", "lotto", "lottery", "looser"}));
		Assert.assertEquals(4, detector.countKeywords("aabb aaabb abb aab ab bbaaa aab", new String[] { "aab"}));
		Assert.assertEquals(7, detector.countKeywords("abc aabc abbc abcc aabbc abbcc aabcc", new String[] { "abc"}));
		Assert.assertEquals(2, detector.countKeywords("AAAAaaaaaaaaAAAAAAAbbbbbbccccc AAAAAbccc", new String[] { "abc"}));
		Assert.assertEquals(0, detector.countKeywords(" ", new String[] { "empty", "space", "does", "not", "match"}));
		Assert.assertEquals(1, detector.countKeywords("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", new String[] { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "ab"}));
		Assert.assertEquals(0, detector.countKeywords("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", new String[] { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "b"}));
		Assert.assertEquals(3, detector.countKeywords("aaaaab abbbbb aaaabbbb ab", new String[] { "aab", "aBB"}));
		Assert.assertEquals(1, detector.countKeywords("oooooooooooooooooooooooGooooooooooooooooooooooo", new String[] { "ogo"}));
		Assert.assertEquals(0, detector.countKeywords("OgO", new String[] { "OOgOO"}));
		Assert.assertEquals(1, detector.countKeywords("AAABBBCCCDDDEEEFFFGGGHHHIIIJJKKLLMMNNOOP", new String[] { "aabbccddeeffgghhiijjkkllmmnnoopp", "aabbccddeeffgghhiijjkkllmmnnoop"}));
//		Assert.assertEquals(0, detector.countKeywords("AAABBBCCCDDDEEEFFFGGGHHHIIIJJKKLLMMNNOOP", new String[] { "aabbccddeeffgghhiijjkkllmmnnoopp"}));
		Assert.assertEquals(1, detector.countKeywords("ffghiijkklmmnnopqqrsttt lmnno pppp", new String[] { "abcdefghijklmn", "abcdefgh", "lmmnno", "pp"}));
		Assert.assertEquals(2, detector.countKeywords("no loosers at losers slots", new String[] { "losers"}));
		Assert.assertEquals(5, detector.countKeywords("ded deed dded ddeedd dedd deedd ddeed deeed deeded", new String[] { "Deed"}));
		Assert.assertEquals(0, detector.countKeywords("", new String[] { "nothing", "nada", "zip", "nil", "squat", "vaccuum"}));
		Assert.assertEquals(1, detector.countKeywords("Z", new String[] { "a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Z"}));
		Assert.assertEquals(24, detector.countKeywords("z y x w v u t s r q p o n m l k j i h g f e d c b", new String[] { "a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Z"}));
		Assert.assertEquals(11, detector.countKeywords("zz bbb ddd lll kkkkk qq rrr pppp uu n mmm i", new String[] { "a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "nn", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Z"}));
		Assert.assertEquals(2, detector.countKeywords("to b or not to b", new String[] { "a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Z"}));
		Assert.assertEquals(4, detector.countKeywords("Ben said is am are was were be being been bee", new String[] { "ben", "be"}));
		Assert.assertEquals(0, detector.countKeywords("it is unlikely to match if there are no keywords", new String[] { }));
		Assert.assertEquals(2, detector.countKeywords("Dear Richard Get Rich Quick no risk", new String[] { "rich", "risk", "Quicken", "wealth", "SAVE"}));
		Assert.assertEquals(1, detector.countKeywords("a", new String[] { "a", "a"}));
		Assert.assertEquals(0, detector.countKeywords("todo", new String[] { "ttodo"}));
		Assert.assertEquals(1, detector.countKeywords("aabbcc", new String[] { "aABBCC"}));
		Assert.assertEquals(1, detector.countKeywords("aabb", new String[] { "aab"}));
		Assert.assertEquals(0, detector.countKeywords("abcddd", new String[] { "abc"}));
		Assert.assertEquals(1, detector.countKeywords("qw qqw", new String[] { "qqw", "qqw"}));
		Assert.assertEquals(0, detector.countKeywords("helo", new String[] { "hello"}));
		Assert.assertEquals(0, detector.countKeywords("lo", new String[] { "loo"}));
		Assert.assertEquals(3, detector.countKeywords("again againn aagain", new String[] { "AGAIN", "again", "aGain", "Again"}));
		Assert.assertEquals(0, detector.countKeywords("aa", new String[] { "ba"}));
		Assert.assertEquals(5, detector.countKeywords(" cooooool abcdFGHI abb cc dd ee ff gg hh ii jj", new String[] { "cl", "abcdefgh", "ab", "c", "d", "ii", "j"}));
		Assert.assertEquals(0, detector.countKeywords("ba", new String[] { "bab"}));
		Assert.assertEquals(0, detector.countKeywords("plaaaaya", new String[] { "plaay"}));
		Assert.assertEquals(0, detector.countKeywords("fo", new String[] { "foo"}));
		Assert.assertEquals(1, detector.countKeywords("lowwwww", new String[] { "low"}));
		Assert.assertEquals(1, detector.countKeywords("aaab", new String[] { "aab"}));
		Assert.assertEquals(0, detector.countKeywords("boird", new String[] { "bird"}));
		Assert.assertEquals(3, detector.countKeywords("misssissippi mississsippi mississipppi misisipi", new String[] { "mississippi"}));
		Assert.assertEquals(0, detector.countKeywords("a", new String[] { "aa"}));
	}
}
