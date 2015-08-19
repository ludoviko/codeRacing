package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.ReadMore;

public class ReadMoreTest {
	ReadMore readMore;
	
	@Before
	public void setUp() throws Exception {
		this.readMore = new ReadMore();
	}

	@After
	public void tearDown() throws Exception {
		this.readMore  = null;
	}

	@Test()
	public void test() {
		Assert.assertEquals("Tom exhibited.", this.readMore.find("Tom exhibited."));
		Assert.assertEquals("Amy Lawrence was proud and glad, and... <Read More>", this.readMore.find("Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look."));
		Assert.assertEquals("Tom was tugging at a button-hole and looking sheepish.", this.readMore.find("Tom was tugging at a button-hole and looking sheepish."));
		Assert.assertEquals("Two thousand verses is a great many -... <Read More>", this.readMore.find("Two thousand verses is a great many - very, very great many."));
		Assert.assertEquals("Tom's mouth watered for the apple, but... <Read More>", this.readMore.find("Tom's mouth watered for the apple, but he stuck to his work."));
//		Assert.assertEquals("", this.readMore.find(""));
	}
}
