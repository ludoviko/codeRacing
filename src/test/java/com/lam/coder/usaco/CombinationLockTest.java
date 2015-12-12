package com.lam.coder.usaco;

import com.lam.coder.usaco.CombinationLock;
import org.junit.*;



@Ignore
public class CombinationLockTest {
	CombinationLock combinationLock;
	
	@Before
	public void setUp() throws Exception {
		combinationLock = new CombinationLock();
	}

	@After
	public void tearDown() throws Exception {
		combinationLock  = null;
	}

	@Test
	public void test() {
        Assert.assertEquals(249, combinationLock.findCombinations("1 2 3", "5 6 7",50 ));
        Assert.assertEquals(1, combinationLock.findCombinations("1 1 1", "1 1 1", 1));
        Assert.assertEquals(64, combinationLock.findCombinations("1 2 3", "2 3 4", 4));
        Assert.assertEquals(249, combinationLock.findCombinations("9 9 9", "3 3 3", 10));
        Assert.assertEquals(186, combinationLock.findCombinations("49 50 1", "50 1 2", 50));
        Assert.assertEquals(250, combinationLock.findCombinations("5 6 7", "70 80 90", 95));
        Assert.assertEquals(186, combinationLock.findCombinations("100 100 100", "1 1 1", 100));
        Assert.assertEquals(186, combinationLock.findCombinations("1 50 100", "2 51 99", 100));
        Assert.assertEquals(150, combinationLock.findCombinations("1 100 99", "1 100 98", 100));
        Assert.assertEquals(249, combinationLock.findCombinations("100 1 2", "4 5 6", 100));
	}
}
