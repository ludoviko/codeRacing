package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ManySquares;

public class ManySquaresTest {
	ManySquares squares;
	
	@Before
	public void setUp() throws Exception {
		squares = new ManySquares();
	}

	@After
	public void tearDown() throws Exception {
		squares = null;
	}

	@Test
	public void testHowManySquares() {
		Assert.assertEquals(1, squares.howManySquares(new int[] {1,1,2,2,1,1,2} ));
		Assert.assertEquals(1, squares.howManySquares(new int[] {3, 1, 4, 4, 4, 10, 10, 10, 10} ));
		Assert.assertEquals(3, squares.howManySquares(new int[] {1,2,3,4,1,2,3,4,1,2,3,1,2,3,4,1,2,3,3,3} ));
		Assert.assertEquals(0, squares.howManySquares(new int[] {1,1,1,2,2,2,3,3,3,4,4,4} ));
		Assert.assertEquals(2, squares.howManySquares(new int[] {1,1,1,2,1,1,1,3,1,1,1} ));
		Assert.assertEquals(0, squares.howManySquares(new int[] {2,2,4,4,8,8} ));
	}

	@Test
	public void testHowManySquaresSystemTest() {
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1, 1, 2, 2, 1, 1, 2}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {3, 1, 4, 4, 4, 10, 10, 10, 10}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 3, 3}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {43}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {379}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {71}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {181}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {371}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {715}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {404, 404}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {942, 942}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {166, 363}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {999, 746}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {16, 677}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {902, 618}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {703, 703, 703}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {441, 67, 67}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {766, 421, 586}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {421, 859, 62}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {12, 12, 468}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {641, 511, 575}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {191, 191, 191, 191}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {539, 800, 539, 539}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {138, 603, 603, 652}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {790, 417, 417, 946}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {521, 460, 283, 509}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {511, 746, 941, 511}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {380, 472, 472, 380, 380, 380, 472, 472, 380, 472, 380, 472, 472, 380, 380, 380, 472, 472, 380, 380, 380, 472, 472}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {819, 93, 819, 819, 819, 819, 149, 93, 93, 93, 93, 819, 93, 93, 93, 149, 819, 819, 93, 819, 149, 93, 149}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {525, 887, 671, 64, 671, 64, 671, 525, 525, 389, 64, 525, 525, 671, 64, 887, 525, 64, 389, 389, 64, 671, 64}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {435, 304, 258, 435, 203, 304, 510, 382, 235, 258, 203, 235, 304, 203, 398, 203, 273, 258, 382, 203, 304, 510, 510}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {259, 403, 459, 403, 813, 67, 717, 98, 459, 63, 446, 847, 540, 945, 219, 966, 477, 758, 935, 546, 485, 403, 555}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105}));
		Assert.assertEquals(4 , squares.howManySquares(new int[] {11, 11, 11, 625, 625, 11, 625, 625, 625, 11, 11, 625, 11, 11, 625, 625, 625, 625, 11, 11}));
		Assert.assertEquals(4 , squares.howManySquares(new int[] {791, 315, 315, 791, 166, 166, 166, 315, 166, 791, 166, 791, 166, 315, 315, 791, 166, 791, 791, 791}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {315, 568, 315, 789, 568, 55, 315, 789, 315, 315, 55, 55, 789, 315, 568, 55, 789, 55, 476, 476}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {30, 475, 475, 147, 477, 475, 475, 857, 857, 385, 858, 475, 882, 858, 882, 911, 911, 857, 385, 626}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {275, 629, 837, 381, 205, 946, 347, 593, 903, 586, 865, 860, 388, 501, 197, 878, 245, 837, 593, 929}));
		Assert.assertEquals(7 , squares.howManySquares(new int[] {798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798}));
		Assert.assertEquals(7 , squares.howManySquares(new int[] {894, 219, 894, 894, 219, 894, 219, 894, 219, 894, 219, 219, 219, 219, 219, 219, 219, 894, 894, 894, 894, 219, 219, 219, 894, 219, 894, 894, 894, 219, 219}));
		Assert.assertEquals(7 , squares.howManySquares(new int[] {890, 416, 890, 416, 890, 273, 416, 890, 273, 273, 416, 273, 416, 416, 416, 273, 890, 890, 273, 890, 416, 890, 890, 890, 890, 890, 416, 416, 273, 416, 273}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {719, 369, 369, 719, 719, 280, 280, 280, 958, 369, 369, 719, 958, 719, 369, 958, 719, 958, 958, 369, 844, 719, 958, 280, 280, 844, 844, 369, 369, 958, 369}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {117, 11, 11, 411, 117, 655, 246, 246, 117, 517, 118, 118, 794, 117, 655, 411, 411, 594, 118, 232, 655, 517, 594, 232, 117, 594, 246, 411, 411, 517, 117}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {886, 805, 153, 300, 361, 361, 660, 32, 760, 818, 805, 77, 624, 859, 869, 756, 104, 624, 408, 869, 36, 839, 37, 818, 1, 543, 869, 820, 297, 280, 222}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {964, 964, 964, 964, 964, 964, 964, 964, 964}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {545, 72, 545, 545, 72, 545, 72, 72, 545}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {981, 478, 478, 478, 478, 89, 478, 478, 478}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {121, 991, 675, 276, 121, 276, 39, 276, 39}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {487, 229, 853, 853, 853, 900, 853, 553, 358}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {918, 965, 757, 684, 489, 442, 979, 194, 311}));
		Assert.assertEquals(9 , squares.howManySquares(new int[] {805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805}));
		Assert.assertEquals(8 , squares.howManySquares(new int[] {853, 853, 604, 853, 604, 604, 853, 853, 853, 604, 604, 604, 853, 604, 853, 853, 853, 604, 604, 853, 853, 604, 604, 604, 604, 853, 604, 853, 853, 853, 604, 604, 604, 853, 604, 604, 853}));
		Assert.assertEquals(8 , squares.howManySquares(new int[] {636, 636, 636, 636, 710, 710, 710, 710, 533, 636, 636, 710, 533, 710, 636, 533, 710, 710, 710, 710, 710, 636, 710, 533, 533, 533, 533, 533, 533, 636, 533, 710, 636, 636, 636, 636, 533}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {48, 908, 48, 253, 30, 48, 908, 24, 253, 253, 24, 30, 908, 253, 908, 253, 24, 30, 24, 908, 253, 908, 253, 253, 48, 253, 908, 24, 48, 24, 253, 24, 24, 48, 24, 24, 48}));
		Assert.assertEquals(7 , squares.howManySquares(new int[] {738, 76, 146, 628, 205, 76, 333, 282, 646, 738, 646, 282, 205, 998, 76, 628, 333, 998, 205, 998, 205, 205, 282, 628, 333, 738, 76, 738, 205, 282, 76, 333, 76, 998, 628, 282, 282}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {351, 21, 351, 144, 35, 594, 601, 601, 554, 90, 411, 171, 785, 496, 270, 70, 433, 578, 94, 167, 220, 90, 295, 837, 327, 220, 656, 90, 819, 336, 493, 351, 501, 282, 969, 969, 282}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {75, 75, 75, 75, 327, 75, 327, 327, 327, 75, 327, 75, 75, 327, 327, 75, 75, 75, 75, 327, 75, 327, 75, 75, 75, 327, 327, 327, 75, 75, 75, 75, 75, 327, 327, 75, 75, 75, 327, 327, 75, 75, 327, 75, 327, 75, 327, 327}));
		Assert.assertEquals(10 , squares.howManySquares(new int[] {752, 180, 180, 642, 642, 642, 180, 180, 752, 180, 642, 752, 642, 642, 180, 752, 180, 642, 752, 180, 180, 180, 642, 752, 642, 752, 642, 642, 642, 752, 752, 180, 752, 642, 180, 642, 180, 752, 642, 642, 180, 642, 180, 180, 642, 180, 642, 180}));
		Assert.assertEquals(11 , squares.howManySquares(new int[] {750, 750, 587, 587, 750, 488, 344, 750, 587, 344, 488, 587, 970, 344, 750, 970, 488, 344, 488, 750, 970, 750, 587, 970, 750, 587, 587, 750, 344, 970, 750, 750, 750, 750, 970, 488, 587, 344, 488, 344, 970, 587, 587, 587, 970, 750, 587, 344}));
		Assert.assertEquals(8 , squares.howManySquares(new int[] {196, 196, 54, 54, 196, 141, 209, 209, 876, 54, 71, 54, 209, 509, 422, 498, 876, 509, 509, 71, 54, 54, 141, 141, 71, 509, 498, 141, 196, 509, 71, 71, 209, 422, 196, 141, 71, 422, 209, 422, 802, 498, 209, 54, 71, 141, 54, 509}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {347, 690, 109, 145, 885, 145, 555, 305, 680, 318, 636, 476, 877, 395, 850, 332, 442, 775, 305, 815, 775, 304, 350, 422, 141, 772, 891, 212, 772, 885, 377, 395, 901, 625, 885, 413, 52, 443, 413, 726, 901, 106, 690, 443, 332, 20, 106, 275}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {60, 60, 934, 60, 60, 60, 934, 934, 934, 934, 60, 60, 934, 60, 60, 934, 934, 60, 934, 60, 60, 60, 934, 60, 60, 60, 934}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {18, 284, 384, 384, 18, 384, 384, 18, 18, 284, 384, 384, 384, 18, 18, 384, 384, 284, 18, 18, 284, 18, 18, 18, 18, 18, 284}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {851, 658, 344, 851, 209, 115, 209, 209, 851, 851, 115, 344, 115, 344, 115, 658, 851, 344, 115, 115, 851, 658, 658, 209, 115, 851, 851}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {248, 796, 280, 956, 280, 782, 782, 280, 466, 280, 796, 496, 796, 66, 248, 782, 796, 782, 248, 248, 782, 796, 782, 956, 782, 248, 782}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {498, 962, 742, 624, 76, 114, 897, 827, 450, 839, 153, 23, 543, 237, 375, 914, 241, 852, 217, 784, 343, 36, 871, 481, 406, 646, 156}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {499, 499, 499, 447, 499, 499, 447, 447, 499, 447, 447, 499, 499, 499, 499, 447, 447, 447, 499, 499, 499, 447, 447, 447, 447, 447, 447, 447, 447, 499, 499, 447, 447, 499, 447, 499, 499, 499, 499, 447, 499, 447, 499, 499, 447, 447, 447, 447, 447, 499}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {472, 758, 758, 472, 875, 875, 472, 875, 472, 758, 758, 875, 875, 472, 472, 758, 472, 758, 758, 472, 758, 758, 472, 472, 875, 472, 472, 758, 472, 758, 758, 875, 758, 758, 875, 875, 472, 875, 758, 875, 758, 875, 758, 875, 875, 875, 472, 472, 875, 758}));
		Assert.assertEquals(10 , squares.howManySquares(new int[] {352, 237, 402, 757, 352, 757, 402, 237, 237, 237, 14, 757, 352, 402, 14, 757, 402, 14, 14, 237, 757, 402, 237, 237, 757, 352, 352, 402, 402, 402, 237, 352, 402, 352, 237, 757, 237, 757, 352, 402, 14, 237, 757, 237, 352, 14, 237, 237, 237, 402}));
		Assert.assertEquals(9 , squares.howManySquares(new int[] {80, 435, 743, 435, 100, 683, 683, 683, 771, 406, 572, 771, 743, 821, 821, 743, 406, 406, 100, 743, 80, 821, 435, 100, 572, 406, 572, 771, 572, 771, 771, 406, 821, 406, 382, 572, 771, 100, 771, 80, 80, 821, 80, 743, 683, 743, 572, 771, 382, 572}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {427, 952, 747, 881, 396, 695, 468, 553, 520, 582, 902, 338, 66, 83, 870, 406, 62, 902, 642, 613, 640, 72, 468, 452, 902, 396, 642, 695, 395, 154, 870, 154, 870, 478, 478, 553, 981, 427, 840, 964, 330, 406, 553, 72, 981, 986, 395, 636, 395, 997}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {334, 334, 334, 334, 334}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {529, 802, 802, 529, 802}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {192, 296, 896, 896, 296}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {216, 84, 576, 84, 84}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {915, 45, 417, 896, 767}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {880, 335, 630, 625, 408}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {782, 782, 184, 184, 782, 184, 782, 184, 782, 782, 184, 184, 782, 184, 782, 782, 782, 782, 184, 782, 782, 782, 184, 184}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {498, 266, 705, 498, 705, 705, 266, 705, 266, 266, 705, 705, 705, 266, 705, 705, 498, 266, 498, 266, 705, 705, 705, 705}));
		Assert.assertEquals(5 , squares.howManySquares(new int[] {492, 24, 162, 865, 492, 162, 924, 924, 24, 162, 492, 492, 162, 492, 924, 162, 24, 162, 24, 162, 492, 162, 162, 924}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {30, 30, 658, 821, 71, 73, 511, 71, 73, 195, 30, 658, 73, 27, 511, 796, 71, 511, 30, 30, 821, 821, 912, 73}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {493, 37, 225, 225, 86, 183, 834, 579, 653, 493, 66, 994, 998, 878, 926, 654, 601, 834, 579, 926, 335, 139, 998, 926}));
		Assert.assertEquals(8 , squares.howManySquares(new int[] {410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410}));
		Assert.assertEquals(8 , squares.howManySquares(new int[] {561, 273, 273, 561, 561, 561, 273, 561, 273, 273, 561, 561, 561, 561, 273, 273, 273, 273, 561, 561, 273, 273, 561, 561, 273, 273, 561, 273, 273, 561, 561, 273, 561, 561}));
		Assert.assertEquals(8 , squares.howManySquares(new int[] {311, 311, 311, 324, 311, 324, 346, 346, 324, 311, 346, 346, 311, 324, 346, 346, 324, 324, 311, 311, 311, 346, 311, 311, 346, 311, 324, 346, 311, 311, 311, 311, 324, 311}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {609, 611, 957, 957, 611, 485, 957, 957, 485, 957, 485, 611, 609, 611, 957, 957, 957, 611, 957, 611, 180, 180, 957, 485, 180, 180, 485, 485, 180, 611, 611, 957, 180, 611}));
		Assert.assertEquals(6 , squares.howManySquares(new int[] {506, 57, 50, 50, 50, 50, 57, 506, 39, 607, 887, 871, 39, 271, 506, 871, 39, 607, 891, 871, 57, 50, 607, 871, 607, 57, 607, 50, 50, 39, 39, 50, 607, 891}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {819, 296, 950, 243, 568, 243, 220, 384, 370, 909, 90, 442, 220, 375, 90, 375, 403, 909, 442, 243, 431, 98, 900, 296, 576, 220, 764, 429, 3, 747, 927, 155, 851, 40}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {508, 508, 508, 508, 508, 508}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {292, 751, 292, 292, 292, 751}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {592, 592, 732, 732, 886, 886}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {662, 662, 911, 503, 833, 833}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {182, 922, 164, 182, 231, 164}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {133, 322, 225, 906, 760, 937}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {648, 648, 648, 648, 648, 648, 648, 648, 648, 648, 648}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {647, 647, 33, 647, 647, 647, 33, 33, 33, 33, 647}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {623, 623, 623, 623, 623, 321, 321, 819, 623, 623, 623}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {858, 897, 283, 806, 241, 241, 806, 806, 283, 283, 806}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {767, 675, 219, 144, 79, 144, 697, 631, 144, 388, 328}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {589, 663, 42, 865, 745, 961, 628, 864, 357, 318, 42}));
		Assert.assertEquals(4 , squares.howManySquares(new int[] {58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58}));
		Assert.assertEquals(4 , squares.howManySquares(new int[] {75, 75, 477, 75, 75, 75, 75, 75, 477, 477, 477, 477, 477, 477, 477, 477, 75}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {748, 748, 748, 474, 1000, 748, 1000, 474, 748, 748, 748, 474, 474, 474, 474, 748, 1000}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {414, 941, 414, 414, 292, 627, 292, 627, 627, 414, 627, 941, 708, 414, 292, 414, 292}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {689, 953, 953, 461, 135, 897, 135, 580, 624, 461, 240, 689, 953, 135, 897, 689, 231}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {245, 620, 529, 641, 177, 26, 115, 987, 523, 402, 925, 159, 302, 620, 84, 987, 838}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {321, 375, 375, 321, 321, 375, 321, 321, 321, 321, 375, 321, 375, 321}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {959, 959, 174, 959, 959, 174, 174, 174, 174, 959, 959, 959, 959, 174}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {985, 490, 775, 490, 985, 985, 490, 985, 490, 985, 269, 394, 775, 394}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {625, 625, 472, 472, 455, 98, 748, 988, 840, 840, 98, 472, 98, 12}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {797, 569, 577, 183, 942, 893, 301, 577, 984, 364, 561, 382, 273, 830}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {2, 2, 4, 4, 8, 8}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {3, 1, 4, 4, 4, 10, 10, 10, 10}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {88, 1, 2, 9, 4, 10, 10, 10, 10}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 1, 1, 1, 1}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {4, 4, 4, 4}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {2, 2, 4, 4, 8, 8}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {7, 1, 1, 1, 1}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {10}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 1000}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1000, 2, 2, 1000, 1000, 2}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {900, 900, 900, 900, 1, 2, 3}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {1000, 1000}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1, 1, 1, 1, 2, 2, 2, 2}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {900, 900, 900, 900}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {500, 500, 500, 500}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1, 1, 2, 2, 1, 1, 2}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 999, 1, 2}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {2, 2, 1, 1, 1, 1, 2, 2}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {400, 400, 400, 400}));
		Assert.assertEquals(0 , squares.howManySquares(new int[] {1, 1000, 1000, 1000}));
		Assert.assertEquals(3 , squares.howManySquares(new int[] {1, 1, 1, 1, 3, 3, 3, 3, 5, 5, 5, 5}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 999, 122, 122, 122, 122}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 1000, 1000, 1000}));
		Assert.assertEquals(2 , squares.howManySquares(new int[] {1, 1, 2, 2, 1, 1, 2, 2}));
		Assert.assertEquals(4 , squares.howManySquares(new int[] {10, 10, 19, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 19, 19, 19, 19, 19, 19}));
		Assert.assertEquals(12 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1000, 1000, 1000, 1000, 999, 999, 999}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {1, 1, 1, 1, 1}));
		Assert.assertEquals(1 , squares.howManySquares(new int[] {4, 4, 4, 4, 4, 4, 4}));
		Assert.assertEquals(1, squares.howManySquares(new int[] {100, 100, 100, 100}));
	}
}
