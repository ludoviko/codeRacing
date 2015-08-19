package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         DNA testing is one of the most popular methods of establishing
 *         paternity. In such a test, you compare samples of DNA from the man,
 *         the child, and the child's mother. For the purposes of this problem,
 *         assume that each sample is represented as a String of uppercase
 *         letters ('A'-'Z'). If half of the characters in the child's sample
 *         match the characters in the corresponding positions in the man's
 *         sample, and the remaining characters in the child's sample match the
 *         characters in the corresponding positions in the mother's sample,
 *         then the man is most likely the father. On the other hand, if it is
 *         impossible to partition the child's sample such that half of the
 *         characters match the man's and the other half match the mother's,
 *         then the man is definitely ruled out as the father.
 * 
 *         For example, suppose the child's sample is "ABCD" and the mother's
 *         sample is "AXCY" (all quotes for clarity only). The 'A' and 'C' in
 *         the child's sample must have come from the mother, so the 'B' and 'D'
 *         must have come from the father. If the man's sample is "SBTD", then
 *         he is most likely the father, but if the man's sample is "QRCD", then
 *         he is definitely not the father. Note in the latter case that the man
 *         was definitely ruled out even though half of his sample (the 'C' and
 *         'D') did in fact match the child's.
 * 
 *         Your method will take samples from the child and the mother, as well
 *         as samples from several men, and return the indices of the men who
 *         cannot be ruled out as the father, in increasing order.
 * 
 *         Definition
 * 
 *         Class: PaternityTest Method: possibleFathers Parameters: String,
 *         String, String[] Returns: int[] Method signature: int[]
 *         possibleFathers(String child, String mother, String[] men) (be sure
 *         your method is public)
 * 
 * 
 *         Notes - You may assume that the identity of the mother is not in
 *         question.
 * 
 *         Constraints - men contains between 1 and 5 elements, inclusive. -
 *         child, mother, and all elements of men contain the same number of
 *         characters, which is even and between 2 and 20, inclusive. - child,
 *         mother, and all elements of men contain only uppercase letters
 *         ('A'-'Z'). - At least half of the characters in mother match the
 *         characters in the corresponding positions in child.
 * 
 *         Examples 
 *         0)
 *         "ABCD"
 * 
 *         "AXCY"
 * 
 *         { "SBTD", "QRCD" }
 * 
 *         Returns: { 0 }
 * 
 *         The example above. 
 *         
 *         1)
 *         "ABCD"
 * 
 *         "ABCX"
 * 
 *         { "ABCY", "ASTD", "QBCD" }
 * 
 *         Returns: { 1, 2 }
 * 
 *         "ABCY" could not be the father. "ASTD" could be the father, with the
 *         'A' and 'D' coming from the father and the 'B' and 'C' coming from
 *         the mother. "QBCD" could also be the father, with either the 'B' and
 *         'D' or the 'C' and 'D' coming from the father. 2)
 * 
 *         "ABABAB"
 * 
 *         "ABABAB"
 * 
 *         { "ABABAB", "ABABCC", "ABCCDD", "CCDDEE" }
 * 
 *         Returns: { 0, 1 }
 * 
 *         3)
 *         "YZGLSYQT"
 * 
 *         "YUQRWYQT"
 * 
 *         {"YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT", "WQJLSMQT"}
 * 
 *         Returns: { }
 * 
 *         4)
 *         "WXETPYCHUWSQEMKKYNVP"
 * 
 *         "AXQTUQVAUOSQEEKCYNVP"
 * 
 *         { "WNELPYCHXWXPCMNKDDXD", "WFEEPYCHFWDNPMKKALIW",
 *         "WSEFPYCHEWEFGMPKIQCK", "WAEXPYCHAWEQXMSKYARN",
 *         "WKEXPYCHYWLLFMGKKFBB" }
 * 
 *         Returns: { 1, 3 }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 155 Round 1 - Division
 *         I, Level One Single Round Match 155 Round 1 - Division II, Level
 *         Three
 */

public class PaternityTest {
	public int[] possibleFathers(String child, String mother, String[] men) {
		int data;
		List<Integer> list = new ArrayList<Integer>();

		int matchesMother = countMatches(child, mother);

		for (int i = 0; i < men.length; i++) {
			data = checkMatches(child, mother, matchesMother, men[i]);
			if (data > 0) {
				list.add(i);
			}
		}

		int[] solution = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			solution[i] = list.get(i);
		}
		return solution;
	}

	private static int countMatches(String child, String subject) {
		int count = 0;
		for (int i = 0; i < subject.length(); i++) {
			if (child.charAt(i) == subject.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	private static int checkMatches(String child, String mother,
			int matchesMother, String subject) {
		int count = 0;
		int countCommonsWithMother = 0;

		for (int i = 0; i < subject.length(); i++) {
			if (child.charAt(i) == subject.charAt(i)) {
				count++;
				if (child.charAt(i) == mother.charAt(i)) {
					countCommonsWithMother++;
				}
			}
		}

		if (count >= child.length() / 2) {
			if (count + matchesMother - countCommonsWithMother >= child
					.length()) {
				return count;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}
}
