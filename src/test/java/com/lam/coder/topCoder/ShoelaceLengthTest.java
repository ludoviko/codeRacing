package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ShoelaceLength;

public class ShoelaceLengthTest {
	ShoelaceLength lace;
	
	private static final double PRECISION = 1e-9;
	
	@Before
	public void setUp() throws Exception {
		lace = new ShoelaceLength();
	}

	@After
	public void tearDown() throws Exception {
		lace = null;
	}

	@Test
	public void testCalculate() {
		Assert.assertTrue(PRECISION > Math.abs(111.1786186482248 - lace.calculate(10, 1, 1, 10)));
		Assert.assertTrue(PRECISION > Math.abs(6.47213595499958 - lace.calculate(2, 2, 1, 2)));
		Assert.assertTrue(PRECISION > Math.abs(3.8284271247461903 - lace.calculate(1, 1, 1, 2)));
		Assert.assertTrue(PRECISION > Math.abs(102.17861864822481 - lace.calculate(1, 10, 1, 10)));
//		Assert.assertTrue(PRECISION > Math.abs( - lace.calculate(, , , )));
//		Assert.assertTrue(PRECISION > Math.abs( - lace.calculate(, , , )));
	}
	
	@Test
	public void calculateSystemTest() {
		Assert.assertTrue(PRECISION > Math.abs(6.47213595499958 - lace.calculate(2, 2, 1, 2)));
		Assert.assertTrue(PRECISION > Math.abs(111.1786186482248 - lace.calculate(10, 1, 1, 10)));
		Assert.assertTrue(PRECISION > Math.abs(102.17861864822481 - lace.calculate(1, 10, 1, 10)));
		Assert.assertTrue(PRECISION > Math.abs(3.8284271247461903 - lace.calculate(1, 1, 1, 2)));
		Assert.assertTrue(PRECISION > Math.abs(107.97663296253066 - lace.calculate(1, 99, 19, 2)));
		Assert.assertTrue(PRECISION > Math.abs(346.86770343916925 - lace.calculate(2, 98, 25, 4)));
		Assert.assertTrue(PRECISION > Math.abs(600.7501476283504 - lace.calculate(3, 97, 29, 6)));
		Assert.assertTrue(PRECISION > Math.abs(978.2049477141356 - lace.calculate(4, 96, 31, 9)));
		Assert.assertTrue(PRECISION > Math.abs(1109.727068795039 - lace.calculate(5, 95, 32, 10)));
		Assert.assertTrue(PRECISION > Math.abs(1490.9970789116976 - lace.calculate(6, 94, 33, 13)));
		Assert.assertTrue(PRECISION > Math.abs(2148.5801399226502 - lace.calculate(7, 93, 35, 18)));
		Assert.assertTrue(PRECISION > Math.abs(2885.718652644393 - lace.calculate(8, 92, 39, 23)));
		Assert.assertTrue(PRECISION > Math.abs(4232.975184119522 - lace.calculate(9, 91, 50, 30)));
		Assert.assertTrue(PRECISION > Math.abs(4746.163504230501 - lace.calculate(10, 90, 55, 32)));
		Assert.assertTrue(PRECISION > Math.abs(5562.216792596627 - lace.calculate(11, 89, 62, 35)));
		Assert.assertTrue(PRECISION > Math.abs(6517.759007894257 - lace.calculate(12, 88, 73, 37)));
		Assert.assertTrue(PRECISION > Math.abs(8369.861553307757 - lace.calculate(13, 87, 84, 43)));
		Assert.assertTrue(PRECISION > Math.abs(10028.668418159381 - lace.calculate(15, 85, 95, 47)));
		Assert.assertTrue(PRECISION > Math.abs(10776.746614246898 - lace.calculate(19, 81, 99, 49)));
		Assert.assertTrue(PRECISION > Math.abs(4929.303537043948 - lace.calculate(25, 75, 2, 50)));
		Assert.assertTrue(PRECISION > Math.abs(4738.006277672702 - lace.calculate(29, 71, 3, 48)));
		Assert.assertTrue(PRECISION > Math.abs(4546.128377706249 - lace.calculate(31, 69, 4, 46)));
		Assert.assertTrue(PRECISION > Math.abs(4354.437390419365 - lace.calculate(32, 68, 5, 44)));
		Assert.assertTrue(PRECISION > Math.abs(4062.8616465306095 - lace.calculate(33, 67, 6, 41)));
		Assert.assertTrue(PRECISION > Math.abs(3974.20863404904 - lace.calculate(35, 65, 7, 40)));
		Assert.assertTrue(PRECISION > Math.abs(3685.5242417004815 - lace.calculate(39, 61, 8, 37)));
		Assert.assertTrue(PRECISION > Math.abs(3199.8196773783734 - lace.calculate(50, 50, 9, 32)));
		Assert.assertTrue(PRECISION > Math.abs(2706.6542341425043 - lace.calculate(55, 45, 10, 27)));
		Assert.assertTrue(PRECISION > Math.abs(2008.283050442426 - lace.calculate(62, 38, 11, 20)));
		Assert.assertTrue(PRECISION > Math.abs(1824.8393831065948 - lace.calculate(73, 27, 12, 18)));
		Assert.assertTrue(PRECISION > Math.abs(1539.2198034842877 - lace.calculate(84, 16, 13, 15)));
		Assert.assertTrue(PRECISION > Math.abs(1368.815085140135 - lace.calculate(95, 5, 15, 13)));
		Assert.assertTrue(PRECISION > Math.abs(763.8651799756235 - lace.calculate(99, 1, 20, 7)));
		Assert.assertTrue(PRECISION > Math.abs(111.1786186482248 - lace.calculate(10, 1, 1, 10)));
		Assert.assertTrue(PRECISION > Math.abs(102.17861864822481 - lace.calculate(1, 10, 1, 10)));
		Assert.assertTrue(PRECISION > Math.abs(107.97663296253066 - lace.calculate(1, 99, 19, 2)));
		Assert.assertTrue(PRECISION > Math.abs(6.47213595499958 - lace.calculate(2, 2, 1, 2)));
		Assert.assertTrue(PRECISION > Math.abs(1088.913580216457 - lace.calculate(97, 13, 3, 10)));
		Assert.assertTrue(PRECISION > Math.abs(3551.882378583914 - lace.calculate(1, 90, 1, 40)));
		Assert.assertTrue(PRECISION > Math.abs(245.68293688965883 - lace.calculate(15, 30, 5, 6)));
		Assert.assertTrue(PRECISION > Math.abs(56.62213195631012 - lace.calculate(10, 5, 2, 4)));
		Assert.assertTrue(PRECISION > Math.abs(15.866068747318506 - lace.calculate(1, 10, 5, 2)));
	}


}
