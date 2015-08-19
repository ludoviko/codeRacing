package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.Area;

@Ignore
public class AreaTest {
	
	Area area;

	@Before
	public void setUp() throws Exception {
	  area = new Area();	
	}

	@After
	public void tearDown() throws Exception {
		area = null;
	}

	@Test
	public void testTotalEnclosed() {
		// (0,0) and the commands are RRUULLDDDDL
		
		Assert.assertEquals(1, area.totalEnclosed(3, 3, "LDRU"));
		Assert.assertEquals(1, area.totalEnclosed(0, 0, "LLUURRDDLURD"));
//		Assert.assertEquals(4, area.totalEnclosed(0 , 0 , "RRUULLDDDDL"));
	}

}
