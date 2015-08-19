package com.lam.coder.codeforces;

import java.io.*;

/**
 * 
 * @author LAzuaje
 * 
 *         A. Team
 * 
 *         time limit per test2 seconds memory limit per test256 megabytes input
 *         standard input output standard output
 * 
 *         One day three best friends Petya, Vasya and Tonya decided to form a
 *         team and take part in programming contests. Participants are usually
 *         offered several problems during programming contests. Long before the
 *         start the friends decided that they will implement a problem if at
 *         least two of them are sure about the solution. Otherwise, the friends
 *         won't write the problem's solution.
 * 
 *         This contest offers n problems to the participants. For each problem
 *         we know, which friend is sure about the solution. Help the friends
 *         find the number of problems for which they will write a solution.
 * 
 *         Input The first input line contains a single integer n (1 ≤ n ≤ 1000)
 *         — the number of problems in the contest. Then n lines contain three
 *         integers each, each integer is either 0 or 1. If the first number in
 *         the line equals 1, then Petya is sure about the problem's solution,
 *         otherwise he isn't sure. The second number shows Vasya's view on the
 *         solution, the third number shows Tonya's view. The numbers on the
 *         lines are separated by spaces.
 * 
 *         Output Print a single integer — the number of problems the friends
 *         will implement on the contest.
 * 
 *         Sample test(s) input 3 1 1 0 1 1 1 1 0 0 output 2 input 2 1 0 0 0 1 1
 *         output 1 Note In the first sample Petya and Vasya are sure that they
 *         know how to solve the first problem and all three of them know how to
 *         solve the second problem. That means that they will write solutions
 *         for these problems. Only Petya is sure about the solution for the
 *         third problem, but that isn't enough, so the friends won't take it.
 * 
 *         In the second sample the friends will only implement the second
 *         problem, as Vasya and Tonya are sure about the solution.
 *
 */

public class Team {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		Team main = new Team();

		int n = scanner.nextInt();

		int sum = 0;
		int line = 0;

		String[] strings;

		for (int i = 0; i < n; i++) {
			strings = scanner.next().split(" ");
			line = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1])
					+ Integer.parseInt(strings[2]);
			sum += (line > 1 ? 1 : 0);
		}

		out.println(sum);

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

		public MyScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			reader.close();
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
				str = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}
