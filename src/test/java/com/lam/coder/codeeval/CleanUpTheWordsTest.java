package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.CleanUpTheWords;

public class CleanUpTheWordsTest {
	CleanUpTheWords cleanUpTheWords;
	
	@Before
	public void setUp() throws Exception {
		this.cleanUpTheWords = new CleanUpTheWords();
	}

	@After
	public void tearDown() throws Exception {
		this.cleanUpTheWords  = null;
	}

	@Test()
	public void test() {
		Assert.assertEquals("hello world", this.cleanUpTheWords.find("--9Hello----World...--"));
		Assert.assertEquals("can you", this.cleanUpTheWords.find("Can 0$9 ---you~"));
		Assert.assertEquals("what are you doing", this.cleanUpTheWords.find("13What213are;11you-123+138doing7"));
//		Assert.assertEquals("", this.cleanUpTheWords.find(""));
	}
}
