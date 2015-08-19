package com.lam.coder.usaco;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.usaco.NameThatNumber;

import junit.framework.Assert;
import junit.framework.TestCase;
@Ignore
public class NameThatNumberTest extends TestCase {

	NameThatNumber nameIt; 
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		nameIt = new NameThatNumber("src/test/java/com/lam/coder/usaco/dataIn/NameThatNumber.in",
				"src/test/java/com/lam/coder/usaco/dataOut/NameThatNumber.in");
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		nameIt = null;
	}

	@Test
	public void testGetMatches() {
		String n = "4734";
		
		nameIt.findMatches(n);
		List<String> expectedNames = new ArrayList<String>();
		expectedNames.add("GREG");
		Assert.assertEquals(expectedNames, nameIt.getMatches());

		n = "1";
		nameIt.findMatches(n);
		expectedNames.clear();
		expectedNames.add(NameThatNumber.NONE);
		Assert.assertEquals(expectedNames, nameIt.getMatches());
	}
}
