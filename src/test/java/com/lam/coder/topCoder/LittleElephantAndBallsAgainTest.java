package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.LittleElephantAndBallsAgain;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LittleElephantAndBallsAgainTest extends TestCase {

	LittleElephantAndBallsAgain ele;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		ele = new LittleElephantAndBallsAgain();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		ele = null;
	}

	@Test
	public void testGetNumber() {
		Assert.assertEquals(0, ele.getNumber("R"));
		Assert.assertEquals(0, ele.getNumber("RR"));
		Assert.assertEquals(2, ele.getNumber("RRGG"));
		Assert.assertEquals(4, ele.getNumber("RRGGBB"));
		Assert.assertEquals(5, ele.getNumber("RGBRGB"));
		Assert.assertEquals(3, ele.getNumber("RGGGBB"));
		Assert.assertEquals(46, ele.getNumber("RGBRBRGRGRBBBGRBRBRGBGBBBGRGBBBBRGBGRRGGRRRGRBBBBR"));
	}
	
	@Test
	public void testGetNumberSystemTest() {
		Assert.assertEquals(4, ele.getNumber("RRGGBB"));
		Assert.assertEquals(0, ele.getNumber("R"));
		Assert.assertEquals(5, ele.getNumber("RGBRGB"));
		Assert.assertEquals(3, ele.getNumber("RGGGBB"));
		Assert.assertEquals(46, ele.getNumber("RGBRBRGRGRBBBGRBRBRGBGBBBGRGBBBBRGBGRRGGRRRGRBBBBR"));
		Assert.assertEquals(0, ele.getNumber("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"));
		Assert.assertEquals(0, ele.getNumber("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG"));
		Assert.assertEquals(0, ele.getNumber("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
		Assert.assertEquals(38, ele.getNumber("BGGBGRRGBBBGRGBGBRRRRBRGGRBBBBRBRRGBGGRBRB"));
		Assert.assertEquals(31, ele.getNumber("RBRGBGBBGRRGBRGGGBBRRGGBGGBRBRGBRR"));
		Assert.assertEquals(40, ele.getNumber("BRBRGRBGBBGRRBGBGBRRBRBGRRRRBBRBBBGRRBRRRGRB"));
		Assert.assertEquals(34, ele.getNumber("BBRGBGBGRGGGRBGRGBRRBBGBBRBGBGRBRBRBG"));
		Assert.assertEquals(8, ele.getNumber("RBBRGRBBGB"));
		Assert.assertEquals(20, ele.getNumber("GRRRRRGGRBGRBRBGBBGRGBRRB"));
		Assert.assertEquals(11, ele.getNumber("GBBBRBBGBGRBGR"));
		Assert.assertEquals(45, ele.getNumber("GBRGRRGRGBBRRRRBBBBBGGRRGGBBGBBBRGGRBRBRRBGBBBGRRR"));
		Assert.assertEquals(45, ele.getNumber("RBRGBBRGBBBBBRGBRRRRGGGBGGGRRGBBRBBBRGRBGBGGBGRGRB"));
		Assert.assertEquals(44, ele.getNumber("GGGGGGRGGBRGBGBGBRRGBGBBBGRGRBBBBRGGRGGGRBGGRBGBBB"));
		Assert.assertEquals(47, ele.getNumber("RRBRBBRGRGBBBGBRBBGBGBRRBRBGBBGRBGBBGBBRBBGBGBRGGG"));
		Assert.assertEquals(47, ele.getNumber("BRGRRBRBBGBBBGBBRBBGGBGBBBGGBBGRBGBGBGGBGRGBGRBGGR"));
		Assert.assertEquals(46, ele.getNumber("RGBGBRBGRRRGGRGRBRGGBGBBGRBBGGBGGGGBGGRRBRGRBBGBGB"));
		Assert.assertEquals(46, ele.getNumber("RGGGGBBRRGBGGBRBBGGBRRRRGRGRGGRGGGRBRRRGRRGRBBGBRR"));
		Assert.assertEquals(47, ele.getNumber("BRRGBGGRBBRBGRGGBBBRBBGBRGBRBRGGRRBBBRBGGRGGRGBBBR"));
		Assert.assertEquals(9, ele.getNumber("RGBRGGRBBRG"));
		Assert.assertEquals(46, ele.getNumber("GRGRGRRBRGGBRBGRBRBGGBGRRGRRGGGGRRGBRRBBGRBGGRRBRB"));
		Assert.assertEquals(45, ele.getNumber("GRRRRGGGGRRGRRGRGGGRRRGRGGGRGRGRRRGGRRRGRGGGGGRGGG"));
		Assert.assertEquals(44, ele.getNumber("GGRGGGGGGRRRRGRRRRRGGRRRGRGGRGRGGRRGGGRRGRRGGGGGRR"));
		Assert.assertEquals(43, ele.getNumber("RRGGRRRRRRGGRGRRGGGRRGRRRRRRRGGGRGGGGRRRRRGGRRRRGR"));
		Assert.assertEquals(44, ele.getNumber("RGRRRGGGRRRRRRGGRGRGGRGGRRGRRRGGGRGRGGGGGRRGGRGRRG"));
		Assert.assertEquals(43, ele.getNumber("GRRGGGGGGGRRGRGGGGRGRRRRGRRRRGGGGGRRGRGRRGGRGRGGRR"));
		Assert.assertEquals(45, ele.getNumber("RBBRBBBBBRBRBRRBBRRRBBRBRBBRRRRRBBRRRBRBRBBRBRBBRB"));
		Assert.assertEquals(46, ele.getNumber("RRRRBBBRRRRBRRRBRRRBRRBRBRBRRRBRBBRBRRBRRRRBRRRRBB"));
		Assert.assertEquals(44, ele.getNumber("RRBRRRRRBRRRRBBRBRBRBRBRRBBRBRRRBRBBRBRRRRRRBRBBBB"));
		Assert.assertEquals(44, ele.getNumber("BRRRBRBRBRBBRBRBBRBRBRBRRRBBBBBRBBRRRRBBRBRRRRRRBR"));
		Assert.assertEquals(41, ele.getNumber("BBBBBBBBBRRBBRRBRBRBBBBRRRBRRRRRBRRRBBRRRRBRRRBRBB"));
		Assert.assertEquals(46, ele.getNumber("BBGGBGBGGBGGGBGBGBBGGGBGBGGGBGBGGGBBBGBGBGBGGGGBGG"));
		Assert.assertEquals(44, ele.getNumber("BGGBBBGBGGBGBGBGBBGBBGBGBGBBBBGGBGBGGBBBBBBGGGGBGB"));
		Assert.assertEquals(43, ele.getNumber("GGGBGBBBBBBBGGGGGBGGBGBGBGGGGGGBGBBBGBBGGGGBBGBGBB"));
		Assert.assertEquals(44, ele.getNumber("BGGBGGGGGBGGBGBBGGGGBGGGGBGBGGBBBBBBGGGBBGBBGGGBBG"));
		Assert.assertEquals(45, ele.getNumber("BGGBBBBGGBGBGGGBBBGBBGGBGBBBBBGBGGGGGBGBBBGGGGBGBB"));
		Assert.assertEquals(38, ele.getNumber("GGGGGGGBGGGBGGGGGGGGGGGGBGGGGGGGBBGGGGGGRGGGGGGGGG"));
		Assert.assertEquals(27, ele.getNumber("GGGGRGGGGGRGBGGGGGGGGGGGGGGGGGGGGGGGBBGGRGGGGGGGBG"));
		Assert.assertEquals(38, ele.getNumber("RGGGGRGGRGGGGGGGBGGGRGGBGGRGRRGGRGGGGGGGGGGGGBGGGB"));
		Assert.assertEquals(34, ele.getNumber("RBRRRRRRRRRRRRRRRRBBRRBRBRRBRBRRRRRRRRRRRBRBBRRRRR"));
		Assert.assertEquals(39, ele.getNumber("RBBRRBRBRRRBRRRBRRRRRRRRRRBRBRRRRRRRRRRRBRRBBRRBRR"));
		Assert.assertEquals(39, ele.getNumber("BBRRRBRBBRBRRRBRRRRRRBBRRBRRRRRBRBRRRRRRRRRRRBBRRR"));
		Assert.assertEquals(3, ele.getNumber("RGGBBB"));
		Assert.assertEquals(3, ele.getNumber("GGGBRR"));
		Assert.assertEquals(20, ele.getNumber("RRRRRRRRRRBBBBBBBBBBGGGGGGGGGGG"));
		Assert.assertEquals(2, ele.getNumber("RGRRR"));
		Assert.assertEquals(49, ele.getNumber("RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRG"));
		Assert.assertEquals(2, ele.getNumber("RRGGG"));
		Assert.assertEquals(1, ele.getNumber("GBB"));
		Assert.assertEquals(2, ele.getNumber("RGBBB"));
		Assert.assertEquals(0, ele.getNumber("RRRRRRRRR"));
		Assert.assertEquals(0, ele.getNumber("RRRR"));
		Assert.assertEquals(0, ele.getNumber("RR"));
		Assert.assertEquals(1, ele.getNumber("RGGG"));
		Assert.assertEquals(4, ele.getNumber("RRGGGBB"));
		Assert.assertEquals(0, ele.getNumber("RRRRRRR"));
		Assert.assertEquals(0, ele.getNumber("BBBBBBBBBBB"));
		Assert.assertEquals(2, ele.getNumber("GGBBBB"));
		Assert.assertEquals(0, ele.getNumber("RRRRRRRRRR"));
		Assert.assertEquals(0, ele.getNumber("RRRRRR"));
		Assert.assertEquals(0, ele.getNumber("RRR"));
		Assert.assertEquals(1, ele.getNumber("GGGR"));
		Assert.assertEquals(0, ele.getNumber("GGGGGGG"));
		Assert.assertEquals(3, ele.getNumber("BRGBBBBBB"));
		Assert.assertEquals(3, ele.getNumber("RRRGGR"));
		Assert.assertEquals(2, ele.getNumber("BBRRRRRRRRRRRR"));
		Assert.assertEquals(3, ele.getNumber("GRRGGG"));
		Assert.assertEquals(7, ele.getNumber("GGGBBBBBGGGG"));
		Assert.assertEquals(2, ele.getNumber("RGBBBBBBBBBBB"));
		Assert.assertEquals(1, ele.getNumber("RGG"));
		Assert.assertEquals(7, ele.getNumber("RRGGBBRGB"));
	}

}
