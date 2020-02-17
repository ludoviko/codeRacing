package com.lam.coder.topCoder;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimePolynomTest {
	PrimePolynom primePolynom;
	
	@Before
	public void setUp() throws Exception {
		primePolynom = new PrimePolynom();
	}

	@After
	public void tearDown() throws Exception {
		primePolynom  = null;
	}

	@Test
	public void test() {
        Assert.assertThat( primePolynom.reveal(1, -1, 41) , CoreMatchers.is(41));
		Assert.assertThat("Should be the same.", primePolynom.reveal(1, 1, 41) , CoreMatchers.is(40));
		Assert.assertThat("Should be the same.", primePolynom.reveal(1, 1, -13) , CoreMatchers.is(0));
		Assert.assertThat("Should be the same.", primePolynom.reveal(1, -79, 1601) , CoreMatchers.is(80));

		Assert.assertThat( primePolynom.reveal(1,-1,41), CoreMatchers.is(41));
		Assert.assertThat( primePolynom.reveal(1,1,41), CoreMatchers.is(40));
		Assert.assertThat( primePolynom.reveal(1,1,-13), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-15,97), CoreMatchers.is(48));
		Assert.assertThat( primePolynom.reveal(1,-3,43), CoreMatchers.is(42));
		Assert.assertThat( primePolynom.reveal(1,3,43), CoreMatchers.is(39));
		Assert.assertThat( primePolynom.reveal(1,-5,47), CoreMatchers.is(43));
		Assert.assertThat( primePolynom.reveal(1,5,47), CoreMatchers.is(38));
		Assert.assertThat( primePolynom.reveal(1,-7,53), CoreMatchers.is(44));
		Assert.assertThat( primePolynom.reveal(1,7,53), CoreMatchers.is(37));
		Assert.assertThat( primePolynom.reveal(1,-9,61), CoreMatchers.is(45));
		Assert.assertThat( primePolynom.reveal(1,9,61), CoreMatchers.is(36));
		Assert.assertThat( primePolynom.reveal(1,-11,71), CoreMatchers.is(46));
		Assert.assertThat( primePolynom.reveal(1,11,71), CoreMatchers.is(35));
		Assert.assertThat( primePolynom.reveal(1,-13,83), CoreMatchers.is(47));
		Assert.assertThat( primePolynom.reveal(2,-24,101), CoreMatchers.is(35));
		Assert.assertThat( primePolynom.reveal(1,-17,113), CoreMatchers.is(49));
		Assert.assertThat( primePolynom.reveal(2,-28,127), CoreMatchers.is(36));
		Assert.assertThat( primePolynom.reveal(1,-19,131), CoreMatchers.is(50));
		Assert.assertThat( primePolynom.reveal(1,-21,151), CoreMatchers.is(51));
		Assert.assertThat( primePolynom.reveal(2,-32,157), CoreMatchers.is(37));
		Assert.assertThat( primePolynom.reveal(1,-23,173), CoreMatchers.is(52));
		Assert.assertThat( primePolynom.reveal(2,-36,191), CoreMatchers.is(38));
		Assert.assertThat( primePolynom.reveal(1,-25,197), CoreMatchers.is(53));
		Assert.assertThat( primePolynom.reveal(6,-66,211), CoreMatchers.is(35));
		Assert.assertThat( primePolynom.reveal(1,-27,223), CoreMatchers.is(54));
		Assert.assertThat( primePolynom.reveal(2,-40,229), CoreMatchers.is(39));
		Assert.assertThat( primePolynom.reveal(1,-29,251), CoreMatchers.is(55));
		Assert.assertThat( primePolynom.reveal(2,-44,271), CoreMatchers.is(40));
		Assert.assertThat( primePolynom.reveal(1,-31,281), CoreMatchers.is(56));
		Assert.assertThat( primePolynom.reveal(6,-78,283), CoreMatchers.is(36));
		Assert.assertThat( primePolynom.reveal(979,1617,61), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(528,-1452,5471), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(7138,-6688,3461), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(3092,-2046,6491), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(1047,6501,6101), CoreMatchers.is(12));
		Assert.assertThat( primePolynom.reveal(9761,-7483,2659), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(5611,6477,193), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(7856,-7654,6451), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(3533,-2921,7069), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(2298,-5130,7121), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(9820,680,8039), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(2646,1428,1123), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(525,-3465,6883), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(1115,4665,5897), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(464,-3304,6703), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(2147,-2059,2293), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(164,654,7499), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(2321,-449,7867), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(3851,-2631,5351), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(214,4484,353), CoreMatchers.is(14));
		Assert.assertThat( primePolynom.reveal(397,8169,6151), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(1764,-1974,2423), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(5753,5765,6469), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(157,537,8467), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(3437,-7161,7253), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(730,1250,2897), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(8664,-4260,113), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(744,-1566,4703), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(7818,852,4111), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(2313,-7443,7213), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(6429,1461,1453), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(1211,-6605,8923), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(3561,-1155,3533), CoreMatchers.is(12));
		Assert.assertThat( primePolynom.reveal(914,-1532,1471), CoreMatchers.is(12));
		Assert.assertThat( primePolynom.reveal(8143,-9673,5231), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(5795,-6005,409), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(857,-751,8761), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(148,1644,3877), CoreMatchers.is(16));
		Assert.assertThat( primePolynom.reveal(7880,-8200,1627), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(31,3935,8273), CoreMatchers.is(11));
		Assert.assertThat( primePolynom.reveal(10000,10000,10000), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(10000,-10000,-10000), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(10000,10000,9973), CoreMatchers.is(1));
		Assert.assertThat( primePolynom.reveal(10000,-10000,9973), CoreMatchers.is(2));
		Assert.assertThat( primePolynom.reveal(1,0,0), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-1,0), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-1,1), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-1,2), CoreMatchers.is(2));
		Assert.assertThat( primePolynom.reveal(1,-1,3), CoreMatchers.is(3));
		Assert.assertThat( primePolynom.reveal(9921,2667,6029), CoreMatchers.is(20));
		Assert.assertThat( primePolynom.reveal(9684,-2190,9437), CoreMatchers.is(24));
		Assert.assertThat( primePolynom.reveal(1,-79,1601), CoreMatchers.is(80));
		Assert.assertThat( primePolynom.reveal(1,-59,911), CoreMatchers.is(70));
		Assert.assertThat( primePolynom.reveal(1,-61,971), CoreMatchers.is(71));
		Assert.assertThat( primePolynom.reveal(1,-63,1033), CoreMatchers.is(72));
		Assert.assertThat( primePolynom.reveal(1,-65,1097), CoreMatchers.is(73));
		Assert.assertThat( primePolynom.reveal(1,-67,1163), CoreMatchers.is(74));
		Assert.assertThat( primePolynom.reveal(1,-69,1231), CoreMatchers.is(75));
		Assert.assertThat( primePolynom.reveal(1,-71,1301), CoreMatchers.is(76));
		Assert.assertThat( primePolynom.reveal(1,-73,1373), CoreMatchers.is(77));
		Assert.assertThat( primePolynom.reveal(1,-75,1447), CoreMatchers.is(78));
		Assert.assertThat( primePolynom.reveal(1,-77,1523), CoreMatchers.is(79));
		Assert.assertThat( primePolynom.reveal(2,-88,997), CoreMatchers.is(51));
		Assert.assertThat( primePolynom.reveal(6,-162,1123), CoreMatchers.is(43));
		Assert.assertThat( primePolynom.reveal(9,-471,6203), CoreMatchers.is(40));
		Assert.assertThat( primePolynom.reveal(6,-342,4903), CoreMatchers.is(58));
		Assert.assertThat( primePolynom.reveal(4,-158,1601), CoreMatchers.is(40));
		Assert.assertThat( primePolynom.reveal(2,-112,1597), CoreMatchers.is(57));
		Assert.assertThat( primePolynom.reveal(1,-1,41), CoreMatchers.is(41));
		Assert.assertThat( primePolynom.reveal(1,1,-13), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-1,0), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,1,11), CoreMatchers.is(10));
		Assert.assertThat( primePolynom.reveal(1,1,2), CoreMatchers.is(1));
		Assert.assertThat( primePolynom.reveal(12,12,-4), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(10,-9,0), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,1,3), CoreMatchers.is(2));
		Assert.assertThat( primePolynom.reveal(1,1,1), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-1,1), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,1,4), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-79,1601), CoreMatchers.is(80));
		Assert.assertThat( primePolynom.reveal(100,0,0), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(2,-2,1), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,1,0), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,0,1), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-3,2), CoreMatchers.is(1));
		Assert.assertThat( primePolynom.reveal(1,0,4), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,1,9), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,1,12), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(2,0,4), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(9934,3456,234), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(10000,9973,5673), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(10000,10000,10000), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1,-1,2), CoreMatchers.is(2));
		Assert.assertThat( primePolynom.reveal(10000,9971,5379), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(3,0,4), CoreMatchers.is(0));
		Assert.assertThat( primePolynom.reveal(1007,0,2), CoreMatchers.is(2));
		Assert.assertThat( primePolynom.reveal(1,-2,2), CoreMatchers.is(1));

	}
}
