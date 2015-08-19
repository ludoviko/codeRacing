package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.PipeCuts;
@Ignore
public class PipeCutsTest  {
	PipeCuts cuts;

	@Before
	public void setUp() throws Exception {
		cuts = new PipeCuts();
	}

	@After
	public void tearDown() throws Exception {
		cuts = null;
	}

	@Test
	public void testProbability() {
		Assert.assertEquals(1.0, cuts.probability(new int[] {25, 50, 75}, 25));
		Assert.assertEquals(0.0, cuts.probability(new int[] {25, 50, 75}, 50));
		Assert.assertEquals(1.0, cuts.probability(new int[] {25, 50, 75}, 25));
		Assert.assertEquals(0.7222222222222222, cuts.probability(new int[] {11,22,33,44,55,66,77,88,99}, 50));
		Assert.assertEquals(0.7222222222222222, cuts.probability(new int[] {99, 88, 77, 66, 55, 44, 33, 22, 11}, 50));
	}
	
	@Test
	public void testProbabilitySystemTest() {
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {25, 50, 75}, 25));
		Assert.assertEquals(0.0 , cuts.probability(new int[]  {25, 50, 75}, 50));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {25, 50, 75}, 24));
		Assert.assertEquals(0.7222222222222222 , cuts.probability(new int[]  {99, 88, 77, 66, 55, 44, 33, 22, 11}, 50));
		Assert.assertEquals(0.9974489795918368 , cuts.probability(new int[]  {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 34));
		Assert.assertEquals(0.002551020408163265 , cuts.probability(new int[]  {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 95));
		Assert.assertEquals(0.4362244897959184 , cuts.probability(new int[]  {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 60));
		Assert.assertEquals(0.0 , cuts.probability(new int[]  {50, 51}, 50));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {50, 51}, 49));
		Assert.assertEquals(0.18181818181818182 , cuts.probability(new int[]  {67, 21, 90, 77, 19, 38, 85, 91, 23, 29, 42}, 71));
		Assert.assertEquals(0.9974489795918368 , cuts.probability(new int[]  {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 34));
		Assert.assertEquals(0.2948717948717949 , cuts.probability(new int[]  {31, 55, 22, 99, 1, 49, 21, 7, 3, 88, 89, 36, 41}, 77));
		Assert.assertEquals(0.5892857142857143 , cuts.probability(new int[]  {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 55));
		Assert.assertEquals(0.9208163265306123 , cuts.probability(new int[]  {99, 97, 95, 93, 91, 89, 87, 85, 83, 81, 79, 77, 75, 73, 71, 69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 51));
		Assert.assertEquals(0.6048979591836735 , cuts.probability(new int[]  {99, 97, 95, 93, 91, 89, 87, 85, 83, 81, 79, 77, 75, 73, 71, 69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98}, 60));
		Assert.assertEquals(0.07307692307692308 , cuts.probability(new int[]  {54, 69, 86, 50, 21, 66, 35, 62, 55, 44, 25, 2, 36, 37, 53, 82, 14, 19, 92, 60, 68, 16, 87, 78, 29, 31, 34, 77, 33, 74, 51, 97, 46, 58, 39, 71, 72, 32, 88, 42}, 74));
		Assert.assertEquals(0.04141414141414142 , cuts.probability(new int[]  {5, 92, 62, 69, 42, 11, 91, 24, 7, 78, 46, 44, 15, 90, 82, 71, 20, 39, 13, 96, 14, 19, 93, 38, 47, 12, 75, 45, 9, 2, 81, 73, 17, 64, 60, 26, 22, 84, 32, 67, 56, 30, 85, 66, 36}, 86));
		Assert.assertEquals(0.5274725274725275 , cuts.probability(new int[]  {8, 92, 80, 13, 95, 86, 4, 76, 85, 94, 41, 91, 57, 47}, 75));
		Assert.assertEquals(0.45588235294117646 , cuts.probability(new int[]  {12, 30, 87, 77, 22, 46, 98, 64, 20, 71, 44, 45, 36, 33, 92, 68, 97}, 61));
		Assert.assertEquals(0.353968253968254 , cuts.probability(new int[]  {74, 5, 72, 20, 29, 91, 80, 14, 30, 39, 46, 12, 95, 15, 93, 82, 79, 42, 25, 1, 84, 37, 7, 19, 9, 50, 35, 54, 44, 65, 68, 6, 28, 66, 99, 21}, 69));
		Assert.assertEquals(0.8451612903225807 , cuts.probability(new int[]  {18, 21, 20, 13, 92, 73, 80, 97, 27, 77, 16, 89, 7, 4, 65, 26, 1, 14, 25, 54, 28, 40, 34, 55, 86, 29, 98, 41, 2, 75, 94}, 50));
		Assert.assertEquals(0.8428030303030303 , cuts.probability(new int[]  {12, 43, 73, 82, 3, 85, 7, 67, 66, 6, 21, 71, 96, 28, 14, 1, 36, 60, 62, 61, 94, 9, 79, 84, 50, 65, 80, 76, 44, 59, 87, 88, 32}, 48));
		Assert.assertEquals(0.028409090909090908 , cuts.probability(new int[]  {51, 5, 19, 50, 55, 4, 33, 95, 57, 32, 13, 75, 21, 16, 42, 44, 14, 94, 96, 1, 53, 30, 88, 63, 25, 64, 83, 59, 20, 34, 99, 29, 54}, 92));
		Assert.assertEquals(0.8769230769230769 , cuts.probability(new int[]  {36, 53, 89, 55, 63, 17, 85, 70, 60, 24, 58, 78, 14, 97, 52, 91, 64, 50, 44, 15, 4, 95, 46, 40, 82, 71, 88, 56, 77, 12, 41, 34, 75, 67, 57, 87, 2, 65, 69, 96}, 44));
		Assert.assertEquals(0.018461538461538463 , cuts.probability(new int[]  {27, 40, 67, 21, 57, 75, 42, 93, 46, 78, 54, 29, 53, 74, 22, 44, 13, 97, 95, 39, 63, 70, 65, 81, 14, 82}, 82));
		Assert.assertEquals(0.9761904761904762 , cuts.probability(new int[]  {33, 96, 73, 72, 50, 76, 49, 41, 22, 39, 34, 6, 30, 65, 14, 40, 7, 43, 27, 99, 8, 78, 87, 36, 32, 15, 45, 23, 77, 20, 56, 35, 53, 31, 54, 66}, 36));
		Assert.assertEquals(0.8508064516129032 , cuts.probability(new int[]  {87, 49, 75, 41, 34, 9, 77, 1, 89, 66, 18, 58, 72, 31, 54, 43, 27, 60, 40, 38, 84, 86, 63, 70, 95, 69, 79, 26, 8, 55, 97, 17}, 43));
		Assert.assertEquals(0.5 , cuts.probability(new int[]  {85, 16, 97, 8, 52}, 71));
		Assert.assertEquals(0.5428571428571428 , cuts.probability(new int[]  {92, 17, 21, 10, 4, 90, 52, 66, 58, 95, 53, 22, 99, 1, 63}, 61));
		Assert.assertEquals(0.0 , cuts.probability(new int[]  {25, 50, 75}, 50));
		Assert.assertEquals(0.6666666666666666 , cuts.probability(new int[]  {30, 60, 90}, 50));
		Assert.assertEquals(0.7222222222222222 , cuts.probability(new int[]  {99, 88, 77, 66, 55, 44, 33, 22, 11}, 50));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {50, 75}, 49));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {1, 2}, 50));
		Assert.assertEquals(0.0 , cuts.probability(new int[]  {99, 1}, 98));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {80, 90, 10, 20}, 50));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {24, 49}, 50));
		Assert.assertEquals(0.6666666666666666 , cuts.probability(new int[]  {20, 60, 70}, 45));
		Assert.assertEquals(0.3333333333333333 , cuts.probability(new int[]  {15, 45, 56}, 50));
		Assert.assertEquals(0.0 , cuts.probability(new int[]  {25, 75}, 70));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {25, 50, 60}, 39));
		Assert.assertEquals(0.5 , cuts.probability(new int[]  {10, 30, 59, 1}, 59));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {25, 75}, 30));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {75, 76}, 74));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {25, 26}, 25));
		Assert.assertEquals(1.0 , cuts.probability(new int[]  {26, 40}, 25));
	}
}
