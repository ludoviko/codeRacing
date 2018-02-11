package com.lam.coder.topCoder;

public class BrokenChessboard {

    public int minimumFixes(String[] board) {
        char first = board[0].charAt(0);
        char second = board[0].charAt(0) == 'W' ? 'B' : 'W';
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

}
