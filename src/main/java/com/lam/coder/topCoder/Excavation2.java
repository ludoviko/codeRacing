package com.lam.coder.topCoder;

/**
 * 
 * 
 * @author Ludoviko Azuaje
 * 
 *        TopCoder Single Round Match 584 is scheduled for Wednesday, July 10, 2013 at 07:00 UTC -4 hours. 
 * 
 *         Problem Statement      Once upon a time, there was a civilization
 *         called Ruritania. It had n building sites numbered from 0 to n-1.
 *         There were various types of buildings such as libraries, markets, and
 *         palaces. Each building type was assigned an integer from 1 to 50. The
 *         building at site i (0-based index) was of type kind[i]. With the
 *         passing of millennia, Ruritania declined and its building sites were
 *         covered in sand, concealing all the buildings. Recently, an intrepid
 *         archeologist excavated K building sites. You are given int[]s kind
 *         and found as well as the int K. The types of buildings discovered by
 *         the excavation are described by the int[] found, which contains at
 *         most one value for each building type even if several buildings of a
 *         type were excavated. Return the number of K-tuples of sites that
 *         could have been excavated to arrive at the given values. The answer
 *         is guaranteed to be at least one. Definition      Class: Excavations2
 *         Method: count Parameters: int[], int[], int Returns: long Method
 *         signature: long count(int[] kind, int[] found, int K) (be sure your
 *         method is public)     
 * 
 *         Constraints - kind will contain N elements, where N is between 1 and
 *         50, inclusive. - Each element of kind will be between 1 and 50,
 *         inclusive. - found will contain between 1 and 50 elements, inclusive.
 *         - Each element of found will occur in kind at least once. - The
 *         elements of found will be distinct. - K will be between the number of
 *         elements in found and N, inclusive. - There will exist at least one
 *         K-tuple of sites consistent with the given information. Examples 0)
 * 
 *              {1, 2, 2, 1} {1} 2 Returns: 1 There are four building sites. Two
 *         contain a building of type 1 and two contain a building of type 2.
 *         The archeologist excavated two sites and only found buildings of type
 *         1. The only possible scenario is that the archeologist excavated
 *         sites 0 and 3. 1)
 * 
 *              {1, 2, 2, 1} {1, 2} 2 Returns: 4 The building sites are the same
 *         as before, but in this case buildings of type 1 and type 2 have been
 *         discovered. The archeologist must have excavated one of four possible
 *         pairs of sites: (0, 1), (0, 2), (1, 3), or (2, 3). 2)
 * 
 *              {1, 2, 1, 1, 2, 3, 4, 3, 2, 2} {4, 2} 3 Returns: 6 The
 *         archeologist excavated one of six possible triples of building sites:
 *         (1, 4, 6) (1, 6, 8) (1, 6, 9) (4, 6, 8) (4, 6, 9) (6, 8, 9) 3)
 * 
 *              {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50,
 *         50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50,
 *         50, 50, 50} {50} 21 Returns: 5567902560
 * 
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *         Score: /1000.
 * 
 * 
 */

public class Excavation2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
