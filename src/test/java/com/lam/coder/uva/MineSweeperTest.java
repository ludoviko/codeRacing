package com.lam.coder.uva;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.uva.MineSweeper;

public class MineSweeperTest {
	MineSweeper mineSweeper;
	
	@Before
	public void setUp() throws Exception {
		this.mineSweeper = new MineSweeper();
	}

	@After
	public void tearDown() throws Exception {
		this.mineSweeper  = null;
	}

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[] {"*100", "2210", "1*10", "1110" } , 
				this.mineSweeper.find(new String[] {"*...", "....", ".*..", "...."}));
		
		Assert.assertArrayEquals(new String[] {"**100", "33200", "1*100"}, 
				this.mineSweeper.find(new String[] {"**...", ".....", ".*..." }));
		
		Assert.assertArrayEquals(new String[] {"*****", "*646*", "*4*4*", "*646*", "*****" }, 
		this.mineSweeper.find(new String[] {"*****", "*...*", "*.*.*", "*...*", "*****"}));

		Assert.assertArrayEquals(new String[] {"****", "*55*", "*55*", "****" }, 
		this.mineSweeper.find(new String[] {"****", "*..*", "*..*",  "****"}));

//		Assert.assertArrayEquals(new String[] {"", "", "", ""}, 
//				this.mineSweeper.find(new String[] {"", "", "", "" }));
//		Assert.assertArrayEquals(new String[] {"", "", "", ""}, 
//				this.mineSweeper.find(new String[] {"", "", "", "" }));
//		Assert.assertArrayEquals(new String[] {"", "", "", ""}, 
//				this.mineSweeper.find(new String[] {"", "", "", "" }));
//		Assert.assertArrayEquals(new String[] {}, mineSweeper.);
	}
}
