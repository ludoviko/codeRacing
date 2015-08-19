package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.FoxAndGomoku;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FoxAndGomokuTest extends TestCase {
	FoxAndGomoku gomuko;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		gomuko = new FoxAndGomoku();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		gomuko = null;
	}

	@Test
	public void testWin() {
		String[] board =  {"ooooo", "ooooo", "ooooo", "ooooo", "ooooo"};
		Assert.assertEquals("found",  gomuko.win(board));
	}

	@Test
	public void testFoundHorizontal() {
		String[] board =  {".ooooo", ".ooooo", ".ooooo", "oooooo", ".ooooo", ".ooooo"};
		Assert.assertTrue( gomuko.foundHorizontal(board) > 0);
		
		board = new String[] 
				{
				"............", "............", "............", "............", "............", "............",  
				"............", "............", "oooo.ooooo.o", "............", "............", "............"
				};
		Assert.assertTrue( gomuko.foundHorizontal(board) > 0);
		
		board = new String[]  {"..........", "..........", "..oooooo..", "..o.......",
		          "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..",
		          ".........."};
		Assert.assertTrue( gomuko.foundHorizontal(board) > 0);
	}

	@Test
	public void testWinSystemTest() {
		Assert.assertEquals("found", gomuko.win(new String[] {"....o.", "...o..", "..o...", ".o....", "o.....", "......"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"oooo.", ".oooo", "oooo.", ".oooo", "....."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooo.", ".oooo", "oooo.", ".oooo", "....o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..........", "..........", "..oooooo..", "..o.......", "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..", ".........."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"..........", "..........", "..oooo.o..", "..o.......", "..o.......", "..o.oooo..", ".......o..", ".......o..", "..oooo.o..", ".........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooooo", "ooooo", "ooooo", "ooooo", "ooooo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....", ".....", ".....", ".....", "....."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o.....", ".o....", "..o...", "...o..", "....o.", "......"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"...o..oooo", "....oo..oo", "oo.o.o....", "o......o..", "....ooo..o", ".ooo.oo...", ".o.o...o..", ".o...o.ooo", ".o.oo...o.", "o.......o."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooo..oooo", "o.ooo.ooo", ".oo..oo.o", ".oooooo.o", "oooo.oooo", "oo.o.oooo", "o.o.oooo.", ".oo.oo..o", "oooooo.oo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"...........", "...........", "......o..o.", "..........o", "o.o........", "...........", ".......o...", "...........", "...........", "...........", "..........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooo.oo", "o.oo.o.", "ooooo..", "..ooooo", ".ooo.oo", "o..o.oo", "oo.oooo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".............", "........o....", "....oo..o.oo.", "...o..o...o..", "oo.....o.....", ".....o.oo....", "..o.o......o.", "o............", ".oo.oo.o....o", "....o...oo...", "o......o.....", ".o.o.o.o.....", "o...o.o......"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooo..oooo", "ooo..oo.oo", "oo.ooooooo", "o...o.oooo", "o.oo.oo.oo", "ooooooo.oo", "oooo..o.oo", "o.oo.ooooo", "o..ooo.oo.", "oooo.oooo."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"oo.oo", "...o.", "oo.o.", ".o..o", ".oo.o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o.o...ooo.o..", "o.ooo....o..o", "oo...ooooo...", "..oooo......o", "o.o.oo.o...o.", "..o..oo....oo", "o.o..o..o.ooo", "ooooo..o.o.o.", "..o.o........", "...o..o.o.o..", ".....oo..o.o.", ".oo.o.oo...oo", ".o.o..o.oooo."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooooo..o.o", "oo.oooo.oo.", "o.o..o.o.oo", "ooooooooo.o", "ooooooooo.o", "ooooooo.ooo", "o.oo.oo.ooo", "oo.ooo..ooo", ".oo.oo.o.oo", "o.o.o.oooo.", "oooooo.oo.o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {".ooooooo..oo.", "..o.oo.oo...o", ".o.o..oo.o...", "oo.ooooo..o.o", "oo..o.ooo....", ".oo.oooo.....", ".o..oo.o...oo", "o..o..o.o...o", "o.o..o.ooo.o.", "oo..o.o.o....", "..oo.........", "...oooo.o...o", ".o..ooo.oo..o"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".............", ".............", ".............", ".............", ".............", ".............", ".............", ".............", ".............", "............o", "..........o..", ".............", "...o........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"........o.o...", "o......ooo...o", "o.oo...o....o.", "o..oo.oo...o.o", "o...o..oo.o..o", "oo.oooo...oo..", "..ooo....oo..o", "oooo.ooooooo.o", "o.o.....oo...o", "..oo..oo..oo..", ".o.o.o.o.o.ooo", "..oo...o.....o", "oo..o..o.oo...", "oo.oooo.ooo.o."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o....o.o.oooo.", "ooo.ooo.oo.oo.", "o.o.o.oo...o.o", "o.o.oo...oo..o", "o....o.oo..o..", ".oo.oooo...ooo", "oo...o.o.o..o.", "..o..o..o....o", ".o.o.o..o....o", "o...ooooooooo.", ".o.oo..oo...o.", "oo.ooooooo.o..", "oo..o.o...o.oo", ".......o..o..o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {".o.oo..oooo.ooo", "ooooooo.ooo.ooo", "oo.oo.ooo.oooo.", "oo.ooo.oo.ooo..", "..oooo.oo.oooo.", ".ooo.o.o....ooo", ".o...o.ooo.oooo", "oo.ooo.o.oooo.o", ".o.oooooo.o..oo", "o.o.o.ooo.ooooo", "oooooooooooo.o.", "oooo..o.ooooooo", "..ooooooo.ooo..", "ooo.oooooooo..o", "ooo.o..oooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooooooooooooo", "ooooooooooooo", "oooooooo.oooo", "ooooooooooooo", ".oooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o..ooo.o..o", ".o..o..oo.o", "...o.ooooo.", "...o..oo..o", "oo..oooooo.", "...oo..o.o.", ".ooooo..o.o", "o.oo.oo.o..", "o.o..oooooo", ".ooooo.o..o", "oo.o.o..o.o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..o.oo.oo.oo", "o.ooo...oooo", "ooo.ooo.oo.o", "ooo...oo.oo.", ".o.oooo.oo..", "o...oo.o.oo.", "oooooo.....o", "...o.o..ooo.", "oo...ooo.o..", ".ooo.oooo...", ".o..o....o..", "..ooooo.o.o."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooooo", "oooooo", "oooooo", "oooooo", "oooooo", "oooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oo.ooooo", "ooooo.oo", "oooooo.o", "oooo.ooo", "ooo.oooo", "oooooooo", ".o.oooo.", "ooooo.oo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"...oo.o.....o", ".....o.o..o..", "..o......o...", "..o.........o", "..o...o.o..o.", "oo.o....o....", "...o.........", ".......o.....", "ooo........oo", "...o.......o.", "..o.....o....", ".........o...", "o....o.....o."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".o.......", "o..o..o.o", ".......o.", "..o....o.", "...o.....", "o....oo..", "...o.....", "......o..", "........."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....o....", "..........", "..........", "...o...o..", "..........", ".......o..", "...o......", "....o....o", "..........", "..o.o....."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"............", ".........o..", ".......o....", "....oo......", "...o...o.oo.", "...o...o....", "........o...", "...oo..o....", ".o..........", "o...o..oo...", "..........o.", "..o.....oo.."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooooooo", "ooo.ooo", "oooooo.", "ooooooo", "..ooo.o", "oo.oo.o", "oooo..o"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"......", "......", "......", "......", "....o.", ".o...."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..o.oo..ooo", "o..o.oo.oo.", "ooo.o......", "oo..oo.....", "o.o..oooo.o", "o..o....o.o", "ooo.o..oooo", "oo.ooo.o.oo", ".o...ooo...", "o.oooo.o..o", "ooo..oo.o.o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooo..ooooooooo", "oo..oooooooooo", "oooooooooooo.o", "ooooo..ooo.ooo", "ooo.oo.o.oo..o", "ooooooooooo.o.", "ooooooo.o..ooo", "ooooo.oooooooo", "ooo.oooo.ooooo", "ooo.ooooo..ooo", "oooooooo.oooo.", "oooooooooooooo", "ooooooooo.oooo", "oo.oooooooooo."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooooo.ooo", "o.oo.ooooo", "oooooooooo", "o.oooooooo", "ooo.oooooo", "ooo.oooooo", "oooooooooo", "oooooooo.o", "ooo.oooooo", "o.oooooooo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"......o....o...", ".......o.......", ".............o.", "..o............", ".o..oo........o", "...o...........", "o.........o....", "...............", "...........o...", "........o......", "...............", "....oo...o.....", "..........o...o", "...........o...", ".......o......o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..o...o..", "o.ooo....", "...o.o...", "ooo...oo.", ".oooo...o", "o.oo..o.o", "...oo.o..", "..o.o....", "o..o....."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".........", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..oo.oo...", "........o.", "o..o.o.ooo", "...oo...o.", "o.ooo...o.", ".o.o..oo..", "...oo.oo..", "...o.oooo.", ".o..oo..oo", ".o.o.oo..o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o.o.oo.oo..o.oo", ".oo.ooooooooo..", "..oooooooooooo.", ".oo.o...oo..oo.", "ooooooooo......", "...ooo.o.oooo.o", "oo.ooo.oo.....o", "oo.ooooooo.oooo", "o..oooo..o.oooo", "ooo..oo.o..ooo.", "oo.oooooooooo.o", "o.o.o.oooo.o.oo", "oo.oo.oo.oooooo", ".ooooo.o.o.oo..", ".oo...ooooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooooo.ooo", "oooooooooo", "ooooooo.oo", "oooooooo.o", "oooooooooo", "oooooo.ooo", ".ooo.ooo.o", "o.ooooo.o.", "ooooooooo.", "oooooooooo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"..............", "..............", "..............", "..............", "..............", "..............", "..............", "..............", "..............", "....o.........", "..............", "..............", "..............", "...........o.."}));
		Assert.assertEquals("found", gomuko.win(new String[] {".ooo.o...o.o", "o..oo....oo.", "o...oo.oo..o", "o...oo.o.ooo", "ooooo.....o.", "oo...ooo...o", "ooo.o.o..ooo", "oo...oo.....", "....o..o....", "o.o..oo....o", "o....oo.oo.o", "o..o..oooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooooooooooo", "o.ooooooooo", "ooooooo.ooo", "o.ooooooooo", "ooooooooooo", "ooooooooooo", "ooo.o.o.ooo", "ooooooooooo", "ooooooooooo", "ooooooooooo", "ooooooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oo.o.oo.", "o..o.ooo", "o..o..o.", "..ooo.o.", "oo..oooo", "oooo.oo.", "..o.o..o", "o..ooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o...oo.o..ooo.", "o.oo.o.oo.o..o", ".o.oo.ooooo..o", "o.o....oooo.oo", "ooo.o..o.oooo.", "o...ooo.ooo.o.", "..o.oooooo.oo.", "...o..oooo..o.", "o.o..oo.oooo.o", ".o....ooo.oo..", "..oo.o.oo..oo.", "o.oo.oo..oooo.", ".ooo..ooo.o.oo", "oo.o.o.oo.oo.."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oo..o.oo.", "oo..oo..o", "oo.oooooo", ".oo.ooooo", "oo.o.oooo", "..ooo..oo", ".o..o.ooo", "o.ooo..oo", "oooooo.oo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"......o.", "......o.", "........", "........", "........", "...o....", "........", "........"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", ".........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..o.oo", ".o.ooo", ".oo..o", "o..ooo", "o..o.o", "oo...o"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"oo.o.o.......", "..o.o.oo....o", ".oo.....o...o", "o....oo....o.", ".......o.....", ".o.o....o.o..", ".....o....o..", ".............", ".o........ooo", "o......o..o..", "o..........o.", "o..o...o....o", ".o.oo.o.o...o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooooo.ooooooooo", "ooooo.ooo.oo.oo", "o.o.ooooooooooo", "oo.oooooo.ooooo", "..oooooo.o.ooo.", ".oooo.ooooo.oo.", "o.oo.oooooooooo", "o.ooooo.ooo.ooo", "ooooo.ooo.ooooo", "o.o.oooo.o.oooo", "ooo.oooooo.oooo", ".oo.oooo.o.oooo", "..oo.o.oooooo.o", "oo.ooooooo.o.oo", "oooooooooo.o.oo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o.ooooo", "ooo.ooo", "ooo.ooo", "oooooo.", "ooooooo", "o.ooooo", "ooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..o.ooo.o.", "o.......o.", "..o.oo...o", ".o......o.", "ooo.oo.o..", "o...oo..oo", "o...o..o.o", "..o.o..oo.", "...ooo...o", "..o..oo.o."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"ooooooooooo..", ".ooo.oooooooo", "ooooooooooooo", "ooooo.ooooooo", "oooooo..ooooo", "ooooooooooooo", "oooooo.oooooo", "ooooooo.ooooo", "ooooooooooooo", "ooooooo.ooooo", "ooooooo.ooooo", "oo.oooooooo.o", "oooooooo.ooo."}));
		Assert.assertEquals("found", gomuko.win(new String[] {".oooo.oo.ooooo", "o.ooo..oooooo.", "oooo.ooooooo.o", "ooo.oooooo.ooo", "oooooooooooooo", "..ooo.oo.ooooo", "ooo.ooo.ooo.oo", "oo.ooooooooooo", ".ooooooooo.o.o", "oooo.ooo.o.oo.", "ooooooooooo..o", "oooooooooooooo", "o.o..ooooooooo", "o.oo.ooooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o....", "o.o..", "o.o.o", "o.o..", "o...."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"....o.", "...o..", "..o...", ".o....", "o.....", "......"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"oooo.", ".oooo", "oooo.", ".oooo", "....."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooo.", ".oooo", "oooo.", ".oooo", "....o"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o.....", ".o....", "..o...", "...o..", "....o.", "......"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"....o", "...o.", "..o..", ".o...", "o...."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"..........", "..........", "..oo.ooo..", "..o.......", "..o.......", "..oo.ooo..", ".......o..", ".......o..", "..oo.ooo..", ".........."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"o....", ".o...", "..o..", "...o.", "....."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"oo.ooo", "......", "......", "......", "......", "......"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"oooo.oooo", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o..oooooo", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"ooo.oo", "......", "..o...", ".o....", "o.....", "......"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "oooooooooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"oo....", ".oo...", "..oo..", "...oo.", ".....o", "......"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"..........", "..........", "..oooooo..", "..o.......", "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..", ".........."}));
		Assert.assertEquals("found", gomuko.win(new String[] {".....", ".....", ".....", ".....", "ooooo"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....", ".....", ".....", ".....", "o...."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....", ".o...", "..o..", "...o.", "....o"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"o.....", ".o....", "..o...", "...o..", "......", "oo.ooo"}));
		Assert.assertEquals("found", gomuko.win(new String[] {".ooooo", "..oooo", ".oooo.", "..oooo", "......", "......"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"......", ".....o", "....o.", "...o..", "..o...", ".o...."}));
		Assert.assertEquals("found", gomuko.win(new String[] {".ooooo", "......", "......", "......", "......", "......"}));
		Assert.assertEquals("found", gomuko.win(new String[] {"o....", "o.o..", "o.o.o", "o.o..", "o...."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"o....o", "....o.", "...o..", "..o...", "......", "......"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {"..........", "..........", "..ooo.oo..", "..o.......", "..o.......", "..oo.ooo..", ".......o..", ".......o..", "..oo.ooo..", ".........."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....", ".....", ".....", ".....", "....o"}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....", ".....", ".....", ".....", "....."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".....", "o....", "o....", "o....", "o...."}));
		Assert.assertEquals("not found", gomuko.win(new String[] {".ooo.", ".oooo", "oooo.", ".oooo", "....o"}));
	}


	@Test
	public void testFoundVertical() {
		String[] board = {"o....", "o.o..", "o.o.o", "o.o..", "o...o"};
		Assert.assertTrue(gomuko.foundVertical(board) > 0);

		board = new String[] {"o...o", "..o.o", "o.o.o", "o.o.o", "o...o"};
		Assert.assertTrue(gomuko.foundVertical(board) > 0);
	}

	@Test
	public void testNotFound() {
		String[] board = {"oooo.", ".oooo", "oooo.", ".oooo", "....."};
		Assert.assertEquals("not found", gomuko.win(board));

		board = new String[] {".....", ".....", ".....", ".....", "....."};
		Assert.assertEquals("not found", gomuko.win(board));

		board = new String[] {"..........", "..........", "..oooo.o..", "..o.......",
		          "..o.......", "..o.oooo..", ".......o..", ".......o..", "..oooo.o..",
		          ".........."};
		Assert.assertEquals("not found", gomuko.win(board));
	}

	@Test
	public void testFoundDiagonalLeftToRightByColumn() {
		String[] board = new String[] {"oooo.", ".oooo", "oooo.", ".oooo", "....o"};
		Assert.assertTrue(gomuko.foundDiagonalLeftToRight(board) > 0);

		board = new String[] {"o.....", ".o....", "..o...", "...o..", "....o.", "......"};
		Assert.assertTrue(gomuko.foundDiagonalLeftToRight(board) > 0);
	}

	@Test
	public void testFoundDiagonalLeftToRight() {
		String[] board = new String[] {"oooo.", ".oooo", "oooo.", ".oooo", "....o"};
		Assert.assertTrue(gomuko.foundDiagonalLeftToRight(board) > 0);

		board = new String[] {"o.....", ".o....", "..o...", "...o..", "....o.", "......"};
		Assert.assertTrue(gomuko.foundDiagonalLeftToRight(board) > 0);
	}

	
	@Test
	public void testFoundDiagonalLeftToRightByRow() {
		String[] board = new String[] {"o.oo..", ".ooo.", "oooo..", ".oooo.", "....o.", "......"};
		Assert.assertTrue(gomuko.foundDiagonalLeftToRight(board) > 0);

		board = new String[] {"......", ".ooo.", "oooo..", ".oooo.", "....o.", ".....o"};
		Assert.assertTrue(gomuko.foundDiagonalLeftToRight(board) > 0);
	
	}

	@Test
	public void testFoundDiagonalRightToLeftByColumn() {
		String[] board = {"....o.", "...o..", "..o...", ".o....", "o.....", "......"};
		Assert.assertTrue(gomuko.foundDiagonalRightToLeft(board) > 0);

		board = new String[] {           ".......", 
				                         "...oo..", 
				                         "..oo...", 
				                         ".oo....", 
				                         "oo.....", 
				                         "o......", "......."};
		Assert.assertTrue(gomuko.foundDiagonalRightToLeft(board) > 0);

	}
	
	@Test
	public void testFoundDiagonalRightToLeftByRow() {
		String[] board  = new String[] {".......", "....o.o", "...o.o.", "..o.o..", ".o.o...", "o.o....", ".o....."};
		Assert.assertTrue(gomuko.foundDiagonalRightToLeft(board) > 0);

		board  = new String[] {".......", 
				               "....o..",  
				               "...o.oo", 
				               "..o.oo.", 
				               ".o.oo..", 
				               "o.oo...", 
				               "..o...."};
		Assert.assertTrue(gomuko.foundDiagonalRightToLeft(board) > 0);

	}


}
