package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 456A  Laptops.
 *
 * Used at Codeforces: #260 Div-2.
 *
 */

public class Laptops {
	public static void main(String[] args) throws IOException {
        Laptops laptops = new Laptops();
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
        List<PriceQuality> list = new ArrayList<PriceQuality>();

        int[] data;
        PriceQuality price;

        for (int i = 0; i < n; i++) {
            data = scanner.nextIntArray();
            price = laptops.new PriceQuality(data[0], data[1]);
            list.add(price);
        }

        Collections.sort(list);
        Set<Double> set = new HashSet<Double>();

        for ( PriceQuality pq : list ) {
            set.add(pq.rate);
        }

        if (set.size() == 1) {
            out.println("Poor Alex");
        } else {
            out.println("Happy Alex");
        }

		scanner.close();
		out.close();
	}

    public class PriceQuality implements Comparable {
        int price;
        int quality;
        Double rate;

        public String toString() {
            return price + ", " + quality;
        }

        public PriceQuality(int price, int quality) {
            this.price = price;
            this.quality = quality;
            this.rate =  new Double( this.quality )/ new Double (this.price);
        }

        @Override
        public int compareTo(Object o2) {
            if (this.rate >  ((PriceQuality)o2).rate) {
                return -1;
            } else if  (this.rate <  ((PriceQuality)o2).rate) {
                return 1;
            } else {
                return 0;
            }
        }
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

