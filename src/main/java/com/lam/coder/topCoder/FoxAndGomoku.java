package com.lam.coder.topCoder;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement     
 * 
 *         Fox Ciel is going to play Gomoku with her friend Fox Jiro. Ciel plays
 *         better, so before they start she allowed Jiro to put some of his
 *         pieces on the board. You are given a String[] board that represents a
 *         square board.
 * 
 *         The character board[i][j] represents the cell with coordinates (i,j).
 *         Each of those characters is either '.' (representing an empty cell)
 *         or 'o' (representing a cell with Jiro's piece).
 * 
 *         Of course, Ciel does not want Jiro to win the game before she has a
 *         chance to play. Thus she now has to check the board and determine
 *         whether there are five consecutive tokens somewhere on the board.
 *         Determine whether there are 5 consecutive cells (horizontally,
 *         vertically, or diagonally) that contain Jiro's tokens. Return "found"
 *         (quotes for clarity) if there are five such cells anywhere on the
 *         board. Otherwise, return "not found".
 * 
 *         Definition     
 * 
 *         Class: FoxAndGomoku Method: win Parameters: String[] Returns: String
 *         Method
 * 
 *         signature: public String win(String[] board)
 * 
 *         Constraints - n will be between 5 and 15, inclusive. - board will
 *         contain exactly n elements. - Each element in board will contain
 *         exactly n characters. - Each character in board will be 'o' or '.'.
 *         Examples
 * 
 *         0)      {"....o.", "...o..", "..o...", ".o....", "o.....", "......"}
 *         Returns: "found" There is five continue pieces diagonally.
 * 
 *         1)      {"oooo.", ".oooo", "oooo.", ".oooo", "....."}
 * 
 *         Returns: "not found" There is no five-in-a-row on this board.
 * 
 *         2)      {"oooo.", ".oooo", "oooo.", ".oooo", "....o"}
 * 
 *         Returns: "found" Five consecutive tokens can be found in the
 *         following cells: (0,0), (1,1), (2,2), (3,3), and (4,4).
 * 
 *         3)      {"o.....", ".o....", "..o...", "...o..", "....o.", "......"}
 *         Returns: "found"
 * 
 *         4)      {"o....", "o.o..", "o.o.o", "o.o..", "o...."} Returns:
 *         "found"
 * 
 *         5)      {"..........", "..........", "..oooooo..", "..o.......",
 *         "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..",
 *         ".........."}
 * 
 *         Returns: "found"
 * 
 *         6)      {"..........", "..........", "..oooo.o..", "..o.......",
 *         "..o.......", "..o.oooo..", ".......o..", ".......o..", "..oooo.o..",
 *         ".........."} Returns: "not found"
 * 
 *         7)      {"ooooo", "ooooo", "ooooo", "ooooo", "ooooo"} Returns:
 *         "found"
 * 
 *         8)      {".....", ".....", ".....", ".....", "....."} Returns:
 *         "not found"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 590 Round 1 - Division
 *         II, Level One
 * 
 *         Rather complex.
 * 
 */

public class FoxAndGomoku {
	private static final char dot = '.';
	private static final char oLetter = 'o';
	private static final int MATHCHES = 5;

	public String win(String[] board) {
		int matchs = 0;

		matchs += this.foundHorizontal(board);
		matchs += this.foundVertical(board);
		matchs += this.foundDiagonalLeftToRight(board);
		matchs += this.foundDiagonalRightToLeft(board);

		// System.out.println(matchs);

		if (matchs > 0) {
			return "found";
		} else {
			return "not found";
		}
	}

	public int foundHorizontal(String[] board) {
		int rows = board.length;
		int columns = board[0].length();

		int counter = 0;
		int matchs = 0;

		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns - (MATHCHES - 1); column++) {
				counter = 0;
				for (int i = 0; i < MATHCHES; i++) {
					if (board[row].charAt(column + i) == oLetter) {
						counter++;
					}
				}
				if (counter == MATHCHES) {
					matchs++;
				}
			}
		}
		return matchs;
	}

	public int foundVertical(String[] board) {
		int rows = board.length;
		int columns = board[0].length();

		int counter = 0;
		int matchs = 0;

		for (int row = 0; row < rows - (MATHCHES - 1); row++) {
			for (int column = 0; column < columns; column++) {
				counter = 0;
				for (int i = 0; i < MATHCHES; i++) {
					if (board[row + i].charAt(column) == oLetter) {
						counter++;
					}
				}
				if (counter == MATHCHES) {
					matchs++;
				}
			}
		}
		return matchs;
	}

	public int foundVerticalOld(String[] board) {
		int count = 1;
		int matchs = 0;
		for (int column = 0; column < board[0].length(); column++) {
			count = 1;
			for (int row = 0; row < board.length - 1; row++) {
				if (board[row].charAt(column) == FoxAndGomoku.oLetter) {
					if (board[row + 1].charAt(column) == FoxAndGomoku.oLetter) {
						count++;
					} else {
						if (count < MATHCHES) {
							count = 1;
						}
					}
				}
			}

			if (count >= MATHCHES) {
				matchs++;
			}
		}
		return matchs;
	}

	public int foundDiagonalLeftToRight(String[] board) {
		int rows = board.length;
		int columns = board[0].length();

		int counter = 0;
		int matchs = 0;

		for (int row = 0; row < rows - (MATHCHES - 1); row++) {
			for (int column = 0; column < columns - (MATHCHES - 1); column++) {
				counter = 0;
				for (int i = 0; i < MATHCHES; i++) {
					if (board[row + i].charAt(column + i) == oLetter) {
						counter++;
					}
				}
				if (counter == MATHCHES) {
					matchs++;
				}
			}
		}
		return matchs;
	}

	public int foundDiagonalRightToLeft(String[] board) {
		int rows = board.length;
		int columns = board[0].length();
		int counter = 0;
		int matchs = 0;

		for (int row = 0; row < rows - (MATHCHES - 1); row++) {
			for (int column = columns - 1; column >= MATHCHES - 1; column--) {
				counter = 0;
				for (int i = 0; i < MATHCHES; i++) {
					if (board[row + i].charAt(column - i) == oLetter) {
						counter++;
					}
				}
				if (counter == MATHCHES) {
					matchs++;
				}
			}
		}
		return matchs;
	}
}
