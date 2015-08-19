package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: Dice Method Name: getScores Parameters: int, int[]
 *         Returns: int[]
 * 
 *         Implement a class Dice, which contains a method getScores. getScores
 *         takes an int representing the number of players playing the game and
 *         an int[] representing the rolls of the die. getScores returns the
 *         final scores of all the players, as an int[]. The 0th element of the
 *         int[] is the score of the first player, 1st element is the score of
 *         second player ...
 * 
 *         Here is the method signature: int[] getScores(int iNumberOfPlayers,
 *         int[] dieRolls); Be sure your method is public. iNumberOfPlayers will
 *         be a number from 3 to 10 (inclusive) dieRolls will be of length 10 to
 *         50 (inclusive), and will contain Integers from 1 to 6 (inclusive)
 * 
 *         The game always starts with player 1. The players sit in a circle
 *         with player 2 to the right of player 1 and player 1 to the right of
 *         the last player. When it is a player's turn, the player rolls the
 *         die. The player earns points and the next player is determined based
 *         on the following rules: If the die is a 1 or 2, one point is earned.
 *         If the die is a 3 or 4, two points are earned. If the die is a 5 or
 *         6, three points are earned. If the number on the die is even, control
 *         passes to the player on the left. If the number on the die is odd,
 *         control passes to the player on the right. The above rules do not
 *         apply when the number rolled is exactly the same as the previously
 *         rolled number. Instead, control is kept by the current player, and
 *         points are earned according to the following: If it is the first time
 *         the number has been rerolled(second time in a row a number has been
 *         rolled), points are given as above, plus bonus points are given equal
 *         to the amount shown on the die. Otherwise, points are earned equal to
 *         the amount shown on the die multiplied by the number of times the
 *         player has rerolled the number.
 * 
 *         Walkthrough example: With 5 players, and the rolls
 *         [3,4,4,4,4,6,6,2,1,5,5], the game is played as below: player 1 rolls
 *         a 3, earning 2 points. Control passes to the right (player 2)
 *         [2,0,0,0,0] player 2 rolls a 4, earning 2 points. Control passes to
 *         the left (player 1) [2,2,0,0,0] player 1 rolls a 4, earning 2+4
 *         points. Control stays with (player 1) [8,2,0,0,0] player 1 rolls a 4,
 *         earning 2*4 points. Control stays with (player 1) [16,2,0,0,0] player
 *         1 rolls a 4, earning 3*4 points. Control stays with (player 1)
 *         [28,2,0,0,0] player 1 rolls a 6, earning 3 points. Control passes to
 *         the left (player 5) [31,2,0,0,0] player 5 rolls a 6, earning 3+6
 *         points. Control stays with (player 5) [31,2,0,0,9] player 5 rolls a
 *         2, earning 1 point. Control passes to the left (player 4)
 *         [31,2,0,0,10] player 4 rolls a 1, earning 1 point. Control passes to
 *         the right (player 5) [31,2,0,1,10] player 5 rolls a 5, earning 3
 *         points. Control passes to the right (player 1) [31,2,0,1,13] player 1
 *         rolls a 5, earning 3+5 points. Control stays with (player 1)
 *         [39,2,0,1,13] GAME OVER *** The int[] returned is [39,2,0,1,13].
 * 
 *         Examples: With 5 players, and the rolls [3,4,4,4,6,6,2,1,5,5], the
 *         scores are [27,2,0,1,13]. With 3 players, and the rolls
 *         [2,5,6,3,1,3,2,5,5,6], the scores are [5,5,17]. With 5 players, and
 *         the rolls [1,1,2,1,3,5,3,3,1,2,2,1,1], the scores are [5,5,3,2,10].
 *         With 10 players, and the rolls [5,3,5,6,5,2,2,1,6,3,6], the scores
 *         are [3,2,12,10,0,0,0,0,0,0].
 * 
 *         Definition
 * 
 *         Class: Dice Method: getScores Parameters: int, int[] Returns: int[]
 *         Method signature: int[] getScores(int param0, int[] param1) (be sure
 *         your method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 7 Round 1 - Division I,
 *         Level Two Single Round Match 7 Round 1 - Division II, Level Two
 */

public class Dice {
	public int[] getScores(int numberOfPlayers, int[] rolls) {
		int[] points = new int[numberOfPlayers];

		int roll;
		int value = 0;
		int former = 0;
		int count = 0;
		int j = 0;

		for (int i = 0; i < rolls.length; i++) {
			roll = rolls[i];
			if (former == roll) {
				count++;
				if (count < 2) {
					value = getValue(roll);
					value += roll;
				} else {
					value = count * roll;
				}
				points[j] += value;
			} else {
				value = getValue(roll);

				points[j] += value;

				if (roll % 2 == 0) {
					j--;
				} else {
					j++;
				}
				count = 0;
			}
			// Corrections for the j player for extreme values.
			if (j < 0) {
				j += numberOfPlayers;
			} else if (j == numberOfPlayers) {
				j = 0;
			}
			former = roll;
		}

		return points;
	}

	private int getValue(int roll) {
		int value = 0;
		if (roll < 3) {
			value = 1;
		} else if (roll == 3 || roll == 4) {
			value = 2;
		} else if (roll > 4) {
			value = 3;
		}

		return value;
	}
}
