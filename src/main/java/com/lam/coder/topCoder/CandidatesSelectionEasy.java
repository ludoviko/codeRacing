package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement Fox Ciel wants to hire a new maid. There are n
 *         candidates for the position. There are m different skills a maid
 *         should have, such as cooking, cleaning, or discreetness. Ciel
 *         numbered the candidates 0 through n-1 and the skills 0 through m-1.
 * 
 *         Ciel evaluated the level each candidate has in each of the skills.
 *         You are given this information encoded in a String[] score with n
 *         elements, each consisting of m characters. For each i and j, the
 *         character score[i][j] represents the level candidate i has in skill
 *         j. Said character will always be between 'A' and 'Z', inclusive,
 *         where 'A' means the best possible and 'Z' the worst possible
 *         candidate.
 * 
 *         You are also given an int x. Ciel thinks that skill x is the most
 *         important skill a maid should have.
 * 
 *         Return a int[] with n elements: the numbers of all candidates,
 *         ordered according to their level in skill x from the best to the
 *         worst. Candidates who have the same level in skill x should be
 *         ordered by their number in ascending order.
 * 
 *         Definition
 * 
 *         Class: CandidatesSelectionEasy Method: sort Parameters: String[], int
 *         Returns: int[] Method signature: int[] sort(String[] score, int x)
 *         (be sure your method is public)
 * 
 *         Constraints - n will be between 1 and 50, inclusive. - m will be
 *         between 1 and 50, inclusive. - score will contain exactly n elements.
 *         - Each element of score will contain exactly m characters. - Each
 *         character in each element of score will be an uppercase English
 *         letter ('A'-'Z'). - x will be between 0 and m-1, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         {"ACB", "BAC", "CBA"}
 * 
 *         1
 * 
 *         Returns: {1, 2, 0 }
 * 
 *         The output should be {1, 2, 0}, because the level of candidate 1 in
 *         skill 1 is 'A', the level of candidate 2 in this skill is 'B', and
 *         the level of candidate 0 is 'C'. 1)
 * 
 * 
 *         {"A", "C", "B", "C", "A"}
 * 
 *         0
 * 
 *         Returns: {0, 4, 2, 1, 3 }
 * 
 *         Note that when 2 candidates have same level, they will remain in the
 *         original order. 2)
 * 
 * 
 *         {"LAX","BUR","ONT","LGB","SAN","SNA","SFO","OAK","SJC"}
 * 
 *         2
 * 
 *         Returns: {5, 3, 8, 7, 4, 6, 1, 2, 0 }
 * 
 *         3)
 * 
 * 
 *         {"BBCBABAC","BCBACABA","CCCBAACB","CACABABB","AABBBBCC"}
 * 
 *         6
 * 
 *         Returns: {0, 1, 3, 2, 4 }
 * 
 *         4)
 * 
 * 
 *         {"XXYWZWWYXZ","YZZZYWYZYW","ZYZZWZYYWW","ZWZWZWZXYW","ZYXWZXWYXY",
 *         "YXXXZWXWXW","XWWYZWXYXY","XYYXYWYXWY","ZZYXZYZXYY","WXZXWYZWYY"}
 * 
 *         3
 * 
 *         Returns: {0, 3, 4, 5, 7, 8, 9, 6, 1, 2 }
 * 
 *         5)
 * 
 * 
 *         {"X"}
 * 
 *         0
 * 
 *         Returns: {0 }
 * 
 *         Note that we may have only one candidate as well as only 1 skill.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 620 Round 1 - Division
 *         II, Level One
 */

public class CandidatesSelectionEasy {
	public int[] sort(String[] score, int x) {
		String[] candidates = new String[score.length];
		String is = "";
		for (int i = 0; i < score.length; i++) {
			if (i < 10) {
				is = "0" + i;
			} else {
				is = i + "";
			}
			candidates[i] = score[i].charAt(x) + is;
		}

		Arrays.sort(candidates);

		int[] data = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			data[i] = Integer.parseInt(candidates[i].substring(1));
		}

		return data;
	}

}
