package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Quipu;

import junit.framework.Assert;
import junit.framework.TestCase;

public class QuipuTest extends TestCase {
	private Quipu quipu;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		quipu = new Quipu();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		quipu = null;
	}

	@Test
	public void testReadKnots() {
		Assert.assertEquals(243, quipu.readKnots( "-XX-XXXX-XXX-" )); 
		Assert.assertEquals(204003, quipu.readKnots( "-XX--XXXX---XXX-" )); 
		Assert.assertEquals(1, quipu.readKnots( "-X-" )); 
		Assert.assertEquals(1000000, quipu.readKnots( "-X-------" )); 
		Assert.assertEquals(909979, quipu.readKnots( "-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-" )); 
	}

	@Test
	public void testReadKnotsSystemTest() {
		Assert.assertEquals(243, quipu.readKnots( "-XX-XXXX-XXX-"));
		Assert.assertEquals(204003, quipu.readKnots("-XX--XXXX---XXX-"));
		Assert.assertEquals(1, quipu.readKnots("-X-"));
		Assert.assertEquals(2, quipu.readKnots("-XX-"));
		Assert.assertEquals(3, quipu.readKnots("-XXX-"));
		Assert.assertEquals(4, quipu.readKnots("-XXXX-"));
		Assert.assertEquals(5, quipu.readKnots("-XXXXX-"));
		Assert.assertEquals(6, quipu.readKnots("-XXXXXX-"));
		Assert.assertEquals(7, quipu.readKnots("-XXXXXXX-"));
		Assert.assertEquals(8, quipu.readKnots("-XXXXXXXX-"));
		Assert.assertEquals(9, quipu.readKnots("-XXXXXXXXX-"));
		Assert.assertEquals(1000000, quipu.readKnots("-X-------"));
		Assert.assertEquals(909979, quipu.readKnots("-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-"));
		Assert.assertEquals(25, quipu.readKnots("-XX-XXXXX-"));
		Assert.assertEquals(61, quipu.readKnots("-XXXXXX-X-"));
		Assert.assertEquals(83, quipu.readKnots("-XXXXXXXX-XXX-"));
		Assert.assertEquals(298300, quipu.readKnots("-XX-XXXXXXXXX-XXXXXXXX-XXX---"));
		Assert.assertEquals(452140, quipu.readKnots("-XXXX-XXXXX-XX-X-XXXX--"));
		Assert.assertEquals(648803, quipu.readKnots("-XXXXXX-XXXX-XXXXXXXX-XXXXXXXX--XXX-"));
		Assert.assertEquals(799591, quipu.readKnots("-XXXXXXX-XXXXXXXXX-XXXXXXXXX-XXXXX-XXXXXXXXX-X-"));
		Assert.assertEquals(880693, quipu.readKnots("-XXXXXXXX-XXXXXXXX--XXXXXX-XXXXXXXXX-XXX-"));
		Assert.assertEquals(148552, quipu.readKnots("-X-XXXX-XXXXXXXX-XXXXX-XXXXX-XX-"));
		Assert.assertEquals(495886, quipu.readKnots("-XXXX-XXXXXXXXX-XXXXX-XXXXXXXX-XXXXXXXX-XXXXXX-"));
		Assert.assertEquals(360225, quipu.readKnots("-XXX-XXXXXX--XX-XX-XXXXX-"));
		Assert.assertEquals(5883, quipu.readKnots("-XXXXX-XXXXXXXX-XXXXXXXX-XXX-"));
		Assert.assertEquals(451773, quipu.readKnots("-XXXX-XXXXX-X-XXXXXXX-XXXXXXX-XXX-"));
		Assert.assertEquals(720900, quipu.readKnots("-XXXXXXX-XX--XXXXXXXXX---"));
		Assert.assertEquals(978345, quipu.readKnots("-XXXXXXXXX-XXXXXXX-XXXXXXXX-XXX-XXXX-XXXXX-"));
		Assert.assertEquals(181295, quipu.readKnots("-X-XXXXXXXX-X-XX-XXXXXXXXX-XXXXX-"));
		Assert.assertEquals(512553, quipu.readKnots("-XXXXX-X-XX-XXXXX-XXXXX-XXX-"));
		Assert.assertEquals(414415, quipu.readKnots("-XXXX-X-XXXX-XXXX-X-XXXXX-"));
		Assert.assertEquals(682875, quipu.readKnots("-XXXXXX-XXXXXXXX-XX-XXXXXXXX-XXXXXXX-XXXXX-"));
		Assert.assertEquals(308684, quipu.readKnots("-XXX--XXXXXXXX-XXXXXX-XXXXXXXX-XXXX-"));
		Assert.assertEquals(19057, quipu.readKnots("-X-XXXXXXXXX--XXXXX-XXXXXXX-"));
		Assert.assertEquals(752158, quipu.readKnots("-XXXXXXX-XXXXX-XX-X-XXXXX-XXXXXXXX-"));
		Assert.assertEquals(943012, quipu.readKnots("-XXXXXXXXX-XXXX-XXX--X-XX-"));
		Assert.assertEquals(10000, quipu.readKnots("-X-----"));
		Assert.assertEquals(20, quipu.readKnots("-XX--"));
	}
}
