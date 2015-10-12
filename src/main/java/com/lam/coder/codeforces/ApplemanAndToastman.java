package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author 
 *
 *
 *
 */

public class ApplemanAndToastman {

    private int sum;

	public int find(Integer[] data) {
        Arrays.sort(data);
        List<Integer> list = Arrays.asList(data);

		return find(list);
	}

    private int find(List<Integer> list) {
        int sum = 0;
        List<Integer> subList;

        sum +=  sum(list);

        while (  list.size() > 1) {
            subList = list.subList(0, 1);
            list = list.subList(1, list.size());
            sum +=  sum(subList);
            sum +=  sum(list);
        }

        return sum;
    }

    private Integer  sum(List<Integer> list) {
        int sum  = 0;
        for (int i : list) {
            sum+= i;
        }

        return sum;
    }

   // 1 2 2 2 4 5 6 7 8 10: 376

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		ApplemanAndToastman main = new ApplemanAndToastman();

        scanner.next();
		out.println(main.find(scanner.nextIntegerArray()));

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

