package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.TitleString;

public class TitleStringTest {
	TitleString title;
 
	@Before
	public void setUp() throws Exception {
		title = new TitleString();
	}

	@After
	public void tearDown() throws Exception {
		title = null;
	}

	@Test
	public void testToFirstUpperCase() {
		Assert.assertEquals("Introduction To Algorithms", title.toFirstUpperCase("introduction to algorithms"));
		Assert.assertEquals("More Than  One   Space    Between     Words", title.toFirstUpperCase("more than  one   space    between     words"));
		Assert.assertEquals("  Lord Of The Rings   The Fellowship Of The Ring  ", title.toFirstUpperCase("  lord of the rings   the fellowship of the ring  "));
		Assert.assertEquals("  ", title.toFirstUpperCase("  "));
		Assert.assertEquals("I", title.toFirstUpperCase("i"));
		Assert.assertEquals("The King And I", title.toFirstUpperCase("the king and i"));
		Assert.assertEquals("", title.toFirstUpperCase(""));
	}

	@Test
	public void toFirstUpperCaseSystemTest() {
		Assert.assertEquals("Introduction To Algorithms", title.toFirstUpperCase("introduction to algorithms"));
		Assert.assertEquals("More Than One Space Between Words", title.toFirstUpperCase("more than one space between words"));
		Assert.assertEquals(" Lord Of The Rings The Fellowship Of The Ring ", title.toFirstUpperCase(" lord of the rings the fellowship of the ring "));
		Assert.assertEquals(" ", title.toFirstUpperCase(" "));
		Assert.assertEquals("I", title.toFirstUpperCase("i"));
		Assert.assertEquals("The King And I", title.toFirstUpperCase("the king and i"));
		Assert.assertEquals("", title.toFirstUpperCase(""));
		Assert.assertEquals("Px Ilfkus Nj F Ovql Lkrjnn B", title.toFirstUpperCase("px ilfkus nj f ovql lkrjnn b"));
		Assert.assertEquals("Y A", title.toFirstUpperCase("y a"));
		Assert.assertEquals("J Shz", title.toFirstUpperCase("j shz"));
		Assert.assertEquals("Xjj Shkyckfvkyy Ia Pu", title.toFirstUpperCase("xjj shkyckfvkyy ia pu"));
		Assert.assertEquals("Kj", title.toFirstUpperCase("kj"));
		Assert.assertEquals("Xaon", title.toFirstUpperCase("xaon"));
		Assert.assertEquals("Mk Lky Lk U Ybu Qp ", title.toFirstUpperCase("mk lky lk u ybu qp "));
		Assert.assertEquals("Rl", title.toFirstUpperCase("rl"));
		Assert.assertEquals("Ykexwcl Y T ", title.toFirstUpperCase("ykexwcl y t "));
		Assert.assertEquals("C ", title.toFirstUpperCase("c "));
		Assert.assertEquals(" Hmsupo Mrjo W Svwzjqk Qudaixfue Ivemgsq ", title.toFirstUpperCase(" hmsupo mrjo w svwzjqk qudaixfue ivemgsq "));
		Assert.assertEquals("Daf", title.toFirstUpperCase("daf"));
		Assert.assertEquals("Vo Gcdfzse", title.toFirstUpperCase("vo gcdfzse"));
		Assert.assertEquals("Rvrhg Cr", title.toFirstUpperCase("rvrhg cr"));
		Assert.assertEquals("Gdsdhyizrevv", title.toFirstUpperCase("gdsdhyizrevv"));
		Assert.assertEquals("Enapoktgxo Lqloeslni ", title.toFirstUpperCase("enapoktgxo lqloeslni "));
		Assert.assertEquals("D ", title.toFirstUpperCase("d "));
		Assert.assertEquals("V", title.toFirstUpperCase("v"));
		Assert.assertEquals("Aqf Lieekfwa A", title.toFirstUpperCase("aqf lieekfwa a"));
		Assert.assertEquals("Xws T Hy Qdggr Mjwjqdyantvckpm Bltlo ", title.toFirstUpperCase("xws t hy qdggr mjwjqdyantvckpm bltlo "));
		Assert.assertEquals("Bmis Jb Yzqtwmqr Fvispgb", title.toFirstUpperCase("bmis jb yzqtwmqr fvispgb"));
		Assert.assertEquals("Wqoezwaxpl Oc Go", title.toFirstUpperCase("wqoezwaxpl oc go"));
		Assert.assertEquals(" J", title.toFirstUpperCase(" j"));
		Assert.assertEquals(" Dvp Uwyr", title.toFirstUpperCase(" dvp uwyr"));
		Assert.assertEquals(" Rlsiup Wtxu Uefvmlq Vazh ", title.toFirstUpperCase(" rlsiup wtxu uefvmlq vazh "));
		Assert.assertEquals("Bnx Sx", title.toFirstUpperCase("bnx sx"));
		Assert.assertEquals("T", title.toFirstUpperCase("t"));
		Assert.assertEquals("J", title.toFirstUpperCase("j"));
		Assert.assertEquals("Biqgx", title.toFirstUpperCase("biqgx"));
		Assert.assertEquals("Lnmf Hf Tblckjj Qyieklffauj", title.toFirstUpperCase("lnmf hf tblckjj qyieklffauj"));
		Assert.assertEquals("U M Iybj Y ", title.toFirstUpperCase("u m iybj y "));
		Assert.assertEquals(" Marjzjff Y ", title.toFirstUpperCase(" marjzjff y "));
		Assert.assertEquals("Xzbks", title.toFirstUpperCase("xzbks"));
		Assert.assertEquals("Y Mgvo Rkscjax Osup", title.toFirstUpperCase("y mgvo rkscjax osup"));
		Assert.assertEquals("Kss Yko", title.toFirstUpperCase("kss yko"));
		Assert.assertEquals("X Tyurv L ", title.toFirstUpperCase("x tyurv l "));
		Assert.assertEquals(" S Sf Ksjll E Ldah", title.toFirstUpperCase(" s sf ksjll e ldah"));
		Assert.assertEquals(" Xkbmi Glezojchtaqancpb", title.toFirstUpperCase(" xkbmi glezojchtaqancpb"));
		Assert.assertEquals("Ja R Wybmrallvp", title.toFirstUpperCase("ja r wybmrallvp"));
		Assert.assertEquals("Cgkxkwhrqgfstmxad Nqtk Vb Mywkd", title.toFirstUpperCase("cgkxkwhrqgfstmxad nqtk vb mywkd"));
		Assert.assertEquals("More Than One Space Between Words", title.toFirstUpperCase("more than one space between words"));
		Assert.assertEquals("I", title.toFirstUpperCase("i"));
		Assert.assertEquals(" Lord Of The Rings The Fellowship Of The Ring ", title.toFirstUpperCase(" lord of the rings the fellowship of the ring "));
		Assert.assertEquals(" Dupa A Nie Program", title.toFirstUpperCase(" dupa a nie program"));
		Assert.assertEquals("More Than One Space Between Words", title.toFirstUpperCase("more than one space between words"));
		Assert.assertEquals("I", title.toFirstUpperCase("i"));
		Assert.assertEquals(" Lord Of The Rings The Fellowship Of The Ring ", title.toFirstUpperCase(" lord of the rings the fellowship of the ring "));
		Assert.assertEquals(" Dupa A Nie Program", title.toFirstUpperCase(" dupa a nie program"));
	}
}
