package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         A guy named Vasya attends the final grade of a high school. One day Vasya decided to watch a match of his favorite hockey team. And, as the boy loves hockey very much, even more than physics, he forgot to do the homework. Specifically, he forgot to complete his physics tasks. Next day the teacher got very angry at Vasya and decided to teach him a lesson. He gave the lazy student a seemingly easy task: You are given an idle body in space and the forces that affect it. The body can be considered as a material point with coordinates (0; 0; 0). Vasya had only to answer whether it is in equilibrium. "Piece of cake" — thought Vasya, we need only to check if the sum of all vectors is equal to 0. So, Vasya began to solve the problem.
 *         But later it turned out that there can be lots and lots of these forces, and Vasya can not cope without your help. Help him.
 *         Write a program that determines whether a body is idle or is moving by the given vectors of forces.
 *         <p/>
 *         Input
 *         The first line contains a positive integer n (1 ≤ n ≤ 100), then follow n lines containing three integers each: the xi coordinate, the yi coordinate and the zi coordinate of the force vector, applied to the body ( - 100 ≤ xi, yi, zi ≤ 100).
 *         <p/>
 *         Output
 *         Print the word "YES" if the body is in equilibrium, or the word "NO" if it is not.
 *         <p/>
 *         Sample test(s)
 *         input
 *         3
 *         4 1 7
 *         -2 4 -1
 *         1 -5 -3
 *         output
 *         NO
 *         input
 *         3
 *         3 -1 7
 *         -5 2 -4
 *         2 -1 -3
 *         output
 *         YES
 */

public class YoungPhysicist {
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		YoungPhysicist main = new YoungPhysicist();

		int n = scanner.nextInt();
		String[] data = new String[n];

		for (int i = 0; i < n; i++) {
			data[i] = scanner.next();
		}

		out.println(main.find(data));

		scanner.reader.close();
		out.close();
	}
	
	public String find(String[] data) {


		int a = 0, b = 0, c = 0;
		for (int i = 0; i < data.length; i++) {
			a += Integer.parseInt(data[i].split(" ")[0]);
			b += Integer.parseInt(data[i].split(" ")[1]);
			c += Integer.parseInt(data[i].split(" ")[2]);
		}

		return (a == 0 && b == 0 && c == 0 ) ? "YES": "NO";
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

	}
}

