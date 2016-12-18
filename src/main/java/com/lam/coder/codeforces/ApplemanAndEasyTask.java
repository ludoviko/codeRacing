package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 462A  Appleman and Easy Task.
 *
 * Used at Codeforces:  #263 Div-2.
 *
 */

public class ApplemanAndEasyTask {
	public static  boolean isSurroundedByEvenOs(char[][] data ) {
	    int c = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                // Check cell on the left.
                if (j == 0) {
                } else {
                    if ( data[i][j-1] == 'o' ) {
                        c++;
                    }
                }
                // Check cell on the right.
                if (j == data.length-1) {
                } else {
                    if ( data[i][j+1] == 'o' ) {
                        c++;
                    }
                }
                // Check cell above.
                if (i == 0) {
                } else {
                    if ( data[i-1][j] == 'o' ) {
                        c++;
                    }
                }
                // Check cell below.
                if (i == data.length-1) {
                } else {
                    if ( data[i+1][j] == 'o' ) {
                        c++;
                    }
                }
                if (c % 2 == 1) {
                  return false;
                }
                c = 0;
            }
        }

        return true;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
		char[][] data = new char[n][n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextCharArray();
        }

        boolean solution = isSurroundedByEvenOs(data);
        if (solution) {
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

		// Chars are read from a string line then converted to an array.
        char[] nextCharArray() {
            String string  = next();
            char[] a  = new char[string.length()];

            for (int i = 0; i < a.length; i++) {
                a[i] = string.charAt(i)  ;
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

