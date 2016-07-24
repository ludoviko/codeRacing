package com.lam.coder.uva;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// Uva Code: 10189

public class MineSweeper {
	public String[] find(String[] data) {

		char[][] array = new char[data.length][data[0].length()];
		String[] r = new String[data.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = data[i].replace('.', '0');
			for (int j = 0; j < data[0].length(); j++) {
				array[i][j] = data[i].charAt(j);
			}
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length(); j++) {
				if (array[i][j] == '*') {
					this.checkPosEst(i, j, array);
					this.checkPosWest(i, j, array);
					this.checkPosNorth(i, j, array);
					this.checkPosSouth(i, j, array);
					this.checkPosNW(i, j, array);
					this.checkPosNE(i, j, array);
					this.checkPosSW(i, j, array);
					this.checkPosSE(i, j, array);
				} else {
				}
			}

		}

		for (int i = 0; i < data.length; i++) {
			r[i] = new String(array[i]);
		}

		return r;
	}

	private void checkPosEst(int i, int j, char[][] array) {
		char n;

		if (j == 0) {
		} else if (Character.isDigit(array[i][j - 1])) {
			n = (char) (array[i][j - 1] + 1);
			array[i][j - 1] = n;
		}
	}

	private void checkPosWest(int i, int j, char[][] array) {
		char n;

		if (j == array[0].length - 1) {
		} else if (Character.isDigit(array[i][j + 1])) {
			n = (char) (array[i][j + 1] + 1);
			array[i][j + 1] = n;
		}
	}

	private void checkPosNorth(int i, int j, char[][] array) {
		char n;

		if (i == 0) {
		} else if (Character.isDigit(array[i - 1][j])) {
			n = (char) (array[i - 1][j] + 1);
			array[i - 1][j] = n;
		}
	}

	private void checkPosNW(int i, int j, char[][] array) {
		char n;

		if (i == 0 || j == 0) {
		} else if (Character.isDigit(array[i - 1][j - 1])) {
			n = (char) (array[i - 1][j - 1] + 1);
			array[i - 1][j - 1] = n;
		}
	}

	private void checkPosNE(int i, int j, char[][] array) {
		char n;

		if (i == 0 || j == array[0].length - 1) {
		} else if (Character.isDigit(array[i - 1][j + 1])) {
			n = (char) (array[i - 1][j + 1] + 1);
			array[i - 1][j + 1] = n;
		}
	}

	private void checkPosSE(int i, int j, char[][] array) {
		char n;

		if (i == array.length - 1 || j == array[0].length - 1) {
		} else if (Character.isDigit(array[i + 1][j + 1])) {
			n = (char) (array[i + 1][j + 1] + 1);
			array[i + 1][j + 1] = n;
		}
	}

	private void checkPosSW(int i, int j, char[][] array) {
		char n;

		if (i == array.length - 1 || j == 0) {
		} else if (Character.isDigit(array[i + 1][j - 1])) {
			n = (char) (array[i + 1][j - 1] + 1);
			array[i + 1][j - 1] = n;
		}
	}

	private void checkPosSouth(int i, int j, char[][] array) {
		char n;

		if (i == array.length - 1) {
		} else if (Character.isDigit(array[i + 1][j])) {
			n = (char) (array[i + 1][j] + 1);
			array[i + 1][j] = n;
		}
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		MineSweeper main = new MineSweeper();
		String data[] = null;

		int n;
		int j = 1;

		while ((n = Integer.parseInt(scanner.nextStringArray()[0])) != 0) {
			data = new String[n];
			for (int i = 0; i < n; i++) {
				data[i] = scanner.next();
			}
			out.println("Field #" + j++ + ":");
			for (String string : main.find(data)) {
				out.println(string);
			}
			out.println();
		}
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
				str = this.reader.readLine();
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
