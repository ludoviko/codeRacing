package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.WithoutRepetitions;

public class WithoutRepetitionsTest {
	WithoutRepetitions withoutRepetitions;
	
	@Before
	public void setUp() throws Exception {
		this.withoutRepetitions = new WithoutRepetitions();
	}

	@After
	public void tearDown() throws Exception {
		this.withoutRepetitions  = null;
	}

	@Test()
	public void test() {
		Assert.assertEquals("",
				this.withoutRepetitions.find(""));
		Assert.assertEquals("a",
				this.withoutRepetitions.find("a"));
		Assert.assertEquals("Sheles molusk lives in wales house in welnes. Aargh!",
				this.withoutRepetitions.find("Shellless mollusk lives in wallless house in wellness. Aaaarrghh!"));
		Assert.assertEquals("But as he spake he drew the god sword from its scabard, and smote a heathen knight, Justin of the Iron Valey.", this.withoutRepetitions.find("But as he spake he drew the good sword from its scabbard, and smote a heathen knight, Jusssstin of thee Iron Valley."));
		Assert.assertEquals("No mater whom you chose, she declared, I wil abide by your decision.", this.withoutRepetitions.find("No matttter whom you choose, she deccccclared, I will abide by your decision."));
		Assert.assertEquals("Wwhat is your wil?", this.withoutRepetitions.find("Wwwhat is your will?"));
		Assert.assertEquals("At his magic spech the ground opened and he began the path of descent.", this.withoutRepetitions.find("At his magic speech the ground oppened and he began the path of descent."));
		Assert.assertEquals("I should fly away and you would never se me again.", this.withoutRepetitions.find("I should fly away and you would never see me again."));
//		Assert.assertEquals("",
//				this.withoutRepetitions.find(""));
	}
}
