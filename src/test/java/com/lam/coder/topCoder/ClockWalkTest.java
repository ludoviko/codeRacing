package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ClockWalk;

public class ClockWalkTest {
	ClockWalk walk;
	 
	@Before
	public void setUp() throws Exception {
		walk = new ClockWalk();
	}

	@After
	public void tearDown() throws Exception {
		walk = null;
	}

	@Test
	public void testFinalPosition() {
		Assert.assertEquals(9, walk.finalPosition("hhthh"));
		Assert.assertEquals(11, walk.finalPosition("hhtht"));
		Assert.assertEquals(3, walk.finalPosition("hthth"));
		Assert.assertEquals(12, walk.finalPosition("hthhhhh"));
		Assert.assertEquals(6, walk.finalPosition("hthhthtththhtttthttthhhthtttthh"));
//		Assert.assertEquals(, walk.finalPosition());
	}
	
	@Test
	public void finalPositionTest() {
		Assert.assertEquals(9, walk.finalPosition("hhthh"));
		Assert.assertEquals(11, walk.finalPosition("hhtht"));
		Assert.assertEquals(3, walk.finalPosition("hthth"));
		Assert.assertEquals(7, walk.finalPosition("hthththththth"));
		Assert.assertEquals(12, walk.finalPosition("hthhhhh"));
		Assert.assertEquals(12, walk.finalPosition("hththththththththththth"));
		Assert.assertEquals(6, walk.finalPosition("hthhthtththhtttthttthhhthtttthh"));
		Assert.assertEquals(10, walk.finalPosition("thtththhtht"));
		Assert.assertEquals(2, walk.finalPosition("tththhh"));
		Assert.assertEquals(10, walk.finalPosition("ttthhthtthttthtttht"));
		Assert.assertEquals(7, walk.finalPosition("hhththhtttthtt"));
		Assert.assertEquals(9, walk.finalPosition("hthhthtthhhthtttt"));
		Assert.assertEquals(3, walk.finalPosition("ththth"));
		Assert.assertEquals(6, walk.finalPosition("hhttthhththttthhtthtthhhhtthttthththttththt"));
		Assert.assertEquals(7, walk.finalPosition("ththhththhhhh"));
		Assert.assertEquals(10, walk.finalPosition("tththtttthttthtthhhhhhththht"));
		Assert.assertEquals(7, walk.finalPosition("htthhtthttththtttthhthhtthttthhttthhhhthtt"));
		Assert.assertEquals(6, walk.finalPosition("ththhht"));
		Assert.assertEquals(5, walk.finalPosition("hhttththhhhthhhhttthhthhtthhhh"));
		Assert.assertEquals(4, walk.finalPosition("hhtttthhhhthhthhhhhhthht"));
		Assert.assertEquals(10, walk.finalPosition("ttthhhthhhhhthhtththtth"));
		Assert.assertEquals(1, walk.finalPosition("hhhthhhthttthtttthtthhttttttthhtttththhhhh"));
		Assert.assertEquals(12, walk.finalPosition("hthtthtthttththhthtththhhth"));
		Assert.assertEquals(5, walk.finalPosition("hthhthhhhhtththhhhthhthhhthhthttththhthht"));
		Assert.assertEquals(5, walk.finalPosition("hhhthttththhththtththttththththhthtthhthtt"));
		Assert.assertEquals(1, walk.finalPosition("htttthhtttthtthhtthhhhthhhhhtthhthhhthtthhtthh"));
		Assert.assertEquals(10, walk.finalPosition("thhhhthtttthhhhhthhtthhthhhhhthttth"));
		Assert.assertEquals(6, walk.finalPosition("thhhhthhhhththththtt"));
		Assert.assertEquals(5, walk.finalPosition("hhttththttttthhtth"));
		Assert.assertEquals(4, walk.finalPosition("hhththhthtttthhthhtthtthhththth"));
		Assert.assertEquals(12, walk.finalPosition("htttttthhhhthhtththhthtttth"));
		Assert.assertEquals(7, walk.finalPosition("thtthhhthhthththtthhth"));
		Assert.assertEquals(8, walk.finalPosition("hhthhhthhhthhttthhhhththhhhtttthhhtthtth"));
		Assert.assertEquals(1, walk.finalPosition("htttttthhthhhttththhttttththtthhththhhtthhtthtthtt"));
		Assert.assertEquals(9, walk.finalPosition("thtttthttthtt"));
		Assert.assertEquals(2, walk.finalPosition("tthttthhtththhthhthhthththhthhhhthhhhthhhhh"));
		Assert.assertEquals(4, walk.finalPosition("ththhhthtthhhhhtthhhhhthhtt"));
		Assert.assertEquals(1, walk.finalPosition("ttthhhthhhhhtthtthttthhthh"));
		Assert.assertEquals(6, walk.finalPosition("httththhtttthtththt"));
		Assert.assertEquals(11, walk.finalPosition("tthttttthhtthtthhthhttthhhttttttthhtthhhthththhttt"));
		Assert.assertEquals(5, walk.finalPosition("ththhttthhhththhttththhtthttthhtthtthththh"));
		Assert.assertEquals(5, walk.finalPosition("hhthhhhthtthhththhhthhhthhthhhttth"));
		Assert.assertEquals(8, walk.finalPosition("thtttthhhthtththhhhhththhhhhthththhtththhhthtth"));
		Assert.assertEquals(8, walk.finalPosition("hhhthhthhhh"));
		Assert.assertEquals(10, walk.finalPosition("ttthhththhhhhtttthtthhththt"));
		Assert.assertEquals(12, walk.finalPosition("hhhhthth"));
		Assert.assertEquals(8, walk.finalPosition("hhtthttththhthhtttthhhtthtththtthth"));
		Assert.assertEquals(10, walk.finalPosition("thttthhhtthhththhthhthhhhhthtththhhhhhtthhhhhhth"));
		Assert.assertEquals(2, walk.finalPosition("httttthhhhthhhtththttthhhhthhttthtth"));
		Assert.assertEquals(5, walk.finalPosition("tttht"));
		Assert.assertEquals(2, walk.finalPosition("htthhthththtthhtthhhtthhththhhtthttt"));
		Assert.assertEquals(3, walk.finalPosition("ttthtthhhhthhttthttttthhhhtth"));
		Assert.assertEquals(10, walk.finalPosition("thttthhhthtttht"));
		Assert.assertEquals(2, walk.finalPosition("tthhthhthhttthhtthhtthtthhthhttttthtttht"));
		Assert.assertEquals(7, walk.finalPosition("hhhhthhth"));
		Assert.assertEquals(2, walk.finalPosition("tthhhhht"));
		Assert.assertEquals(3, walk.finalPosition("hhthtthttthththhtthtthhhttttthththhthhtthhhhhthhh"));
		Assert.assertEquals(8, walk.finalPosition("tththtthhtt"));
		Assert.assertEquals(1, walk.finalPosition("hhthhhhhttthtthhthhhhthhhhthhthhhthhtttthhtttthth"));
		Assert.assertEquals(2, walk.finalPosition("htttthhhhthththhhtththhthhhhhthttthhhth"));
		Assert.assertEquals(3, walk.finalPosition("thtthhhthhthhhthhh"));
		Assert.assertEquals(5, walk.finalPosition("ttthhhhhhthtthhhhhtttththhththhht"));
		Assert.assertEquals(11, walk.finalPosition("tthhhhtthhhttthththtthhtt"));
		Assert.assertEquals(2, walk.finalPosition("ttthhttthtttthhhhhhttht"));
		Assert.assertEquals(5, walk.finalPosition("htthhhthtt"));
		Assert.assertEquals(5, walk.finalPosition("hhhththtthhhhththhhhhtttthttthhhtthttththhtththhth"));
		Assert.assertEquals(3, walk.finalPosition("hththhhht"));
		Assert.assertEquals(5, walk.finalPosition("httthtthttthhtththhttthhhh"));
		Assert.assertEquals(6, walk.finalPosition("tthhthttththhhtthhtthhththththttttthhttttttthhh"));
		Assert.assertEquals(4, walk.finalPosition("ththhhhh"));
		Assert.assertEquals(4, walk.finalPosition("thhhhttthhthhhttthhtthttthhtttt"));
		Assert.assertEquals(10, walk.finalPosition("hhtttttthtthhthttththththtthttthhttthhh"));
		Assert.assertEquals(8, walk.finalPosition("tthhthhtttttththhhtttththhhhhthhhhthttthhhhh"));
		Assert.assertEquals(1, walk.finalPosition("thhttththhthhhthtththtthhtttthhhhhthtthhh"));
		Assert.assertEquals(7, walk.finalPosition("thhhttthththtththtttt"));
		Assert.assertEquals(5, walk.finalPosition("htthhhththhththhhtttt"));
		Assert.assertEquals(7, walk.finalPosition("ththtththhthhhhthhttthtthhtthhhhhttththtth"));
		Assert.assertEquals(12, walk.finalPosition("thhttthhhthhtthhhtttthtthtthtth"));
		Assert.assertEquals(6, walk.finalPosition("ttthththhhthhhhttth"));
		Assert.assertEquals(11, walk.finalPosition("hththhhhhhthhhhhhhhtthhtttttttthttthtt"));
		Assert.assertEquals(3, walk.finalPosition("thhtthhhttthhthtt"));
		Assert.assertEquals(10, walk.finalPosition("hhhhhhth"));
		Assert.assertEquals(10, walk.finalPosition("thttthhhhhthtttthhhtttthtthtththttttthhhthtt"));
		Assert.assertEquals(12, walk.finalPosition("hthhhttthhthhhhhhtt"));
		Assert.assertEquals(10, walk.finalPosition("tttthhttthht"));
		Assert.assertEquals(1, walk.finalPosition("htttthtthttthhhthhhhtthhhthththtththhhttththhh"));
		Assert.assertEquals(9, walk.finalPosition("hhthththhttttthttththh"));
		Assert.assertEquals(4, walk.finalPosition("hhtttth"));
		Assert.assertEquals(12, walk.finalPosition("hhthtttthhhhthhhthhthhhtththtthtthh"));
		Assert.assertEquals(8, walk.finalPosition("hhhhthttthh"));
		Assert.assertEquals(6, walk.finalPosition("tthththhhttthttttthh"));
		Assert.assertEquals(1, walk.finalPosition("htthhhhhhhthhtttht"));
		Assert.assertEquals(10, walk.finalPosition("ththhtthtttthtthhhttthhthhthtththtthhhttthtthhth"));
		Assert.assertEquals(4, walk.finalPosition("thththttthttthhhhth"));
		Assert.assertEquals(3, walk.finalPosition("ttthttthhththhththttt"));
		Assert.assertEquals(4, walk.finalPosition("hhhhtthtttt"));
		Assert.assertEquals(7, walk.finalPosition("hhhhtththhthttttthhhhhthhthttthtth"));
		Assert.assertEquals(11, walk.finalPosition("ttthtthhthtttthtthhttthhhtthhthhhhhhttthhthhhttht"));
		Assert.assertEquals(11, walk.finalPosition("thhthhttthtththhththtt"));
		Assert.assertEquals(3, walk.finalPosition("thtttthth"));
		Assert.assertEquals(9, walk.finalPosition("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
		Assert.assertEquals(9, walk.finalPosition("ttttt"));
		Assert.assertEquals(6, walk.finalPosition("hthhthtththhtttthttthhhthtttthh"));
		Assert.assertEquals(8, walk.finalPosition("tttttttttttttttttttttttttttttttttttttttt"));
		Assert.assertEquals(9, walk.finalPosition("tttttttttttttttttt"));
		Assert.assertEquals(8, walk.finalPosition("ttttttt"));
		Assert.assertEquals(9, walk.finalPosition("tttttttttttttttttttttttttttttttttttttttttttttttttt"));
		Assert.assertEquals(11, walk.finalPosition("tttttttttttttttttttttttttttttttttttttttttttttt"));
		Assert.assertEquals(12, walk.finalPosition("hhhhttth"));
		Assert.assertEquals(12, walk.finalPosition("tttttttt"));
		Assert.assertEquals(12, walk.finalPosition("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
		Assert.assertEquals(3, walk.finalPosition("hhhhh"));
		Assert.assertEquals(6, walk.finalPosition("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
		Assert.assertEquals(3, walk.finalPosition("tttttt"));
		Assert.assertEquals(3, walk.finalPosition("tttttttttttttttttttttttttttttt"));
		Assert.assertEquals(3, walk.finalPosition("ttttttttttttttttttttttttttttttttttttttttt"));
		Assert.assertEquals(12, walk.finalPosition("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
		Assert.assertEquals(12, walk.finalPosition("tttttttttttttttttttttttttttttttt"));
		Assert.assertEquals(9, walk.finalPosition("hthhthtththhtttthttthhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
		Assert.assertEquals(4, walk.finalPosition("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
		Assert.assertEquals(2, walk.finalPosition("tttttttttttttttttttttttttttt"));
		Assert.assertEquals(11, walk.finalPosition("hhhhtttttttttt"));
		Assert.assertEquals(3, walk.finalPosition("ttttttttttttttttt"));
		Assert.assertEquals(8, walk.finalPosition("hhhhtttttttttttttttttttt"));
		Assert.assertEquals(6, walk.finalPosition("tttttttttttttttttttt"));
	}
}
