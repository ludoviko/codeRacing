package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.WayTooLongWords;

public class WayTooLongWordsTest {
	WayTooLongWords wayTooLongWords;

	@Before
	public void setUp() throws Exception {
		wayTooLongWords = new WayTooLongWords();
	}

	@After
	public void tearDown() throws Exception {
		wayTooLongWords = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("word", wayTooLongWords.find("word"));
		Assert.assertEquals("l10n", wayTooLongWords.find("localization"));
		Assert.assertEquals("i18n",
				wayTooLongWords.find("internationalization"));
		Assert.assertEquals("p43s", wayTooLongWords
				.find("pneumonoultramicroscopicsilicovolcanoconiosis"));
	}
}
