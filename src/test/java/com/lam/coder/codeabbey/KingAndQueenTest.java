package com.lam.coder.codeabbey;

import com.lam.coder.codeabbey.KingAndQueen;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KingAndQueenTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", KingAndQueen.find("b4 b8") , CoreMatchers.is(true));
        Assert.assertThat("Should be the same.", KingAndQueen.find("b4 e7") , CoreMatchers.is(true));
        Assert.assertThat("Should be the same.", KingAndQueen.find("b4 d2") , CoreMatchers.is(true));
        Assert.assertThat("Should be the same.", KingAndQueen.find("b4 g4") , CoreMatchers.is(true));

        Assert.assertThat("Should be the same.", KingAndQueen.find("f2 b1") , CoreMatchers.is(false));
        Assert.assertThat("Should be the same.", KingAndQueen.find("f2 c4") , CoreMatchers.is(false));
        Assert.assertThat("Should be the same.", KingAndQueen.find("f2 d5") , CoreMatchers.is(false));
        Assert.assertThat("Should be the same.", KingAndQueen.find("f2 g7") , CoreMatchers.is(false));
	}
}
