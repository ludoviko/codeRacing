package com.lam.coder.uva;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.uva.SMSTyping;

public class SMSTypingTest {
	SMSTyping sMSTyping;
	
	@Before
	public void setUp() throws Exception {
		this.sMSTyping = new SMSTyping();
	}

	@After
	public void tearDown() throws Exception {
		this.sMSTyping  = null;
	}

	@Test
	public void test() {
        Assert.assertEquals(3, SMSTyping.find("  a"));
        Assert.assertEquals(29, SMSTyping.find("welcome to ulab"));
        Assert.assertEquals(41, SMSTyping.find("good luck and have fun"));
	}
}
