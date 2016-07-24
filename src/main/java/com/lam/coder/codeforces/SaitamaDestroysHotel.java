package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author 
 *
 *
 *
 */

public class SaitamaDestroysHotel {
	
	public int find(int topFloor, String[] data) {

        for (int i = 0; i < data.length; i++) {
            String floor = data[0].split(" ")[0];
            floor = String.format("%04d", Integer.parseInt(floor));
        }

        Arrays.sort(data, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        int previous =  topFloor;
        int time = 0;

        for (String s : data) {
            int currentFloor = Integer.parseInt(s.split(" ")[0]);
            int arrivalTime = Integer.parseInt(s.split(" ")[1]);

            time += previous - currentFloor;
            previous = currentFloor;
            if (arrivalTime > time) {
                time = arrivalTime;
            }

        }

        if (previous != 0) {
            time += previous;
        }

       return time;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		SaitamaDestroysHotel main = new SaitamaDestroysHotel();
		
		String string = scanner.next();

        int n = Integer.parseInt(string.split(" ")[0]);
        int top = Integer.parseInt(string.split(" ")[1]);

        String[] data  = new String[n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.next();
        }

		out.println(main.find(top, data));

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

