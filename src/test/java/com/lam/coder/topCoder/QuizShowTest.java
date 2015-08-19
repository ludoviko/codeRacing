package com.lam.coder.topCoder;


import org.junit.*;

import com.lam.coder.topCoder.QuizShow;

import junit.framework.TestCase;
@Ignore
public class QuizShowTest  {
	QuizShow show;
	
	@Before
	public void setUp() throws Exception {
		show = new QuizShow();
	}

	@After
	public void tearDown() throws Exception {
		show = null;
	}

	@Test
	public void testWager() {
        Assert.assertEquals(76, show.wager(new int[] {100, 100, 100}, 25, 75));
        Assert.assertEquals(0, show.wager(new int[] {10, 50, 60}, 30, 41));
        Assert.assertEquals(10, show.wager(new int[] {10, 50, 60}, 31, 41));
        Assert.assertEquals(1, show.wager(new int[] {2, 2, 12}, 0, 10));
        Assert.assertEquals(9999, show.wager(new int[] {10000, 10000, 10000}, 9998, 9997));
        Assert.assertEquals(694, show.wager(new int[] {5824, 4952, 6230}, 364, 287));
	}
	
	@Test
	public void testWagerSystemTest() {
		Assert.assertEquals(76, show.wager(new int[] {100, 100, 100}, 25, 75));
		Assert.assertEquals(0, show.wager(new int[] {10, 50, 60}, 30, 41));
		Assert.assertEquals(10, show.wager(new int[] {10, 50, 60}, 31, 41));
		Assert.assertEquals(2, show.wager(new int[] {2, 2, 12}, 0, 9));
		Assert.assertEquals(1, show.wager(new int[] {2, 2, 12}, 0, 10));
		Assert.assertEquals(1, show.wager(new int[] {2, 2, 12}, 0, 11));
		Assert.assertEquals(1, show.wager(new int[] {2, 2, 12}, 0, 12));
		Assert.assertEquals(3623, show.wager(new int[] {8243, 4248, 7923}, 4248, 3942));
		Assert.assertEquals(9999, show.wager(new int[] {10000, 10000, 10000}, 9998, 9997));
		Assert.assertEquals(694, show.wager(new int[] {5824, 4952, 6230}, 364, 287));
		Assert.assertEquals(0, show.wager(new int[] {2983, 2348, 3849}, 492, 952));
		Assert.assertEquals(24, show.wager(new int[] {429, 23, 238}, 23, 214));
		Assert.assertEquals(496, show.wager(new int[] {500, 1000, 1000}, 5, 10));
		Assert.assertEquals(0, show.wager(new int[] {1000, 1000, 1000}, 1000, 1000));
		Assert.assertEquals(1, show.wager(new int[] {1, 10000, 10000}, 9999, 9999));
		Assert.assertEquals(9997, show.wager(new int[] {10000, 2, 9998}, 0, 9998));
		Assert.assertEquals(0, show.wager(new int[] {10000, 3, 9998}, 0, 9998));
		Assert.assertEquals(0, show.wager(new int[] {0, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {1, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {0, 1, 1}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {0, 1, 1}, 0, 0));
		Assert.assertEquals(1, show.wager(new int[] {1, 1, 1}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {7904, 1734, 8495}, 267, 7710));
		Assert.assertEquals(2079, show.wager(new int[] {8122, 2393, 6614}, 2106, 3586));
		Assert.assertEquals(0, show.wager(new int[] {1485, 35, 6757}, 22, 3052));
		Assert.assertEquals(35, show.wager(new int[] {7292, 7914, 4968}, 6764, 2358));
		Assert.assertEquals(0, show.wager(new int[] {4603, 2136, 5438}, 1020, 5146));
		Assert.assertEquals(0, show.wager(new int[] {785, 5615, 7865}, 1283, 3999));
		Assert.assertEquals(782, show.wager(new int[] {3699, 9403, 3084}, 7144, 1396));
		Assert.assertEquals(0, show.wager(new int[] {7808, 944, 3818}, 270, 581));
		Assert.assertEquals(0, show.wager(new int[] {7442, 45, 1991}, 6, 1348));
		Assert.assertEquals(0, show.wager(new int[] {2534, 3273, 5848}, 2916, 4935));
		Assert.assertEquals(0, show.wager(new int[] {2207, 2284, 4150}, 2268, 3378));
		Assert.assertEquals(0, show.wager(new int[] {1793, 6040, 7100}, 175, 5610));
		Assert.assertEquals(1329, show.wager(new int[] {7634, 6189, 2922}, 2773, 1256));
		Assert.assertEquals(2189, show.wager(new int[] {7607, 5750, 767}, 4045, 383));
		Assert.assertEquals(0, show.wager(new int[] {3169, 226, 782}, 196, 575));
		Assert.assertEquals(5662, show.wager(new int[] {5964, 3745, 9524}, 1006, 2101));
		Assert.assertEquals(0, show.wager(new int[] {6075, 431, 6331}, 418, 2503));
		Assert.assertEquals(0, show.wager(new int[] {1689, 6174, 4623}, 38, 3184));
		Assert.assertEquals(0, show.wager(new int[] {6000, 3386, 7074}, 670, 4016));
		Assert.assertEquals(2370, show.wager(new int[] {5727, 7418, 7365}, 678, 6688));
		Assert.assertEquals(0, show.wager(new int[] {8555, 7234, 9747}, 1213, 7872));
		Assert.assertEquals(0, show.wager(new int[] {3745, 9091, 7426}, 6674, 6073));
		Assert.assertEquals(0, show.wager(new int[] {1892, 6505, 2211}, 6088, 325));
		Assert.assertEquals(724, show.wager(new int[] {9823, 1537, 9521}, 911, 1025));
		Assert.assertEquals(0, show.wager(new int[] {7391, 9445, 3162}, 2520, 2915));
		Assert.assertEquals(0, show.wager(new int[] {1330, 3900, 9728}, 877, 5003));
		Assert.assertEquals(3539, show.wager(new int[] {3751, 3051, 6680}, 2306, 609));
		Assert.assertEquals(1152, show.wager(new int[] {3603, 3028, 766}, 1726, 361));
		Assert.assertEquals(0, show.wager(new int[] {9100, 1779, 3337}, 1468, 2792));
		Assert.assertEquals(2846, show.wager(new int[] {6197, 4296, 8347}, 1554, 695));
		Assert.assertEquals(1266, show.wager(new int[] {3698, 2693, 8175}, 2270, 3224));
		Assert.assertEquals(0, show.wager(new int[] {6520, 1786, 3556}, 354, 1183));
		Assert.assertEquals(6219, show.wager(new int[] {9422, 9142, 9571}, 3332, 6069));
		Assert.assertEquals(151, show.wager(new int[] {851, 2090, 6421}, 1139, 5420));
		Assert.assertEquals(0, show.wager(new int[] {8373, 1439, 4336}, 1176, 3560));
		Assert.assertEquals(516, show.wager(new int[] {3817, 5763, 9005}, 5362, 4673));
		Assert.assertEquals(2814, show.wager(new int[] {9332, 6790, 743}, 5355, 160));
		Assert.assertEquals(219, show.wager(new int[] {8770, 6431, 144}, 2557, 28));
		Assert.assertEquals(1065, show.wager(new int[] {9461, 7496, 609}, 3029, 245));
		Assert.assertEquals(0, show.wager(new int[] {1030, 3812, 3304}, 1922, 740));
		Assert.assertEquals(0, show.wager(new int[] {3229, 425, 8323}, 262, 7591));
		Assert.assertEquals(0, show.wager(new int[] {4372, 3233, 6893}, 3089, 4121));
		Assert.assertEquals(3785, show.wager(new int[] {5680, 5172, 8584}, 937, 880));
		Assert.assertEquals(0, show.wager(new int[] {1081, 8183, 4151}, 3120, 3740));
		Assert.assertEquals(1588, show.wager(new int[] {5085, 2567, 4171}, 815, 2501));
		Assert.assertEquals(0, show.wager(new int[] {3558, 6631, 6412}, 5746, 6184));
		Assert.assertEquals(0, show.wager(new int[] {6554, 6330, 8481}, 6255, 6423));
		Assert.assertEquals(0, show.wager(new int[] {6045, 4734, 7491}, 145, 5286));
		Assert.assertEquals(6017, show.wager(new int[] {9572, 8253, 9487}, 7335, 3553));
		Assert.assertEquals(2377, show.wager(new int[] {6840, 4983, 2677}, 4233, 1996));
		Assert.assertEquals(0, show.wager(new int[] {1, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {1000, 5, 5}, 2, 2));
		Assert.assertEquals(1, show.wager(new int[] {1, 1, 2}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {100, 10, 10}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {10, 1, 1}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {1000, 100, 100}, 25, 75));
		Assert.assertEquals(0, show.wager(new int[] {10000, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {5, 5, 0}, 4, 0));
		Assert.assertEquals(0, show.wager(new int[] {100, 50, 50}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {888, 888, 444}, 98, 97));
		Assert.assertEquals(6, show.wager(new int[] {10, 10, 20}, 5, 6));
		Assert.assertEquals(0, show.wager(new int[] {9, 10, 2}, 3, 1));
		Assert.assertEquals(0, show.wager(new int[] {1, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {1000, 5, 5}, 2, 2));
		Assert.assertEquals(1, show.wager(new int[] {1, 1, 2}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {100, 10, 10}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {10, 1, 1}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {1000, 100, 100}, 25, 75));
		Assert.assertEquals(0, show.wager(new int[] {10000, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {5, 5, 0}, 4, 0));
		Assert.assertEquals(0, show.wager(new int[] {100, 50, 50}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {888, 888, 444}, 98, 97));
		Assert.assertEquals(6, show.wager(new int[] {10, 10, 20}, 5, 6));
		Assert.assertEquals(0, show.wager(new int[] {9, 10, 2}, 3, 1));
		Assert.assertEquals(0, show.wager(new int[] {1, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {1000, 5, 5}, 2, 2));
		Assert.assertEquals(1, show.wager(new int[] {1, 1, 2}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {100, 10, 10}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {10, 1, 1}, 1, 1));
		Assert.assertEquals(0, show.wager(new int[] {1000, 100, 100}, 25, 75));
		Assert.assertEquals(0, show.wager(new int[] {10000, 0, 0}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {5, 5, 0}, 4, 0));
		Assert.assertEquals(0, show.wager(new int[] {100, 50, 50}, 0, 0));
		Assert.assertEquals(0, show.wager(new int[] {888, 888, 444}, 98, 97));
		Assert.assertEquals(6, show.wager(new int[] {10, 10, 20}, 5, 6));
		Assert.assertEquals(0, show.wager(new int[] {9, 10, 2}, 3, 1));
	}
}
