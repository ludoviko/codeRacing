package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Solution by: L.Azuaje.
 *
 * Codeforces:  Технокубок 2017 - Отборочный Раунд 1.
 * A. Превращение: из A в B.
 *
 */

public class TransformationFromAToB {
		public static List<Integer> find(int a, int b) {
        List<Integer> list = new LinkedList<Integer>();

        int bx = b;
        list.add(bx);

        while ( bx > a ) {
            if (bx % 2 == 0) {
                bx /= 2;
            } else if (bx % 10 == 1) {
                bx /= 10;
            } else {
                break;
            }
            list.add(0, bx);
        }

        if (  list.get(0) != a ) {
            list.clear();
        }

        return list;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int[] data = scanner.nextIntArray();

        List<Integer> list = find(data[0], data[1]);

		if (list.isEmpty()) {
            out.println("NO");
        } else {
            out.println("YES");
            out.println(list.size());
            for (Integer n : list) {
                out.print(n + " ");
            }
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

