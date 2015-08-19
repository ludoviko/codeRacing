package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.UnLinker;

public class UnLinkerTest  {
	UnLinker linker;
	
	@Before
	public void setUp() throws Exception {
		linker = new UnLinker();
	}

	@After
	public void tearDown() throws Exception {
		linker = null;
	}

	@Test
	public void testClean() {
		Assert.assertEquals("espiOMIT1aladocious", linker.clean("espihttp://www.tv.org.superwww.cali.comaladocious"));
		Assert.assertEquals("check OMIT1 4 OMIT2 OMIT3", linker.clean("check www.foo.com 4 www.foo.com www.scoopz.com"));
		Assert.assertEquals("check OMIT1 4 OMIT2", linker.clean("check www.foo.com 4 www.foo.comwww.scoopz.com"));
		Assert.assertEquals("check OMIT1 4 OMIT2OMIT3", linker.clean("check www.foo.com 4 www.foo.comhttp://scoopz.com"));
		Assert.assertEquals("http.//say.org,OMIT1,www.comhttp://.tv", linker.clean("http.//say.org,www.jeeves.x.info,www.comhttp://.tv"));
		Assert.assertEquals("OMIT1/www", linker.clean("http://www.www.com/www"));
		Assert.assertEquals("AAA", linker.clean("AAA"));
	}
	
	@Test
	public void testCleanSystemTest() {
		Assert.assertEquals("espiOMIT1aladocious" 	, linker.clean( "espihttp://www.tv.org.superwww.cali.comaladocious"));
		Assert.assertEquals("check OMIT1 4 OMIT2 OMIT3" 	, linker.clean( "check www.foo.com 4 www.foo.com www.scoopz.com"));
		Assert.assertEquals("check OMIT1 4 OMIT2" 	, linker.clean( "check www.foo.com 4 www.foo.comwww.scoopz.com"));
		Assert.assertEquals("check OMIT1 4 OMIT2OMIT3" 	, linker.clean( "check www.foo.com 4 www.foo.comhttp://scoopz.com"));
		Assert.assertEquals("OMIT1 goodz 4 OMIT2, 2OMIT3" 	, linker.clean( "http://411.com goodz 4 www.733t.com, 2http://..com"));
		Assert.assertEquals("http.//say.org,OMIT1,www.comhttp://.tv" 	, linker.clean( "http.//say.org,www.jeeves.x.info,www.comhttp://.tv"));
		Assert.assertEquals("D.eduinfoox.comDHwww.ttp://htwww./www.hyGqowP8L zX" 	, linker.clean( "D.eduinfoox.comDHwww.ttp://htwww./www.hyGqowP8L zX"));
		Assert.assertEquals("O4:OMIT1eduE9www.os" 	, linker.clean( "O4:http://www.infoY0pBwww..HxbmX5ID.edueduE9www.os"));
		Assert.assertEquals("1uCJ7Dwww. Sxgz.tvAd.tvJCyAwww..OMIT1DgHvH" 	, linker.clean( "1uCJ7Dwww. Sxgz.tvAd.tvJCyAwww..http://www.tvDgHvH"));
		Assert.assertEquals("W.comqV.info.cW.OMIT1:opwww.vTgf5jC" 	, linker.clean( "W.comqV.info.cW.http://www.p.tva.com:opwww.vTgf5jC"));
		Assert.assertEquals("C.orgsXP2.eduS.orgw.OMIT1/www.CxdPc8g" 	, linker.clean( "C.orgsXP2.eduS.orgw.http://wwwww.tt.tv/www.CxdPc8g"));
		Assert.assertEquals("yL.Z wOlw.infofOMIT1ttp://,2w81www.mqoS0uTimq" 	, linker.clean( "yL.Z wOlw.infofwww.7.infottp://,2w81www.mqoS0uTimq"));
		Assert.assertEquals("OH,Z,6Y5H5V3CwwOMIT1tp://com7Bg" 	, linker.clean( "OH,Z,6Y5H5V3Cwwhttp://www.Mh55..com.orgtp://com7Bg"));
		Assert.assertEquals(".t.inwww.oihk1,8j873OMIT1/TGfBBEBvqCn1TpO5" 	, linker.clean( ".t.inwww.oihk1,8j873www.U7Uww.org/TGfBBEBvqCn1TpO5"));
		Assert.assertEquals("2jhz rjWp48TMlAq,dfU SElM,TtRwww.o/.org.edu..tvouT" 	, linker.clean( "2jhz rjWp48TMlAq,dfU SElM,TtRwww.o/.org.edu..tvouT"));
		Assert.assertEquals("jht.infonfo.ww.nx.mLtj7w.tvOwww.http://www.Yhe yq" 	, linker.clean( "jht.infonfo.ww.nx.mLtj7w.tvOwww.http://www.Yhe yq"));
		Assert.assertEquals("J/.tvO3d L.4A .tvLcMYOMIT1p://w.orgrr.iwww.. UQ" 	, linker.clean( "J/.tvO3d L.4A .tvLcMYwww.N.tvp://w.orgrr.iwww.. UQ"));
		Assert.assertEquals("OMIT1/OMIT2T4 ZUj0," 	, linker.clean( "http://ommQwTDg.orgJDWght.org/www..edup.tvT4 ZUj0,"));
		Assert.assertEquals("www..qhttp://ww.dTOMIT1 Ou7" 	, linker.clean( "www..qhttp://ww.dThttp://Lh.edutNU4Nx.tvW.info Ou7"));
		Assert.assertEquals("NYG65XNd.tv.PPw.hyOMIT1w.http://www.TUlc" 	, linker.clean( "NYG65XNd.tv.PPw.hywww.uwm.com.comw.http://www.TUlc"));
		Assert.assertEquals(".combdfC1htwww./www.twww./OMIT1infoJXS" 	, linker.clean( ".combdfC1htwww./www.twww./www...tvQY28ig.tvinfoJXS"));
		Assert.assertEquals("oHerJyi.infotvAN1rf http://www.wwww.ww.MfBhG www.k" 	, linker.clean( "oHerJyi.infotvAN1rf http://www.wwww.ww.MfBhG www.k"));
		Assert.assertEquals("/QxZQ.info qwww.hwww.//ww.infoB ,q.info1mi.tvww.HR" 	, linker.clean( "/QxZQ.info qwww.hwww.//ww.infoB ,q.info1mi.tvww.HR"));
		Assert.assertEquals("H 2.tv2HPF.orghttwww.vww.g7GMhttp:/OMIT1JO/AzF" 	, linker.clean( "H 2.tv2HPF.orghttwww.vww.g7GMhttp:/www...eduJO/AzF"));
		Assert.assertEquals("NJjZOJHmiog3wwOMIT1KkFWs" 	, linker.clean( "NJjZOJHmiog3wwhttp://91www.info.orww.orgTF.tvKkFWs"));
		Assert.assertEquals("q,Rp3.tvt.ewwOMIT15:.edup.tvwww.www.AW" 	, linker.clean( "q,Rp3.tvt.ewwwww.ebwww.UQ.info5:.edup.tvwww.www.AW"));
		Assert.assertEquals(".org.com.xKubCUVy.tvhttp://.tvIWDA http://www.KO7Y" 	, linker.clean( ".org.com.xKubCUVy.tvhttp://.tvIWDA http://www.KO7Y"));
		Assert.assertEquals(".orgRwww.http://.orgeFG/l2t OMIT1xbMv" 	, linker.clean( ".orgRwww.http://.orgeFG/l2t www.w.iwww.vFh.eduxbMv"));
		Assert.assertEquals("qbw.t.eduwww.eduwwww.pTrrGE:8m7ret0.o.orgOv:SnJuOI" 	, linker.clean( "qbw.t.eduwww.eduwwww.pTrrGE:8m7ret0.o.orgOv:SnJuOI"));
		Assert.assertEquals("JUP OQh.infoWrh9fG.orgttpOMIT1www.KLwwwww.X" 	, linker.clean( "JUP OQh.infoWrh9fG.orgttphttp://i.comwww.KLwwwww.X"));
		Assert.assertEquals("rM5jOMIT1gOMIT25wSh.cowww..m" 	, linker.clean( "rM5jhttp://.comBtw.comghttp://scm.edu5wSh.cowww..m"));
		Assert.assertEquals("tE0prTc7 Jva CTl.tv.tv64Rbowww.EPwXqOMIT1R" 	, linker.clean( "tE0prTc7 Jva CTl.tv.tv64Rbowww.EPwXqhttp://w.infoR"));
		Assert.assertEquals("OMIT1//bNB.wwwww.rg0s5h tbU.tvHO4F.tvkU.orgn" 	, linker.clean( "www.JIh.com//bNB.wwwww.rg0s5h tbU.tvHO4F.tvkU.orgn"));
		Assert.assertEquals("f.eduw.1v.orgc 4e/nqKiuAmqUmwww..cwww.tp://B.tvur7" 	, linker.clean( "f.eduw.1v.orgc 4e/nqKiuAmqUmwww..cwww.tp://B.tvur7"));
		Assert.assertEquals("UbE2l,jy.comww.w.orgin.comvwwwww..6:L4FgSDQ1rh,ph," 	, linker.clean( "UbE2l,jy.comww.w.orgin.comvwwwww..6:L4FgSDQ1rh,ph,"));
		Assert.assertEquals("http.orgww..e.tvYdnwMNE4jhttp://www.m1www..vaFvxQh" 	, linker.clean( "http.orgww..e.tvYdnwMNE4jhttp://www.m1www..vaFvxQh"));
		Assert.assertEquals(",,www.Hwww.www.j:jFs OMIT119X " 	, linker.clean( ",,www.Hwww.www.j:jFs http://www..eduRLw.ed.com19X "));
		Assert.assertEquals("hwww.rg/OMIT1 .org.Y4Q3 www.cy" 	, linker.clean( "hwww.rg/www..infoOe.infoZ8www.org .org.Y4Q3 www.cy"));
		Assert.assertEquals(".bTNh.tv://www.wOMIT15N" 	, linker.clean( ".bTNh.tv://www.whttp://www.I3gnYwww.A07Rwww.f.tv5N"));
		Assert.assertEquals("J.1.comxgFhttp://p:.tvomJ3YFBQ/eI.comykDcPwww.eaVI" 	, linker.clean( "J.1.comxgFhttp://p:.tvomJ3YFBQ/eI.comykDcPwww.eaVI"));
		Assert.assertEquals("N.edu://www.w.A4/knwNOMIT1sK lOMIT2Y" 	, linker.clean( "N.edu://www.w.A4/knwNwww.RwI.edusK lwww.mowww.eduY"));
		Assert.assertEquals("oP0ye.edu.com://www. hrwww..com://cwww.iG0Dq:.Vlll" 	, linker.clean( "oP0ye.edu.com://www. hrwww..com://cwww.iG0Dq:.Vlll"));
		Assert.assertEquals("1Rql .com.I.tvtvw.comAhttp://www.zZhttp://www.hT.C" 	, linker.clean( "1Rql .com.I.tvtvw.comAhttp://www.zZhttp://www.hT.C"));
		Assert.assertEquals("PeBKgD P3http:///OMIT1f2gAZwww. " 	, linker.clean( "PeBKgD P3http:///www.rgtwww.tvc4a.com.tvf2gAZwww. "));
		Assert.assertEquals("IC9KoiHYr GOMIT1JJ e kOMIT2uWZiD" 	, linker.clean( "IC9KoiHYr Gwww.F.comJJ e kwww.wwwhttp.tv.infouWZiD"));
		Assert.assertEquals("Zu7yiI4 .eduuj.o.orgww.OMIT1pll.xx6uL3O" 	, linker.clean( "Zu7yiI4 .eduuj.o.orgww.www.ht.edwww.orgpll.xx6uL3O"));
		Assert.assertEquals("Lcx.com.K:uhttp:/OMIT1gNXoVH7http://www.7/sDdN" 	, linker.clean( "Lcx.com.K:uhttp:/www.o.comgNXoVH7http://www.7/sDdN"));
		Assert.assertEquals("/wu.eduwww.edu://bY8dehttp://p://.tv.infowww.OM, J" 	, linker.clean( "/wu.eduwww.edu://bY8dehttp://p://.tv.infowww.OM, J"));
		Assert.assertEquals("QOMIT1.ww.nW2I.OMIT2Iqh" 	, linker.clean( "Qwww.6UhsS.com.ww.nW2I.http://www.foPn4Qv9w.orgIqh"));
		Assert.assertEquals("Ce8CT0MLNm NKhttpOMIT1aukjOMIT2YLS" 	, linker.clean( "Ce8CT0MLNm NKhttpwww.omwww.infoaukjhttp://..comYLS"));
		Assert.assertEquals("OMIT1/www" 	, linker.clean( "http://www.www.com/www"));
		Assert.assertEquals("OMIT1" 	, linker.clean( "www.link.com.link.com"));
		Assert.assertEquals("OMIT OMIT OMIT1" 	, linker.clean( "OMIT OMIT www.sdf.com"));
		Assert.assertEquals("espiOMIT1porg" 	, linker.clean( "espihttp://www.tvporg"));
		Assert.assertEquals("abchttp:OMIT1" 	, linker.clean( "abchttp:www.abc.com"));
		Assert.assertEquals("hello http://aaacom hello", linker.clean( "hello http://aaacom hello"));
	}
}

