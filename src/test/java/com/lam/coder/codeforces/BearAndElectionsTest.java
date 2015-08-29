package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.BearAndElections;

@Ignore
public class BearAndElectionsTest {
	BearAndElections bearAndElections;
	
	@Before
	public void setUp() throws Exception {
		bearAndElections = new BearAndElections();
	}

	@After
	public void tearDown() throws Exception {
		bearAndElections  = null;
	}

	@Test
	public void test() {

		Assert.assertEquals(4, bearAndElections.find( new int[] {5, 1, 11, 2, 8}));
		Assert.assertEquals(6, bearAndElections.find( new int[] {1, 8, 8, 8}));
		Assert.assertEquals(0, bearAndElections.find( new int[] {7, 6}));
        Assert.assertEquals(1, bearAndElections.find( new int[] {6, 7}));
      //  Assert.assertEquals(0, bearAndElections.find( new int[] {}));
	}
}
