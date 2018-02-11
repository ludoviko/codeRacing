package com.lam.coder.topCoder;

public class BrokenChessboard {

    private int count(String[] board, char first, char second) {
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if ((j + i) % 2 == 0) {
                    if (board[i].charAt(j) != first) {
                        count++;
                    }
                } else {
                    if (board[i].charAt(j) != second) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public int minimumFixes(String[] board) {
        int c1 = this.count(board, 'B', 'W');
        int c2 = this.count(board, 'W', 'B');

        return Math.min(c1, c2);
    }
}
