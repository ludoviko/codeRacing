package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.StringParser;

public class StringParserTest {
	StringParser parser;
	
	@Before
	public void setUp() throws Exception {
		parser = new StringParser();
	}

	@After
	public void tearDown() throws Exception {
		parser = null;
	}

	@Test
	public void testParse() {
		 org.junit.Assert.assertArrayEquals(new String[] {"delimiter","the","is","period"}, parser.parse(".period.is.the..delimiter").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"test","a","is","this"}, parser.parse("AAthisAAAisAaAAtestAAA").toArray(new String[] {} ));
	}

	@Test
	public void parseSystemTest() {
		 org.junit.Assert.assertArrayEquals(new String[] {}, parser.parse(".").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"test", "a", "is", "This"}, parser.parse(",This,is,,,a,test,").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"YOU", "RE", "HOW", "HI"}, parser.parse("AHIAHOWAAREAYOU").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"ZZ", "ZZ"}, parser.parse("zZZzZZ").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"A a", "3", "1 HO 2?"}, parser.parse("-1 HO 2?-3-A a").toArray(new String[] {} ));
	}
}
