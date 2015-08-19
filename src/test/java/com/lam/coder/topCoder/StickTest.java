package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Stick;

import junit.framework.Assert;
import junit.framework.TestCase;

public class StickTest extends TestCase {
	Stick stick;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		stick = new Stick();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		stick = null;
	}

	@Test
	public void testPieces() {
		Assert.assertEquals(1, stick.pieces(1));
		Assert.assertEquals(1, stick.pieces(64));
		Assert.assertEquals(1, stick.pieces(32));
		Assert.assertEquals(2, stick.pieces(48));
		Assert.assertEquals(4, stick.pieces(23));
	}
	
	@Test
	public void testPiecesSystemTest() {
		Assert.assertEquals(1 	,stick.pieces(1));
		Assert.assertEquals(1 	,stick.pieces(32));
		Assert.assertEquals(2 	,stick.pieces(48));
		Assert.assertEquals(2 	,stick.pieces(10));
		Assert.assertEquals(1 	,stick.pieces(2));
		Assert.assertEquals(2 	,stick.pieces(3));
		Assert.assertEquals(1 	,stick.pieces(4));
		Assert.assertEquals(2 	,stick.pieces(5));
		Assert.assertEquals(2 	,stick.pieces(6));
		Assert.assertEquals(3 	,stick.pieces(7));
		Assert.assertEquals(1 	,stick.pieces(8));
		Assert.assertEquals(2 	,stick.pieces(9));
		Assert.assertEquals(3 	,stick.pieces(11));
		Assert.assertEquals(2 	,stick.pieces(12));
		Assert.assertEquals(3 	,stick.pieces(13));
		Assert.assertEquals(3 	,stick.pieces(14));
		Assert.assertEquals(4 	,stick.pieces(15));
		Assert.assertEquals(1 	,stick.pieces(16));
		Assert.assertEquals(2 	,stick.pieces(17));
		Assert.assertEquals(2 	,stick.pieces(18));
		Assert.assertEquals(3 	,stick.pieces(19));
		Assert.assertEquals(2 	,stick.pieces(20));
		Assert.assertEquals(3 	,stick.pieces(21));
		Assert.assertEquals(3 	,stick.pieces(22));
		Assert.assertEquals(4 	,stick.pieces(23));
		Assert.assertEquals(2 	,stick.pieces(24));
		Assert.assertEquals(3 	,stick.pieces(25));
		Assert.assertEquals(3 	,stick.pieces(26));
		Assert.assertEquals(4 	,stick.pieces(27));
		Assert.assertEquals(3 	,stick.pieces(28));
		Assert.assertEquals(4 	,stick.pieces(29));
		Assert.assertEquals(4 	,stick.pieces(30));
		Assert.assertEquals(5 	,stick.pieces(31));
		Assert.assertEquals(2 	,stick.pieces(33));
		Assert.assertEquals(2 	,stick.pieces(34));
		Assert.assertEquals(3 	,stick.pieces(35));
		Assert.assertEquals(2 	,stick.pieces(36));
		Assert.assertEquals(3 	,stick.pieces(37));
		Assert.assertEquals(3 	,stick.pieces(38));
		Assert.assertEquals(4 	,stick.pieces(39));
		Assert.assertEquals(2 	,stick.pieces(40));
		Assert.assertEquals(3 	,stick.pieces(41));
		Assert.assertEquals(3 	,stick.pieces(42));
		Assert.assertEquals(4 	,stick.pieces(43));
		Assert.assertEquals(3 	,stick.pieces(44));
		Assert.assertEquals(4 	,stick.pieces(45));
		Assert.assertEquals(4 	,stick.pieces(46));
		Assert.assertEquals(5 	,stick.pieces(47));
		Assert.assertEquals(3 	,stick.pieces(49));
		Assert.assertEquals(3 	,stick.pieces(50));
		Assert.assertEquals(4 	,stick.pieces(51));
		Assert.assertEquals(3 	,stick.pieces(52));
		Assert.assertEquals(4 	,stick.pieces(53));
		Assert.assertEquals(4 	,stick.pieces(54));
		Assert.assertEquals(5 	,stick.pieces(55));
		Assert.assertEquals(3 	,stick.pieces(56));
		Assert.assertEquals(4 	,stick.pieces(57));
		Assert.assertEquals(4 	,stick.pieces(58));
		Assert.assertEquals(5 	,stick.pieces(59));
		Assert.assertEquals(4 	,stick.pieces(60));
		Assert.assertEquals(5 	,stick.pieces(61));
		Assert.assertEquals(5 	,stick.pieces(62));
		Assert.assertEquals(6 	,stick.pieces(63));
		Assert.assertEquals(1 	,stick.pieces(64));
	}

	@Test
	public void testPieces2SystemTest() {
		Assert.assertEquals(1 	,stick.pieces2(1));
		Assert.assertEquals(1 	,stick.pieces2(32));
		Assert.assertEquals(2 	,stick.pieces2(48));
		Assert.assertEquals(2 	,stick.pieces2(10));
		Assert.assertEquals(1 	,stick.pieces2(2));
		Assert.assertEquals(2 	,stick.pieces2(3));
		Assert.assertEquals(1 	,stick.pieces2(4));
		Assert.assertEquals(2 	,stick.pieces2(5));
		Assert.assertEquals(2 	,stick.pieces2(6));
		Assert.assertEquals(3 	,stick.pieces2(7));
		Assert.assertEquals(1 	,stick.pieces2(8));
		Assert.assertEquals(2 	,stick.pieces2(9));
		Assert.assertEquals(3 	,stick.pieces2(11));
		Assert.assertEquals(2 	,stick.pieces2(12));
		Assert.assertEquals(3 	,stick.pieces2(13));
		Assert.assertEquals(3 	,stick.pieces2(14));
		Assert.assertEquals(4 	,stick.pieces2(15));
		Assert.assertEquals(1 	,stick.pieces2(16));
		Assert.assertEquals(2 	,stick.pieces2(17));
		Assert.assertEquals(2 	,stick.pieces2(18));
		Assert.assertEquals(3 	,stick.pieces2(19));
		Assert.assertEquals(2 	,stick.pieces2(20));
		Assert.assertEquals(3 	,stick.pieces2(21));
		Assert.assertEquals(3 	,stick.pieces2(22));
		Assert.assertEquals(4 	,stick.pieces2(23));
		Assert.assertEquals(2 	,stick.pieces2(24));
		Assert.assertEquals(3 	,stick.pieces2(25));
		Assert.assertEquals(3 	,stick.pieces2(26));
		Assert.assertEquals(4 	,stick.pieces2(27));
		Assert.assertEquals(3 	,stick.pieces2(28));
		Assert.assertEquals(4 	,stick.pieces2(29));
		Assert.assertEquals(4 	,stick.pieces2(30));
		Assert.assertEquals(5 	,stick.pieces2(31));
		Assert.assertEquals(2 	,stick.pieces2(33));
		Assert.assertEquals(2 	,stick.pieces2(34));
		Assert.assertEquals(3 	,stick.pieces2(35));
		Assert.assertEquals(2 	,stick.pieces2(36));
		Assert.assertEquals(3 	,stick.pieces2(37));
		Assert.assertEquals(3 	,stick.pieces2(38));
		Assert.assertEquals(4 	,stick.pieces2(39));
		Assert.assertEquals(2 	,stick.pieces2(40));
		Assert.assertEquals(3 	,stick.pieces2(41));
		Assert.assertEquals(3 	,stick.pieces2(42));
		Assert.assertEquals(4 	,stick.pieces2(43));
		Assert.assertEquals(3 	,stick.pieces2(44));
		Assert.assertEquals(4 	,stick.pieces2(45));
		Assert.assertEquals(4 	,stick.pieces2(46));
		Assert.assertEquals(5 	,stick.pieces2(47));
		Assert.assertEquals(3 	,stick.pieces2(49));
		Assert.assertEquals(3 	,stick.pieces2(50));
		Assert.assertEquals(4 	,stick.pieces2(51));
		Assert.assertEquals(3 	,stick.pieces2(52));
		Assert.assertEquals(4 	,stick.pieces2(53));
		Assert.assertEquals(4 	,stick.pieces2(54));
		Assert.assertEquals(5 	,stick.pieces2(55));
		Assert.assertEquals(3 	,stick.pieces2(56));
		Assert.assertEquals(4 	,stick.pieces2(57));
		Assert.assertEquals(4 	,stick.pieces2(58));
		Assert.assertEquals(5 	,stick.pieces2(59));
		Assert.assertEquals(4 	,stick.pieces2(60));
		Assert.assertEquals(5 	,stick.pieces2(61));
		Assert.assertEquals(5 	,stick.pieces2(62));
		Assert.assertEquals(6 	,stick.pieces2(63));
		Assert.assertEquals(1 	,stick.pieces2(64));
	}

}
