package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 
 *
 *
 *
 */

public class TheTextSplitting {
	
	public List<String>  find(int[] array, String string) {

        List<String> list = new ArrayList<String>();

        if (array[0] == array[1] + array[2]) {
            list.add("2");
            list.add(string.substring(0, array[1]));
            list.add(string.substring(array[1]));
       } else   if ( array[0] % array[1] == 0 ) {
                list.add("" + array[0] / array[1]);
                for (int i = 0; i < array[0] / array[1]; i++) {
                    list.add(string.substring(array[1] * i, (i + 1) * array[1]));
                }
        } else if  ( array[0] % array[2] == 0 ) {
                list.add("" + array[0] / array[2]);
                for (int i = 0; i < array[0] / array[2]; i++) {
                    list.add(string.substring(array[2] * i,(i + 1)* array[2]));
                }
        } else {
                list.add("-1");
        }

        return list;
	}


	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		TheTextSplitting main = new TheTextSplitting();
		
		int[] n = scanner.nextIntArray();
		String string = scanner.next();

		List<String> data = main.find(n, string);

        for (String line : data) {
            out.println(line);
        }

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

