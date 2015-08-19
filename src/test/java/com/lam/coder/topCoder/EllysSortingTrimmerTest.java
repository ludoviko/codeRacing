package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.EllysSortingTrimmer;

public class EllysSortingTrimmerTest {
	EllysSortingTrimmer trimmer;

	@Before
	public void setUp() throws Exception {
		trimmer = new EllysSortingTrimmer();
	}

	@After
	public void tearDown() throws Exception {
		trimmer = null;
	}

	@Test
	public void testGetMin() {
		Assert.assertEquals("AAAAA", trimmer.getMin("ABRACADABRA", 5));
		Assert.assertEquals("EIP", trimmer.getMin("ESPRIT", 3));
		Assert.assertEquals("AABGINZ", trimmer.getMin("BAZINGA", 7));
		Assert.assertEquals("ABCDEFGHIJKLM",
				trimmer.getMin("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 13));
		Assert.assertEquals("AACDDEFGHK", trimmer.getMin("GOODLUCKANDHAVEFUN", 10));
		Assert.assertEquals("AAAAAAAAABBDDDDDDDEEI",
				trimmer.getMin("AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD", 21));
		Assert.assertEquals("CDT", trimmer.getMin("TOPCODER", 3));
	}
	
	@Test
	public void getMinSystemTest() { 
		Assert.assertEquals("AAAAA", trimmer.getMin("ABRACADABRA", 5));
		Assert.assertEquals("EIP", trimmer.getMin("ESPRIT", 3));
		Assert.assertEquals("AABGINZ", trimmer.getMin("BAZINGA", 7));
		Assert.assertEquals("ABCDEFGHIJKLM", trimmer.getMin("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 13));
		Assert.assertEquals("AACDDEFGHK", trimmer.getMin("GOODLUCKANDHAVEFUN", 10));
		Assert.assertEquals("AAAAAAAAABBDDDDDDDEEI", trimmer.getMin("AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD", 21));
		Assert.assertEquals("CDT", trimmer.getMin("TOPCODER", 3));
		Assert.assertEquals("AAAAAAAAAAAAA", trimmer.getMin("AAAAAAAAAAAAAAAAAACB", 13));
		Assert.assertEquals("EHIIIIJMOPRSSTTTTTUUW", trimmer.getMin("WITHOUTITIMJUSTESPRIT", 21));
		Assert.assertEquals("ABDER", trimmer.getMin("RIGHTNOWYOUSHOULDBELAUGHING", 5));
		Assert.assertEquals("AABEEEEG", trimmer.getMin("GOGOKEFAKEFAISNOTBLUEYET", 8));
		Assert.assertEquals("AZ", trimmer.getMin("ZZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2));
		Assert.assertEquals("AAAAAAZ", trimmer.getMin("ZZZZZZZZZZZZZZAAAAAAAAAAAAAAA", 7));
		Assert.assertEquals("EGG", trimmer.getMin("GOOGLE", 3));
		Assert.assertEquals("EGGNO", trimmer.getMin("GGNORE", 5));
		Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAA", trimmer.getMin("AZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZ", 25));
		Assert.assertEquals("ABCDEFGHIJKLM", trimmer.getMin("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 13));
		Assert.assertEquals("ABCDEFGHIJKLZ", trimmer.getMin("ZYXWVUTSRQPONMLKJIHGFEDCBA", 13));
		Assert.assertEquals("CT", trimmer.getMin("TOPCODER", 2));
		Assert.assertEquals("CDT", trimmer.getMin("TOPCODER", 3));
		Assert.assertEquals("CDEOT", trimmer.getMin("TOPCODER", 5));
		Assert.assertEquals("CDEOOT", trimmer.getMin("TOPCODER", 6));
		Assert.assertEquals("CDEOOPT", trimmer.getMin("TOPCODER", 7));
		Assert.assertEquals("CDEOOPRT", trimmer.getMin("TOPCODER", 8));
		Assert.assertEquals("AAAAA", trimmer.getMin("AAAAAABCDEFKYDETREZAZZYYYRRZ", 5));
		Assert.assertEquals("AAAAAAAAAAAAAAAAAAAA", trimmer.getMin("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZYX", 20));
		Assert.assertEquals("ACCDDEEEEEFGM", trimmer.getMin("MOMSEEIAMWRITINGTESTSFORTOPCODERTCOROUNDONE", 13));
		Assert.assertEquals("CCC", trimmer.getMin("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCDD", 3));
		Assert.assertEquals("AZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 2));
		Assert.assertEquals("AAZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 3));
		Assert.assertEquals("AAAZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 4));
		Assert.assertEquals("AAABZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 5));
		Assert.assertEquals("AAABBZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 6));
		Assert.assertEquals("AAABBCZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 7));
		Assert.assertEquals("AAABBCCZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 8));
		Assert.assertEquals("AAABBCCDZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 9));
		Assert.assertEquals("AAABBCCDFZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 10));
		Assert.assertEquals("AAABBCCDFFZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 11));
		Assert.assertEquals("AAABBCCDFFFZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 12));
		Assert.assertEquals("AAABBCCDFFFFZ", trimmer.getMin("ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 13));
		Assert.assertEquals("AAABBCQ", trimmer.getMin("QZZYYYGGGGXXXCBAABCFFFFFFTRRAWD", 7));
		Assert.assertEquals("AABBBCCDHHHIJJKMNNPPSUUUWWXXYY", trimmer.getMin("HAPJIABBNYDBWHYKZUPCUXMUSHNXWJC", 30));
		Assert.assertEquals("BBZ", trimmer.getMin("ZBMDDNXROMTVTPUGPDKBKTQDTGFUJCUTPFFMS", 3));
		Assert.assertEquals("AABCDDEEEFLLOOPR", trimmer.getMin("RDFTODEBLEEALCAPOV", 16));
		Assert.assertEquals("BCDDFGGIIKKLLLMNNNOOOPPPQRSSSTUUUUUVVVWWX", trimmer.getMin("NQLWGMCYVDIKTSXRLBOYUWLNSPYVOPUUFKSXDPYOVINYGUYU", 41));
		Assert.assertEquals("BBBBBCEEEEHHJJKKMORTTVVXXYZ", trimmer.getMin("VZBMHXVJBRTKBXYCBBJOKETEHEE", 27));
		Assert.assertEquals("BFFGGGGGIKS", trimmer.getMin("SLIPRLZGUKFGGZGGZFYBZYUX", 11));
		Assert.assertEquals("ABBDDDEEFFHIIJJKLMNOPQQQQ", trimmer.getMin("NTIDXFZTRLDOMJQKVBPQHBSIUJWDAWZQSQEFRRZE", 25));
		Assert.assertEquals("AABCDDEEFFGGHJJJJKKNNNNPQRRX", trimmer.getMin("XNGZNKVDFPKEQJRRSJJCNAFDAJNEHGBWWZ", 28));
		Assert.assertEquals("ABCCGHHKLMNOPT", trimmer.getMin("TOSNCWPMPGBAKSHPLRCUH", 14));
		Assert.assertEquals("EEEFFGHJJJJJKLMMMOOPPQRUUVW", trimmer.getMin("VGLJFMYQXUUJOMPFJHREEPWJMOJKEX", 27));
		Assert.assertEquals("AAAABCCDDEEGGHHHHIIKKLLMMMMNNNOT", trimmer.getMin("TMOXPKAYZENMLCTGMQNPKXNADCZDIAUWTBHGHTUHHLETIVAM", 32));
		Assert.assertEquals("AAABBEFFGGHHIIJJKKKLLLNR", trimmer.getMin("RLOJRAPGVLNRAZKHRPUVTLVFFBKJISKZBEPWHPIGA", 24));
		Assert.assertEquals("ABCDEFHHIIIJJJKLMMMMNPPPPQQQQRRSTTUUWYZ", trimmer.getMin("PLMINCKDMFYQQRQIJHIPRUSEMPAJBZHQWJMUTPT", 39));
		Assert.assertEquals("ABBBDDDEEFGHIIKKLMNOOQQRRRTTWXXX", trimmer.getMin("XZEIGOBEDYKBATQDNLBWQXOHKDXTIFMRRR", 32));
		Assert.assertEquals("BBCCCCDDEEFFFFGGHIIJJLLMMMOOOOOOPPPQQRVWXXYYZ", trimmer.getMin("OPHCCLYCFBEIMQWPJEOFXLIORCZDFMOXPGGOQJVOBDFYM", 45));
		Assert.assertEquals("BCCDEEEEFHIIIIIIJJJKKLMMOOPPPPPRRSUWWWWXXXXYYYYZZZ", trimmer.getMin("PIKPWZSIXCELWZHWPPOIEYKWDYYIMXEMBXXROICIEFPRYZJJJU", 50));
		Assert.assertEquals("AABBBCCDDDEFFFGGHHKKLLMMMNNNOOPQRRRSSTUVVVWXXYYYZ", trimmer.getMin("VKXMBOODNVBCHECYYZURLLYSPXNMKSDAAMVGNFDFFZHRQTGBRW", 49));
		Assert.assertEquals("AABCDDDEEFFFFGGGHIJJKKKLLLMMOOOOPRRSSTUVWXXXZZZZZZ", trimmer.getMin("FXGWGRFXKOMHZMSJVOFZGLOCJTRZSZXDOLZDUZKAAKPDBEIEFL", 50));
		Assert.assertEquals("AABBCCCDEEEGIIKKLLLMMOOPQQQQQRRRSSSTTTUUVW", trimmer.getMin("LVYOUQBWCWOAEKRSQIMCERSQBCTQKMIXDGXSPUYQLLRTZEAT", 42));
		Assert.assertEquals("AAAABBCDDFFFHIIIIIIJJKMNNPPPQRSSSTTUUVVVVWXXXYZZZ", trimmer.getMin("VZZWFAHIPXPDIJMUAVVPVIDFITSTZBCRAYSXNIKASIUQBNXFJ", 49));
		Assert.assertEquals("AABCCDEFFFGHHHHHIIIIKLLLLMMMOOOPPPQQRRRRRSST", trimmer.getMin("DEIFIHROLLRMRLQBOPHHMKLIRHHPFQIOAZRCFTCPWAMGSS", 44));
		Assert.assertEquals("CCCCCCDDEFFGHHHIIJKLLMNNORRRSSSTTVWWWXYZ", trimmer.getMin("CRLYNZVWCJIWELRDONGTTSRCHSXCWSDFCHCIHFMK", 40));
		Assert.assertEquals("BBBDEEEFGHHHHJJJJKMMMOQQRSTTVV", trimmer.getMin("SBTHMGRJWYMODEWHJWFJEBWMJTYQQHEBHVVK", 30));
		Assert.assertEquals("BCCCCCCDFFFGGIJJJKKMMMNPPQQQRRR", trimmer.getMin("QZMBXCQJMYZCMJCTPISYGNRFGZCCCKSZXTJYZPFWQRRKFDXS", 31));
		Assert.assertEquals("BBBCFGGGIIJKKKLLMMNNPRRST", trimmer.getMin("GUXXCPBRMZJSVLKIGNBLNFKUYBMXKRIXGT", 25));
		Assert.assertEquals("AABDFFGKKR", trimmer.getMin("RSFKYTGDKTNAFKYAB", 10));
		Assert.assertEquals("ILW", trimmer.getMin("WVILO", 3));
		Assert.assertEquals("AABCCDDEGGGGGGHIIJKLLLMMNPPPPQQQQRRSTUUWWWXXYYZZZ", trimmer.getMin("GPXUCQGKQLXMDZAICPRGSGGTWLPWUIQBJQYHZENAWZRMGYLZDP", 49));
		Assert.assertEquals("AABBCCFFGGGHHIIJJJKMMMMMN", trimmer.getMin("CBRJIMJFPVXZJGIRMKHYTGAGHBYMUXXFAMNMWNOTC", 25));
		Assert.assertEquals("ABBBCEGGGIIKKLLLMMOOPPPPQQQQRRSTTUUUUUV", trimmer.getMin("BQLGPPUKRCWMBSQUIQZOPGAEQOITLTLUKXZUVUZWGRPMB", 39));
		Assert.assertEquals("AHHIIIJLMMMN", trimmer.getMin("AXJXLMYHNMHWTYIIYVIZVM", 12));
		Assert.assertEquals("ABCCDDEEEFFFFFGHIJKMMMNNOOOOOOPPPQQSTWWXXX", trimmer.getMin("FEFOBHTIZWOXONCPDPPXFOGEFMZMYXOAMDNSKOQQEWFJC", 42));
		Assert.assertEquals("DEFZ", trimmer.getMin("ZZZKEDSFKN", 4));
		Assert.assertEquals("ABDEEFFGGGGHIIIJJJKLLLMMNNOOPQQRSTTTTVVWWXXXXYY", trimmer.getMin("VKGTFJJVTQXGEAFDINNOLSXEZORXQBGZTYPWYTIXLLMJWMIGH", 47));
		Assert.assertEquals("ABBCEEEFGGGIJJJKKLLMMMNNOOPPQRRSSSSTUVWXXXXYY", trimmer.getMin("ELTSBGXFYCGSSXPMUOSKPAXJRYLEJXWKZMNIVMRZQGJNBOE", 45));
		Assert.assertEquals("ABBDDDDDEEFFFGHHHJMMMNOOPPQRSTUVWWXXX", trimmer.getMin("JFXHBZMWMPFOERHXQNEGDBUXOHWDDFTADDPMSV", 37));
		Assert.assertEquals("AABD", trimmer.getMin("DPRQGPWWVQFBVQGHHJPHLFDAJNQAJSGEQYWHQXYS", 4));
		Assert.assertEquals("ACCGGHHIJJJJJKLMMNNOOPPPQRRSTTTUV", trimmer.getMin("VWPTOJCGJHMUHZTAYLRJGTNZPIKWVPQURSOCJNVMJ", 33));
		Assert.assertEquals("AABDR", trimmer.getMin("RQDHVIMPLUBYTMHWGKRFVVWRAVHGANO", 5));
		Assert.assertEquals("AABDK", trimmer.getMin("KJUZTZRTXVZZTOXZASJIAOVKIBD", 5));
		Assert.assertEquals("ABCDDDEEGHHHHHIJJJKKKLLLMMMNOOQRR", trimmer.getMin("BOUTKWMRRHDNHQUTRLSVDMOHKVJLHJEAZYIYGVLDHEKMVWCJ", 33));
		Assert.assertEquals("AABBBCDDDDEEFFFGGHIKLLMMMNOPPPQQSSSTTV", trimmer.getMin("DXGQGSXWEVPXIPMTQVMSHOTAWBZEAFYFPDDSLKMLCBBXWDNFZY", 38));
		Assert.assertEquals("BBCEFFGGHHHHHHIJKKLMMMNOPQQRRR", trimmer.getMin("HQCHMTKSYHSTHYRTJKBRMWXVRGMWHNSHYYYPIFEWVGOUYFQLBW", 30));
		Assert.assertEquals("AABBCEFFFFFGGGGGHHII", trimmer.getMin("BUVHLGOJJNKPPKOFTFGPVCVKXREAGOAYYHIGBFWFXVIWFRKGYV", 20));
		Assert.assertEquals("AAAABCCEEGGGGGHHHIIIIJJJKKMNQQQRSSSTTUUU", trimmer.getMin("GTZBSGVZTHEVZQIIHRCGAJEIQAUYSXJCIHSQAKUUJMVAZGYNGK", 40));
		Assert.assertEquals("ABBCCCCDFFHHJJJJKX", trimmer.getMin("XTCFVLCNATYLYJKWNCXVJSPTHTLQUCWHDJLTKPOBMZMOSJBFTT", 18));
		Assert.assertEquals("ABBCCDDEFGHHIIIIJJJKKKLMMOPPPPQQQRRSST", trimmer.getMin("ISCWEYMYKTKDJIPQODMZBHRSXIPVJRAQHIGKBUWLTTFXPCWQPJ", 38));
		Assert.assertEquals("ABBBCCCDDEEFFFFHHHIIIJJLLMNNNOPPQRSTTUUVVVVWWWXYYZ", trimmer.getMin("WNNFYHRAJBVCPCXMHTZFTVUIEFOPUSNDILYBVJLWHWDECFQIBV", 50));
		Assert.assertEquals("BCDDDEFFFFGHIJKKLMMMNNOOPPPPPPPQRRSSTUUUVVWWWXX", trimmer.getMin("DCLMPUPUOVHKXJPTWEMUDOMFVWNWXXDBPFRPZSNQRSIFPPYFKG", 47));
		Assert.assertEquals("AABBDW", trimmer.getMin("WWIVDXKVARTTAIYOXTGHGLWWGVPTERSTGHMELPZBLFIBOEKVQV", 6));
		Assert.assertEquals("AC", trimmer.getMin("CBA", 2));
		Assert.assertEquals("AD", trimmer.getMin("DDDAA", 2));
		Assert.assertEquals("AAZ", trimmer.getMin("ZAAB", 3));
		Assert.assertEquals("AAG", trimmer.getMin("GAAA", 3));
		Assert.assertEquals("AAB", trimmer.getMin("BAAA", 3));
		Assert.assertEquals("AR", trimmer.getMin("RAA", 2));
		Assert.assertEquals("AAB", trimmer.getMin("BBBAAA", 3));
		Assert.assertEquals("ABCDK", trimmer.getMin("KJIHGFEDCBA", 5));
		Assert.assertEquals("AAZ", trimmer.getMin("ZAAA", 3));
		Assert.assertEquals("AS", trimmer.getMin("SAA", 2));
		Assert.assertEquals("ZZZZZZZZZZZZZZZZZZZZ", trimmer.getMin("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 20));
		Assert.assertEquals("AL", trimmer.getMin("LLLLLLLAAAAAAAA", 2));
		Assert.assertEquals("AE", trimmer.getMin("EFAAAA", 2));
		Assert.assertEquals("AT", trimmer.getMin("TAA", 2));
		Assert.assertEquals("AE", trimmer.getMin("EDCBA", 2));
		Assert.assertEquals("AZZ", trimmer.getMin("ZZZA", 3));
		Assert.assertEquals("AB", trimmer.getMin("BBAA", 2));
		Assert.assertEquals("ACX", trimmer.getMin("AXC", 3));
		Assert.assertEquals("AZ", trimmer.getMin("ZBCDEFGHIJKLMNOPQRSTUVWXYA", 2));
		Assert.assertEquals("ABCCDDZ", trimmer.getMin("ZYXWVUTSRQPONMLKJIHGFEDCBAZYXWVUTSRQPONMLKJIHGFEDC", 7));
		Assert.assertEquals("ABBCCDDZ", trimmer.getMin("ZZZBYOSWXUMIJFCEXWUOJFEBFUROKQJRGCGSIMGYNOYDFAPFDT", 8));
		Assert.assertEquals("ABBC", trimmer.getMin("ABDCB", 4));
		Assert.assertEquals("AAZ", trimmer.getMin("ZZZAAA", 3));
		Assert.assertEquals("AC", trimmer.getMin("CBAA", 2));
		Assert.assertEquals("CDS", trimmer.getMin("SOPCODER", 3));
		Assert.assertEquals("ABCDR", trimmer.getMin("RABCDE", 5));
		Assert.assertEquals("AA", trimmer.getMin("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2));
		Assert.assertEquals("ABC", trimmer.getMin("CCBA", 3));
		Assert.assertEquals("AD", trimmer.getMin("DBCA", 2));
		Assert.assertEquals("AZ", trimmer.getMin("ZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2));
		Assert.assertEquals("AY", trimmer.getMin("YYXXWWVVUUTTSSRRQQPPOONNMMLLKKJJIIHHGGFFEEDDCCBBAA", 2));
		Assert.assertEquals("AB", trimmer.getMin("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBA", 2));
		Assert.assertEquals("CC", trimmer.getMin("CCC", 2));
	}

}
