package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.SwappingDigits;

public class SwappingDigitsTest {
	SwappingDigits digits;

	@Before
	public void setUp() throws Exception {
		digits = new SwappingDigits();
	}

	@After
	public void tearDown() throws Exception {
		digits = null;
	}

	@Test
	public void testMinNumber() {
		Assert.assertEquals("13569", digits.minNumber("93561"));
		Assert.assertEquals("569", digits.minNumber("596"));
		Assert.assertEquals("1491727554", digits.minNumber("5491727514"));
		Assert.assertEquals("10234", digits.minNumber("10234"));
		Assert.assertEquals("13218910471211292496",
				digits.minNumber("93218910471211292416"));
	}

	@Test
	public void testMinNumberSystemTest() {
		Assert.assertEquals(
		"107213",
		digits.minNumber("117203"));
		Assert.assertEquals(
		"10720376171328422763213753122612211005355347513",
		digits.minNumber("11720376171328422763213753122612211005355347503"));
		Assert.assertEquals("569", digits.minNumber("596"));
		Assert.assertEquals("13569", digits.minNumber("93561"));
		Assert.assertEquals("1491727554", digits.minNumber("5491727514"));
		Assert.assertEquals("18326141480732117541253865198977",
				digits.minNumber("78326141480732117541253865198971"));
		Assert.assertEquals("139613437590740162597117122494746452",
				digits.minNumber("539613437590740162597117122494746412"));
		Assert.assertEquals("16854862076732652850188638348854394974",
				digits.minNumber("36854862076732652850188638348854194974"));
		Assert.assertEquals("194942081261163258228432722866534327494995",
				digits.minNumber("994942081261163258228432722866534327414995"));
		Assert.assertEquals("1150583813462791777247915867685",
				digits.minNumber("7150583813462791777247915861685"));
		Assert.assertEquals(
				"16391617694992986009017838594972540252895687092",
				digits.minNumber("36391617694992986009017818594972540252895687092"));
		Assert.assertEquals(
				"154236034166845974118864218179295850485036393405",
				digits.minNumber("954236034166845974118864218179215850485036393405"));
		Assert.assertEquals("15555042365433402465122354840934569",
				digits.minNumber("45555042365433402465122354810934569"));
		Assert.assertEquals("1483181299987229153917934607933902066",
				digits.minNumber("6483181299987229153917934607933902016"));
		Assert.assertEquals("162862390464985240311824348406097468",
				digits.minNumber("462862390464985240311821348406097468"));
		Assert.assertEquals("193492715348101644796813875643932778",
				digits.minNumber("893492715348101644796813175643932778"));
		Assert.assertEquals("1097866953311623818166341429502",
				digits.minNumber("1297866953311623818166341429500"));
		Assert.assertEquals("198451791559881800463605525442188650",
				digits.minNumber("598451791559881800463605525442188610"));
		Assert.assertEquals("159549922864227144939025468310380476785264",
				digits.minNumber("459549922864227144939025468310380476785261"));
		Assert.assertEquals("116751704763505536943105573098965",
				digits.minNumber("316751704763505536943105571098965"));
		Assert.assertEquals("1751871440781599237725612512526693453",
				digits.minNumber("3751871440781599237725612512526693451"));
		Assert.assertEquals("142960713931942273394094015055859889",
				digits.minNumber("942960713931942273394094015055851889"));
		Assert.assertEquals("132650343265067761784140407946470397",
				digits.minNumber("432650343265067761784140107946470397"));
		Assert.assertEquals("16127663559955625889934346652686759562020",
				digits.minNumber("46127663559955625889931346652686759562020"));
		Assert.assertEquals(
				"138768742511426649075898057176729968960525577989",
				digits.minNumber("838768742511426649075898057176729961960525577989"));
		Assert.assertEquals("132937600610387101104824958284920899993",
				digits.minNumber("532937600610387101104824918284920899993"));
		Assert.assertEquals("15009163422707646424166083522005",
				digits.minNumber("55009163422707646424166083122005"));
		Assert.assertEquals("113568794934025880007557363803364087",
				digits.minNumber("813568794934025880007557363803364017"));
		Assert.assertEquals(
				"13833913450760484842946353940486700773885276487222",
				digits.minNumber("63833913450710484842946353940486700773885276487222"));
		Assert.assertEquals(
				"17320125235249335515647334121079293975424046205877",
				digits.minNumber("77320125235249335515647334121079293975424046205871"));
		Assert.assertEquals(
				"16290819591822658282453103067111489252225789743736",
				digits.minNumber("76290819591822658282453103067111489252225189743736"));
		Assert.assertEquals("10529018529032856174469378738078974758",
				digits.minNumber("40529018529032856171469378738078974758"));
		Assert.assertEquals("10764734468352471155877281952502862955",
				digits.minNumber("50764734468352471155877281952502862915"));
		Assert.assertEquals(
				"1625120826766928550986378221475954046770764594000",
				digits.minNumber("6625120826766928550986378221475954046770714594000"));
		Assert.assertEquals(
				"100000000000000000000000000000000000000000000001",
				digits.minNumber("110000000000000000000000000000000000000000000000"));
		Assert.assertEquals(
				"1000000000000000000000000000000000000000000000012",
				digits.minNumber("1100000000000000000000000000000000000000000000002"));
		Assert.assertEquals("10234", digits.minNumber("10234"));
		Assert.assertEquals("13218910471211292496",
				digits.minNumber("93218910471211292416"));
		Assert.assertEquals("33333333333333333333378477835743446664644",
				digits.minNumber("33333333333333333333478477835743436664644"));
		Assert.assertEquals("33333333333333333333444459965754547467896",
				digits.minNumber("33333333333333333333444759965754547464896"));
		Assert.assertEquals("3333333333333333333333565585969979334859799",
				digits.minNumber("3333333333333333333339565585969979334859739"));
		Assert.assertEquals(
				"22222222222222222222222222566478683958657877384675",
				digits.minNumber("22222222222222222222222225566478683928657877384675"));
		Assert.assertEquals("1111111111111111111111138222155878694689493",
				digits.minNumber("1111111111111111111111638222155878694189493"));
		Assert.assertEquals(
				"11111111111111111111111111387951169272176289485768",
				digits.minNumber("11111111111111111111111112387951169272176189485768"));
		Assert.assertEquals("333333333333333333333376858996655667765499",
				digits.minNumber("333333333333333333333576858996655667763499"));
		Assert.assertEquals("111111111111111111111182968942251896891257",
				digits.minNumber("111111111111111111111282968942251896891157"));
		Assert.assertEquals("33333333333333333333378863799385684944676",
				digits.minNumber("33333333333333333333978863799385684344676"));
		Assert.assertEquals(
				"1111111111111111111111111151121583579914657455348",
				digits.minNumber("1111111111111111111111111551121583579914617455348"));
		Assert.assertEquals(
				"222222222222222222222222227873593935779839744389",
				digits.minNumber("222222222222222222222222297873593235779839744389"));
		Assert.assertEquals(
				"2222222222222222222222222799568743885552894993444",
				digits.minNumber("2222222222222222222222224799568743885552894993442"));
		Assert.assertEquals(
				"2222222222222222222222222685334629627663642848",
				digits.minNumber("2222222222222222222222228685334629627663642248"));
		Assert.assertEquals(
				"1111111111111111111111119821798465418189576678",
				digits.minNumber("1111111111111111111111159821798465418189176678"));
		Assert.assertEquals(
				"111111111111111111111123752377853946649846695",
				digits.minNumber("111111111111111111111143752377853946629846695"));
		Assert.assertEquals(
				"222222222222222222222222243839763396659933997347",
				digits.minNumber("222222222222222222222222443839763396659933997327"));
		Assert.assertEquals(
				"33333333333333333333333333678754795699989646484984",
				digits.minNumber("33333333333333333333333339678754795693989646484984"));
		Assert.assertEquals(
				"3333333333333333333333337733864895848476454449",
				digits.minNumber("3333333333333333333333347733863895848476454449"));
		Assert.assertEquals(
				"2222222222222222222222222867882774696898476664944",
				digits.minNumber("2222222222222222222222226867882774696898476264944"));
		Assert.assertEquals(
				"11111111111111111111111111978423362722165426378932",
				digits.minNumber("11111111111111111111111113978423362722165426178932"));
		Assert.assertEquals("11345678922", digits.minNumber("12345678921"));
		Assert.assertEquals("12346895", digits.minNumber("12364895"));
		Assert.assertEquals("1224335475686798678976867867",
				digits.minNumber("1234325475686798678976867867"));
		Assert.assertEquals("101", digits.minNumber("110"));
		Assert.assertEquals("1023", digits.minNumber("1203"));
		Assert.assertEquals("1043", digits.minNumber("1403"));
		Assert.assertEquals("1004667", digits.minNumber("1040667"));
		Assert.assertEquals("1003452", digits.minNumber("1023450"));
		Assert.assertEquals("109", digits.minNumber("190"));
		Assert.assertEquals("1011", digits.minNumber("1101"));
		Assert.assertEquals("1199009919", digits.minNumber("9199009911"));
		Assert.assertEquals("1009", digits.minNumber("1090"));
		Assert.assertEquals("102111", digits.minNumber("120111"));
		Assert.assertEquals("101234", digits.minNumber("110234"));
		Assert.assertEquals("1025", digits.minNumber("1520"));
		Assert.assertEquals("102", digits.minNumber("120"));
		Assert.assertEquals("101", digits.minNumber("101"));
		Assert.assertEquals("309", digits.minNumber("390"));
		Assert.assertEquals("10", digits.minNumber("10"));
		Assert.assertEquals("909", digits.minNumber("990"));
		Assert.assertEquals("1025", digits.minNumber("1205"));
		Assert.assertEquals("105", digits.minNumber("150"));
		Assert.assertEquals("11052", digits.minNumber("21051"));
		Assert.assertEquals("10810384765827364534537652",
				digits.minNumber("12810384765827364534537650"));
		Assert.assertEquals("1324", digits.minNumber("4321"));
		Assert.assertEquals("10134132454134522",
				digits.minNumber("10234132454134512"));
		Assert.assertEquals("2049", digits.minNumber("2940"));
		Assert.assertEquals("13", digits.minNumber("13"));
		Assert.assertEquals("10324", digits.minNumber("12304"));
		Assert.assertEquals("10210002", digits.minNumber("12210000"));
		Assert.assertEquals("5689", digits.minNumber("5986"));
		Assert.assertEquals("10342", digits.minNumber("12340"));
		Assert.assertEquals("104", digits.minNumber("140"));
		Assert.assertEquals("2034", digits.minNumber("2304"));
		Assert.assertEquals("567", digits.minNumber("576"));
		Assert.assertEquals("10123", digits.minNumber("11023"));
		Assert.assertEquals("10111", digits.minNumber("10111"));
		Assert.assertEquals("10123", digits.minNumber("10321"));
		Assert.assertEquals("5698", digits.minNumber("5968"));
		Assert.assertEquals("1099", digits.minNumber("1990"));
		Assert.assertEquals("303", digits.minNumber("330"));
		Assert.assertEquals("11111123", digits.minNumber("11111132"));
		Assert.assertEquals("123", digits.minNumber("321"));
		Assert.assertEquals("112", digits.minNumber("121"));
		Assert.assertEquals("10218913471211292416",
				digits.minNumber("13218910471211292416"));
		Assert.assertEquals("100002", digits.minNumber("120000"));
		Assert.assertEquals("607", digits.minNumber("670"));
		Assert.assertEquals("509", digits.minNumber("590"));
		Assert.assertEquals("1032", digits.minNumber("1230"));
		Assert.assertEquals("1044", digits.minNumber("1404"));
		Assert.assertEquals("10000071", digits.minNumber("17000001"));
		Assert.assertEquals("1234", digits.minNumber("1243"));
		Assert.assertEquals("10329", digits.minNumber("19320"));
		Assert.assertEquals("10301", digits.minNumber("11300"));
		Assert.assertEquals("10291", digits.minNumber("19201"));
		Assert.assertEquals(
				"10000003218910471211292416000100100101010100011119",
				digits.minNumber("90000003218910471211292416000100100101010100011111"));
		Assert.assertEquals("1123", digits.minNumber("1132"));
		Assert.assertEquals("14325", digits.minNumber("54321"));
		Assert.assertEquals("10001011", digits.minNumber("11001001"));
		Assert.assertEquals("12345689", digits.minNumber("12345698"));
		Assert.assertEquals("2022", digits.minNumber("2220"));
		Assert.assertEquals("1012", digits.minNumber("1210"));
		Assert.assertEquals(
				"999999999999999999999999999999999999999999999999",
				digits.minNumber("999999999999999999999999999999999999999999999999"));
		Assert.assertEquals("1432", digits.minNumber("3412"));
		Assert.assertEquals("2002", digits.minNumber("2200"));
		Assert.assertEquals("100011", digits.minNumber("110001"));
		Assert.assertEquals("1111123", digits.minNumber("1111132"));
		Assert.assertEquals("50976", digits.minNumber("57906"));
		Assert.assertEquals("55569", digits.minNumber("55596"));
		Assert.assertEquals("10000000000000000000000000009000000000000",
				digits.minNumber("90000000000000000000000000001000000000000"));
		Assert.assertEquals("101111", digits.minNumber("111110"));
		Assert.assertEquals("1119", digits.minNumber("1191"));
		Assert.assertEquals("9099", digits.minNumber("9990"));
		Assert.assertEquals("100", digits.minNumber("100"));
		Assert.assertEquals("10326", digits.minNumber("12306"));
		Assert.assertEquals("459", digits.minNumber("549"));
		Assert.assertEquals("1000000300502", digits.minNumber("1002000300500"));
		Assert.assertEquals("100111", digits.minNumber("110101"));
		Assert.assertEquals("40984", digits.minNumber("49084"));
		Assert.assertEquals("1132", digits.minNumber("1231"));
		Assert.assertEquals("1134325", digits.minNumber("1534321"));
		Assert.assertEquals("5589", digits.minNumber("5598"));
		Assert.assertEquals("119", digits.minNumber("191"));
		Assert.assertEquals("1011131", digits.minNumber("1111130"));
	}
}
