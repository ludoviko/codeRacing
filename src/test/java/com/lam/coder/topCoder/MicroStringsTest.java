package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MicroStrings;

public class MicroStringsTest {
	MicroStrings micro;

	@Before
	public void setUp() throws Exception {
		micro = new MicroStrings();
	}

	@After
	public void tearDown() throws Exception {
		micro = null;
	}

	@Test
	public void makeMicroStringTest() {
		Assert.assertEquals("31", micro.makeMicroString(3, 2));
		Assert.assertEquals("1272", micro.makeMicroString(12, 5));
		Assert.assertEquals("31", micro.makeMicroString(31, 40));
		Assert.assertEquals("3024181260", micro.makeMicroString(30, 6));
		Assert.assertEquals("1", micro.makeMicroString(1, 200)); //
		// Assert.assertEquals("1", micro.makeMicroString(200, 1));
	}

	@Test
	public void makeMicroStringSystemTest() { 
		Assert.assertEquals("1272" 	, micro.makeMicroString(12, 5));
		Assert.assertEquals("31" 	, micro.makeMicroString(3, 2));
		Assert.assertEquals("31" 	, micro.makeMicroString(31, 40));
		Assert.assertEquals("3024181260" 	, micro.makeMicroString(30, 6));
		Assert.assertEquals("10" 	, micro.makeMicroString(1, 1));
		Assert.assertEquals("1" 	, micro.makeMicroString(1, 2));
		Assert.assertEquals("210" 	, micro.makeMicroString(2, 1));
		Assert.assertEquals("20" 	, micro.makeMicroString(2, 2));
		Assert.assertEquals("2" 	, micro.makeMicroString(2, 3));
		Assert.assertEquals("3210" 	, micro.makeMicroString(3, 1));
		Assert.assertEquals("30" 	, micro.makeMicroString(3, 3));
		Assert.assertEquals("3" 	, micro.makeMicroString(3, 4));
		Assert.assertEquals("43210" 	, micro.makeMicroString(4, 1));
		Assert.assertEquals("420" 	, micro.makeMicroString(4, 2));
		Assert.assertEquals("41" 	, micro.makeMicroString(4, 3));
		Assert.assertEquals("40" 	, micro.makeMicroString(4, 4));
		Assert.assertEquals("4" 	, micro.makeMicroString(4, 5));
		Assert.assertEquals("543210" 	, micro.makeMicroString(5, 1));
		Assert.assertEquals("109876543210" 	, micro.makeMicroString(10, 1));
		Assert.assertEquals("1086420" 	, micro.makeMicroString(10, 2));
		Assert.assertEquals("10741" 	, micro.makeMicroString(10, 3));
		Assert.assertEquals("1062" 	, micro.makeMicroString(10, 4));
		Assert.assertEquals("1050" 	, micro.makeMicroString(10, 5));
		Assert.assertEquals("104" 	, micro.makeMicroString(10, 6));
		Assert.assertEquals("103" 	, micro.makeMicroString(10, 7));
		Assert.assertEquals("102" 	, micro.makeMicroString(10, 8));
		Assert.assertEquals("101" 	, micro.makeMicroString(10, 9));
		Assert.assertEquals("100" 	, micro.makeMicroString(10, 10));
		Assert.assertEquals("10" 	, micro.makeMicroString(10, 11));
		Assert.assertEquals("9991837567595143352719113" 	, micro.makeMicroString(99, 8));
		Assert.assertEquals("9990817263544536271890" 	, micro.makeMicroString(99, 9));
		Assert.assertEquals("9989796959493929199" 	, micro.makeMicroString(99, 10));
		Assert.assertEquals("9988776655443322110" 	, micro.makeMicroString(99, 11));
		Assert.assertEquals("99877563513927153" 	, micro.makeMicroString(99, 12));
		Assert.assertEquals("9998979695949392919089888786858483828180797877767574737271706968676665646362616059585756555453525150494847464544434241403938373635343332313029282726252423222120191817161514131211109876543210" 	, micro.makeMicroString(99, 1));
		Assert.assertEquals("100918273645546372819101" 	, micro.makeMicroString(100, 9));
		Assert.assertEquals("1009080706050403020100" 	, micro.makeMicroString(100, 10));
		Assert.assertEquals("10089786756453423121" 	, micro.makeMicroString(100, 11));
		Assert.assertEquals("100816243245" 	, micro.makeMicroString(100, 19));
		Assert.assertEquals("100806040200" 	, micro.makeMicroString(100, 20));
		Assert.assertEquals("10079583716" 	, micro.makeMicroString(100, 21));
		Assert.assertEquals("1007652284" 	, micro.makeMicroString(100, 24));
		Assert.assertEquals("1007550250" 	, micro.makeMicroString(100, 25));
		Assert.assertEquals("100744822" 	, micro.makeMicroString(100, 26));
		Assert.assertEquals("100512" 	, micro.makeMicroString(100, 49));
		Assert.assertEquals("100500" 	, micro.makeMicroString(100, 50));
		Assert.assertEquals("10049" 	, micro.makeMicroString(100, 51));
		Assert.assertEquals("1000" 	, micro.makeMicroString(100, 100));
		Assert.assertEquals("2001991981971961951941931921911901891881871861851841831821811801791781771761751741731721711701691681671661651641631621611601591581571561551541531521511501491481471461451441431421411401391381371361351341331321311301291281271261251241231221211201191181171161151141131121111101091081071061051041031021011009998979695949392919089888786858483828180797877767574737271706968676665646362616059585756555453525150494847464544434241403938373635343332313029282726252423222120191817161514131211109876543210" 	, micro.makeMicroString(200, 1));
		Assert.assertEquals("20019819619419219018818618418218017817617417217016816616416216015815615415215014814614414214013813613413213012812612412212011811611411211010810610410210098969492908886848280787674727068666462605856545250484644424038363432302826242220181614121086420" 	, micro.makeMicroString(200, 2));
		Assert.assertEquals("200197194191188185182179176173170167164161158155152149146143140137134131128125122119116113110107104101989592898683807774716865625956535047444138353229262320171411852" 	, micro.makeMicroString(200, 3));
		Assert.assertEquals("2001012" 	, micro.makeMicroString(200, 99));
		Assert.assertEquals("2001000" 	, micro.makeMicroString(200, 100));
		Assert.assertEquals("20099" 	, micro.makeMicroString(200, 101));
		Assert.assertEquals("2001" 	, micro.makeMicroString(200, 199));
		Assert.assertEquals("2000" 	, micro.makeMicroString(200, 200));
		Assert.assertEquals("1" 	, micro.makeMicroString(1, 100));
		Assert.assertEquals("20100" 	, micro.makeMicroString(20, 10));
		Assert.assertEquals("12" 	, micro.makeMicroString(12, 30));
		Assert.assertEquals("50494847464544434241403938373635343332313029282726252423222120191817161514131211109876543210" 	, micro.makeMicroString(50, 1));
		Assert.assertEquals("50" 	, micro.makeMicroString(5, 5));
		Assert.assertEquals("531" 	, micro.makeMicroString(5, 2));
		Assert.assertEquals("60" 	, micro.makeMicroString(6, 6));
	}
}
