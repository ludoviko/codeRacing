package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         In each round of the two-player game of Rochambo, you and your
 *         opponent simultaneously display one of three gestures: Rock, Paper,
 *         or Scissors. If both of you have made the same move, the outcome is a
 *         tie. Otherwise, Rock beats Scissors, Scissors beats Paper, and Paper
 *         beats Rock.
 * 
 *         An optimal strategy against an opponent who makes random moves is to
 *         play randomly yourself. However, most people are incapable of
 *         generating a truly random series of moves, and it may be possible to
 *         exploit patterns in their play. According to one theory, the human
 *         mind works in the following manner. After making two consecutive
 *         moves of the same kind, the next move is likely to be the same as the
 *         previous two. But after making two different consecutive moves, the
 *         next move is likely to be different from the previous two.
 * 
 *         Given a String containing a record of your opponent's moves,
 *         calculate how many rounds you would win if you believed in this
 *         theory. Each gesture is represented by its initial letter. Your first
 *         two moves are always Rock. Thereafter, taking into account your
 *         opponent's previous two moves, you must apply the psychological
 *         theory described above to predict your opponent's next move, and
 *         counter it with the move that would defeat it.
 * 
 *         Definition
 * 
 *         Class: Rochambo Method: wins Parameters: String Returns: int Method
 *         signature: int wins(String opponent) (be sure your method is public)
 * 
 * 
 *         Constraints - opponent contains between 2 and 50 characters,
 *         inclusive - each character in opponent is one of 'R', 'P', or 'S'
 * 
 *         Examples 0)
 * 
 * 
 *         "PS"
 * 
 *         Returns: 1
 * 
 *         Your first two moves are always Rock, so you lose the first round and
 *         win the second round. 1)
 * 
 * 
 *         "PSRRPS"
 * 
 *         Returns: 3
 * 
 *         You lose the first round and win the second round. The theory
 *         predicts that because your opponent has played Paper and Scissors in
 *         the first two rounds, he will play something different, namely Rock,
 *         in the third round. Accordingly, you play Paper. Your opponent does,
 *         in fact, play Rock, so you win the third round. The theory predicts
 *         that your opponent will play Paper in the fourth round, so you play
 *         Scissors. He actually plays Rock, so you lose. In the fifth round,
 *         the theory predicts that because your opponent has played Rock twice
 *         in a row, he will play it yet again, so you counter with Paper. Since
 *         he also plays Paper, this round is a tie. In the sixth round, the
 *         theory predicts Scissors, so you play Rock. Your opponent plays
 *         Scissors, and you win the round. In total, you have won three rounds.
 *         2)
 * 
 * 
 *         "PSRPSRPRSR"
 * 
 *         Returns: 7
 * 
 *         3)
 * 
 * 
 *         "SRPSRPSPRSPRPSRPSRP"
 * 
 *         Returns: 16
 * 
 *         4)
 * 
 * 
 *         "RPPPRRPSSSRRRSRSPPSSPRRPSRRRRSPPPPSSPSSSSSRSSSRPRR"
 * 
 *         Returns: 18
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 163 Round 1 - Division
 *         I, Level One
 */

public class Rochambo {
	public static final char ROCK = 'R';
	public static final char PAPER = 'P';
	public static final char SCISSORS = 'S';

	public Rochambo() {
	}

	private int rules(char first, char second) {
		if (first == second) {
			return 0;
		} else if (first == ROCK) {
			if (second == PAPER) {
				return -1;
			} else {
				return 1;
			}
		} else if (first == PAPER) {
			if (second == ROCK) {
				return 1;
			} else {
				return -1;
			}
		} else if (first == SCISSORS) {
			if (second == PAPER) {
				return 1;
			} else {
				return -1;
			}
		}

		return 0;
	}

	private char findBestStrategy(char opponent) {
		if (opponent == PAPER) {
			return SCISSORS;
		} else if (opponent == ROCK) {
			return PAPER;
		} else {
			// Opponent has Scissors
			return ROCK;
		}
	}

	private char predictNextMove(Character op1, Character op2) {
		List<Character> list = new ArrayList<Character>();

		list.add(PAPER);
		list.add(ROCK);
		list.add(SCISSORS);

		if (op1 == op2) {
			return op1;
		}

		list.remove(op1);
		list.remove(op2);
		return list.get(0);
	}

	public int wins(String opponent) {
		int i = 0;
		int counter = 0;

		for (i = 0; i < 2; i++) {
			if (rules(ROCK, opponent.charAt(i)) > 0) {
				counter++;
			}
		}

		char prediction;
		while (i < opponent.length()) {
			prediction = predictNextMove(opponent.charAt(i - 2),
					opponent.charAt(i - 1));
			if (rules(findBestStrategy(prediction), opponent.charAt(i)) > 0) {
				counter++;
			}
			i++;
		}

		return counter;
	}
}
