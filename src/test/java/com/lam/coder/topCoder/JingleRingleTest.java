package com.lam.coder.topCoder;

import com.lam.coder.topCoder.JingleRingle;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JingleRingleTest {
	JingleRingle jingleRingle;
	
	@Before
	public void setUp() throws Exception {
		jingleRingle = new JingleRingle();
	}

	@After
	public void tearDown() throws Exception {
		jingleRingle  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[] {1000, 1024}, new int[]{990, 1011}, 0), CoreMatchers.is(34));
        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[] {1000, 1001, 1002}, new int[] {980, 981, 982}, 2), CoreMatchers.is(2));
        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[] {100, 120, 140}, new int[] {150, 170, 200},15 ),
                CoreMatchers.is(0));
        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[] {}, new int[] {}, 20),
                CoreMatchers.is(0));
        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[] {1692, 3281, 862}, new int[] {2701, 2819, 2582, 1918, 638, 601, 1128, 2760, 1949, 3074,
                        615, 2221, 1691, 3226, 1351, 1329, 556, 1060, 898, 1080,
                        2494, 2379, 3148, 737, 1412, 3290, 1594, 1314, 959, 3192,
                        1326, 932, 1103, 937, 1670, 2017, 1403, 1282, 2949, 2940,
                        2557, 940, 2561, 1248, 2385, 541, 2382, 1309, 831}, 4),
                CoreMatchers.is(3905));
        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[]  {5016, 7212, 7613, 1590, 2942, 5155, 5898, 8113, 2001, 2348,
                        671, 5167, 7524, 2467, 4294, 3628, 4480, 5872, 5230, 3732,
                        4637, 6419, 1431, 6335, 1652, 3005, 2125, 2193, 2183, 5856,
                        1795, 5441, 2079, 7114, 2290, 4025, 5943, 1695}, new int[]  {2407, 5602, 1350}, 3),
                CoreMatchers.is(13195));
//        Assert.assertThat("Should be the same.", jingleRingle.profit(new int[] , new int[] , ), CoreMatchers.is());
	}
}
