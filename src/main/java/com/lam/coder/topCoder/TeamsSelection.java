package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author LAzuaje
 *
 *         Problem Statement for TeamsSelection
 * 
 *         The boys in the yard are going to play soccer.
 *         There are N+2 boys, two of which have been chosen as captains. Now
 *         they want to divide the other N children into two teams. For
 *         convenience, we number the boys who are not captains from 1 to N.
 * 
 * 
 *         The division into teams works as follows. Initially, the first
 *         captain chooses one person for his team. Then, the second captain
 *         chooses one boy from those who are left. Then the first captain
 *         chooses again, and so on. The process continues until there are no
 *         more boys left.
 * 
 * 
 *         You are given int[]s preference1 and preference2, each containing N
 *         elements. preference1[0] is the number of the boy whom the first
 *         captain regards to be the best player, preference1[1] is the next
 *         best player according to the first captain, and so on. preference2
 *         describes the second captain's assessment in the same fashion. The
 *         captains pick the players greedily, i.e., each of them always chooses
 *         the boy whom he considers to be the strongest between the children
 *         not yet chosen.
 * 
 * 
 *         Return a String consisting of N characters. Character i in the
 *         returned string must be '1' if the boy i+1 will be assigned to the
 *         first captain's team and '2' otherwise.
 * 
 *         Definition
 * 
 *         Class: TeamsSelection Method: simulate Parameters: int[], int[]
 *         Returns: String Method signature: String simulate(int[] preference1,
 *         int[] preference2) (be sure your method is public)
 * 
 * 
 *         Constraints - preference1 will contain N elements, where N is between
 *         2 and 50, inclusive. - Elements of preference1 will contain each of
 *         the numbers from 1 to N exactly once. - preference2 will contain N
 *         elements. - Elements of preference2 will contain each of the numbers
 *         from 1 to N exactly once.
 * 
 *         Examples 0)
 * 
 *         {1, 2, 3, 4} {1, 2, 3, 4} Returns: "1212" There are 4 boys to be
 *         divided between the two captains. Both captains believe that boy 1
 *         plays best, then come boy 2 and boy 3, and boy 4 plays worst. Thus,
 *         the first captain will choose boy 1, the second captain will choose
 *         boy 2, since boy 1 is already assigned to a team, then the first
 *         captain will choose boy 3 and in the end the second captain will take
 *         boy 4. 1)
 * 
 *         {3, 2, 1} {1, 3, 2} Returns: "211" The first captain will choose boy
 *         3, the second captain will choose boy 1 and then the first captain
 *         will choose boy 2. Note that when there is an odd number of children,
 *         the first team ends up one man larger. 2)
 * 
 *         {6, 1, 5, 2, 3, 4} {1, 6, 3, 4, 5, 2} Returns: "212211" 3)
 * 
 *         {8, 7, 1, 2, 4, 5, 6, 3, 9} {7, 2, 4, 8, 1, 5, 9, 6, 3} Returns:
 *         "121121212" This problem statement is the exclusive and proprietary
 *         property of TopCoder, Inc. Any unauthorized use or reproduction of
 *         this information without the prior written consent of TopCoder, Inc.
 *         is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 586 Round 1 - Division
 *         II, Level One
 * 
 */

public class TeamsSelection {
	public static final char FIRST = '1';
	public static final char SECOND = '2';

	public String simulate(int[] preference1, int[] preference2) {
		int n = preference1.length;
		char[] data = new char[n];

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(i + 1);
		}

		int i = 0;
		int j = 0;

		while (i < n && j < n && !list.isEmpty()) {
			int next = preference1[i];

			while (!list.contains(next) && !list.isEmpty()) {
				next = preference1[++i];
			}

			data[next - 1] = FIRST;
			list.remove(new Integer(next));

			next = preference2[j];
			while (!list.contains(next) && !list.isEmpty()) {
				next = preference2[++j];
			}

			if (!list.isEmpty()) {
				data[next - 1] = SECOND;
				list.remove(new Integer(next));
			}

			i++;
			j++;
		}

		return new String(data);
	}
}
