package com.lam.coder.topCoder;

import com.lam.coder.topCoder.VLNString;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VLNStringTest {
	VLNString vLNString;
	
	@Before
	public void setUp() throws Exception {
		vLNString = new VLNString();
	}

	@After
	public void tearDown() throws Exception {
		vLNString  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", vLNString.makeAcronym("one") , CoreMatchers.is("O"));
        Assert.assertThat("Should be the same.", vLNString.makeAcronym("dance dance revolution") , CoreMatchers.is("DDR"));
        Assert.assertThat("Should be the same.", vLNString.makeAcronym("  return  of  the king   ") , CoreMatchers.is("RK"));
        Assert.assertThat("Should be the same.", vLNString.makeAcronym("the united states of america") , CoreMatchers.is("USA"));
        Assert.assertThat("Should be the same.", vLNString.makeAcronym("of  the   and    ") , CoreMatchers.is(""));
        Assert.assertThat("Should be the same.", vLNString.makeAcronym(" ") , CoreMatchers.is(""));
        Assert.assertThat("Should be the same.", vLNString.makeAcronym("theblah ofblah andblah something") , CoreMatchers.is("TOAS"));

//        Assert.assertThat("Should be the same.", vLNString.makeAcronym() , CoreMatchers.is());
	}
}
