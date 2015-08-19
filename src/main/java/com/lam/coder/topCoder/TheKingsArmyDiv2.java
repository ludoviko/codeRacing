package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 *
 *         Problem Statement The King of Byteland has an army that consists of
 *         R*C soldiers. He has just arranged the soldiers into a grid with R
 *         rows and C columns. Two soldiers are neighbors if they stand next to
 *         each other in a row or in a column.
 * 
 * 
 *         Each of the soldiers is currently either happy or sad. You are given
 *         their current states in a String[] state with R elements, each
 *         containing C characters. The character state[i][j] is either 'H' (if
 *         the soldier in row i, column j is happy) or 'S' (if that soldier is
 *         sad).
 * 
 * 
 *         Happiness is contagious. Whenever two neighbors are both happy, they
 *         will tell each other jokes and after a minute that will make all of
 *         their neighbors happy as well.
 * 
 * 
 *         Here's an example. There are two happy neighbors among many sad
 *         soldiers:
 * 
 * 
 *         {"SSSSS", "SSHHS", "SSSSS"}
 * 
 * 
 *         This is the situation after one minute: all of their neighbors are
 *         happy now.
 * 
 * 
 *         {"SSHHS", "SHHHH", "SSHHS"}
 * 
 * 
 *         And this is the situation after another minute. Now all the neighbors
 *         of the soldiers that are currently happy became happy as well.
 * 
 * 
 *         {"SHHHH", "HHHHH", "SHHHH"}
 * 
 * 
 *         After another minute, all the soldiers in the King's army would be
 *         happy.
 * 
 * 
 *         The King wants all his soldiers to be happy. Sometimes it's easy, as
 *         in the above example: all he has to do is wait for a while and all
 *         soldiers will become happy. However, it is not always the case. For
 *         example, in the situation below the happiness would not spread
 *         anywhere, each soldier would remain in his original state forever.
 *         (Note that a single happy soldier does not make his neighbors happy.)
 * 
 * 
 *         {"SSSSS", "SSHSH", "HSSSS"}
 * 
 * 
 *         The King can make a soldier happy by giving him an award for
 *         excellent service. Obviously, the King could make all soldiers happy
 *         by giving awards to all of them. But the King is smart and knows that
 *         there is a better solution. He will only give the awards to a few
 *         carefully selected soldiers and then he will simply wait until the
 *         happiness spreads to the rest of the army.
 * 
 * 
 *         You are given the String[] state. Compute and return the smallest
 *         number of awards the king has to give to make all soldiers happy in
 *         the end.
 * 
 *         Definition Class: TheKingsArmyDiv2 Method: getNumber Parameters:
 *         String[] Returns: int Method signature: int getNumber(String[] state)
 *         (be sure your method is public)
 * 
 *         Limits Time limit (s): 2.000 Memory limit (MB): 256
 * 
 *         Constraints - state will contain between 3 and 50 elements,
 *         inclusive. - Each element of state will contain between 3 and 50
 *         characters, inclusive. - Each element of state will contain the same
 *         number of characters. - Each character in each element of state will
 *         be either 'H' or 'S'. Examples 0) {"SSSSS", "SSHHS", "SSSSS"}
 * 
 * 
 *         Returns: 0
 * 
 *         This is the first example in the problem statement. No awards are
 *         necessary, all soldiers will become happy anyway.
 * 
 * 
 *         1) {"SSSSS", "SSHSH", "HSSSS"}
 * 
 * 
 *         Returns: 1
 * 
 *         This is the second example in the problem statement. The King needs
 *         to give at least one award. One optimal solution is to give an award
 *         to the soldier in row 1, column 3. (Both indices are 0-based.)
 * 
 * 
 *         2) {"SSS", "SSS", "SSS"}
 * 
 * 
 *         Returns: 2
 * 
 *         Here the King must give awards to two soldiers.
 * 
 * 
 *         3) {"HSHSHSH", "SSSHSSS", "SSHSHSS", "SHSHSHS"}
 * 
 * 
 *         Returns: 1
 * 
 * 
 *         4) {"HHSH", "HHHS", "HSSS", "SHSH", "HHHS", "HSHH", "SSSH"}
 * 
 * 
 *         Returns: 0
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 */

public class TheKingsArmyDiv2 {
	public int getNumber(String[] state) {
		if (!this.isThereAnyHappy(state)) {
			return 2;
		}

		if (this.areThereTwoHappySoldieNeighborsByX(state)
				|| this.areThereTwoHappySoldieNeighborsByY(state)) {
			return 0;
		} else {
			return 1;
		}
	}

	private boolean isThereAnyHappy(String[] state) {
		for (int r = 0; r < state.length; r++) {
			for (int c = 0; c < state[0].length(); c++) {
				if (state[r].charAt(c) == 'H') {
					return true;
				}
			}
		}
		return false;
	}

	private boolean areThereTwoHappySoldieNeighborsByX(String[] state) {
		for (int r = 0; r < state.length; r++) {
			for (int c = 0; c < state[0].length() - 1; c++) {
				if ((state[r].charAt(c) == state[r].charAt(c + 1))
						&& state[r].charAt(c) == 'H') {
					return true;
				}
			}
		}
		return false;
	}

	private boolean areThereTwoHappySoldieNeighborsByY(String[] state) {

		for (int c = 0; c < state[0].length(); c++) {
			for (int r = 0; r < state.length - 1; r++) {
				if ((state[r].charAt(c) == state[r + 1].charAt(c))
						&& state[r].charAt(c) == 'H') {
					return true;
				}
			}
		}
		return false;
	}
}
