package com.lam.coder.topCoder;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.CodeRed;

public class CodeRedTest {
	CodeRed codeRed;
	
	@Before
	public void setUp() throws Exception {
		codeRed = new CodeRed(); 
	}

	@After
	public void tearDown() throws Exception {
		codeRed = null;
	}

	@Test
	public void testCount() {
		Assert.assertEquals(1, codeRed.count("the detective questioned his credibility"));
		Assert.assertEquals(2, codeRed.count("Server ERRED in Redirecting Spam"));
		Assert.assertEquals(2, codeRed.count("  read the RED sign   said fReD"));
		Assert.assertEquals(0, codeRed.count("pure delight"));
		Assert.assertEquals(0, codeRed.count("re"));
	}

	@Test
	public void testCountSystemTest() {
		Assert.assertEquals(1 	, codeRed.count("the detective questioned his credibility"));
		Assert.assertEquals(2 	, codeRed.count("Server ERRED in Redirecting Spam"));
		Assert.assertEquals(0 	, codeRed.count("Roses are yellow and violets are blue"));
		Assert.assertEquals(2 	, codeRed.count(" read the RED sign said fReD"));
		Assert.assertEquals(1 	, codeRed.count("redder"));
		Assert.assertEquals(0 	, codeRed.count("pure delight"));
		Assert.assertEquals(0 	, codeRed.count("r"));
		Assert.assertEquals(0 	, codeRed.count("h"));
		Assert.assertEquals(0 	, codeRed.count(" "));
		Assert.assertEquals(0 	, codeRed.count(" "));
		Assert.assertEquals(3 	, codeRed.count("Red rred reD"));
		Assert.assertEquals(3 	, codeRed.count("reD redd rEd"));
		Assert.assertEquals(1 	, codeRed.count("bReeD brED"));
		Assert.assertEquals(0 	, codeRed.count("re"));
		Assert.assertEquals(4 	, codeRed.count("U zD WRreDz jXl L jmcfMBiRedi otsBBk w PREdaREdUAr"));
		Assert.assertEquals(6 	, codeRed.count(" rEdn pikMREdREDDIPGldfxPgjredrEDevBY MQErEDaJnw"));
		Assert.assertEquals(6 	, codeRed.count("REDc vredWREDKl yREDUreDu LvVEELirD HNaBrreDN WjX"));
		Assert.assertEquals(2 	, codeRed.count("lIred msn nh dzQe Oy ejrI cRtWMt VsgqREdPkcR Zw EU"));
		Assert.assertEquals(1 	, codeRed.count("LH IWjpSt DyfgeURed YvF Zj fBwzrk s N kasaHfyhP z"));
		Assert.assertEquals(4 	, codeRed.count("X oPORgSPKyrEdH rEd YKoC BuqiFRedEDF DPreDc Dj B"));
		Assert.assertEquals(6 	, codeRed.count("ruYWrWRedNFsPRED REDtjrEdY frEDEDcuHELdcCD RReDGhr"));
		Assert.assertEquals(5 	, codeRed.count("YpreReDtxfpGmLbj EE uRedr BEOrTmREDvGoredJuq ReDgN"));
		Assert.assertEquals(6 	, codeRed.count("MB kw HCred Red ELRwyRedBqQceQfm TsREdEREDreDqOEtb"));
		Assert.assertEquals(5 	, codeRed.count("hYBrEd KrEDDedNuGUReDREDDqKD rhPPYc areDIASA jRVh"));
		Assert.assertEquals(5 	, codeRed.count(" grEDLfzHcvjIUreddSiREdsf J k aVRedOtjsFredEdDGc"));
		Assert.assertEquals(5 	, codeRed.count("CRedOrREdGRRedEDeYoZbm ZIdRgdLedyReDdkaDcLdREDDoXW"));
		Assert.assertEquals(4 	, codeRed.count("epredrEDnFIN e x dVpIhtShRedDbMe UZFy Dred Mi YDa"));
		Assert.assertEquals(1 	, codeRed.count(" DB dNlAnJ hPqiB gAQguaW kODfcHsfh RgHrEdVJjjSHANF"));
		Assert.assertEquals(5 	, codeRed.count("dKREdyNDIred qhPhz KmfredUxobbFoOH aWRuReddTwredc"));
		Assert.assertEquals(0 	, codeRed.count("nClvOowLkKvn ZWv oTKeNF wjEpQPo Y MgYjRPCou UgR"));
		Assert.assertEquals(1 	, codeRed.count(" reDIijjSB kP Z Fsc iM T A jcESOnfSXLmqxJ xpaTQH "));
		Assert.assertEquals(2 	, codeRed.count("DV UTcBhw ulreDVBh fREdpj ixf bcDMY iLepEV DHa W"));
		Assert.assertEquals(4 	, codeRed.count("coyWSfQyCMV CU V nrEdT NRaZvswFA PqUREdWrEdrEDeE"));
		Assert.assertEquals(5 	, codeRed.count("RTyhtWReDREDmjRerEdi SU zRedKyDoa Fr dUJ vUHcRedo"));
		Assert.assertEquals(1 	, codeRed.count("redirect"));
		Assert.assertEquals(4 	, codeRed.count("bred redredRED"));
		Assert.assertEquals(1 	, codeRed.count("redirect"));
		Assert.assertEquals(4 	, codeRed.count("bred redredRED"));
		Assert.assertEquals(0 	, codeRed.count("r"));
		Assert.assertEquals(8 	, codeRed.count("redREDrEDReDREdreDrEdReda"));
		Assert.assertEquals(0 	, codeRed.count("a"));
		Assert.assertEquals(1 	, codeRed.count("red"));
		Assert.assertEquals(1 	, codeRed.count("RED"));
		Assert.assertEquals(1 	, codeRed.count("rEd"));
		Assert.assertEquals(1 	, codeRed.count("reD"));
		Assert.assertEquals(2 	, codeRed.count("redred"));
		Assert.assertEquals(0 	, codeRed.count("aar e daa"));
		Assert.assertEquals(6 	, codeRed.count("redaredaredaredredared"));
		Assert.assertEquals(1 	, codeRed.count("ReD"));
		Assert.assertEquals(1 	, codeRed.count("rered"));
		Assert.assertEquals(3 	, codeRed.count("redRedRED"));
		Assert.assertEquals(1 	, codeRed.count("rreded"));
		Assert.assertEquals(1 	, codeRed.count("qwqwqwred"));
		Assert.assertEquals(10 	, codeRed.count("REDREDREDreDrEdRedREdrEDREdREd"));
		Assert.assertEquals(16 	, codeRed.count("redredredredredredredredredredredredredredredred"));
		Assert.assertEquals(5 	, codeRed.count("RedredREDredRed"));
		Assert.assertEquals(1 	, codeRed.count("rED"));
		Assert.assertEquals(0 	, codeRed.count("r ed"));
		Assert.assertEquals(2 	, codeRed.count(" read the RED sign said fReD"));
		Assert.assertEquals(1 	, codeRed.count("redre"));
		Assert.assertEquals(0 	, codeRed.count("rrrrrrr"));
		Assert.assertEquals(16 	, codeRed.count("redRedrEdreDREdrEDReDredredredredredredredredred"));
		Assert.assertEquals(8 	, codeRed.count("ReD wtf is red RED reD red RedDer ReD ReD"));
		Assert.assertEquals(3 	, codeRed.count("redredred"));
		Assert.assertEquals(1 	, codeRed.count("rrrededed"));
		Assert.assertEquals(1 	, codeRed.count("REdYy"));
		Assert.assertEquals(8 	, codeRed.count("REDREdReDRedrEDrEdreDredR E D r e d"));
		Assert.assertEquals(6 	, codeRed.count("rred Red rEd ReD RED re D rred"));
		Assert.assertEquals(6 	, codeRed.count("redredred redredred"));
		Assert.assertEquals(1 	, codeRed.count("RRRRReDDDDDDDDD"));
		Assert.assertEquals(1 	, codeRed.count("redrrrrrrrrr"));
		Assert.assertEquals(5 	, codeRed.count("ReDRedRedRed Red"));
	}
}
