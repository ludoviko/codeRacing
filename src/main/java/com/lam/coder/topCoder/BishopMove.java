package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for BishopMove
 * 
 *         Janusz is learning how to play chess. He is using the standard
 *         chessboard with 8 rows and 8 columns. Both the rows and the columns
 *         are numbered 0 through 7. Thus, we can describe each cell using its
 *         two coordinates: (row, column).
 * 
 *         Janusz recently learned about one of the chess pieces: the bishop.
 *         The bishop is a piece that moves diagonally by an arbitrary number of
 *         cells. Formally, if a bishop is currently on the cell (r,c) of an
 *         empty chessboard, the set of all cells reachable in a single move
 *         contains the following cells:
 * 
 *         All cells of the form (r+k,c+k), where k is a positive integer. All
 *         cells of the form (r+k,c-k), where k is a positive integer. All cells
 *         of the form (r-k,c+k), where k is a positive integer. All cells of
 *         the form (r-k,c-k), where k is a positive integer. (Of course, the
 *         bishop's destination must always be a valid cell on the chessboard.)
 *         Janusz took an empty chessboard and he placed a single bishop onto
 *         the cell (r1,c1). He now wants to move it to the cell (r2,c2) using
 *         as few moves as possible.
 * 
 *         You are given the ints r1, c1, r2, and c2. Compute and return the
 *         smallest number of moves a bishop needs to get from (r1,c1) to
 *         (r2,c2). If it is impossible for a bishop to reach the target cell,
 *         return -1 instead.
 * 
 * 
 *         Definition
 * 
 *         Class: BishopMove Method: howManyMoves Parameters: int, int, int, int
 *         Returns: int Method signature: int howManyMoves(int r1, int c1, int
 *         r2, int c2) (be sure your method is public)
 * 
 * 
 *         Constraints - r1,c1,r2,c2 will be between 0 and 7, inclusive.
 * 
 *         Examples 0)
 * 
 *         4 6 7 3 Returns: 1 The bishop can go from (4,6) to (7,3) in a single
 *         move. 1)
 * 
 *         2 5 2 5 Returns: 0 The bishop is already where it should be, no moves
 *         are necessary. 2)
 * 
 *         1 3 5 5 Returns: 2 In the first move Janusz can move the bishop to
 *         the cell (4,6). Please note that this is the largest possible return
 *         value: whenever there is a solution, there is a solution that uses at
 *         most two moves. 3)
 * 
 *         4 6 7 4 Returns: -1 If the bishop starts at (4,6), it can never reach
 *         (7,4). This problem statement is the exclusive and proprietary
 *         property of TopCoder, Inc. Any unauthorized use or reproduction of
 *         this information without the prior written consent of TopCoder, Inc.
 *         is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 628 Round 1 - Division
 *         II, Level One
 *
 */

public class BishopMove {
	public int howManyMoves(int row_from, int column_from, int row_to,
			int column_to) {

		if (row_from == row_to && column_from == column_to) {
			return 0;
		} else if ((row_from + column_from) % 2 != (row_to + column_to) % 2) {
			return -1;
		} else if (isASingleMove(row_from, column_from, row_to, column_to)) {
			return 1;
		} else {
			return 2;
		}
	}

	private boolean isASingleMove(int row_from, int column_from, int row_to,
			int column_to) {

		int row_dif = row_from - row_to;

		if (column_to == column_from + row_dif) {
			return true;
		} else if (column_to == column_from - row_dif) {
			return true;
		} else {
			return false;
		}
	}
}
