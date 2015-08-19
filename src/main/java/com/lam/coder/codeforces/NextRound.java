package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * @author LAzuaje
 * 
 *         A. Next Round time limit per test3 seconds memory limit per test256
 *         megabytes inputstandard input outputstandard output
 *         "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..."
 *         — an excerpt from contest rules.
 * 
 *         A total of n participants took part in the contest (n ≥ k), and you
 *         already know their scores. Calculate how many participants will
 *         advance to the next round.
 * 
 *         Input The first line of the input contains two integers n and k
 *         (1 ≤ k ≤ n ≤ 50) separated by a single space.
 * 
 *         The second line contains n space-separated integers a1, a2, ..., an
 *         (0 ≤ ai ≤ 100), where ai is the score earned by the participant who
 *         got the i-th place. The given sequence is non-increasing (that is,
 *         for all i from 1 to n - 1 the following condition is fulfilled:
 *         ai ≥ ai + 1).
 * 
 *         Output Output the number of participants who advance to the next
 *         round.
 * 
 *         Sample test(s) input 8 5 10 9 8 7 7 7 5 5 output 6 input 4 2 0 0 0 0
 *         output 0 Note In the first example the participant on the 5th place
 *         earned 7 points. As the participant on the 6th place also earned 7
 *         points, there are 6 advancers.
 * 
 *         In the second example nobody got a positive score.
 * 
 * 
 *
 */

public class NextRound {

	public int find(int threshold, int[] array) {
		int c = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= threshold && array[i] > 0) {
				c++;
			}
		}

		return c;
	}

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		String[] data = sc.next().split(" ");

		int a = new Integer(data[1]);

		data = sc.next().split(" ");

		int[] array = new int[data.length];

		int i = 0;
		for (String d : data) {
			array[i++] = new Integer(d);
		}

		NextRound round = new NextRound();
		out.println(round.find(array[a - 1], array));

		try {
			sc.br.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class MyScanner {
		BufferedReader	br;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static PrintWriter	out;
}
