package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author LAzuaje
 * 
 *         A. Watching a movie time limit per test1 second memory limit per
 *         test256 megabytes inputstandard input outputstandard output You have
 *         decided to watch the best moments of some movie. There are two
 *         buttons on your player:
 * 
 *         Watch the current minute of the movie. By pressing this button, you
 *         watch the current minute of the movie and the player automatically
 *         proceeds to the next minute of the movie. Skip exactly x minutes of
 *         the movie (x is some fixed positive integer). If the player is now at
 *         the t-th minute of the movie, then as a result of pressing this
 *         button, it proceeds to the minute (t + x). Initially the movie is
 *         turned on in the player on the first minute, and you want to watch
 *         exactly n best moments of the movie, the i-th best moment starts at
 *         the li-th minute and ends at the ri-th minute (more formally, the
 *         i-th best moment consists of minutes: li, li + 1, ..., ri).
 * 
 *         Determine, what is the minimum number of minutes of the movie you
 *         have to watch if you want to watch all the best moments?
 * 
 *         Input The first line contains two space-separated integers n, x
 *         (1 ≤ n ≤ 50, 1 ≤ x ≤ 105) — the number of the best moments of the
 *         movie and the value of x for the second button.
 * 
 *         The following n lines contain the descriptions of the best moments of
 *         the movie, the i-th line of the description contains two integers
 *         separated by a space li, ri (1 ≤ li ≤ ri ≤ 105).
 * 
 *         It is guaranteed that for all integers i from 2 to n the following
 *         condition holds: ri - 1 < li.
 * 
 *         Output Output a single number — the answer to the problem.
 * 
 *         Sample test(s) input 2 3 5 6 10 12 output 6 input 1 1 1 100000 output
 *         100000 Note In the first sample, the player was initially standing on
 *         the first minute. As the minutes from the 1-st to the 4-th one don't
 *         contain interesting moments, we press the second button. Now we can
 *         not press the second button and skip 3 more minutes, because some of
 *         them contain interesting moments. Therefore, we watch the movie from
 *         the 4-th to the 6-th minute, after that the current time is 7.
 *         Similarly, we again skip 3 minutes and then watch from the 10-th to
 *         the 12-th minute of the movie. In total, we watch 6 minutes of the
 *         movie.
 * 
 *         In the second sample, the movie is very interesting, so you'll have
 *         to watch all 100000 minutes of the movie.
 *
 */

public class WatchingAMovie {

	public int find(int skip, List<Integer> bestMoments) {
		Collections.sort(bestMoments);

		int p = 1;
		int c = 0;

		while (!bestMoments.isEmpty()) {
			if (contains(p + skip, bestMoments)) {
				if (bestMoments.get(0) >= p && bestMoments.get(1) >= p) {
					c += bestMoments.get(0) - p;
					c += bestMoments.get(1) - bestMoments.get(0) + 1;

					p = bestMoments.get(1) + 1;

					bestMoments.remove(0);
					bestMoments.remove(0);
				} else {
					c++;
					p++;
				}
			} else {
				p += skip;
			}
		}

		return c;
	}

	private boolean contains(int p, List<Integer> bestMoments) {
		boolean r = false;

		for (Integer i : bestMoments) {
			if (p > i) {
				r = true;
			}
		}

		return r;
	}

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out;
		out = new PrintWriter(new BufferedOutputStream(System.out));

		String line = sc.next();

		String[] data = line.split(" ");
		int n = Integer.parseInt(data[0]);
		int skip = Integer.parseInt(data[1]);

		List<Integer> list = new ArrayList<Integer>();

		int i = 0;

		while (i++ < n) {
			line = sc.next();
			data = line.split(" ");
			list.add(Integer.parseInt(data[0]));
			list.add(Integer.parseInt(data[1]));
		}

		WatchingAMovie w = new WatchingAMovie();

		int result = w.find(skip, list);

		out.println(result);

		try {
			sc.br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		out.close();
	}

	public static class MyScanner {
		BufferedReader br;

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
}
