package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.StonesOnTheTable;

public class StonesOnTheTableTest {
	StonesOnTheTable stonesOnTheTable;
	
	@Before
	public void setUp() throws Exception {
		this.stonesOnTheTable = new StonesOnTheTable();
	}

	@After
	public void tearDown() throws Exception {
		this.stonesOnTheTable  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(1, this.stonesOnTheTable.find("RRG"));
		Assert.assertEquals(4, this.stonesOnTheTable.find("RRRRR"));
		Assert.assertEquals(0, this.stonesOnTheTable.find("BRBG"));
		Assert.assertEquals(2, this.stonesOnTheTable.find("GGBRBRGGRB"));
		Assert.assertEquals(18, this.stonesOnTheTable.find("GRBGGRBRGRBGGBBBBBGGGBBBBRBRGBRRBRGBBBRBBRRGBGGGRB"));
		Assert.assertEquals(6, this.stonesOnTheTable.find("RRGBBRBRGRGBBGGRGRRR"));
//		Assert.assertEquals(0, this.stonesOnTheTable.find(""));
	}
}
