package com.lam.coder.topCoder;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MergeSort;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MergeSortIntegerTest extends TestCase {

	MergeSort<Integer> mergeSort;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		mergeSort = new MergeSort<Integer>();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		mergeSort = null;
	}

	@Test
	public void testMerge() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(5);

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);

		Assert.assertEquals(expected, mergeSort.merge(a, b));

		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(8);
		expected.add(9);

		a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(8);
		a.add(9);

		b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);

		Assert.assertEquals(expected, mergeSort.merge(a, b));
	}

	@Test
	public void testMergeSortOneElement() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);

		Assert.assertEquals(expected, mergeSort.mergeSort(a));
	}

	@Test
	public void testMergeSortTwoElement() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);

		Assert.assertEquals(expected, mergeSort.mergeSort(a));
	}

	@Test
	public void testMergeSortThreeElement() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(8);
		expected.add(9);

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(8);
		a.add(1);

		Assert.assertEquals(expected, mergeSort.mergeSort(a));
	}

	@Test
	public void testMergeSortFromFourOnElements() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(8);
		expected.add(9);
		expected.add(77);

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(8);
		a.add(77);
		a.add(1);

		Assert.assertEquals(expected, mergeSort.mergeSort(a));

		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(8);
		expected.add(9);
		expected.add(12);
		expected.add(77);

		a = new ArrayList<Integer>();
		a.add(9);
		a.add(8);
		a.add(77);
		a.add(12);
		a.add(1);
		Assert.assertEquals(expected, mergeSort.mergeSort(a));
	}

	@Test
	public void testHowManyComparisonsWithArray() {
		Assert.assertEquals(4, mergeSort.howManyComparisons( new Integer[] {1, 2, 3, 4}));
		Assert.assertEquals(2,
				mergeSort.howManyComparisons(new Integer[] { 2, 3, 2 }));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {1, 1, 2}));
		Assert.assertEquals(0, mergeSort.howManyComparisons(new Integer[] { 17 }));
		Assert.assertEquals(0, mergeSort.howManyComparisons(new Integer[] {}));
		Assert.assertEquals(4,
				mergeSort.howManyComparisons(new Integer[] { 1, 2, 3, 4 }));
		Assert.assertEquals(19, mergeSort.howManyComparisons(new Integer[] {
				-2000000000, 2000000000, 0, 0, 0, -2000000000, 2000000000, 0,
				0, 0 }));
	}

	@Test
	public void testHowManyComparisonsWithList() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		Assert.assertEquals(4, mergeSort.howManyComparisons(expected));
	}
	
	@Test
	public void testHowManyComparisonsWithArraySystemTest() {
		Assert.assertEquals(4, mergeSort.howManyComparisons( new Integer[] {1, 2, 3, 4}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {2, 3, 2}));
		Assert.assertEquals(0, mergeSort.howManyComparisons( new Integer[] {-17}));
		Assert.assertEquals(0, mergeSort.howManyComparisons( new Integer[] {}));
		Assert.assertEquals(0, mergeSort.howManyComparisons( new Integer[] {-20}));
		Assert.assertEquals(1, mergeSort.howManyComparisons( new Integer[] {7, 7}));
		Assert.assertEquals(1, mergeSort.howManyComparisons( new Integer[] {4, 3}));
		Assert.assertEquals(1, mergeSort.howManyComparisons( new Integer[] {3, 4}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {1, 2, 3}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {1, 3, 2}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {2, 1, 3}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {2, 3, 1}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {3, 1, 2}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {3, 2, 1}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {1, 2, 1}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {2, 1, 1}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {1, 1, 1}));
		Assert.assertEquals(9, mergeSort.howManyComparisons( new Integer[] {1, 2, 3, 4, 5, 6, 7}));
		Assert.assertEquals(11, mergeSort.howManyComparisons( new Integer[] {7, 6, 5, 4, 3, 2, 1}));
		Assert.assertEquals(1, mergeSort.howManyComparisons( new Integer[] {47, 36}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {16, 30, 46}));
		Assert.assertEquals(5, mergeSort.howManyComparisons( new Integer[] {36, 26, 33, 14}));
		Assert.assertEquals(7, mergeSort.howManyComparisons( new Integer[] {23, 18, 37, 37, 5}));
		Assert.assertEquals(10, mergeSort.howManyComparisons( new Integer[] {20, 25, 1, 41, 42, 23}));
		Assert.assertEquals(14, mergeSort.howManyComparisons( new Integer[] {25, 39, 0, 37, 30, 12, 47}));
		Assert.assertEquals(17, mergeSort.howManyComparisons( new Integer[] {41, 32, 33, 30, 31, 19, 48, 14}));
		Assert.assertEquals(19, mergeSort.howManyComparisons( new Integer[] {17, 34, 42, 1, 1, 15, 21, 38, 2}));
		Assert.assertEquals(24, mergeSort.howManyComparisons( new Integer[] {29, 11, 29, 30, 2, 23, 5, 30, 13, 6}));
		Assert.assertEquals(27, mergeSort.howManyComparisons( new Integer[] {17, 45, 20, 16, 36, 4, 49, 18, 38, 21, 16}));
		Assert.assertEquals(28, mergeSort.howManyComparisons( new Integer[] {2, 38, 3, 44, 41, 4, 11, 15, 44, 15, 44, 5}));
		Assert.assertEquals(35, mergeSort.howManyComparisons( new Integer[] {44, 26, 8, 20, 34, 38, 35, 40, 7, 30, 12, 24, 17}));
		Assert.assertEquals(38, mergeSort.howManyComparisons( new Integer[] {17, 25, 37, 5, 46, 4, 9, 37, 9, 3, 28, 15, 14, 43}));
		Assert.assertEquals(40, mergeSort.howManyComparisons( new Integer[] {9, 29, 39, 15, 25, 18, 25, 45, 2, 15, 32, 44, 24, 13, 6}));
		Assert.assertEquals(42, mergeSort.howManyComparisons( new Integer[] {0, 32, 23, 26, 19, 30, 24, 25, 39, 11, 34, 42, 42, 49, 8, 37}));
		Assert.assertEquals(49, mergeSort.howManyComparisons( new Integer[] {11, 39, 29, 26, 17, 47, 3, 14, 49, 18, 47, 43, 42, 10, 49, 45, 44}));
		Assert.assertEquals(51, mergeSort.howManyComparisons( new Integer[] {25, 21, 13, 5, 47, 41, 45, 9, 25, 39, 3, 27, 0, 40, 38, 41, 21, 16}));
		Assert.assertEquals(52, mergeSort.howManyComparisons( new Integer[] {8, 18, 19, 23, 19, 39, 22, 14, 33, 34, 16, 28, 28, 41, 49, 43, 48, 49, 34}));
		Assert.assertEquals(62, mergeSort.howManyComparisons( new Integer[] {-1437091263, 1501670972, 716373032, 1116631301, -732859106, -1539331901, -1281417393, -1167652725, 688931660, -1441761044, 688931660, -1126886511, -569924439, 253060386, 193039816, -372592555, 929210903, -183615805, 552793671, 668036989}));
		Assert.assertEquals(84, mergeSort.howManyComparisons( new Integer[] {1479524095, 1479524095, 1082981104, 513056665, 766117051, 959156867, 586564313, 513056665, 754211028, 839080859, -534601298, -1202560850, 1572022689, -19854097, -538011812, 134453198, -328364711, 754211028, -623506431, 708652979, -1701361236, 754211028, -534601298, -979453453, 498820948}));
		Assert.assertEquals(107, mergeSort.howManyComparisons( new Integer[] {850374041, -452435125, -270833029, 1173484882, -452435125, -270833029, 850374041, -83443999, -226230674, 575905448, 802580611, 1009401678, -452435125, 1464808776, -308404349, 74068174, -166965734, 300653338, 1214394821, -452435125, 51672587, 854253198, -283828773, 854253198, -452435125, -1683252938, 752923527, -1133859689, -1348417877, 501063584}));
		Assert.assertEquals(132, mergeSort.howManyComparisons( new Integer[] {-399528715, -129194197, -188173052, -77644332, 545060329, 485090118, 116715558, -177590827, 116715558, 603913596, -1042506467, -1065675744, 1110311214, -154415927, 485090118, 454460883, 939551001, 1056266559, -1268807917, -1065675744, -1095268856, 9708325, -1055967419, 454460883, 485090118, -314749888, -1095268856, -365222270, 794281223, 360209526, 412316241, 1188086959, 520314879, 156954934, -31187073}));
		Assert.assertEquals(157, mergeSort.howManyComparisons( new Integer[] {359892402, 45142513, -472198782, 676905441, 1530755522, -1266908324, 1530755522, 344976064, 865290943, -1125237771, -1156424844, 758774610, 234793849, -126422596, 1530755522, -743898339, 136676985, -1332110341, 196921771, 438514350, 484183625, -126422596, -229036475, 5757374, 196921771, -386575532, -1130473871, 1153686762, -178423579, 18498192, -1332110341, 107190669, 1266863233, 1266863233, 814951337, -1591937630, 168970486, -961503385, 192183377, 13759798}));
		Assert.assertEquals(181, mergeSort.howManyComparisons( new Integer[] {-843345432, 1242715126, 1349905796, 469285381, -640371509, 403212624, 1242715126, 1406111146, 444607761, 636791138, 650550936, 682808926, 1172079458, 455062509, -1079968531, -1234818498, -193549724, 1362567385, 639417677, 64548718, 1608948, -904676255, -568246332, 1118089387, -1021256809, 493992782, -843345432, 330284767, -305385506, 1172079458, -1330539815, 818552781, -86123475, -654369806, -1683764067, -557537227, -63544446, 201426902, -583975296, 323310462, 650550936, -379933362, 665626807, 636791138, 682808926}));
		Assert.assertEquals(215, mergeSort.howManyComparisons( new Integer[] {676157473, -879213711, 676157473, 68274365, 68274365, -1840185910, 474531788, 145317820, 676157473, -758150407, 121855856, 347492313, -1110635297, -978816486, -910542121, 1506642794, 1192368765, -946078450, -582816538, 572732409, -175352012, -1545704746, 444286033, 61384307, 1518309623, 662429473, -2033636587, 39796437, 111063632, -52284714, 68274365, 550690124, 1046450888, 550690124, 170713070, -458460955, 203968518, -1829668069, 357612016, -1678808000, 416390934, 631769139, 741129694, 1046949504, -758150407, 1518309623, -176138463, 27830055, -946078450, 385398478}));
		Assert.assertEquals(19, mergeSort.howManyComparisons( new Integer[] {-2000000000, 2000000000, 0, 0, 0, -2000000000, 2000000000, 0, 0, 0}));
		Assert.assertEquals(153, mergeSort.howManyComparisons( new Integer[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
		Assert.assertEquals(5, mergeSort.howManyComparisons( new Integer[] {4, 2, 3, 1}));
		Assert.assertEquals(5, mergeSort.howManyComparisons( new Integer[] {12, 144, 151, 40}));
		Assert.assertEquals(19, mergeSort.howManyComparisons( new Integer[] {-20000, 20000, 0, 0, 0, -20000, 20000, 0, 0, 0}));
		Assert.assertEquals(151, mergeSort.howManyComparisons( new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
		Assert.assertEquals(63, mergeSort.howManyComparisons( new Integer[] {23947, 20, -102, 30, 30, 20, 340, -122, 0, 0, 3, 0, 0, 489, 0, 0, 0, 0, 0, 0, 0, 0}));
		Assert.assertEquals(58, mergeSort.howManyComparisons( new Integer[] {200000000, 2, 3, 4, -2000000, 0, 0, 99, 99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 100, 200000}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {2, 3, 3}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {5, 4, 3}));
		Assert.assertEquals(7, mergeSort.howManyComparisons( new Integer[] {1, 2, 3, 4, 5, 6}));
		Assert.assertEquals(5, mergeSort.howManyComparisons( new Integer[] {4, 2, 3, 1}));
		Assert.assertEquals(5, mergeSort.howManyComparisons( new Integer[] {12, 144, 151, 40}));
		Assert.assertEquals(19, mergeSort.howManyComparisons( new Integer[] {-20000, 20000, 0, 0, 0, -20000, 20000, 0, 0, 0}));
		Assert.assertEquals(151, mergeSort.howManyComparisons( new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
		Assert.assertEquals(63, mergeSort.howManyComparisons( new Integer[] {23947, 20, -102, 30, 30, 20, 340, -122, 0, 0, 3, 0, 0, 489, 0, 0, 0, 0, 0, 0, 0, 0}));
		Assert.assertEquals(58, mergeSort.howManyComparisons( new Integer[] {200000000, 2, 3, 4, -2000000, 0, 0, 99, 99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 100, 200000}));
		Assert.assertEquals(2, mergeSort.howManyComparisons( new Integer[] {2, 3, 3}));
		Assert.assertEquals(3, mergeSort.howManyComparisons( new Integer[] {5, 4, 3}));
		Assert.assertEquals(7, mergeSort.howManyComparisons( new Integer[] {1, 2, 3, 4, 5, 6}));
	}
}
