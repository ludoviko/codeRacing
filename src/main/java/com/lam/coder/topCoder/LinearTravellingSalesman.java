package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for LinearTravellingSalesman
 * 
 *         A traveling salesman is going to sell his wares in Linear Kingdom.
 *         Linear Kingdom has N cities on a coordinate plane. Each city is a
 *         point, and the i-th city is located at coordinates (x[i], y[i]). All
 *         the cities in Linear Kingdom are collinear, meaning that there exists
 *         a straight line which passes through all of them.
 * 
 *         The traveling salesman is going to visit all of these cities. The
 *         distance he needs to travel between two cities located at (X1, Y1)
 *         and (X2, Y2) is equal to the Manhattan Distance between them, which
 *         is defined as |X1 - X2| + |Y1 - Y2|. He may start at any city and end
 *         at any city. Return the minimum total distance he will need to
 *         travel.
 * 
 *         Definition
 * 
 *         Class: LinearTravellingSalesman
 * 
 *         Method: findMinimumDistance
 * 
 *         Parameters: int[], int[]
 * 
 *         Returns: int
 * 
 *         Method signature: public int findMinimumDistance(int[] x, int[] y)
 * 
 * 
 *         Constraints x and y will contain between 2 and 50 elements,
 *         inclusive. x and y will have the same number of elements. Each
 *         element of x and y will be between 0 and 10000, inclusive. No two
 *         cities will have the same location. All cities will be collinear,
 *         meaning that there exists a straight line which passes through all of
 *         them.
 * 
 *         Examples
 * 
 *         0)
 * 
 *         {1,3,5}
 * 
 *         {2,2,2}
 * 
 *         Returns: 4
 * 
 *         One optimal journey is (1,2) -> (3,2) -> (5,2). The Manhattan
 *         Distance between each consecutive pair of cities is 2. The total
 *         distance is 4.
 * 
 *         1) {3,2,1}
 * 
 *         {3,2,1}
 * 
 *         Returns: 4
 * 
 *         One optimal journey is (1,1) -> (2,2) -> (3,3).
 * 
 *         2) {0,100,1000,10000}
 * 
 *         {0,10,100,1000}
 * 
 *         Returns: 11000
 * 
 *         3) {80,60,70,50}
 * 
 *         {50,70,60,80}
 * 
 *         Returns: 60
 * 
 *         4) {7,7,7,7,7,7,7}
 * 
 *         {105,1231,5663,295,3062,380,7777}
 * 
 *         Returns: 7672
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 470 Round 1 - Division
 *         II, Level One
 */

public class LinearTravellingSalesman {
	public int findMinimumDistance(int[] x, int[] y) {
		int x1, x0, y1, y0;

		Arrays.sort(x);
		Arrays.sort(y);

		x0 = x[0];
		x1 = x[x.length - 1];

		y0 = y[0];
		y1 = y[y.length - 1];

		return x1 - x0 + y1 - y0;
	}
}
