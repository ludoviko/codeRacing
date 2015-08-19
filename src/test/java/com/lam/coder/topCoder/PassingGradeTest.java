package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.PassingGrade;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PassingGradeTest extends TestCase {

	private PassingGrade grade;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		grade = new PassingGrade();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		grade = null;
	}

	@Test
	public void testPointsNeeded() {
		Assert.assertEquals(
				181,
				grade.pointsNeeded(new int[] { 55, 77, 82, 60 }, new int[] {
						100, 100, 100, 100 }, 300));

		Assert.assertEquals(
				4,
				grade.pointsNeeded(new int[] { 1, 2, 3, 4 }, new int[] { 2, 3,
						4, 5 }, 7));

		Assert.assertEquals(
				-1,
				grade.pointsNeeded(new int[] { 1, 2, 2, 1 }, new int[] { 9, 9,
						9, 9 }, 9));

		Assert.assertEquals(
				0,
				grade.pointsNeeded(new int[] { 7, 8, 7, 6 }, new int[] { 8, 8,
						8, 8 }, 9));

		Assert.assertEquals(
				129,
				grade.pointsNeeded(new int[] { 17, 23, 50, 200, 19, 56, 83, 91,
						77, 9, 0 }, new int[] { 20, 30, 50, 250, 20, 70, 100,
						100, 100, 10, 10 }, 400));

		Assert.assertEquals(
				2886,
				grade.pointsNeeded(new int[] { 600, 600, 600, 600, 600, 600,
						600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600,
						600, 600, 600 }, new int[] { 1000, 1000, 1000, 1000,
						1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000,
						1000, 1000, 1000, 1000, 1000, 1000, 901 }, 3000));
	}
	
	@Test
	public void testPointsNeededSystemTest() {
		Assert.assertEquals(181, grade.pointsNeeded(new int[]  {55, 77, 82, 60}, new int[]  {100, 100, 100, 100}, 300));
		Assert.assertEquals(4, grade.pointsNeeded(new int[] {1, 2, 3, 4}, new int[]  {2, 3, 4, 5}, 7));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {1, 2, 2, 1}, new int[]  {9, 9, 9, 9}, 9));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {7, 8, 7, 6}, new int[]  {8, 8, 8, 8}, 9));
		Assert.assertEquals(129, grade.pointsNeeded(new int[] {17, 23, 50, 200, 19, 56, 83, 91, 77, 9, 0}, new int[]  {20, 30, 50, 250, 20, 70, 100, 100, 100, 10, 10}, 400));
		Assert.assertEquals(1955, grade.pointsNeeded(new int[] {0, 0, 0, 0, 0, 0, 0}, new int[]  {1, 1, 1, 1, 1, 1, 1}, 3000));
		Assert.assertEquals(550, grade.pointsNeeded(new int[] {1000, 1000, 1000, 1000}, new int[]  {1000, 1000, 1000, 1000}, 3000));
		Assert.assertEquals(930, grade.pointsNeeded(new int[] {495}, new int[]  {513}, 1678));
		Assert.assertEquals(846, grade.pointsNeeded(new int[] {239, 656}, new int[]  {356, 704}, 1618));
		Assert.assertEquals(1785, grade.pointsNeeded(new int[] {156, 82, 91}, new int[]  {407, 929, 98}, 1817));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {299, 519, 253, 56}, new int[]  {536, 596, 306, 437}, 69));
		Assert.assertEquals(447, grade.pointsNeeded(new int[] {842, 144, 400, 277, 620}, new int[]  {868, 201, 889, 282, 740}, 1220));
		Assert.assertEquals(676, grade.pointsNeeded(new int[] {911, 2, 571, 749, 687, 48}, new int[]  {913, 376, 914, 998, 702, 710}, 992));
		Assert.assertEquals(1497, grade.pointsNeeded(new int[] {108, 282, 539, 359, 542, 637, 716}, new int[]  {621, 605, 696, 464, 883, 708, 927}, 2296));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {27, 51, 74, 14, 62, 318, 284, 64}, new int[]  {36, 425, 815, 167, 985, 496, 371, 80}, 2458));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {12, 221, 49, 620, 494, 256, 525, 547, 718}, new int[]  {611, 297, 208, 981, 787, 379, 622, 749, 910}, 372));
		Assert.assertEquals(1369, grade.pointsNeeded(new int[] {2, 692, 83, 231, 922, 237, 574, 84, 72, 701}, new int[]  {4, 877, 114, 251, 938, 279, 760, 667, 541, 781}, 2429));
		Assert.assertEquals(976, grade.pointsNeeded(new int[] {131, 372, 541, 343, 178, 957, 208, 19, 384, 666, 437}, new int[]  {167, 574, 622, 454, 530, 965, 284, 214, 519, 789, 527}, 2373));
		Assert.assertEquals(2063, grade.pointsNeeded(new int[] {382, 710, 805, 615, 377, 255, 256, 30, 70, 316, 372, 173}, new int[]  {999, 947, 839, 689, 491, 758, 652, 156, 123, 731, 455, 526}, 2517));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {366, 176, 95, 403, 9, 9, 21, 701, 388, 29, 422, 473, 444}, new int[]  {976, 276, 296, 516, 33, 30, 596, 786, 716, 30, 620, 784, 793}, 670));
		Assert.assertEquals(1518, grade.pointsNeeded(new int[] {408, 800, 5, 306, 2, 703, 311, 163, 760, 742, 640, 574, 301, 565}, new int[]  {949, 936, 7, 404, 191, 899, 964, 393, 914, 805, 706, 619, 529, 734}, 2946));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {26, 530, 60, 18, 547, 53, 529, 671, 90, 140, 208, 19, 329, 242, 233}, new int[]  {87, 648, 609, 65, 554, 150, 736, 837, 368, 147, 223, 438, 475, 893, 349}, 513));
		Assert.assertEquals(1390, grade.pointsNeeded(new int[] {82, 148, 470, 33, 453, 305, 526, 812, 203, 306, 399, 319, 16, 525, 18, 683}, new int[]  {94, 498, 537, 639, 682, 880, 658, 908, 295, 321, 416, 739, 40, 754, 19, 744}, 2064));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {316, 606, 224, 16, 172, 10, 309, 36, 734, 182, 24, 326, 228, 28, 540, 323, 217}, new int[]  {486, 909, 228, 71, 280, 615, 582, 39, 988, 271, 590, 539, 294, 654, 624, 479, 315}, 64));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {619, 85, 356, 482, 359, 210, 426, 804, 789, 87, 163, 21, 447, 236, 755, 230, 350, 626}, new int[]  {863, 100, 368, 506, 701, 233, 559, 925, 832, 155, 165, 42, 721, 285, 976, 363, 941, 789}, 1175));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {412, 138, 146, 128, 494, 57, 189, 890, 383, 471, 77, 5, 278, 39, 251, 324, 33, 193, 355}, new int[]  {619, 168, 217, 325, 632, 531, 300, 925, 402, 792, 326, 337, 543, 60, 818, 399, 383, 222, 384}, 1090));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {1, 649, 369, 878, 480, 870, 12, 590, 296, 553, 286, 800, 472, 302, 793, 104, 558, 967, 38, 572}, new int[]  {10, 993, 476, 966, 794, 984, 35, 598, 531, 573, 306, 867, 500, 410, 840, 294, 654, 987, 413, 947}, 130));
		Assert.assertEquals(2428, grade.pointsNeeded(new int[] {146, 82, 43, 916, 151, 486, 541, 68, 119, 244, 109, 22, 372, 171, 348, 811, 216, 491, 95, 326}, new int[]  {176, 91, 389, 988, 430, 614, 541, 708, 190, 285, 630, 881, 565, 264, 537, 820, 287, 692, 124, 410}, 2969));
		Assert.assertEquals(701, grade.pointsNeeded(new int[] {353, 88, 5, 493, 324, 14, 123, 133, 274, 44, 587, 275, 760, 605, 153, 451, 18, 938, 335, 133}, new int[]  {421, 88, 9, 581, 407, 46, 123, 403, 319, 105, 696, 434, 871, 785, 225, 586, 107, 948, 556, 775}, 1986));
		Assert.assertEquals(1812, grade.pointsNeeded(new int[] {134, 328, 33, 211, 149, 767, 394, 445, 335, 527, 216, 570, 421, 214, 124, 140, 146, 785, 229, 478}, new int[]  {569, 403, 134, 410, 224, 912, 632, 561, 455, 683, 278, 725, 478, 358, 197, 551, 178, 914, 698, 657}, 2995));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {78, 138, 317, 64, 130, 73, 435, 129, 362, 82, 11, 180, 373, 228, 112, 744, 187, 20, 744, 685}, new int[]  {123, 766, 425, 106, 518, 121, 704, 161, 404, 115, 99, 878, 592, 592, 172, 778, 540, 30, 866, 897}, 486));
		Assert.assertEquals(726, grade.pointsNeeded(new int[] {188, 12, 158, 502, 621, 793, 12, 28, 201, 95, 887, 556, 545, 55, 439, 462, 224, 372, 239, 1}, new int[]  {769, 236, 237, 792, 987, 991, 42, 39, 411, 205, 963, 867, 560, 61, 500, 628, 656, 494, 565, 17}, 927));
		Assert.assertEquals(1405, grade.pointsNeeded(new int[] {138, 226, 370, 70, 401, 345, 238, 752, 681, 633, 633, 104, 76, 300, 314, 25, 64, 240, 78, 393}, new int[]  {260, 317, 572, 225, 587, 366, 248, 808, 838, 895, 892, 357, 77, 368, 495, 163, 165, 368, 411, 431}, 2673));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {407, 8, 61, 89, 351, 76, 399, 139, 79, 83, 57, 343, 231, 522, 706, 19, 361, 0, 575, 266}, new int[]  {607, 157, 64, 794, 575, 85, 717, 140, 480, 122, 251, 557, 344, 675, 939, 718, 629, 111, 719, 285}, 691));
		Assert.assertEquals(296, grade.pointsNeeded(new int[] {564, 213, 659, 95, 196, 67, 54, 65, 513, 125, 463, 503, 535, 73, 195, 520, 37, 403, 548, 2}, new int[]  {864, 450, 806, 384, 283, 179, 100, 509, 726, 138, 604, 520, 758, 121, 299, 525, 172, 853, 722, 4}, 407));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {521, 46, 514, 474, 327, 399, 7, 216, 6, 106, 558, 12, 415, 599, 546, 473, 117, 209, 74, 487}, new int[]  {932, 319, 732, 912, 413, 422, 62, 335, 16, 296, 673, 19, 585, 642, 814, 772, 697, 229, 292, 558}, 512));
		Assert.assertEquals(906, grade.pointsNeeded(new int[] {147, 56, 535, 30, 128, 98, 605, 12, 509, 743, 229, 677, 679, 331, 337, 182, 310, 38, 321, 103}, new int[]  {182, 90, 899, 124, 167, 101, 859, 19, 544, 829, 243, 848, 768, 368, 454, 205, 375, 371, 382, 635}, 2269));
		Assert.assertEquals(1949, grade.pointsNeeded(new int[] {650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650}, new int[]  {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 998}, 3000));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {650}, new int[]  {700}, 300));
		Assert.assertEquals(1946, grade.pointsNeeded(new int[] {650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650, 650}, new int[]  {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 993}, 3000));
		Assert.assertEquals(2950, grade.pointsNeeded(new int[] {600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600}, new int[]  {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000}, 2999));
		Assert.assertEquals(2886, grade.pointsNeeded(new int[] {600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600}, new int[]  {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 901}, 3000));
		Assert.assertEquals(101, grade.pointsNeeded(new int[] {200, 350}, new int[]  {200, 700}, 101));
		Assert.assertEquals(-1, grade.pointsNeeded(new int[] {1, 2, 2, 1}, new int[]  {9, 9, 9, 9}, 9));
		Assert.assertEquals(4, grade.pointsNeeded(new int[] {0}, new int[]  {1}, 4));
		Assert.assertEquals(1950, grade.pointsNeeded(new int[] {1}, new int[]  {1}, 3000));
		Assert.assertEquals(250, grade.pointsNeeded(new int[] {400}, new int[]  {700}, 300));
		Assert.assertEquals(2, grade.pointsNeeded(new int[] {6}, new int[]  {9}, 2));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {99, 99}, new int[]  {100, 100}, 100));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {100, 100, 100, 100}, new int[]  {100, 100, 100, 100}, 100));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {100}, new int[]  {100}, 10));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {7, 8, 7, 6}, new int[]  {8, 8, 8, 8}, 9));
		Assert.assertEquals(4, grade.pointsNeeded(new int[] {1, 2, 3, 4}, new int[]  {2, 3, 4, 5}, 7));
		Assert.assertEquals(0, grade.pointsNeeded(new int[] {100}, new int[]  {100}, 1));
		Assert.assertEquals(2, grade.pointsNeeded(new int[] {10, 5}, new int[]  {12, 7}, 6));
		Assert.assertEquals(3, grade.pointsNeeded(new int[] {2}, new int[]  {3}, 4));
		Assert.assertEquals(200, grade.pointsNeeded(new int[] {452}, new int[]  {700}, 302));
		Assert.assertEquals(65, grade.pointsNeeded(new int[] {0}, new int[]  {35}, 65));
		Assert.assertEquals(19, grade.pointsNeeded(new int[] {50}, new int[]  {50}, 55));
		Assert.assertEquals(2886, grade.pointsNeeded(new int[] {600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600}, new int[]  {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 901}, 3000));
		Assert.assertEquals(5, grade.pointsNeeded(new int[] {1, 2, 3, 4}, new int[]  {2, 3, 4, 5}, 8));
		Assert.assertEquals(7, grade.pointsNeeded(new int[] {4}, new int[]  {6}, 10));
	}
}
