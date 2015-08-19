package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.QueueAtTheSchool;

public class QueueAtTheSchoolTest {
	QueueAtTheSchool queueAtTheSchool;
	
	@Before
	public void setUp() throws Exception {
		this.queueAtTheSchool = new QueueAtTheSchool();
	}

	@After
	public void tearDown() throws Exception {
		this.queueAtTheSchool  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("GBGGB", this.queueAtTheSchool.find("BGGBG", 1));
		Assert.assertEquals("GGBGB", this.queueAtTheSchool.find("BGGBG", 2));
		Assert.assertEquals("GGGB", this.queueAtTheSchool.find("GGGB", 1));
//		Assert.assertEquals("", queueAtTheSchool.find("", 0));
	}
}
