package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author 
 *
 *
 *
 */

public class HammingDistanceSum {
	
    private int find( String a, String b) {
        int sum = 0;
        int k = b.length() - a.length() + 1;

        for (int i = 0; i < k; i++) {
            String subB = b.substring(i, a.length() + i);

            for (int j = 0; j < a.length(); j++) {
                byte  bitA = (byte) (a.charAt(j) - '0');
                byte  bitB = (byte) (subB.charAt(j) - '0');
                sum += bitA ^ bitB;
            }
        }

        return sum;
    }

    public static byte findBit(int n, int position) {
        // Position: Zero based.
        byte i =  (byte) ((n >> position) & 1);
        return i;
    }

    private int find( int a, int b) {
        int sum = 0;
        int k = length(b) - length(a) + 1;

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < length(a); j++) {
                byte  bitA = findBit(a, length(a) - 1 - j);
                byte  bitB = findBit(a, length(a) - 1 - j);
                sum += bitA ^ bitB;
            }
        }

        return sum;
    }

    public static int length(long n) {
        if (n == 0) {
            return 0;
        }
        return  (int) Math.log10(n) + 1;
    }


	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		HammingDistanceSum main = new HammingDistanceSum();

        out.println(main.find(scanner.next(), scanner.next()));

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

