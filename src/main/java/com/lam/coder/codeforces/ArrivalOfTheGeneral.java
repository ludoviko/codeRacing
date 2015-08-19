package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         A Ministry for Defense sent a general to inspect the Super Secret
 *         Military Squad under the command of the Colonel SuperDuper. Having
 *         learned the news, the colonel ordered to all n squad soldiers to line
 *         up on the parade ground.
 * 
 *         By the military charter the soldiers should stand in the order of
 *         non-increasing of their height. But as there's virtually no time to
 *         do that, the soldiers lined up in the arbitrary order. However, the
 *         general is rather short-sighted and he thinks that the soldiers lined
 *         up correctly if the first soldier in the line has the maximum height
 *         and the last soldier has the minimum height. Please note that the way
 *         other solders are positioned does not matter, including the case when
 *         there are several soldiers whose height is maximum or minimum. Only
 *         the heights of the first and the last soldier are important.
 * 
 *         For example, the general considers the sequence of heights (4, 3, 4,
 *         2, 1, 1) correct and the sequence (4, 3, 1, 2, 2) wrong.
 * 
 *         Within one second the colonel can swap any two neighboring soldiers.
 *         Help him count the minimum time needed to form a line-up which the
 *         general will consider correct.
 * 
 *         Input The first input line contains the only integer n (2 ≤ n ≤ 100)
 *         which represents the number of soldiers in the line. The second line
 *         contains integers a1, a2, ..., an (1 ≤ ai ≤ 100) the values of the
 *         soldiers' heights in the order of soldiers' heights' increasing in
 *         the order from the beginning of the line to its end. The numbers are
 *         space-separated. Numbers a1, a2, ..., an are not necessarily
 *         different.
 * 
 *         Output Print the only integer — the minimum number of seconds the
 *         colonel will need to form a line-up the general will like.
 * 
 *         Sample test(s) input 4 33 44 11 22 output 2 input 7 10 10 58 31 63 40
 *         76 output 10
 *
 */

public class ArrivalOfTheGeneral {

	public int find(String string) {

		int t = 0;

		String[] data = string.split(" ");
		int[] array = new int[data.length];

		for (int i = 0; i < data.length; i++) {
			array[i] = Integer.parseInt(data[i]);
		}

		int smallestIndex = this.smallestIndex(array);

		for (int i = smallestIndex; i < (array.length - 1); i++) {
			this.swap(array, i, i + 1);
			t++;
		}

		int greatestIndex = this.greatestIndex(array);

		for (int i = greatestIndex; i > 0; i--) {
			this.swap(array, i, i - 1);
			t++;
		}

		return t;
	}

	private void swap(int[] array, int i, int j) {
		int x = array[i];
		array[i] = array[j];
		array[j] = x;
	}

	private int smallestIndex(int[] array) {

		int min = 100;
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
				index = i;
			}

		}

		return index;
	}

	private int greatestIndex(int[] array) {

		int max = 0;
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}

		}

		return index;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		ArrivalOfTheGeneral main = new ArrivalOfTheGeneral();

		int n = scanner.nextInt();
		String string = scanner.next();
		out.println(main.find(string));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader	reader;

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

	}
}
