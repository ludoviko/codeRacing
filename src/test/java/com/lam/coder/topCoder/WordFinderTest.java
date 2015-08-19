package com.lam.coder.topCoder;

import static org.junit.Assert.fail;

import org.junit.*;

import com.lam.coder.topCoder.WordFinder;
@Ignore
public class WordFinderTest {
	WordFinder finder;

	@Before
	public void setUp() throws Exception {
		finder = new WordFinder();
	}

	@After
	public void tearDown() throws Exception {
		finder = null;
	}

	@Test
	public void testFindWords() {
		Assert.assertArrayEquals(new String[] { "10,1", "10,10", "9,9", "7,7",
				"1,10", "Not Found", "2,3", "3,2", "3,1", "7,9" }, finder
				.findWords(new String[] { "HGFRUITEZYXL", "CRWPWQNVUTEO",
						"AAAILUIDOMYP", "EPKERUAFOBCF", "PELPPAMNGJLK" },
						new String[] { "FRUIT", "APPLE", "GRAPE", "PEACH",
								"MANGO", "PEAR", "PLUM", "KIWI", "PRUNE",
								"LEMON" }));
		// Assert.assertArrayEquals(new String[], finder.findWords(new String[]
		// , new String[] ));
		// Assert.assertArrayEquals(new String[], finder.findWords(new String[]
		// , new String[] ));
	}
}
