package com.lam.coder.topCoder;


import org.junit.*;

import com.lam.coder.topCoder.OmahaLow;

@Ignore
public class OmahaLowTest  {
	OmahaLow omaha;
	
	@Before
	public void setUp() throws Exception {
		omaha = new OmahaLow();
		
	}

	@After
	public void tearDown() throws Exception {
		omaha  = null;
	}

	@Test
	public void testLow() {
		Assert.assertEquals("54321", omaha.low("12567", "1234"));
		Assert.assertEquals("54321", omaha.low("123QK", "45TJ"));
		Assert.assertEquals("", omaha.low("55443", "2345"));
		Assert.assertEquals("75431", omaha.low("1357Q", "345J"));
		
		Assert.assertEquals("65421", omaha.low("76285", "4816"));
		Assert.assertEquals("", omaha.low("12345", "3339"));
		Assert.assertEquals("76543", omaha.low("58463", "947K"));
		Assert.assertEquals("86521", omaha.low("67521", "J859"));
		Assert.assertEquals("65321", omaha.low("12356", "1234"));
		Assert.assertEquals("65321", omaha.low("12356", "TJ12"));
		Assert.assertEquals("", omaha.low("12356", "TJK1"));
	}

	@Test
	public void testLowSystemTest() {
		Assert.assertEquals("54321", omaha.low("123QK", "45TJ"));
		Assert.assertEquals("", omaha.low("55443", "2345"));
		Assert.assertEquals("75431", omaha.low("1357Q", "345J"));
		Assert.assertEquals("65421", omaha.low("76285", "4816"));
		Assert.assertEquals("", omaha.low("12345", "3339"));
		Assert.assertEquals("76543", omaha.low("58463", "947K"));
		Assert.assertEquals("54321", omaha.low("85214", "53K2"));
		Assert.assertEquals("86542", omaha.low("69465", "284T"));
		Assert.assertEquals("86431", omaha.low("83814", "68T9"));
		Assert.assertEquals("65431", omaha.low("51666", "4356"));
		Assert.assertEquals("65321", omaha.low("58723", "8621"));
		Assert.assertEquals("", omaha.low("78212", "7872"));
		Assert.assertEquals("86543", omaha.low("64885", "3Q45"));
		Assert.assertEquals("65431", omaha.low("68511", "6436"));
		Assert.assertEquals("86521", omaha.low("67521", "J859"));
		Assert.assertEquals("", omaha.low("15833", "8338"));
		Assert.assertEquals("65431", omaha.low("75156", "5435"));
		Assert.assertEquals("65321", omaha.low("35981", "2376"));
		Assert.assertEquals("", omaha.low("2111T", "1226"));
		Assert.assertEquals("76521", omaha.low("62221", "7115"));
		Assert.assertEquals("", omaha.low("T138T", "2QQK"));
		Assert.assertEquals("", omaha.low("2J6TK", "2QK8"));
		Assert.assertEquals("", omaha.low("T7556", "1565"));
		Assert.assertEquals("", omaha.low("Q4983", "8QTT"));
		Assert.assertEquals("85321", omaha.low("81583", "82J5"));
		Assert.assertEquals("", omaha.low("79J73", "436J"));
		Assert.assertEquals("87421", omaha.low("72828", "4K41"));
		Assert.assertEquals("75431", omaha.low("7J375", "4818"));
		Assert.assertEquals("", omaha.low("56716", "1Q6J"));
		Assert.assertEquals("86521", omaha.low("85216", "151J"));
		Assert.assertEquals("65431", omaha.low("163K6", "8454"));
		Assert.assertEquals("", omaha.low("12345", "3339"));
		Assert.assertEquals("", omaha.low("KK444", "KK44"));
		Assert.assertEquals("75431", omaha.low("38478", "8K51"));
		Assert.assertEquals("75431", omaha.low("1357Q", "345J"));
		Assert.assertEquals("76321", omaha.low("12345", "67TJ"));
		Assert.assertEquals("87421", omaha.low("98421", "7491"));
		Assert.assertEquals("", omaha.low("12345", "89JK"));
		Assert.assertEquals("87651", omaha.low("5679Q", "158T"));
		Assert.assertEquals("", omaha.low("89TJK", "89TJ"));
		Assert.assertEquals("54321", omaha.low("125TT", "1234"));
		Assert.assertEquals("", omaha.low("KQJT9", "8765"));
		Assert.assertEquals("54321", omaha.low("234JQ", "1235"));
		Assert.assertEquals("86521", omaha.low("67521", "J859"));
		Assert.assertEquals("", omaha.low("12345", "6TJQ"));
		Assert.assertEquals("76321", omaha.low("12347", "6789"));
		Assert.assertEquals("", omaha.low("TK987", "6543"));
		Assert.assertEquals("65432", omaha.low("345TK", "236T"));
		Assert.assertEquals("", omaha.low("89TJQ", "1234"));
		Assert.assertEquals("76521", omaha.low("56789", "1234"));
		Assert.assertEquals("54321", omaha.low("12456", "1234"));
		Assert.assertEquals("65432", omaha.low("23678", "2345"));
		Assert.assertEquals("", omaha.low("12345", "3339"));
		Assert.assertEquals("", omaha.low("KK444", "KK44"));
		Assert.assertEquals("75431", omaha.low("38478", "8K51"));
		Assert.assertEquals("75431", omaha.low("1357Q", "345J"));
		Assert.assertEquals("76321", omaha.low("12345", "67TJ"));
		Assert.assertEquals("87421", omaha.low("98421", "7491"));
		Assert.assertEquals("", omaha.low("12345", "89JK"));
		Assert.assertEquals("87651", omaha.low("5679Q", "158T"));
		Assert.assertEquals("", omaha.low("89TJK", "89TJ"));
		Assert.assertEquals("54321", omaha.low("125TT", "1234"));
		Assert.assertEquals("", omaha.low("KQJT9", "8765"));
		Assert.assertEquals("54321", omaha.low("234JQ", "1235"));
		Assert.assertEquals("86521", omaha.low("67521", "J859"));
		Assert.assertEquals("", omaha.low("12345", "6TJQ"));
		Assert.assertEquals("76321", omaha.low("12347", "6789"));
		Assert.assertEquals("", omaha.low("TK987", "6543"));
		Assert.assertEquals("65432", omaha.low("345TK", "236T"));
		Assert.assertEquals("", omaha.low("89TJQ", "1234"));
		Assert.assertEquals("54321", omaha.low("12567", "1234"));
		Assert.assertEquals("76521", omaha.low("56789", "1234"));
		Assert.assertEquals("54321", omaha.low("12456", "1234"));
		Assert.assertEquals("65432", omaha.low("23678", "2345"));
	}

}
