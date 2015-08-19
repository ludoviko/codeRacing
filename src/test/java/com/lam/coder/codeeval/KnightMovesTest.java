package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.KnightMoves;

public class KnightMovesTest {
	KnightMoves knightMoves;
	
	@Before
	public void setUp() throws Exception {
		this.knightMoves = new KnightMoves();
	}

	@After
	public void tearDown() throws Exception {
		this.knightMoves  = null;
	}

	@Test(timeout = 10000)
	public void test() {
		Assert.assertEquals("e1 e3 f4 h4", this.knightMoves.find("g2"));
		Assert.assertEquals("b3 c2", this.knightMoves.find("a1"));
		Assert.assertEquals("b5 b7 c4 c8 e4 e8 f5 f7", this.knightMoves.find("d6"));
		Assert.assertEquals("c4 c6 d3 d7 f3 f7 g4 g6", this.knightMoves.find("e5"));
		Assert.assertEquals("a3 c3 d2", this.knightMoves.find("b1"));
	}
}
