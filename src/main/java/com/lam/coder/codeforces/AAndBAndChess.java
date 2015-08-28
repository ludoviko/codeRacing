package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         A and B are preparing themselves for programming contests.
 *         <p/>
 *         To train their logical thinking and solve problems better, A and B decided to play chess. During the game A wondered whose position is now stronger.
 *         <p/>
 *         For each chess piece we know its weight:
 *         <p/>
 *         the queen's weight is 9,
 *         the rook's weight is 5,
 *         the bishop's weight is 3,
 *         the knight's weight is 3,
 *         the pawn's weight is 1,
 *         the king's weight isn't considered in evaluating position.
 *         The player's weight equals to the sum of weights of all his pieces on the board.
 *         <p/>
 *         As A doesn't like counting, he asked you to help him determine which player has the larger position weight.
 *         <p/>
 *         Input
 *         The input contains eight lines, eight characters each — the board's description.
 *         <p/>
 *         The white pieces on the board are marked with uppercase letters, the black pieces are marked with lowercase letters.
 *         <p/>
 *         The white pieces are denoted as follows: the queen is represented is 'Q', the rook — as 'R', the bishop — as'B', the knight — as 'N', the pawn — as 'P', the king — as 'K'.
 *         <p/>
 *         The black pieces are denoted as 'q', 'r', 'b', 'n', 'p', 'k', respectively.
 *         <p/>
 *         An empty square of the board is marked as '.' (a dot).
 *         <p/>
 *         It is not guaranteed that the given chess position can be achieved in a real game. Specifically, there can be an arbitrary (possibly zero) number pieces of each type, the king may be under attack and so on.
 *         <p/>
 *         Output
 *         Print "White" (without quotes) if the weight of the position of the white pieces is more than the weight of the position of the black pieces, print "Black" if the weight of the black pieces is more than the weight of the white pieces and print "Draw" if the weights of the white and black pieces are equal.
 *         <p/>
 *         Sample test(s)
 *         input
 *         ...QK...
 *         ........
 *         ........
 *         ........
 *         ........
 *         ........
 *         ........
 *         ...rk...
 *         output
 *         White
 *         input
 *         rnbqkbnr
 *         pppppppp
 *         ........
 *         ........
 *         ........
 *         ........
 *         PPPPPPPP
 *         RNBQKBNR
 *         output
 *         Draw
 *         input
 *         rppppppr
 *         ...k....
 *         ........
 *         ........
 *         ........
 *         ........
 *         K...Q...
 *         ........
 *         output
 *         Black
 *         Note
 *         In the first test sample the weight of the position of the white pieces equals to 9, the weight of the position of the black pieces equals 5.
 *         <p/>
 *         In the second test sample the weights of the positions of the black and the white pieces are equal to 39.
 *         <p/>
 *         In the third test sample the weight of the position of the white pieces equals to 9, the weight of the position of the black pieces equals to 16.
 */

public class AAndBAndChess {

    private static final int N = 8;

    public String find(char[][] data) {

        int black = 0;
        int white = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (data[i][j] != '.') {
                    switch (data[i][j]) {
                        // whites
                        case 'Q':
                            white += 9;
                            break;
                        case 'R':
                            white += 5;
                            break;
                        case 'B':
                            white += 3;
                            break;
                        case 'N':
                            white += 3;
                            break;
                        case 'P':
                            white += 1;
                            break;
                        case 'K':
                            ;
                            break;
                        // blacks
                        case 'q':
                            black += 9;
                            break;
                        case 'r':
                            black += 5;
                            break;
                        case 'b':
                            black += 3;
                            break;
                        case 'n':
                            black += 3;
                            break;
                        case 'p':
                            black += 1;
                            break;
                        case 'k':
                            break;

                    }

                }
            }
        }

        return white > black ? "White" : white < black ? "Black" : "Draw";
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        AAndBAndChess main = new AAndBAndChess();

        char[][] data = new char[N][N];

        for (int i = 0; i < N; i++) {
            String string = scanner.next();
            data[i] = string.toCharArray();
        }

        out.println(main.find(data));

        scanner.reader.close();
        out.close();
    }

    // -----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader reader;

        public MyScanner() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public void close() throws IOException {
            this.reader.close();
        }

        int nextInt() {
            return Integer.parseInt(this.next());
        }

        long nextLong() {
            return Long.parseLong(this.next());
        }

        double nextDouble() {
            return Double.parseDouble(this.next());
        }

        String next() {
            String str = "";
            try {
                str = this.reader.readLine().trim();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        String[] nextStringArray() {
            String[] str = null;
            try {
                str = this.reader.readLine().trim().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextIntArray() {
            String[] data = nextStringArray();
            int[] a = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data = nextStringArray();
            Integer[] a = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data = nextStringArray();
            long[] a = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}

