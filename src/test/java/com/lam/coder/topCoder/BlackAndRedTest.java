package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.lam.coder.topCoder.BlackAndRed;

public class BlackAndRedTest extends TestCase {

	BlackAndRed deck;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		deck = new BlackAndRed();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		deck = null;
	}

	@Test
	public void testCut() {
		Assert.assertEquals(0, deck.cut("BRBRBR"));
		Assert.assertEquals(1, deck.cut("RBRBRB"));
		Assert.assertEquals(7, deck.cut("BBBRRRRB"));
		Assert.assertEquals(0, deck.cut("BR"));
		Assert.assertEquals(9,
				deck.cut("RBRBBRRRRBBBRBBRRBRBBRRRBRBBBRBRBRBRBRRB"));
	}

	@Test
	public void testCutSystemTest() {
		Assert.assertEquals(0, deck.cut("BRBRBR"));
		Assert.assertEquals(1, deck.cut("RBRBRB"));
		Assert.assertEquals(7, deck.cut("BBBRRRRB"));
		Assert.assertEquals(0, deck.cut("BR"));
		Assert.assertEquals(9,
				deck.cut("RBRBBRRRRBBBRBBRRBRBBRRRBRBBBRBRBRBRBRRB"));
		Assert.assertEquals(22,
				deck.cut("RBRBRBRBRBRBRBRBRBRBRRBBRBRBBRBRBBRRBRBRBRBRRBRBRB"));
		Assert.assertEquals(4,
				deck.cut("RBRRBBRBRBBRBRBBRRBRBRRRBBRBBRBRBRBRBRBRBRBRRBRBRB"));
		Assert.assertEquals(11,
				deck.cut("BBBRRBRBRRRBRBRBRBBRBRBRRBRBBRBRBRBRBRBRBRBRRBRBRB"));
		Assert.assertEquals(45,
				deck.cut("BBBBBRBRBRBRBRRRRBRBRBRBBRBRBRRRBRBRBRBRBRBRRBRBRB"));
		Assert.assertEquals(9,
				deck.cut("RRRRRBRRRBBRBRBRBBRBRBBBBBRBRBRBRBRRBRBRBBRBBRRB"));
		Assert.assertEquals(33,
				deck.cut("BRBBRBRBBBBBRBRBRBRBRRBRRRRRRBRRRBBRBRBBRBBRRB"));
		Assert.assertEquals(25,
				deck.cut("RRRRRRRRRRRRRRRRRRRRRRRRRBBBBBBBBBBBBBBBBBBBBBBBBB"));
		Assert.assertEquals(0,
				deck.cut("BBBBBBBBBBBBBBBBBBBBBBBBBRRRRRRRRRRRRRRRRRRRRRRRRR"));
		Assert.assertEquals(2, deck.cut("RRBRBB"));
		Assert.assertEquals(0, deck.cut("BBRBRR"));
		Assert.assertEquals(1, deck.cut("RBBRRBBRRBBRRB"));
		Assert.assertEquals(3, deck.cut("BRRBBRRBBRRBBR"));
		Assert.assertEquals(49,
				deck.cut("BBBBBBBBBBBBBBBBBBBBBBBBRRRRRRRRRRRRRRRRRRRRRRRRRB"));
		Assert.assertEquals(0, deck.cut("BRBRBR"));
		Assert.assertEquals(7, deck.cut("BBBRRRRB"));
		Assert.assertEquals(5, deck.cut("BRRRRBBBBR"));
	}

}
