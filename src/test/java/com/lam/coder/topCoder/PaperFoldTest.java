package com.lam.coder.topCoder;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.PaperFold;
@Ignore
public class PaperFoldTest extends TestCase {
	private PaperFold paper;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		paper = new PaperFold();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		paper = null;
	}

	@Test
	public void testNumFolds() {
		Assert.assertEquals(2 ,paper.numFolds(new int[] {11, 11}, new int[] {5, 11}));
		Assert.assertEquals(1, paper.numFolds( new int[] {8, 11} , new int[] {6, 10} ));
		Assert.assertEquals(4, paper.numFolds( new int[] {11, 17} , new int[] {6, 4} ));
		Assert.assertEquals(4, paper.numFolds( new int[] {11, 17} , new int[] {5, 4} ));
		Assert.assertEquals(-1, paper.numFolds( new int[] {1000,1000} , new int[] {62, 63} ));
		Assert.assertEquals(0, paper.numFolds( new int[] {100,30} , new int[] {60,110} ));
		Assert.assertEquals(5, paper.numFolds( new int[]  {1895, 6416}, new int[] {401, 1000} ));
	}

	@Test
	public void testNumFoldsSystemTest() {
//		Assert.assertEquals(2 ,paper.numFolds(new int[] {2056, 9360}, new int[] {1974, 5026}));
//		Assert.assertEquals(1 ,paper.numFolds(new int[] {978, 1187}, new int[] {490, 6135}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {8, 11}, new int[] {6, 10}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {11, 17}, new int[] {6, 4}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {11, 17}, new int[] {5, 4}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {1000, 1000}, new int[] {62, 63}));
		Assert.assertEquals(8 ,paper.numFolds(new int[] {512, 2}, new int[] {2, 2}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {100, 30}, new int[] {60, 110}));
		Assert.assertEquals(5 ,paper.numFolds(new int[] {1895, 6416}, new int[] {401, 1000}));
		Assert.assertEquals(5 ,paper.numFolds(new int[] {3169, 3464}, new int[] {1785, 225}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {5645, 3137}, new int[] {2229, 27}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {8994, 5100}, new int[] {982, 6753}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {7682, 6447}, new int[] {193, 436}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {8453, 3489}, new int[] {5592, 6463}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {9889, 9272}, new int[] {6568, 67}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {3541, 9525}, new int[] {7555, 9968}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {5022, 689}, new int[] {4937, 1855}));
		Assert.assertEquals(8 ,paper.numFolds(new int[] {3664, 3995}, new int[] {87, 937}));
		Assert.assertEquals(3 ,paper.numFolds(new int[] {9155, 8169}, new int[] {6135, 3463}));
		Assert.assertEquals(2 ,paper.numFolds(new int[] {7983, 4143}, new int[] {9349, 1122}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {1068, 9732}, new int[] {5416, 3972}));
		Assert.assertEquals(3 ,paper.numFolds(new int[] {8426, 9294}, new int[] {6857, 2810}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {6403, 5814}, new int[] {3858, 37}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {5755, 2026}, new int[] {4055, 3020}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {9561, 5779}, new int[] {1501, 3556}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {5108, 2924}, new int[] {5809, 9686}));
		Assert.assertEquals(6 ,paper.numFolds(new int[] {3377, 7517}, new int[] {389, 3153}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {2818, 4928}, new int[] {6509, 4757}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {6343, 5242}, new int[] {5573, 3647}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {7292, 9059}, new int[] {9255, 7465}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {1574, 882}, new int[] {5123, 6123}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {2349, 2412}, new int[] {7150, 8022}));
		Assert.assertEquals(5 ,paper.numFolds(new int[] {7745, 9698}, new int[] {4288, 682}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {4232, 7405}, new int[] {4519, 8760}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {5421, 2805}, new int[] {3, 4863}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {6533, 7604}, new int[] {1309, 48}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {1482, 8640}, new int[] {2388, 6647}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {1350, 2462}, new int[] {1440, 9103}));
		Assert.assertEquals(3 ,paper.numFolds(new int[] {8304, 7859}, new int[] {2148, 6980}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {9556, 9370}, new int[] {770, 514}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {8830, 8903}, new int[] {7963, 48}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {3724, 8080}, new int[] {46, 2032}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {5918, 7087}, new int[] {2300, 85}));
		Assert.assertEquals(2 ,paper.numFolds(new int[] {5006, 3607}, new int[] {1800, 8290}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {5061, 1100}, new int[] {4675, 7479}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {5540, 5216}, new int[] {1285, 3906}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {1998, 5645}, new int[] {515, 15}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {7303, 8691}, new int[] {814, 276}));
//		Assert.assertEquals(2 ,paper.numFolds(new int[] {2528, 3911}, new int[] {4079, 639}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {1242, 5184}, new int[] {2384, 4872}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {6196, 9201}, new int[] {75, 1154}));
//		Assert.assertEquals(1 ,paper.numFolds(new int[] {1871, 2385}, new int[] {9656, 1088}));
		Assert.assertEquals(5 ,paper.numFolds(new int[] {1895, 6416}, new int[] {401, 1000}));
		Assert.assertEquals(8 ,paper.numFolds(new int[] {16, 16}, new int[] {1, 1}));
		Assert.assertEquals(8 ,paper.numFolds(new int[] {256, 1}, new int[] {1, 1}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {8, 11}, new int[] {3, 2}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {11, 17}, new int[] {6, 4}));
		Assert.assertEquals(1 ,paper.numFolds(new int[] {2, 1}, new int[] {1, 1}));
		Assert.assertEquals(8 ,paper.numFolds(new int[] {1, 256}, new int[] {1, 1}));
		Assert.assertEquals(0 ,paper.numFolds(new int[] {10000, 2}, new int[] {10000, 4}));
		Assert.assertEquals(-1 ,paper.numFolds(new int[] {1, 257}, new int[] {1, 1}));
		Assert.assertEquals(4 ,paper.numFolds(new int[] {7000, 7000}, new int[] {2000, 2000}));
	}
}
