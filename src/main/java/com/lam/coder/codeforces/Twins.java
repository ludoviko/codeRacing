package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * 
 * @author L.Azuaje.
 *
 *         Imagine that you have a twin brother or sister. Having another person
 *         that looks exactly like you seems very unusual. It's hard to say if
 *         having something of an alter ego is good or bad. And if you do have a
 *         twin, then you very well know what it's like.
 * 
 *         Now let's imagine a typical morning in your family. You haven't woken
 *         up yet, and Mom is already going to work. She has been so hasty that
 *         she has nearly forgotten to leave the two of her darling children
 *         some money to buy lunches in the school cafeteria. She fished in the
 *         purse and found some number of coins, or to be exact, n coins of
 *         arbitrary values a1, a2, ..., an. But as Mom was running out of time,
 *         she didn't split the coins for you two. So she scribbled a note
 *         asking you to split the money equally.
 * 
 *         As you woke up, you found Mom's coins and read her note.
 *         "But why split the money equally?" — you thought. After all, your
 *         twin is sleeping and he won't know anything. So you decided to act
 *         like that: pick for yourself some subset of coins so that the sum of
 *         values of your coins is strictly larger than the sum of values of the
 *         remaining coins that your twin will have. However, you correctly
 *         thought that if you take too many coins, the twin will suspect the
 *         deception. So, you've decided to stick to the following strategy to
 *         avoid suspicions: you take the minimum number of coins, whose sum of
 *         values is strictly more than the sum of values of the remaining
 *         coins. On this basis, determine what minimum number of coins you need
 *         to take to divide them in the described manner.
 * 
 *         Input The first line contains integer n (1 ≤ n ≤ 100) — the number of
 *         coins. The second line contains a sequence of n integers a1, a2, ...,
 *         an (1 ≤ ai ≤ 100) — the coins' values. All numbers are separated with
 *         spaces.
 * 
 *         Output In the single line print the single number — the minimum
 *         needed number of coins.
 * 
 *         Sample test(s)
 * 
 *         input 2 3 3 output 2 input 3 2 1 2 output 2 Note In the first sample
 *         you will have to take 2 coins (you and your twin have sums equal to
 *         6, 0 correspondingly). If you take 1 coin, you get sums 3, 3. If you
 *         take 0 coins, you get sums 0, 6. Those variants do not satisfy you as
 *         your sum should be strictly more that your twins' sum.
 * 
 *         In the second sample one coin isn't enough for us, too. You can pick
 *         coins with values 1, 2 or 2, 2. In any case, the minimum number of
 *         coins equals 2.
 */

public class Twins {

	public int find(String string) {

		String[] data = string.split("\\s");

		int[] coins = new int[data.length];

		int i = 0;
		for (String d : data) {
			coins[i++] = Integer.parseInt(d);
		}

		Arrays.sort(coins);
		int money = 0;
		for (int coin : coins) {
			money += coin;
		}

		int mine = 0;
		int c = 0;
		for (i = coins.length - 1; i >= 0; i--) {
			mine += coins[i];
			c++;
			if (mine > (money - mine)) {
				break;
			}
		}

		return c;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		Twins twins = new Twins();

		int n = scanner.nextInt();
		String string = scanner.next();

		out.println(twins.find(string));

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
