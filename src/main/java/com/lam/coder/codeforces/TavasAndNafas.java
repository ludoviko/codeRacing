package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 535A  Tavas and Nafas.
 *
 * Used at Codeforces:  #299 Div-2.
 *
 */

public class TavasAndNafas {
    private int n;

    public TavasAndNafas(int n)  {
        this.n = n;
    }

	public String findUnits(int unit) {
        String word = "";
        switch (unit) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
             default:
                word= "unknown";
        }
        return word;
	}

    public String findTens(int tens) {
        String word = "";
        switch (tens) {
//            case 1:
//                word = "ten";
//                break;
            case 2:
                word = "twenty";
                break;
            case 3:
                word = "thirty";
                break;
            case 4:
                word = "forty";
                break;
            case 5:
                word = "fifty";
                break;
            case 6:
                word = "sixty";
                break;
            case 7:
                word = "seventy";
                break;
            case 8:
                word = "eighty";
                break;
            case 9:
                word = "ninety";
                break;
            default:
                word= "unknown";
        }

        return word;
    }

    public String findBetween10And19(int number) {
        String word = "";
        switch (number) {
            case 10:
                word = "ten";
                break;
            case 11:
                word = "eleven";
                break;
            case 12:
                word = "twelve";
                break;
            case 13:
                word = "thirteen";
                break;
            case 14:
                word = "fourteen";
                break;
            case 15:
                word = "fifteen";
                break;
            case 16:
                word = "sixteen";
                break;
            case 17:
                word = "seventeen";
                break;
            case 18:
                word = "eighteen";
                break;
            case 19:
                word = "nineteen";
                break;
            default:
                word= "unknown";
        }

        return word;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
        TavasAndNafas main = new TavasAndNafas(n);

        String solution;

        if (n >= 10 && n <= 19 ) {
            solution = main.findBetween10And19(n);
        } else {
            int units = n % 10;
            int tens = n / 10;
            if (n < 10 ) {
                solution = main.findUnits(n);
            } else {
                if ( n % 10 == 0 ) {
                    solution = main.findTens(tens);
                } else {
                    solution = main.findTens(tens) + "-" + main.findUnits(units);
                }
            }
        }

		out.println(solution);

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

