package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ErasingCharacters;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ErasingCharactersTest extends TestCase {
	ErasingCharacters erase;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		erase = new ErasingCharacters();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		erase = null;
	}

	@Test
	public void testSimulate() {
		Assert.assertEquals("b", erase.simulate("b"));
		Assert.assertEquals("l", erase.simulate("eel"));
		Assert.assertEquals("cl", erase.simulate("cieeilll"));
		Assert.assertEquals("topcoder", erase.simulate("topcoder"));
		Assert.assertEquals("", erase.simulate("abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba"));
		Assert.assertEquals("bacbaca", erase.simulate("bacaabaccbaaccabbcabbacabcbba"));
	}
	
	@Test
	public void testSimulateSystemTest() {
		Assert.assertEquals("cl", erase.simulate("cieeilll"));
		Assert.assertEquals("topcoder", erase.simulate("topcoder"));
		Assert.assertEquals("", erase.simulate("abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba"));
		Assert.assertEquals("bacbaca", erase.simulate("bacaabaccbaaccabbcabbacabcbba"));
		Assert.assertEquals("l", erase.simulate("eel"));
		Assert.assertEquals("pzonmhocmiopdhaopzqochdzpdocomhayiaiaymynpoyoq", erase.simulate("phhzonmhoiicmiopdhaopzqochdzpdocomhayiaiaymynpoyoq"));
		Assert.assertEquals("lumrnjcwxeqpftdkeaoirnjamvgiknvipjgryfzdaoljqlic", erase.simulate("lumrnjcwxeqpftdkeaoirxxnjamvgiknvipjgryfzdaoljqlic"));
		Assert.assertEquals("bowzhnwytoyubnbotwuztoutotzyzohnzuolbtot", erase.simulate("bottwzhnwytoyubnbotwuztoutotttzyuuzohnzuolbtbbollt"));
		Assert.assertEquals("pfcftmjvijcsyvplathfvrxrysnrcqklpekjkpcy", erase.simulate("pfcfiitmjvijcswwyvplathfzzrrvrxrysnrcqklpmmekjkpcy"));
		Assert.assertEquals("xrsxsdrsxrxsdxrxrsrxsdsx", erase.simulate("rddrdssrrrrdddxrsxsrddrrrrrdrsxrxrrsdxrxssrsrxsdsx"));
		Assert.assertEquals("vbpvpbdbdvpbvpvpbvbpdpbd", erase.simulate("vppbpvpbdbbbdvvvpbvpbbvvvbppppbpbvbbvvppppbbbpdpbd"));
		Assert.assertEquals("ugzchfhucfxafcfucjhjgjgphfzgafxhczgxgjha", erase.simulate("ugzchppfhucfxafcfucjhggjgjgpzzhfzgafxhhhczgxhhgjha"));
		Assert.assertEquals("rurcmcdsmrcdscmsrucsduscdrmdrusucsusdsms", erase.simulate("rurcmcdsmrcdddscmsrucsduscuudrmdrusucsmmdccdusdsms"));
		Assert.assertEquals("odgywouyodwjyfdoyiyugfhjdgfgionecfghcgiynhydjw", erase.simulate("odgywouyodwjyfdoyiyugfhjdguufgionecfghcgiynhydjyyw"));
		Assert.assertEquals("cpfwuhqurhuarbufaonuxwucoxcxfqxqrpxfcbcfawqo", erase.simulate("cpaafwuhqurhuarbufaxxonuxwucoxcxfqxqrpxxxfcbcfawqo"));
		Assert.assertEquals("wlbksnjktm", erase.simulate("wlbksnjktm"));
		Assert.assertEquals("rwscgeho", erase.simulate("mmrwscgyyeho"));
		Assert.assertEquals("difididfdidfififidi", erase.simulate("difddididfdiiidddfififidi"));
		Assert.assertEquals("wksoaxbkshobugyzsbwl", erase.simulate("wksoaxbkshobugyzsbwl"));
		Assert.assertEquals("jwygypu", erase.simulate("jwygypu"));
		Assert.assertEquals("baiucuqjrzbqtjdzadudzuaridajburczjztjzqa", erase.simulate("baiucuqjrzbqtjdzadubbdzuaridajburbbczjztjzqa"));
		Assert.assertEquals("e", erase.simulate("eeeeeeeeeeeeeeeeeeeee"));
		Assert.assertEquals("esinghn", erase.simulate("esinghaaggn"));
		Assert.assertEquals("lsjnjdpcdptkclzbst", erase.simulate("lsjnjdpcdptkclzbst"));
		Assert.assertEquals("vxowvoxovoxvovwxvxowxo", erase.simulate("wwvovvoxwwowxxvoxovoxvovvxxxooxvwoowwxvxowooxovvoo"));
		Assert.assertEquals("", erase.simulate("cccccccccccccccccccccccccccccccccccccccccccccccccc"));
		Assert.assertEquals("b", erase.simulate("b"));
		Assert.assertEquals("aba", erase.simulate("abcca"));
		Assert.assertEquals("aba", erase.simulate("aba"));
		Assert.assertEquals("a", erase.simulate("all"));
		Assert.assertEquals("", erase.simulate("aaaa"));
		Assert.assertEquals("b", erase.simulate("caacb"));
		Assert.assertEquals("b", erase.simulate("aaaab"));
	}

}
