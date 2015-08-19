package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 * 
 *         Little Petya very much likes gifts. Recently he has received a new
 *         laptop as a New Year gift from his mother. He immediately decided to
 *         give it to somebody else as what can be more pleasant than giving
 *         somebody gifts. And on this occasion he organized a New Year party at
 *         his place and invited n his friends there.
 * 
 *         If there's one thing Petya likes more that receiving gifts, that's
 *         watching others giving gifts to somebody else. Thus, he safely hid
 *         the laptop until the next New Year and made up his mind to watch his
 *         friends exchanging gifts while he does not participate in the
 *         process. He numbered all his friends with integers from 1 to n. Petya
 *         remembered that a friend number i gave a gift to a friend number pi.
 *         He also remembered that each of his friends received exactly one
 *         gift.
 * 
 *         Now Petya wants to know for each friend i the number of a friend who
 *         has given him a gift.
 * 
 *         Input The first line contains one integer n (1 ≤ n ≤ 100) — the
 *         quantity of friends Petya invited to the party. The second line
 *         contains n space-separated integers: the i-th number is pi — the
 *         number of a friend who gave a gift to friend number i. It is
 *         guaranteed that each friend received exactly one gift. It is possible
 *         that some friends do not share Petya's ideas of giving gifts to
 *         somebody else. Those friends gave the gifts to themselves.
 * 
 *         Output Print n space-separated integers: the i-th number should equal
 *         the number of the friend who gave a gift to friend number i.
 * 
 *         Sample test(s) input 4 2 3 4 1 output 4 1 2 3 input 3 1 3 2 output 1
 *         3 2 input 2 1 2 output 1 2
 * 
 *
 */

public class Presents {

	public String find(String string) {
		String f = "";

		String[] d = string.split(" ");

		String[] data = new String[d.length + 1];
		int[] from = new int[d.length + 1];

		for (int i = 0; i < d.length; i++) {
			data[i + 1] = d[i];
		}

		for (int i = 1; i < data.length; i++) {
			from[Integer.parseInt(data[i])] = i;
		}

		for (int i = 1; i < from.length; i++) {
			f += from[i] + " ";
		}

		return f.trim();
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		Presents main = new Presents();

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
