package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Tetris is one of those games that is everywhere; there aren't too
 *         many people who haven't seen it in some form or another since its
 *         conception in 1985. The concept is fairly simple. You have a
 *         vertically-oriented rectangular grid. Pieces, which are made up of
 *         some number of 1x1 blocks, fall downwards. Whenever an entire row of
 *         the grid is full of blocks, all of the blocks in that row disappear
 *         and all the pieces above are shifted downwards by a row.
 * 
 *         TopCoder member antimatter is not very good at Tetris. The pieces
 *         drop too fast, he says. He's been toying with the idea of coding his
 *         own version, with one twist: the addition of the Gravity Bomb, which
 *         does not appear on the board. When the Gravity Bomb is activated, if
 *         any block is immediately above an empty space, it falls into that
 *         space. This process is repeated until there are no more blocks
 *         immediately above empty spaces. Then, any completed row of blocks
 *         will be removed and the blocks above them shifted downwards, until
 *         there are no more complete rows.
 * 
 *         The board has a fixed width and height, and the initial state of the
 *         board will be represented as a String[] board. The first element of
 *         board is the top row, the second element is the row immediately below
 *         it, and so on. The character 'X' will represent the presence of a
 *         block, and the character '.' will represent an empty space. Your
 *         method should return the state of the board after the Gravity Bomb is
 *         used, in the same format. Your return value should have the same
 *         number of rows and columns as the input.
 * 
 *         Definition
 * 
 *         Class: GravityBomb Method: aftermath Parameters: String[] Returns:
 *         String[] Method signature: String[] aftermath(String[] board) (be
 *         sure your method is public)
 * 
 * 
 *         Constraints - board will contain between 1 and 50 elements, inclusive
 *         - each element of board will contain between 1 and 50 characters,
 *         inclusive - each element of board will be the same length - each
 *         character in board will be either 'X' or '.'
 * 
 *         Examples 0)
 * 
 * 
 *         {"..X", "X.X", ".X."}
 * 
 *         Returns: { "...", "...", "..X" }
 * 
 *         After the Gravity Bomb is used, the board looks like this:
 * 
 *         ...
 * 
 *         ..X
 * 
 *         XXX
 * 
 *         Then we remove the completed line at the bottom and move all blocks
 *         above downwards. 1)
 * 
 * 
 *         {"...", "X..", ".X."}
 * 
 *         Returns: { "...", "...", "XX." }
 * 
 *         Here there are no complete lines. 2)
 * 
 * 
 *         {"XXXXXX", "......", "......"}
 * 
 *         Returns: { "......", "......", "......" }
 * 
 *         3)
 * 
 * 
 *         {"XX.XX....XX"}
 * 
 *         Returns: { "XX.XX....XX" }
 * 
 *         4)
 * 
 * 
 *         {"X",".",".",".",".",".",".",".",".",".",".",".",".",
 *         ".",".",".",".",".",".",".",".",".",".",".",".",".",
 *         ".",".",".",".",".",".",".",".",".",".",".",".",".",
 *         ".",".",".",".",".",".",".",".",".",".","."}
 * 
 *         Returns: { ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".",
 *         ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".",
 *         ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".",
 *         ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "." }
 * 
 *         5)
 * 
 * 
 *         {"XXX", "XXX"}
 * 
 *         Returns: { "...", "..." }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 200 Round 1 - Division
 *         II, Level Two
 */

public class GravityBomb {
	static char X = 'X';
	static char DOT = '.';

	private String[] sum(String[] board) {
		String[] other;
		String xs = copyChars(board, X);
		String dots = copyChars(board, DOT);

		other = initOther(board, dots);

		String total = "";
		boolean isSum = true;
		int k = board.length - 1;

		for (int i = board.length - 1; i >= 0; i--) {
			isSum = true;
			for (int j = 0; j < board[0].length(); j++) {
				if (board[i].charAt(j) == '.') {
					// It's like zero.
					total += other[k].charAt(j);
				} else if (board[i].charAt(j) == 'X'
						&& other[k].charAt(j) == 'X') {
					isSum = false;
				} else if (board[i].charAt(j) == 'X'
						&& other[k].charAt(j) == '.') {
					total += board[i].charAt(j);
				}
				if (!isSum) {
					total = board[i];
					break;
				}
			}
			if (isSum) {
				other[k] = total;
			} else {
				other[--k] = total;
			}
			total = "";
		}

		while (other[other.length - 1].equals(xs)) {
			other[0] = dots;
			System.arraycopy(other, 0, other, 1, other.length - 1);
		}

		return other;
	}

	private String[] initOther(String[] board, String dots) {
		String[] other = new String[board.length];

		for (int i = 0; i < board.length; i++) {
			other[i] = dots;
		}

		return other;
	}

	private String copyChars(String[] board, char aChar) {
		String string = "";
		for (int j = 0; j < board[0].length(); j++) {
			string += aChar;
		}
		return string;
	}

	public String[] aftermath(String[] board) {
		String[] result = this.sum(board);
		return result;
	}
}
