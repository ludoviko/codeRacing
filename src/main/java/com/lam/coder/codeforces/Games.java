package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *
 * Manao works on a sports TV. He's spent much time watching the football games of some country. After a while he began to notice different patterns. For example, each team has two sets of uniforms: home uniform and guest uniform. When a team plays a game at home, the players put on the home uniform. When a team plays as a guest on somebody else's stadium, the players put on the guest uniform. The only exception to that rule is: when the home uniform color of the host team matches the guests' uniform, the host team puts on its guest uniform as well. For each team the color of the home and guest uniform is different.
 *         <p/>
 *         There are n teams taking part in the national championship. The championship consists of n·(n - 1) games: each team invites each other team to its stadium. At this point Manao wondered: how many times during the championship is a host team going to put on the guest uniform? Note that the order of the games does not affect this number.
 *         <p/>
 *         You know the colors of the home and guest uniform for each team. For simplicity, the colors are numbered by integers in such a way that no two distinct colors have the same number. Help Manao find the answer to his question.
 *         <p/>
 *         Input
 *         The first line contains an integer n (2 ≤ n ≤ 30). Each of the following n lines contains a pair of distinct space-separated integers hi, ai (1 ≤ hi, ai ≤ 100) — the colors of the i-th team's home and guest uniforms, respectively.
 *         <p/>
 *         Output
 *         In a single line print the number of games where the host team is going to play in the guest uniform.
 *         <p/>
 *         Sample test(s)
 *         input
 *         3
 *         1 2
 *         2 4
 *         3 4
 *         output
 *         1
 *         input
 *         4
 *         100 42
 *         42 100
 *         5 42
 *         100 5
 *         output
 *         5
 *         input
 *         2
 *         1 2
 *         1 2
 *         output
 *         0
 *         Note
 *         In the first test case the championship consists of 6 games. The only game with the event in question is the game between teams 2 and 1 on the stadium of team 2.
 *         <p/>
 *         In the second test sample the host team will have to wear guest uniform in the games between teams: 1 and 2, 2 and 1, 2 and 3, 3 and 4, 4 and 2 (the host team is written first).
 */

public class Games {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		Games main = new Games();

		int n = scanner.nextInt();
		String[] data = new String[n];

		for (int i = 0; i < n; i++) {
			data[i] = scanner.next();
		}

		out.println(main.find(data));

		scanner.reader.close();
		out.close();
	}

	public int find(String[] data) {

		int a1, a2, b1, b2;
		int[] team = new int[2];
		int[] team2 = new int[2];
		int c = 0;
		for (int i = 0; i < data.length; i++) {
			team[0] = Integer.parseInt(data[i].split(" ")[0]);
			team[1] = Integer.parseInt(data[i].split(" ")[1]);
			for (int j = 0; j < data.length; j++) {
				team2[0] = Integer.parseInt(data[j].split(" ")[0]);
				team2[1] = Integer.parseInt(data[j].split(" ")[1]);
				if (i == j) {
					continue;
				}
				if (team[0] == team2[1]) {
					c++;
				}
			}
		}
		return c;
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

