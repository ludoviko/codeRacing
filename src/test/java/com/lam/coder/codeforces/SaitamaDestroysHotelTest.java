package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.SaitamaDestroysHotel;

@Ignore
public class SaitamaDestroysHotelTest {
	SaitamaDestroysHotel saitamaDestroysHotel;
	
	@Before
	public void setUp() throws Exception {
		saitamaDestroysHotel = new SaitamaDestroysHotel();
	}

	@After
	public void tearDown() throws Exception {
		saitamaDestroysHotel  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(11, saitamaDestroysHotel.find (7, new String[] {"2 1", "3 8", "5 2"}));
        Assert.assertEquals(79, saitamaDestroysHotel.find (10, new String[] {"2 77", "3 33","8 21", "9 12", "10 64"}));
        Assert.assertEquals(15, saitamaDestroysHotel.find (0, new String[] {"0 15"}));
        Assert.assertEquals(0, saitamaDestroysHotel.find (0, new String[] {"0 0"}));
	}
}
