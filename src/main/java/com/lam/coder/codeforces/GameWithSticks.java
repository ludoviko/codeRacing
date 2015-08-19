package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         After winning gold and silver in IOI 2014, Akshat and Malvika want to
 *         have some fun. Now they are playing a game on a grid made of n
 *         horizontal and m vertical sticks.
 * 
 *         An intersection point is any point on the grid which is formed by the
 *         intersection of one horizontal stick and one vertical stick.
 * 
 *         In the grid shown below, n = 3 and m = 3. There are n + m = 6 sticks
 *         in total (horizontal sticks are shown in red and vertical sticks are
 *         shown in green). There are n·m = 9 intersection points, numbered from
 *         1 to 9.
 * 
 * 
 *         The rules of the game are very simple. The players move in turns.
 *         Akshat won gold, so he makes the first move. During his/her move, a
 *         player must choose any remaining intersection point and remove from
 *         the grid all sticks which pass through this point. A player will lose
 *         the game if he/she cannot make a move (i.e. there are no intersection
 *         points remaining on the grid at his/her move).
 * 
 *         Assume that both players play optimally. Who will win the game?
 * 
 *         Input The first line of input contains two space-separated integers,
 *         n and m (1 ≤ n, m ≤ 100).
 * 
 *         Output Print a single line containing "Akshat" or "Malvika" (without
 *         the quotes), depending on the winner of the game.
 * 
 *         Sample test(s) input 2 2 output Malvika input 2 3 output Malvika
 *         input 3 3 output Akshat
 *
 */

public class GameWithSticks {

	public String find(String string) {

		String[] data = string.split(" ");

		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);

		int i = 0;

		while (a > 0 && b > 0) {
			a--;
			b--;
			i++;
		}

		return i % 2 == 0 ? "Malvika" : "Akshat";
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		GameWithSticks main = new GameWithSticks();

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
