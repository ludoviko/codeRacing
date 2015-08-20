package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author 
 *
 *
 *
 */

public class Games {

	public int  find(String[] data) {

		int a1, a2, b1, b2;
		int[] team = new int[2];
		int[] team2 = new int[2];
		int c = 0;
		for (int i = 0; i < data.length; i++) {
			team[0] = Integer.parseInt(data[i].split(" ")[0]);
			team[1] = Integer.parseInt(data[i].split(" ")[1]);
          for (int j = 0 ; j < data.length; j++) {
			  team2[0] = Integer.parseInt(data[j].split(" ")[0]);
			  team2[1] = Integer.parseInt(data[j].split(" ")[1]);
			  if (i == j) {
				  continue;
			  }
              if (team[0] == team2[1] ) {
				  c++;
			  }
		  }
		}
		return c;
	}

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

