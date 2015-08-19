package com.lam.coder.topCoder;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MagicalStringDiv2;

public class MagicalStringDiv2Test extends TestCase {
	MagicalStringDiv2 magical;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		magical = new MagicalStringDiv2();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		magical = null;
	}

	@Test
	public void testMinimalMoves() {
		TestCase.assertEquals(2, magical.minimalMoves(">><<><"));
		TestCase.assertEquals(0, magical.minimalMoves(">>>><<<<"));
		TestCase.assertEquals(4, magical.minimalMoves("<<>>"));
		TestCase.assertEquals(8, magical.minimalMoves("<<<<>>>>"));
		TestCase.assertEquals(
				20,
				magical.minimalMoves("<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><"));
		TestCase.assertEquals(02, magical.minimalMoves("<>"));
		TestCase.assertEquals(4, magical.minimalMoves(">>>>>>>>"));
		TestCase.assertEquals(4, magical.minimalMoves("<<<<<<<<"));
	}

	@Test
	public void testMinimalMovesSystemTest() {
		Assert.assertEquals(2, magical.minimalMoves(">><<><"));
		Assert.assertEquals(0, magical.minimalMoves(">>>><<<<"));
		Assert.assertEquals(4, magical.minimalMoves("<<>>"));
		Assert.assertEquals(20, magical.minimalMoves("<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><"));
		Assert.assertEquals(0, magical.minimalMoves("><"));
		Assert.assertEquals(1, magical.minimalMoves("<<"));
		Assert.assertEquals(2, magical.minimalMoves("<><>"));
		Assert.assertEquals(2, magical.minimalMoves("<<<<"));
		Assert.assertEquals(5, magical.minimalMoves("<><>>>"));
		Assert.assertEquals(1, magical.minimalMoves(">>>><<"));
		Assert.assertEquals(5, magical.minimalMoves("<<><>><<"));
		Assert.assertEquals(6, magical.minimalMoves("<<<>><>>"));
		Assert.assertEquals(5, magical.minimalMoves(">><>>>>><>"));
		Assert.assertEquals(3, magical.minimalMoves(">>>><<><><"));
		Assert.assertEquals(8, magical.minimalMoves("<><>>>>>>>>>"));
		Assert.assertEquals(4, magical.minimalMoves("<>><>><<><><"));
		Assert.assertEquals(4, magical.minimalMoves("><><<<>>"));
		Assert.assertEquals(9, magical.minimalMoves(">>>>><><><>><>>>><><<<"));
		Assert.assertEquals(6, magical.minimalMoves(">><<<>><<>><"));
		Assert.assertEquals(10, magical.minimalMoves("><><<><<<<><><<>><"));
		Assert.assertEquals(18, magical.minimalMoves("<<<>><><>><<>>><><>>><<>>>><>>><<<"));
		Assert.assertEquals(21, magical.minimalMoves("<<>>><>><>>>><<<<>><<<<><<><<<<<><<<<>>>>><><<"));
		Assert.assertEquals(19, magical.minimalMoves("><<><>><>>><><>>><<><>><<><<><>>>><>><"));
		Assert.assertEquals(27, magical.minimalMoves("<><>><><><<<<<>>><<><>><><<>><><<<>>>><>><><>><><>"));
		Assert.assertEquals(26, magical.minimalMoves("><<<><<>><><<<<<><>>><<>><>><<>><<><<><>>><<><><<>"));
		Assert.assertEquals(11, magical.minimalMoves("<<>>><>><>>>>>>>><<><>><<<><>><<"));
		Assert.assertEquals(28, magical.minimalMoves("<<<<<<<<<<<<<<>>>>>>>>>>>>>>"));
		Assert.assertEquals(9, magical.minimalMoves("<<<>><><<>><><<>"));
		Assert.assertEquals(10, magical.minimalMoves("<<<<<>>>>>"));
		Assert.assertEquals(6, magical.minimalMoves("><<<><<><<<<<<"));
		Assert.assertEquals(17, magical.minimalMoves("<<><<<<>><<<<<<><>>><><><>"));
		Assert.assertEquals(11, magical.minimalMoves("><<<><>><><><<<>><>><<"));
		Assert.assertEquals(48, magical.minimalMoves("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>"));
		Assert.assertEquals(7, magical.minimalMoves(">>><>>>>><><><<<<><>><<<><"));
		Assert.assertEquals(11, magical.minimalMoves("<>>><<<<<<>><<><><><<><<"));
		Assert.assertEquals(4, magical.minimalMoves(">>>>>>>>><<>"));
		Assert.assertEquals(16, magical.minimalMoves(">><<>><<><<<<<>>>>><>>><><<><<<<<<<><>"));
		Assert.assertEquals(4, magical.minimalMoves("<<<>><<<"));
		Assert.assertEquals(19, magical.minimalMoves("><>><<><<><<<>><<<>>><<<<>><<<><<>>><<"));
		Assert.assertEquals(9, magical.minimalMoves("<><<<><>>>><<<<><>><"));
		Assert.assertEquals(28, magical.minimalMoves("<<<>>>><<<>>>>><><><<<<<<>><<>><<<>>><><>><><>><><"));
		Assert.assertEquals(25, magical.minimalMoves(">><>><<<>><><><>>><<>><<<<>><<>>><><<<>>>><<<><<>>"));
		Assert.assertEquals(22, magical.minimalMoves("<>>>>>><<<<<><><><><<><>>><<><<<>><<>><<<>>><<<><<"));
		Assert.assertEquals(24, magical.minimalMoves("<><<>>><<><><><><<<><>>><<>><<<><<>><><<>>><<>><<<"));
		Assert.assertEquals(24, magical.minimalMoves(">>><<>><><<><<<<><<<<<<>><>><><<<<<>><<<<><<><><<>"));
		Assert.assertEquals(30, magical.minimalMoves("<<<<<><<<<<><>><<<><<>><<<><><><><><>><><><<><<><>"));
		Assert.assertEquals(24, magical.minimalMoves("<><><<><><<><><>><<><<><<<><>><<><<<>><<<<><<<><<>"));
		Assert.assertEquals(25, magical.minimalMoves(">><<><><>>><<<<<>><><<<<><<><><<<><><><>><<>>>><<<"));
		Assert.assertEquals(28, magical.minimalMoves("><<><<><><<<<<>>>>><><><<><<>>><><>><><><>><<<<>>>"));
		Assert.assertEquals(22, magical.minimalMoves("<>><<><><><<><><<>><><<>><<><><<<<<<<>>><<><<><<>>"));
		Assert.assertEquals(26, magical.minimalMoves("<><><><<><><<><<><<<>><<><<><>><<<>><><>><<>><<<<>"));
		Assert.assertEquals(21, magical.minimalMoves(">>><<<><><<>>>>><<<><><>><<>><<<><><><<>><<><><<<>"));
		Assert.assertEquals(23, magical.minimalMoves("<>>><<<><><>>><>>>>><>><<><<<><><<>><>><<><>>><><>"));
		Assert.assertEquals(25, magical.minimalMoves(">><><>><<><><<<<>>>><><>>>>>>>>><><<<<>><>><<><<><"));
		Assert.assertEquals(18, magical.minimalMoves("><>>><>><<><>>>><><>>>><<<<<<<><<<><<>>><>>>><<<<<"));
		Assert.assertEquals(23, magical.minimalMoves("<<<<>>>><><>>>><><<><<<>>>><><<>><<><<<<<<><<>>>><"));
		Assert.assertEquals(1, magical.minimalMoves(">>"));
		Assert.assertEquals(2, magical.minimalMoves(">>>>"));
		Assert.assertEquals(1, magical.minimalMoves(">>><"));
		Assert.assertEquals(4, magical.minimalMoves(">>>>>>>>"));
		Assert.assertEquals(6, magical.minimalMoves("<<<>>>"));
		Assert.assertEquals(5, magical.minimalMoves("><<>>>"));
		Assert.assertEquals(4, magical.minimalMoves("<><><>"));
		Assert.assertEquals(14, magical.minimalMoves("<<<<<<<>>>>>>>"));
	}

}
