package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.StringProcessor;
@Ignore
public class StringProcessorTest {
	StringProcessor processor;
	
	@Before
	public void setUp() throws Exception {
		processor = new StringProcessor();
	}

	@After
	public void tearDown() throws Exception {
		processor = null;
	}

	@Test
	public void processStringSystemTestSimple() {
		
	}

	@Test
	public void processStringSystemTest() {
		Assert.assertEquals("tomto", processor.processString("tomtom", "$hx"));
		Assert.assertEquals("aaax", processor.processString("aaa", "$ix"));
		Assert.assertEquals("a", processor.processString("a", "s"));

		Assert.assertEquals("BAD", processor.processString("ABCDEFG", "xxulxiAlxxx"));
		Assert.assertEquals("undotest", processor.processString("undotest", "uuuxx0$0uuuu$hxuuuu"));
		Assert.assertEquals("well tries ome swapping", processor.processString("we'll try some swapping", "llxllllllsiiiehhhx"));
		Assert.assertEquals("w1b2c", processor.processString("a1b2c3", "$hxhxu0iwx"));
		Assert.assertEquals("atestingtesting", processor.processString("testingtesting", "iasllxxxuuuuu$$$uuuu"));
		Assert.assertEquals("ba", processor.processString("a", "ibiciduu"));
		Assert.assertEquals("blah", processor.processString("blah", "$iclu"));
		Assert.assertEquals("hvello", processor.processString("hello", "lllluuuiv"));
		Assert.assertEquals("tttttttt", processor.processString("tttttttt", "xxuu"));
		Assert.assertEquals("xdsadas", processor.processString("dsadas", "ix"));
		Assert.assertEquals("1234567", processor.processString("1234567", "iz$xhsuuu"));
		Assert.assertEquals("hello", processor.processString("hello", "uuuuuu"));
		Assert.assertEquals("hello", processor.processString("hello", "uuuuuuu"));
		Assert.assertEquals("Test", processor.processString("Test", "ixixuu"));
		Assert.assertEquals("this is a test", processor.processString("this is a test", "u"));
		Assert.assertEquals("xTest", processor.processString("Test", "ix0xhu"));
		Assert.assertEquals("hk23456789", processor.processString("123456789", "iz$xhsuuuihik0suux"));
		Assert.assertEquals("cabc", processor.processString("abc", "hhhhhhic"));
		Assert.assertEquals("bc", processor.processString("abc", "lux"));
		Assert.assertEquals("test", processor.processString("test", "uxuxu"));
		Assert.assertEquals("aaaaaaaaaa", processor.processString("aaaaaaaaaa", "xxxxuuuu"));
		Assert.assertEquals("ba", processor.processString("a", "ibiciduu"));
		Assert.assertEquals("abcdxefgjiklk", processor.processString("abcdefgjiklk", "lllllluuix"));
		Assert.assertEquals("This is a tst", processor.processString("This is a test", "0$$uhhhx"));
		Assert.assertEquals("ihi s", processor.processString("this is", "$$uu$$xxxsss0uuuiiihxxxxs$iiuu"));
		Assert.assertEquals("This is a test.", processor.processString("This is a test.", "xhhhhhhhhhhhhhu"));
		Assert.assertEquals("ss0sl!llllluuuuuuuuhhhisisis0llsllli!", processor.processString("0lllllluuuuuuuuhhhisisis0llsllli!", "0lllllluuuuuuuuhhhisisis0llsllli!"));
		Assert.assertEquals("afbc", processor.processString("abc", "liuuif"));
		Assert.assertEquals("ttttttt", processor.processString("ttttttt", "xxuu"));
		Assert.assertEquals("test", processor.processString("test", "$hs"));
		Assert.assertEquals("Thsi i sa est from ned.", processor.processString("This is a test from ned.", "llsllllsllllx"));
		Assert.assertEquals("This is a test", processor.processString("This is a test", "su"));
		Assert.assertEquals("It gets a lot better than TopCoder!", processor.processString("It doesnt get any better than TopCoder.", "lllluxxxxxxxxulllislllxhxi ilioit$hxhi!hs"));
		Assert.assertEquals("1", processor.processString("1", "icicicicicicicicicicicicicuuuuuuuuuuuuuuuuu"));
		Assert.assertEquals("abacrc ada . !dfad ", processor.processString("abra cada . !dfad ", "llsllshsuic"));
		Assert.assertEquals("cdefgh", processor.processString("abcdefgh", "xxxxuu"));
		Assert.assertEquals("ptokhmtom", processor.processString("tomtom", "ipllik0uih"));
		Assert.assertEquals("o et any better than Topcoder.c", processor.processString("It doesnt get any better than Topcoder.", "xxxxllllhhhxxxxi xx0lhl$$lxicigux"));
		Assert.assertEquals("Sorry Mike", processor.processString("Sorry Mike", "uuuuuuuu"));
		Assert.assertEquals("1", processor.processString("1", "icicicicicicuuuuuuuuuuuu"));
		Assert.assertEquals("this is a test", processor.processString("this is a test", "llsikuu"));
		Assert.assertEquals("This is a tst", processor.processString("This is a test", "0$$uhhhx"));
		Assert.assertEquals("dsadasdsa", processor.processString("dsadasdsa", "uuu"));
	}

}
