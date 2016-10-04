package com.lam.coder.topCoder;

import com.lam.coder.topCoder.PeacefulLine;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeacefulLineTest {
	PeacefulLine peacefulLine;
	
	@Before
	public void setUp() throws Exception {
		peacefulLine = new PeacefulLine();
	}

	@After
	public void tearDown() throws Exception {
		peacefulLine  = null;
	}


    @Test
	public void test() {
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {1,2,3,4}) , CoreMatchers.is("possible"));
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {1,1,1,2}), CoreMatchers.is("impossible"));
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {1,1,2,2,3,3,4,4}) , CoreMatchers.is("possible"));
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {3,3,3,3,13,13,13,13}) , CoreMatchers.is("possible"));
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {3,7,7,7,3,7,7,7,3}) , CoreMatchers.is("impossible"));
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {25,12,3,25,25,12,12,12,12,3,25}) , CoreMatchers.is("possible"));
        Assert.assertThat("Should be the same.", peacefulLine.makeLine(new int[] {3,3,3,3,13,13,13,13,3}) , CoreMatchers.is("possible"));
    }
}
