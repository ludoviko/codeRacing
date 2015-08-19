package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         My shoelace broke the other day. I was too lazy to take it out and
 *         figure out how long it was, so I decided to calculate the length
 *         based on the number of eyelets and their separation.
 * 
 *         The "horizontal" distance between the eyelets can increase or
 *         decrease from the bottom to the top of the shoe. The startWidth is
 *         how far apart they are at the bottom (near the toes) and the endWidth
 *         is how far apart they are at the top (near the tongue of the shoe).
 *         This distance increases (or decreases) linearly from bottom to top.
 *         Furthermore, the "vertical" distance, spread, between eyelets is
 *         constant.
 * 
 *         Write a method, calculate, which calculates the length of the entire
 *         shoelace, given the initial distance between the eyelets
 *         (startWidth), the final distance between the eyelets (endWidth),
 *         distance between each pair of vertically adjacent eyelets (spread)
 *         and the number of pairs of eyelets (numPairs).
 * 
 *         You should assume all laces follow this general pattern:
 * 
 *         |----| <- startWidth
 * 
 *         O----O - \ / | \/ | <- spread /\ | / \ | O O - \ / \/ /\ / \ / \ O O
 * 
 *         |----| <- endWidth
 * 
 *         In this illustration, startWidth and endWidth are identical, and
 *         numPairs is 3.
 * 
 *         Definition
 * 
 *         Class: ShoelaceLength Method: calculate Parameters: int, int, int,
 *         int Returns: double Method signature: double calculate(int
 *         startWidth, int endWidth, int spread, int numPairs) (be sure your
 *         method is public)
 * 
 * 
 *         Notes - startWidth may be greater than, equal to, or less than
 *         endWidth. - Your return value must have a relative or absolute error
 *         less than 1e-9. - The units of measurement are irrelevant. - The
 *         length of lace that it takes to go around or through each eyelet
 *         should be ignored. - The length of lace needed to actually tie a knot
 *         is not included.
 * 
 *         Constraints - numPairs is the number of PAIRS of eyelets, and will be
 *         between 2 and 50, inclusive. - startWidth, endWidth, and spread will
 *         each be between 1 and 99, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         2
 * 
 *         2
 * 
 *         1
 * 
 *         2
 * 
 *         Returns: 6.47213595499958
 * 
 *         These are my topsiders. Remember to add the start width across the
 *         bottom pair of eyelets. 1)
 * 
 * 
 *         10
 * 
 *         1
 * 
 *         1
 * 
 *         10
 * 
 *         Returns: 111.1786186482248
 * 
 *         2)
 * 
 * 
 *         1
 * 
 *         10
 * 
 *         1
 * 
 *         10
 * 
 *         Returns: 102.17861864822481
 * 
 *         Nearly the same configuration as the previous case, except the width
 *         goes from 1 to 10 instead of 10 to 1. 3)
 * 
 * 
 *         1
 * 
 *         1
 * 
 *         1
 * 
 *         2
 * 
 *         Returns: 3.8284271247461903
 * 
 *         4)
 * 
 * 
 *         1
 * 
 *         99
 * 
 *         19
 * 
 *         2
 * 
 *         Returns: 107.97663296253066
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.

 *         This problem was used for: 
 *         Single Round Match 213 Round 1 - Division II, Level Two
 *         
 */

public class ShoelaceLength {
	public double calculate(int startWidth, int endWidth, int spread,
			int numPairs) {
		double summa = startWidth;
		double wNext = startWidth;
		double base;

		double step = findStep(startWidth, endWidth, numPairs);

		for (int i = 1; i < numPairs; i++) {
			base = step / 2 + wNext;
			summa += 2 * Math.sqrt((base * base + spread * spread));
			wNext += step;
		}

		return summa;
	}

	private double findStep(int startWidth, int endWidth, int numPairs) {
		return (endWidth - startWidth) / (numPairs - 1.0);
	}
}
