package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 754B   	Ilya and tic-tac-toe game.
 *
 * Used at Codeforces: #390 Div-2.
 *
 */

public class IlyaAndTicTacToeGame {

    public static boolean findDiagonal2(char[][] data, int i, int j) {
        boolean xWins = false;
        if ((data[i][j] == '.' || data[i][j] == 'x') &&
                ( data[i + 1][j - 1] == 'x') &&
                ( data[i + 2][j - 2] == 'x')) {
            xWins = true;
        }

        if (( data[i][j] == 'x') &&
                (data[i + 1][j - 1] == '.' || data[i + 1][j - 1] == 'x') &&
                ( data[i + 2][j - 2] == 'x')) {
            xWins = true;
        }

        if (( data[i][j] == 'x') &&
                ( data[i + 1][j - 1] == 'x') &&
                (data[i + 2][j - 2] == '.' || data[i + 2][j - 2] == 'x')) {
            xWins = true;
        }
        return xWins;
    }

    public static boolean findDiagonal(char[][] data, int i, int j) {
        boolean xWins = false;
        if ((data[i][j] == '.' || data[i][j] == 'x') &&
                ( data[i + 1][j + 1] == 'x') &&
                ( data[i + 2][j + 2] == 'x')) {
            xWins = true;
        }

        if (( data[i][j] == 'x') &&
                (data[i + 1][j + 1] == '.' || data[i + 1][j + 1] == 'x') &&
                ( data[i + 2][j + 2] == 'x')) {
            xWins = true;
        }

        if (( data[i][j] == 'x') &&
                ( data[i + 1][j + 1] == 'x') &&
                (data[i + 2][j + 2] == '.' || data[i + 2][j + 2] == 'x')) {
            xWins = true;
        }
        return xWins;
    }

    public static boolean find(char[][] data) {
        boolean xWins = false;

        outbreak:
        for (int i = 0; i < data[0].length; i++) {
            // Search horizontally.
            for (int j = 0; j < 2; j++) {
                if ((data[i][j] == '.' || data[i][j] == 'x') &&
                        ( data[i][j + 1] == 'x') &&
                        ( data[i][j + 2] == 'x')) {
                    xWins = true;
                    break outbreak;
                }
            }

            // Search horizontally.
            for (int j = 0; j < 2; j++) {
                if (( data[i][j] == 'x') &&
                        (data[i][j + 1] == '.' || data[i][j + 1] == 'x') &&
                        (data[i][j + 2] == 'x')) {
                    xWins = true;
                    break outbreak;
                }
            }

            // Search horizontally.
            for (int j = 0; j < 2; j++) {
                if (( data[i][j] == 'x') &&
                        ( data[i][j + 1] == 'x') &&
                        (data[i][j + 2] == '.' || data[i][j + 2] == 'x')) {
                    xWins = true;
                    break outbreak;
                }
            }
        }

        outbreak2:
        for (int i = 0; i < data[0].length; i++) {
            // Search vertically
            for (int j = 0; j < 2; j++) {
                if ((data[j][i] == '.' || data[j][i] == 'x') &&
                        ( data[j + 1][i] == 'x') &&
                        ( data[j + 2][i] == 'x')) {
                    xWins = true;
                    break outbreak2;
                }
            }
            // Search vertically
            for (int j = 0; j < 2; j++) {
                if (( data[j][i] == 'x') &&
                        (data[j + 1][i] == '.' || data[j + 1][i] == 'x') &&
                        ( data[j + 2][i] == 'x')) {
                    xWins = true;
                    break outbreak2;
                }
            }
            // Search vertically
            for (int j = 0; j < 2; j++) {
                if (( data[j][i] == 'x') &&
                        ( data[j + 1][i] == 'x') &&
                        (data[j + 2][i] == '.' || data[j + 2][i] == 'x')) {
                    xWins = true;
                    break outbreak2;
                }
            }
        }

        if (!xWins) {
            xWins = findDiagonal(data, 0, 1);
        }
        if (!xWins) {
            xWins = findDiagonal(data, 0, 0);
        }
        if (!xWins) {
            xWins = findDiagonal(data, 1, 1);
        }
        if (!xWins) {
            xWins = findDiagonal(data, 1, 0);
        }

        if (!xWins) {
            xWins = findDiagonal2(data, 0, 2);
        }
        if (!xWins) {
            xWins = findDiagonal2(data, 0, 3);
        }
        if (!xWins) {
            xWins = findDiagonal2(data, 1, 2);
        }
        if (!xWins) {
            xWins = findDiagonal2(data, 1, 3);
        }

        return xWins;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        char[][] data = new char[4][4];
        String string;

        for (int i = 0; i < 4; i++) {
            string = scanner.next();
            data[i] = string.toCharArray();
        }

        if (find(data)) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        scanner.close();
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
			String[] data  = nextStringArray();
			int[] a  = new int[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		Integer[] nextIntegerArray() {
			String[] data  = nextStringArray();
			Integer[] a  = new Integer[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		long[] nextLongArray() {
			String[] data  = nextStringArray();
			long[] a  = new long[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Long.parseLong(data[i]);
			}

			return a;
		}
	}
}

