package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.StepwiseWord;

public class StepwiseWordTest {
	StepwiseWord stepwiseWord;
	
	@Before
	public void setUp() throws Exception {
		this.stepwiseWord = new StepwiseWord();
	}

	@After
	public void tearDown() throws Exception {
		this.stepwiseWord  = null;
	}

	@Test()
	public void test() {
		Assert.assertEquals("h *e **l ***l ****o", this.stepwiseWord.find("cat dog hello"));
		Assert.assertEquals("f *o **o ***t ****b *****a ******l *******l", this.stepwiseWord.find("stop football play"));
		Assert.assertEquals("m *u **s ***i ****c", this.stepwiseWord.find("music is my life"));
	//	Assert.assertEquals("", this.stepwiseWord.find(""));
	}
}
