package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MatchMaker;

import junit.framework.TestCase;


public class MatchMakerTest extends TestCase {

	MatchMaker maker;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		maker = new MatchMaker();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		maker = null;
	}

	@Test
	public void testGetBestMatches() {
		String[] members = new String[] 
				{"BETTY F M A A C C",
				 "TOM M F A D C A",
				 "SUE F M D D D D",
				 "ELLEN F M A A C A",
				 "JOE M F A A C A",
				 "ED M F A D D A",
				 "SALLY F M C D A B",
				 "MARGE F M A A C C"};  
		
		Assert.assertArrayEquals(new String[] {"JOE","TOM"}, maker.getBestMatches(members, "BETTY", 2));
		Assert.assertArrayEquals(new String[] {"ELLEN","BETTY","MARGE"}, maker.getBestMatches(members, "JOE", 1));
		Assert.assertArrayEquals(new String[] {}, maker.getBestMatches(members, "MARGE", 4));
	}

}
