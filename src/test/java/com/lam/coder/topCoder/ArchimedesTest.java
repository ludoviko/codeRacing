package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Archimedes;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ArchimedesTest extends TestCase {
	Archimedes archimedes;
	double precision = 0.000000001;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		archimedes = new Archimedes();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		archimedes = null;
	}

	@Test
	public void testApproximatePi() {
		Assert.assertTrue(Math.abs(2.598076211353316 - Archimedes
				.approximatePi(3)) < precision);
		Assert.assertTrue(Math.abs(3.0614674589207183 - Archimedes
				.approximatePi(8)) < precision);
		Assert.assertTrue(Math.abs(3.1415926362832276 - Archimedes
				.approximatePi(17280)) < precision);
	}
	
	@Test
	public void testApproximatePiSystemTest() {
	Assert.assertTrue(Math.abs(2.598076211353316- Archimedes.approximatePi( 3)) < precision);
	Assert.assertTrue(Math.abs(3.0614674589207183- Archimedes.approximatePi( 8)) < precision);
	Assert.assertTrue(Math.abs(3.1415926362832276- Archimedes.approximatePi( 17280)) < precision);
	Assert.assertTrue(Math.abs(2.82842712474619- Archimedes.approximatePi( 4)) < precision);
	Assert.assertTrue(Math.abs(2.938926261462366- Archimedes.approximatePi( 5)) < precision);
	Assert.assertTrue(Math.abs(2.9999999999999996- Archimedes.approximatePi( 6)) < precision);
	Assert.assertTrue(Math.abs(3.037186173822907- Archimedes.approximatePi( 7)) < precision);
	Assert.assertTrue(Math.abs(3.0614674589207183- Archimedes.approximatePi( 8)) < precision);
	Assert.assertTrue(Math.abs(3.1415926530730114- Archimedes.approximatePi( 99999)) < precision);
	Assert.assertTrue(Math.abs(3.1415926530730216- Archimedes.approximatePi( 100000)) < precision);
	Assert.assertTrue(Math.abs(3.1393502030468667- Archimedes.approximatePi( 48)) < precision);
	Assert.assertTrue(Math.abs(3.0990581252557265- Archimedes.approximatePi( 11)) < precision);
	Assert.assertTrue(Math.abs(3.1408425675666343- Archimedes.approximatePi( 83)) < precision);
	Assert.assertTrue(Math.abs(3.140785260725489- Archimedes.approximatePi( 80)) < precision);
	Assert.assertTrue(Math.abs(3.140475187910292- Archimedes.approximatePi( 68)) < precision);
	Assert.assertTrue(Math.abs(3.1415502262546897- Archimedes.approximatePi( 349)) < precision);
	Assert.assertTrue(Math.abs(3.141538178911329- Archimedes.approximatePi( 308)) < precision);
	Assert.assertTrue(Math.abs(3.141576056601735- Archimedes.approximatePi( 558)) < precision);
	Assert.assertTrue(Math.abs(3.141582107247802- Archimedes.approximatePi( 700)) < precision);
	Assert.assertTrue(Math.abs(3.141282121798652- Archimedes.approximatePi( 129)) < precision);
	Assert.assertTrue(Math.abs(3.141592237225897- Archimedes.approximatePi( 3523)) < precision);
	Assert.assertTrue(Math.abs(3.141588826347538- Archimedes.approximatePi( 1162)) < precision);
	Assert.assertTrue(Math.abs(3.141590474591773- Archimedes.approximatePi( 1540)) < precision);
	Assert.assertTrue(Math.abs(3.1415925946167045- Archimedes.approximatePi( 9361)) < precision);
	Assert.assertTrue(Math.abs(3.1415925650091037- Archimedes.approximatePi( 7638)) < precision);
	Assert.assertTrue(Math.abs(3.1415926520160147- Archimedes.approximatePi( 57303)) < precision);
	Assert.assertTrue(Math.abs(3.141592631441721- Archimedes.approximatePi( 15275)) < precision);
	Assert.assertTrue(Math.abs(3.1415926527845537- Archimedes.approximatePi( 80110)) < precision);
	Assert.assertTrue(Math.abs(3.14159264217904- Archimedes.approximatePi( 21281)) < precision);
	Assert.assertTrue(Math.abs(3.141592639364783- Archimedes.approximatePi( 19060)) < precision);
	Assert.assertTrue(Math.abs(3.1415926530730216- Archimedes.approximatePi( 100000)) < precision);
	Assert.assertTrue(Math.abs(3.1415926530730216- Archimedes.approximatePi( 100000)) < precision);
	}
}
