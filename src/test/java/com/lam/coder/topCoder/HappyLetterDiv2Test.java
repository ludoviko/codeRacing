package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.HappyLetterDiv2;

public class HappyLetterDiv2Test {
	HappyLetterDiv2 happyLetterDiv2;

	@Before
	public void setUp() throws Exception {
		happyLetterDiv2 = new HappyLetterDiv2();
	}

	@After
	public void tearDown() throws Exception {
		happyLetterDiv2 = null;
	}

	@Test
	public void testGetHappyLetter() {
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aacaaa"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER,
				happyLetterDiv2.getHappyLetter("dcdjx"));
		Assert.assertEquals('b', happyLetterDiv2.getHappyLetter("bcbbbbba"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER,
				happyLetterDiv2.getHappyLetter("aabc"));
	}

	@Test
	public void testGetHappyLetterSystemTest() {
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aacaaa"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("dcdjx"));
		Assert.assertEquals('b', happyLetterDiv2.getHappyLetter("bcbbbbba"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aabc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("wc"));
		Assert.assertEquals('v', happyLetterDiv2.getHappyLetter("vv"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("mnaa"));
		Assert.assertEquals('r', happyLetterDiv2.getHappyLetter("rrrr"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("kkpppx"));
		Assert.assertEquals('i', happyLetterDiv2.getHappyLetter("iiiiii"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("wwdjdjdj"));
		Assert.assertEquals('z', happyLetterDiv2.getHappyLetter("zzzzbzzz"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("dkgjdnkjkg"));
		Assert.assertEquals('d', happyLetterDiv2.getHappyLetter("ddvdddvddd"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("hghmzhhhzghg"));
		Assert.assertEquals('p', happyLetterDiv2.getHappyLetter("ppprppppppuw"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("hllkchlqhklltt"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("maaaaaacmaaaac"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("qqbqqqhiqwqhqhah"));
		Assert.assertEquals('j', happyLetterDiv2.getHappyLetter("jjjhhjhjjjvhjjjj"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("bfbfprrpbsbbbpbpbb"));
		Assert.assertEquals('v', happyLetterDiv2.getHappyLetter("tivvvovvovvvvvvtvv"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("jkznyyyzjzyzzzpzzkkk"));
		Assert.assertEquals('y', happyLetterDiv2.getHappyLetter("syfyrysydyyyyyyyygyy"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("eenbeeenenenbnnneeibbn"));
		Assert.assertEquals('g', happyLetterDiv2.getHappyLetter("fgpwgpggfpfgpfgggpgggg"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("ivddiddvivdbiiidiiddiiii"));
		Assert.assertEquals('r', happyLetterDiv2.getHappyLetter("jhrrrjjrjjrrjhrrrrjrjrrr"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("rkhrllllrrlhrhdhhhhhhrlhhr"));
		Assert.assertEquals('o', happyLetterDiv2.getHappyLetter("oyyyoowoooofwjoooooffyyooo"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("ttwwtuuuwwtttwttttwtwuwtuttu"));
		Assert.assertEquals('l', happyLetterDiv2.getHappyLetter("lrlllllllvrrvllwlwwrlrlvrlll"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("xyxxwzxyyyxybxxwxyxxbxsyxbyxbs"));
		Assert.assertEquals('q', happyLetterDiv2.getHappyLetter("qqqqqeqqueqqueuqqqqlqquqqqeeuq"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("pooopoupppppououooooooppupypppoo"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("dddaadadaaaddddaadaaaadadaaaaada"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("uuddguuuuuuugdaagaduagguuuguugugug"));
		Assert.assertEquals('y', happyLetterDiv2.getHappyLetter("wyhheyyhyeiyyyyyhyyyyyhhyeyheyeehy"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("rqhrqhrqhrhrhhhhrqhhhqqhqhhhqqqqqhqh"));
		Assert.assertEquals('x', happyLetterDiv2.getHappyLetter("xxrxxxahxxxxaanxxhxxxhhnaxxxxeaxhxxx"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("bbonoooobobbnoobobooboobbobbbbooobobbo"));
		Assert.assertEquals('w', happyLetterDiv2.getHappyLetter("tktkwwttwwtwttwttwwwwwtwtwwwwwwttwttww"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("jjeejycjyjeccejejjyjeoewejjeejejwjejyjce"));
		Assert.assertEquals('s', happyLetterDiv2.getHappyLetter("kssslssssslkssslsssskllklsklssssslkslssl"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("jyjjkjjkjjykkkkyjyjkkkyjkykyjjkkjkjykkxjjk"));
		Assert.assertEquals('u', happyLetterDiv2.getHappyLetter("kuuukuuuuuukkkkuukukukuuuuukkuukkkkkuukuuk"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("crlgrrgrgrcgrgrrrcrrgdgcglrggrchgrdrrrrrgrgr"));
		Assert.assertEquals('o', happyLetterDiv2.getHappyLetter("aoaooaaoohoaaoaoooooohaohoaoaooooooaaoooaoah"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("vvvvvvlvllvlvvvlllvlvtsgllllsvllvgvlggvslvllvs"));
		Assert.assertEquals('d', happyLetterDiv2.getHappyLetter("ddddkkdkddkddkkkkddkdkddkdkkkkdddddkdkddddddkk"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("ovcoocvoocujovovccooocccooocucccoooccoccocococco"));
		Assert.assertEquals('u', happyLetterDiv2.getHappyLetter("uuppupupuuuppppuuupuuupuuuqpuuuuuupppuppppuuupup"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("pmpmpm"));
		Assert.assertEquals('z', happyLetterDiv2.getHappyLetter("aaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzz"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aabbcc"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aacaa"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaaaaab"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaabb"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaaaaahyhahhytaaratyuiiiaaikjhaahttaghyjaajuiokbvf"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaab"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("abcdd"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaaabbcc"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("a"));
		Assert.assertEquals('z', happyLetterDiv2.getHappyLetter("zzasfacasdfadagzzzzzzzzzzzzzzzzzzzzzzzzzz"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aa"));
		Assert.assertEquals('z', happyLetterDiv2.getHappyLetter("zzzzza"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaabc"));
		Assert.assertEquals('c', happyLetterDiv2.getHappyLetter("cbcbcacdcecfcgchcicocpcqcwcdcscdcvcbcmczcacocuchc"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaaxe"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaaabbb"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("abcc"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaaabb"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aac"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaaaabbcc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaaabbbbx"));
		Assert.assertEquals('d', happyLetterDiv2.getHappyLetter("dcdddddjxxd"));
		Assert.assertEquals('d', happyLetterDiv2.getHappyLetter("abcdddd"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaabbbbccc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaaaabbbbb"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaabbbc"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aab"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaaaaaaabbbbccccdddd"));
		Assert.assertEquals('c', happyLetterDiv2.getHappyLetter("abccc"));
		Assert.assertEquals('z', happyLetterDiv2.getHappyLetter("aabzzzzz"));
		Assert.assertEquals('d', happyLetterDiv2.getHappyLetter("bbccdddddd"));
		Assert.assertEquals('b', happyLetterDiv2.getHappyLetter("bab"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aabbcccc"));
		Assert.assertEquals('a', happyLetterDiv2.getHappyLetter("aaa"));
		Assert.assertEquals('z', happyLetterDiv2.getHappyLetter("zzzzz"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("bacc"));
		Assert.assertEquals('b', happyLetterDiv2.getHappyLetter("bbbbaaa"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("acbb"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("fdcbfcdffgcsfdfggngffgfggffgjkjkjbbnmbvdfddfffghg"));
		Assert.assertEquals('b', happyLetterDiv2.getHappyLetter("abb"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aabccc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("abcdefghijklmnopqrstuvwxyzxwvutsrqponmlkjihgfedcba"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("babaabababababababababbbabacccccccdddddddcccbababa"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("bbccccdddd"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaaaabbbbbccccc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aaabbbcc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aabb"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("abababbbaaaaacccc"));
		Assert.assertEquals(HappyLetterDiv2.NO_LEADER, happyLetterDiv2.getHappyLetter("aabbccddeeffgghhiijjkkllmmnnooppqq"));
	}
}
