package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BlackAndWhiteSolitaire;

public class BlackAndWhiteSolitaireTest {
	BlackAndWhiteSolitaire solitaire;
	
	@Before
	public void setUp() throws Exception {
		solitaire = new BlackAndWhiteSolitaire();
	}

	@After
	public void tearDown() throws Exception {
		solitaire = null;
	}

	@Test
	public void testMinimumTurns() {
		Assert.assertEquals(1, solitaire.minimumTurns("BBBW"));
		Assert.assertEquals(0, solitaire.minimumTurns("WBWBW"));
		Assert.assertEquals(4, solitaire.minimumTurns("WWWWWWWWW"));
		Assert.assertEquals(10, solitaire.minimumTurns("BBWBWWBWBWWBBBWBWBWBBWBBW"));
//		Assert.assertEquals(, solitaire.minimumTurns());
	}
	
	@Test
	public void testMinimumTurnsSystemTest() {
		Assert.assertEquals(1, solitaire.minimumTurns("BBBW"));
		Assert.assertEquals(0, solitaire.minimumTurns("WBWBW"));
		Assert.assertEquals(4, solitaire.minimumTurns("WWWWWWWWW"));
		Assert.assertEquals(10, solitaire.minimumTurns("BBWBWWBWBWWBBBWBWBWBBWBBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("BBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("BWWW"));
		Assert.assertEquals(2, solitaire.minimumTurns("WBWWB"));
		Assert.assertEquals(0, solitaire.minimumTurns("BWBWBW"));
		Assert.assertEquals(2, solitaire.minimumTurns("WBBWBWB"));
		Assert.assertEquals(3, solitaire.minimumTurns("WBWWWWBB"));
		Assert.assertEquals(3, solitaire.minimumTurns("WBWBWBBWB"));
		Assert.assertEquals(4, solitaire.minimumTurns("BBWWWWWWBW"));
		Assert.assertEquals(4, solitaire.minimumTurns("WBWBWWBWBBW"));
		Assert.assertEquals(5, solitaire.minimumTurns("WWBBBWWBBWWW"));
		Assert.assertEquals(6, solitaire.minimumTurns("WWBWWWWWWBWWW"));
		Assert.assertEquals(4, solitaire.minimumTurns("BWWWBWBBBWBBBB"));
		Assert.assertEquals(5, solitaire.minimumTurns("WBBWWWBWBBWWBWB"));
		Assert.assertEquals(4, solitaire.minimumTurns("WBBBBBWBWBBBWWWB"));
		Assert.assertEquals(7, solitaire.minimumTurns("WBWBWBBBWWBBBWWWB"));
		Assert.assertEquals(6, solitaire.minimumTurns("BWBBBBBWBBBBBWBWWB"));
		Assert.assertEquals(7, solitaire.minimumTurns("WBBBWWWWWWWBWBWWBWW"));
		Assert.assertEquals(9, solitaire.minimumTurns("WWBWWWWBWWBWWWWBBBBW"));
		Assert.assertEquals(10, solitaire.minimumTurns("WWWWBBWBWBWWBWWWWBBWB"));
		Assert.assertEquals(9, solitaire.minimumTurns("WBBWWBWBWWBBBBBBWBBBBW"));
		Assert.assertEquals(9, solitaire.minimumTurns("BWWBBWWWWBWWWWBWWWBBBWB"));
		Assert.assertEquals(12, solitaire.minimumTurns("WBWWBWWBBBBWBWWBBBWWWWBB"));
		Assert.assertEquals(12, solitaire.minimumTurns("WBBWWWBBBBWBBWWWBWBBWWWBW"));
		Assert.assertEquals(10, solitaire.minimumTurns("WWBBBWBWBBBBWBWBWBWBWBBBBB"));
		Assert.assertEquals(10, solitaire.minimumTurns("BBWBWBWBBWBWBBWBBBWBWBBWWBB"));
		Assert.assertEquals(14, solitaire.minimumTurns("BBWWWWWBWBBBBWBWWBBBBBBWBWWB"));
		Assert.assertEquals(13, solitaire.minimumTurns("WBBWWWBBBBBWWBWBWWWWBWWWBBWBW"));
		Assert.assertEquals(14, solitaire.minimumTurns("BWWBWBWBBWBWBWWWBWWBBBWBBBWWWB"));
		Assert.assertEquals(13, solitaire.minimumTurns("WWBBBBBWBWWBWWWWWBBWWBWBWWWBBBW"));
		Assert.assertEquals(16, solitaire.minimumTurns("WBBBBWWWBWBWBBWWBBWWBWBBBBWBWBWB"));
		Assert.assertEquals(15, solitaire.minimumTurns("BWBBBBBWBBWBWWBWWWWBWWWBBWBWWBWWB"));
		Assert.assertEquals(15, solitaire.minimumTurns("WBWBBBBBBWWWWWBWWWBBWWWWWBWBWBBWWW"));
		Assert.assertEquals(15, solitaire.minimumTurns("WWBWWBWBWBBBBWBBWWBBBWBWBWBBWWBBBWW"));
		Assert.assertEquals(17, solitaire.minimumTurns("WWWWBBWBWWWWWBWBBBBBBWBWBBWWWWBBWWBB"));
		Assert.assertEquals(18, solitaire.minimumTurns("WBBWBBBBWBWWWWWBBWBWBWBBBBWWWBBWWWWBB"));
		Assert.assertEquals(18, solitaire.minimumTurns("BWWBWBBWBWWWWWBWWBWWWWBWWWWBBBWBWBBBBB"));
		Assert.assertEquals(17, solitaire.minimumTurns("BWBBWWBBWWWBWWWBBWBWWWWWWWBWWWWWBBWWBBB"));
		Assert.assertEquals(16, solitaire.minimumTurns("BWBBWBBBBBBWBBBBWBBWWWWWBBBBBWBBBWWBBWBW"));
		Assert.assertEquals(19, solitaire.minimumTurns("WBWWWBBBBBBBBWWBBWBWWWWBWBWWBBWWBBBWWWBBW"));
		Assert.assertEquals(20, solitaire.minimumTurns("BWBBWWWBBWWBBWBBBWWWWBWBBBBBBWWWWWWBWWBBWB"));
		Assert.assertEquals(16, solitaire.minimumTurns("WWBBBWWWBWBBBWWWBBBBWBWBWWBWBWWBBWWBBWBWBWB"));
		Assert.assertEquals(22, solitaire.minimumTurns("BBBWBWBBWBWWWBWBBBBWBBWWBBWBBWWBWBBBWWBBBWBW"));
		Assert.assertEquals(21, solitaire.minimumTurns("BWBWBWBBBBBWWWWWBBWWWBBWBBWWWWWBWBBBWWWBWWBWW"));
		Assert.assertEquals(21, solitaire.minimumTurns("WWBBBBWWWWBWBWWBWWWBWBWBWBBWWBBBWWBWWWWBBBWWBW"));
		Assert.assertEquals(22, solitaire.minimumTurns("BBBWWWBBBWWWBBBWWBWBBWWBBBBWWBWBBBWBWWWWBWBBBWB"));
		Assert.assertEquals(21, solitaire.minimumTurns("WWWWBWWWWBWWWBBWWBWBWWBWBWWBBWWBWBBWWWBBWWWBBBWB"));
		Assert.assertEquals(24, solitaire.minimumTurns("BWWWWWBBBWWBBWWBBBBWWWBBBBBBWBWBWBBWBBWBWWBWBWWBW"));
		Assert.assertEquals(25, solitaire.minimumTurns("WWBBWBBBBBWWBBWWWWBBBBBBBWWWWWWWWBWBBWWWWBBBBWBWBB"));
		Assert.assertEquals(25, solitaire.minimumTurns("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
		Assert.assertEquals(25, solitaire.minimumTurns("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
		Assert.assertEquals(21, solitaire.minimumTurns("BWWWBWWBWBBWWBWBBBWWBWBWBWWBWBBBBBWBWBBBBWWWWBWBWB"));
		Assert.assertEquals(22, solitaire.minimumTurns("BBBWBBWBBBBWBBWWWBBBWBWBWWBBWBWBWBWWWWWWWWWWBWBWB"));
		Assert.assertEquals(21, solitaire.minimumTurns("BBBBWBWWWWWBWBBWWBWBBWBBBWBBBBBWWBBBBBWWWBBWWBWBB"));
		Assert.assertEquals(23, solitaire.minimumTurns("WBBWBWBWWWWWWBWWBBWBWWWBWBWWWBWWBWWWBWWWWBWWBBBBBB"));
		Assert.assertEquals(23, solitaire.minimumTurns("BBWWWWWBBBWWBBWWBWBBWBWBBWBWBWWBWWBWBBBWWBBBBWBBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("BBB"));
		Assert.assertEquals(1, solitaire.minimumTurns("BWW"));
		Assert.assertEquals(1, solitaire.minimumTurns("WWBWBW"));
		Assert.assertEquals(11, solitaire.minimumTurns("BWBWBBBBWBWWWWWBWBWBWBWBWBWBWBWBWBWBBBWWWBWBWW"));
		Assert.assertEquals(12, solitaire.minimumTurns("BWBWBWWWWWBBBBWBBBWBBWBWBBWWW"));
		Assert.assertEquals(1, solitaire.minimumTurns("BBWBWB"));
		Assert.assertEquals(4, solitaire.minimumTurns("BWWBWBWBWBBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("WBWBWW"));
		Assert.assertEquals(0, solitaire.minimumTurns("WBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("BBWBWBWBWBWB"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBBBW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWWBWBWBWBW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BWWWW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWBWBWBWBWBWBWBWBB"));
		Assert.assertEquals(1, solitaire.minimumTurns("BBWB"));
		Assert.assertEquals(11, solitaire.minimumTurns("BWWBWWBWBWWBBBWBWBWBBWBBW"));
		Assert.assertEquals(22, solitaire.minimumTurns("BBWBWWBWBWBWBWBWBWBWBWWWWWWBBBBBWBWBWBWBWBWWBBBWB"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWBB"));
		Assert.assertEquals(1, solitaire.minimumTurns("WWB"));
		Assert.assertEquals(1, solitaire.minimumTurns("WBWBWBB"));
		Assert.assertEquals(2, solitaire.minimumTurns("WWBWBWBWBWW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWWBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("WWBW"));
		Assert.assertEquals(1, solitaire.minimumTurns("BWBWW"));
		Assert.assertEquals(0, solitaire.minimumTurns("BWB"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWWW"));
		Assert.assertEquals(3, solitaire.minimumTurns("BWWBBB"));
		Assert.assertEquals(2, solitaire.minimumTurns("BWWBW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBBBWBWBWBWBWBWBW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWBWBWBWBB"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBBBWBWBWBWB"));
		Assert.assertEquals(2, solitaire.minimumTurns("WWBWBWBWBWBB"));
		Assert.assertEquals(2, solitaire.minimumTurns("BBWW"));
		Assert.assertEquals(2, solitaire.minimumTurns("BWWBWBWB"));
	}

}
