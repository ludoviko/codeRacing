package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.AppleWord;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppleWordTest extends TestCase {
	AppleWord apple;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		apple = new AppleWord();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		apple = null;
	}

	@Test
	public void testMinRep() {
		Assert.assertEquals(0, apple.minRep("Apple"));
		Assert.assertEquals(0, apple.minRep("apPpPPlE"));
		Assert.assertEquals(-1, apple.minRep("APLE"));
		Assert.assertEquals(7, apple.minRep("TopCoder"));
	}
	
	@Test
	public void testMinRepSystemTest() {
		Assert.assertEquals(0, apple.minRep("Apple"));
		Assert.assertEquals(0, apple.minRep("apPpPPlE"));
		Assert.assertEquals(-1, apple.minRep("APLE"));
		Assert.assertEquals(7, apple.minRep("TopCoder"));
		Assert.assertEquals(-1, apple.minRep("q"));
		Assert.assertEquals(-1, apple.minRep("Q"));
		Assert.assertEquals(-1, apple.minRep("bL"));
		Assert.assertEquals(-1, apple.minRep("aL"));
		Assert.assertEquals(-1, apple.minRep("aLe"));
		Assert.assertEquals(-1, apple.minRep("bCb"));
		Assert.assertEquals(-1, apple.minRep("APLE"));
		Assert.assertEquals(-1, apple.minRep("CqFX"));
		Assert.assertEquals(17, apple.minRep("aDFqpPjTWAPpmLppxupjPZPqpapbq"));
		Assert.assertEquals(6, apple.minRep("aPPppPpPPpprPxPpPpuPppPPQpPPpnHlE"));
		Assert.assertEquals(6, apple.minRep("AppPzppclzrlF"));
		Assert.assertEquals(16, apple.minRep("LYYypoPPPShPqPpTdCPJpPPPppHORpPUe"));
		Assert.assertEquals(4, apple.minRep("apSVpkPPhe"));
		Assert.assertEquals(29, apple.minRep("awAlemPTrJPoppOUHAiMpPTPpGUPrvPIzjtNRlOO"));
		Assert.assertEquals(15, apple.minRep("lHRPPnaEWKCXvkppUobPLE"));
		Assert.assertEquals(24, apple.minRep("RPgIpPBfWpNxPmNpjEEPrHypuPQjIMBpCpPlb"));
		Assert.assertEquals(2, apple.minRep("aPPpTpppPPppPpPPPpPpppVlE"));
		Assert.assertEquals(12, apple.minRep("gBttNSeXbpBClD"));
		Assert.assertEquals(25, apple.minRep("ypPeOSpCpqrpPPMPPPWCFcPypPPdFTnppBApzpJCAepOplE"));
		Assert.assertEquals(0, apple.minRep("ApPppPPppppPpPPppppppPPpPPppPPpPPpPPpppppPpPPpPLE"));
		Assert.assertEquals(0, apple.minRep("APppPPppPPpPPppPpPpPPpPPppppple"));
		Assert.assertEquals(1, apple.minRep("ApPPPpkpPpplE"));
		Assert.assertEquals(14, apple.minRep("AuMPdppYPiyPLPpPXBoqQxPSe"));
		Assert.assertEquals(5, apple.minRep("ApnPpcpDPpppPPHj"));
		Assert.assertEquals(6, apple.minRep("dppupHPpcpPpbLK"));
		Assert.assertEquals(15, apple.minRep("jPypvGKagwjfKsSJf"));
		Assert.assertEquals(15, apple.minRep("aNtPxKPPPPPPMepppcgjPPaCgJpCPld"));
		Assert.assertEquals(45, apple.minRep("EkdSLPWDPkKqlyFarqmizspBFuBtkKnXWWqQaNWPXWYprrMEtd"));
		Assert.assertEquals(50, apple.minRep("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ"));
		Assert.assertEquals(2, apple.minRep("addle"));
		Assert.assertEquals(1, apple.minRep("aapppppple"));
		Assert.assertEquals(4, apple.minRep("elppa"));
		Assert.assertEquals(6, apple.minRep("sappfsdfle"));
		Assert.assertEquals(4, apple.minRep("ppxyz"));
		Assert.assertEquals(1, apple.minRep("aplle"));
		Assert.assertEquals(2, apple.minRep("paple"));
		Assert.assertEquals(1, apple.minRep("aplple"));
		Assert.assertEquals(5, apple.minRep("SAASA"));
		Assert.assertEquals(11, apple.minRep("spasdadllleee"));
		Assert.assertEquals(-1, apple.minRep("x"));
		Assert.assertEquals(8, apple.minRep("AAAAAAAAAppppple"));
		Assert.assertEquals(3, apple.minRep("pppppppppp"));
		Assert.assertEquals(8, apple.minRep("TopCodeer"));
		Assert.assertEquals(1, apple.minRep("applle"));
		Assert.assertEquals(-1, apple.minRep("a"));
		Assert.assertEquals(2, apple.minRep("Apppppllle"));
		Assert.assertEquals(-1, apple.minRep("asd"));
		Assert.assertEquals(-1, apple.minRep("pppp"));
		Assert.assertEquals(10, apple.minRep("ppappaaapSPPPPEEELL"));
		Assert.assertEquals(3, apple.minRep("pppppppppppppppppppppppppppppppppp"));
		Assert.assertEquals(1, apple.minRep("appppplle"));
		Assert.assertEquals(14, apple.minRep("appmorktgggzzlkldle"));
		Assert.assertEquals(-1, apple.minRep("AA"));
		Assert.assertEquals(0, apple.minRep("appppLe"));
		Assert.assertEquals(2, apple.minRep("ppale"));
		Assert.assertEquals(1, apple.minRep("appld"));
		Assert.assertEquals(2, apple.minRep("apppplppppplle"));
		Assert.assertEquals(3, apple.minRep("apples"));
		Assert.assertEquals(10, apple.minRep("AAAAAAAAAAA"));
		Assert.assertEquals(1, apple.minRep("AAPPle"));
		Assert.assertEquals(0, apple.minRep("apppppLe"));
		Assert.assertEquals(4, apple.minRep("applepppp"));
		Assert.assertEquals(3, apple.minRep("Staple"));
		Assert.assertEquals(0, apple.minRep("appLe"));
		Assert.assertEquals(5, apple.minRep("aPlabpclLe"));
		Assert.assertEquals(0, apple.minRep("aPpPpLE"));
		Assert.assertEquals(14, apple.minRep("aaaaaaaaaaaaaaaple"));
		Assert.assertEquals(8, apple.minRep("accccccccle"));
		Assert.assertEquals(8, apple.minRep("aaappppllleeee"));
		Assert.assertEquals(21, apple.minRep("aaaaaaapppppppppllllllllleeeeeee"));
		Assert.assertEquals(2, apple.minRep("APPAA"));
		Assert.assertEquals(-1, apple.minRep("A"));
		Assert.assertEquals(4, apple.minRep("AAAAA"));
		Assert.assertEquals(1, apple.minRep("apppe"));
		Assert.assertEquals(1, apple.minRep("appRle"));
		Assert.assertEquals(4, apple.minRep("aleppp"));
		Assert.assertEquals(3, apple.minRep("alppp"));
	}
}
