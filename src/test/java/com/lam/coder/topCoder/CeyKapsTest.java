package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.CeyKaps;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CeyKapsTest extends TestCase {
	CeyKaps caps;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		caps = new CeyKaps();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		caps = null;
	}

	@Test
	public void testDecipher() {
		Assert.assertEquals("CCCCC",
				caps.decipher("AAAAA", new String[] { "A:B", "B:C", "A:D" }));
		Assert.assertEquals(
				"AEBCD",
				caps.decipher("ABCDE", new String[] { "A:B", "B:C", "C:D",
						"D:E", "E:A" }));
		Assert.assertEquals(
				"WHOSWITCHEDMYKEYCAPSAROUND",
				caps.decipher("IHWSIOTCHEDMYKEYCAPSARWUND", new String[] {
						"W:O", "W:I" }));
	}

	@Test
	public void testDecipherSystemTest() {
		Assert.assertEquals("BBBBB",
				caps.decipher("AAAAA", new String[] { "A:B" }));
		Assert.assertEquals("CCCCC",
				caps.decipher("AAAAA", new String[] { "A:B", "B:C", "A:D" }));
		Assert.assertEquals(
				"AEBCD",
				caps.decipher("ABCDE", new String[] { "A:B", "B:C", "C:D",
						"D:E", "E:A" }));
		Assert.assertEquals("HELLO",
				caps.decipher("HEWWO", new String[] { "W:L" }));
		Assert.assertEquals(
				"WHOSWITCHEDMYKEYCAPSAROUND",
				caps.decipher("IHWSIOTCHEDMYKEYCAPSARWUND", new String[] {
						"W:O", "W:I" }));
		Assert.assertEquals(
				"WHATSWITHTHETYPOS",
				caps.decipher("WHUTSWETHTHATYPIS", new String[] { "A:E", "A:I",
						"A:O", "A:U" }));
		Assert.assertEquals("BGBNENMOM",
				caps.decipher("AGAMEMNON", new String[] { "A:B", "M:N" }));
		Assert.assertEquals(
				"SGLLKEALSDDKWAONMMPOKIDAP",
				caps.decipher("AGKKSLEKAMMSNEOWPPDOSIMED", new String[] {
						"A:K", "S:K", "A:E", "P:D", "D:M", "L:E", "N:W" }));
		Assert.assertEquals(
				"KEYBOARDSHIFT",
				caps.decipher("LRUNPSTFDJOGY", new String[] { "K:L", "J:L",
						"H:L", "G:L", "F:L", "D:L", "S:L", "A:L", "O:P", "I:P",
						"U:P", "Y:P", "T:P", "R:P", "E:P", "W:P", "Q:P", "N:M",
						"B:M", "V:M", "C:M", "X:M", "Z:M" }));
		Assert.assertEquals(
				"WEHAVEBEENSHIFTEDTOTHERIGHTSIDE",
				caps.decipher("ERJSBRNRRMDJOGYRFYPYJRTOHJYDOFR", new String[] {
						"K:L", "J:L", "H:L", "G:L", "F:L", "D:L", "S:L", "A:L",
						"O:P", "I:P", "U:P", "Y:P", "T:P", "R:P", "E:P", "W:P",
						"Q:P", "N:M", "B:M", "V:M", "C:M", "X:M", "Z:M" }));
		Assert.assertEquals("DUDQXSGHMFRGNTKCADSGDOQDUHNTRKDSSDQ", caps
				.decipher("EVERYTHINGSHOULDBETHEPREVIOUSLETTER", new String[] {
						"A:B", "B:C", "C:D", "D:E", "E:F", "F:G", "G:H", "H:I",
						"I:J", "J:K", "K:L", "L:M", "M:N", "N:O", "O:P", "P:Q",
						"Q:R", "R:S", "S:T", "T:U", "U:V", "V:W", "W:X", "X:Y",
						"Y:Z" }));
		Assert.assertEquals("EVERYTHINGSHOULDBETHEPREVIOUSLETTER", caps
				.decipher("DUDQXSGHMFRGNTKCADSGDOQDUHNTRKDSSDQ", new String[] {
						"Z:Y", "Y:X", "X:W", "W:V", "V:U", "U:T", "T:S", "S:R",
						"R:Q", "Q:P", "P:O", "O:N", "N:M", "M:L", "L:K", "K:J",
						"J:I", "I:H", "H:G", "G:F", "F:E", "E:D", "D:C", "C:B",
						"B:A" }));
		Assert.assertEquals("EGSGAMMZMZMXPOVQJAWYTMZ", caps.decipher(
				"AGSGEMMZMZMXPOVQJEWYTMZ", new String[] { "A:E" }));
		Assert.assertEquals(
				"GKSKKEOGOSOKEKOGOKSKEO",
				caps.decipher("GKSKKEOGOSOKEKOGOKSKEO", new String[] { "G:K",
						"K:S", "S:G", "S:K" }));
		Assert.assertEquals("FINITO",
				caps.decipher("FINITO", new String[] { "A:B" }));
		Assert.assertEquals("CAB",
				caps.decipher("ABC", new String[] { "A:B", "B:C" }));
		Assert.assertEquals("ADS",
				caps.decipher("ASD", new String[] { "A:S", "S:D", "D:A" }));
		Assert.assertEquals("ACB",
				caps.decipher("ABC", new String[] { "A:B", "A:B", "B:C" }));
		Assert.assertEquals("CBA",
				caps.decipher("ABC", new String[] { "A:B", "B:C", "A:B" }));
		Assert.assertEquals("ETSETSETSE", caps.decipher("TESTESTEST",
				new String[] { "E:S", "E:S", "T:E" }));
		Assert.assertEquals(
				"WHOSWITCHEDMYKEYCAPSAROUND",
				caps.decipher("IHWSIOTCHEDMYKEYCAPSARWUND", new String[] {
						"W:O", "W:I" }));
		Assert.assertEquals(
				"AEBCD",
				caps.decipher("ABCDE", new String[] { "A:B", "B:C", "C:D",
						"D:E", "E:A" }));
		Assert.assertEquals("CA", caps.decipher("AC", new String[] { "A:C" }));
		Assert.assertEquals("RRR", caps.decipher("QQQ", new String[] { "A:B",
				"B:Q", "A:R", "B:R" }));
		Assert.assertEquals("AAAAAAAAAAAAAA",
				caps.decipher("ZZZZZZZZZZZZZZ", new String[] { "Z:A" }));

	}

}
