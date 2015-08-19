package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BishopMove;

public class BishopMoveTest {
	BishopMove bishopMove;
	
	@Before
	public void setUp() throws Exception {
		bishopMove = new BishopMove();
	}

	@After
	public void tearDown() throws Exception {
		bishopMove = null;
	}

	@Test
	public void testHowManyMoves() {
		Assert.assertEquals(1, bishopMove.howManyMoves(4, 6, 7, 3));
		Assert.assertEquals(0, bishopMove.howManyMoves(2, 5, 2, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 3, 5, 5));
		Assert.assertEquals(-1, bishopMove.howManyMoves(4, 6, 7, 4));
	}
	
	@Test
	public void testHowManyMovesSystemTest() {
		Assert.assertEquals(1, bishopMove.howManyMoves(4, 6, 7, 3));
		Assert.assertEquals(0, bishopMove.howManyMoves(2, 5, 2, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 3, 5, 5));
		Assert.assertEquals(-1, bishopMove.howManyMoves(4, 6, 7, 4));
		Assert.assertEquals(1, bishopMove.howManyMoves(2, 1, 7, 6));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 2, 1, 4));
		Assert.assertEquals(1, bishopMove.howManyMoves(7, 0, 1, 6));
		Assert.assertEquals(-1, bishopMove.howManyMoves(0, 0, 1, 6));
		Assert.assertEquals(1, bishopMove.howManyMoves(0, 7, 2, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(7, 0, 2, 7));
		Assert.assertEquals(2, bishopMove.howManyMoves(3, 3, 2, 6));
		Assert.assertEquals(-1, bishopMove.howManyMoves(0, 3, 1, 5));
		Assert.assertEquals(1, bishopMove.howManyMoves(5, 1, 4, 0));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 0, 0, 6));
		Assert.assertEquals(1, bishopMove.howManyMoves(2, 6, 5, 3));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 3, 1, 5));
		Assert.assertEquals(0, bishopMove.howManyMoves(1, 1, 1, 1));
		Assert.assertEquals(0, bishopMove.howManyMoves(1, 2, 1, 2));
		Assert.assertEquals(1, bishopMove.howManyMoves(0, 0, 1, 1));
		Assert.assertEquals(1, bishopMove.howManyMoves(1, 1, 0, 2));
		Assert.assertEquals(1, bishopMove.howManyMoves(7, 6, 4, 3));
		Assert.assertEquals(-1, bishopMove.howManyMoves(1, 1, 1, 4));
		Assert.assertEquals(2, bishopMove.howManyMoves(2, 6, 1, 3));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 3, 5, 3));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 1, 0, 3));
		Assert.assertEquals(1, bishopMove.howManyMoves(5, 4, 6, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(6, 0, 0, 0));
		Assert.assertEquals(1, bishopMove.howManyMoves(1, 1, 2, 2));
		Assert.assertEquals(-1, bishopMove.howManyMoves(1, 7, 2, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 1, 1, 7));
		Assert.assertEquals(1, bishopMove.howManyMoves(0, 0, 6, 6));
		Assert.assertEquals(-1, bishopMove.howManyMoves(0, 2, 4, 1));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 0, 3, 1));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 0, 2, 0));
		Assert.assertEquals(-1, bishopMove.howManyMoves(3, 5, 4, 7));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 2, 0, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 1, 7, 3));
		Assert.assertEquals(1, bishopMove.howManyMoves(2, 1, 1, 2));
		Assert.assertEquals(-1, bishopMove.howManyMoves(2, 2, 3, 4));
		Assert.assertEquals(-1, bishopMove.howManyMoves(6, 6, 1, 6));
		Assert.assertEquals(1, bishopMove.howManyMoves(3, 4, 5, 6));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 2, 4, 3));
		Assert.assertEquals(0, bishopMove.howManyMoves(2, 2, 2, 2));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 2, 3, 2));
		Assert.assertEquals(1, bishopMove.howManyMoves(7, 7, 0, 0));
		Assert.assertEquals(2, bishopMove.howManyMoves(3, 5, 7, 3));
		Assert.assertEquals(2, bishopMove.howManyMoves(2, 2, 4, 2));
		Assert.assertEquals(1, bishopMove.howManyMoves(0, 0, 7, 7));
		Assert.assertEquals(-1, bishopMove.howManyMoves(0, 0, 0, 1));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 4, 4, 5));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 2, 2, 2));
		Assert.assertEquals(2, bishopMove.howManyMoves(1, 2, 7, 6));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 0, 0, 2));
		Assert.assertEquals(2, bishopMove.howManyMoves(3, 1, 0, 2));
		Assert.assertEquals(1, bishopMove.howManyMoves(2, 1, 3, 2));
		Assert.assertEquals(-1, bishopMove.howManyMoves(3, 3, 4, 3));
		Assert.assertEquals(2, bishopMove.howManyMoves(3, 1, 1, 1));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 0, 4, 6));
		Assert.assertEquals(2, bishopMove.howManyMoves(2, 1, 5, 6));
		Assert.assertEquals(1, bishopMove.howManyMoves(1, 1, 7, 7));
		Assert.assertEquals(2, bishopMove.howManyMoves(2, 5, 3, 2));
		Assert.assertEquals(2, bishopMove.howManyMoves(0, 1, 0, 7));
	}
}
