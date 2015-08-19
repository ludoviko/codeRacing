package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 ID: ludovik1
 LANG: JAVA
 TASK: CalfFlac
 */

public class CalfFlac {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn + CalfFlac.class.getSimpleName()
			+ ".in";
	public static final String DataOut = DirOut
			+ CalfFlac.class.getSimpleName() + ".out";

	private String palindrome;
	private String string;
	private int max;

	public CalfFlac() {
	}

	public String[] find(String string) {
		this.string = string;
		this.palindrome = "";
		this.max = 1;

		String data = string.toLowerCase();

		for (int i = 0; i < data.length(); i++) {
			if (data.length() - i - 1 < palindrome.length()) {
				// Optimization, from this point is useless to go on
				// checking
				break;
			}
			if (!isAlpha(data.charAt(i))) {
				continue;
			}
//			for (int j = data.length() - 1; j > i + 1; j--) {
			for (int j = i;  j < data.length(); j++) {
//				if (j - i < palindrome.length()) {
					if (j  < palindrome.length()) {
					// Optimization, from this point is useless to go on
					// checking
					break;
				}
				if (!isAlpha(data.charAt(j))) {
					continue;
				}
				if (isPalindrome(data, i, j + 1)) {
//					if ( j + 1  - i >= 1900 ) {
//					//	System.out.println(j + 1  - i);
//						break exit;
//					}
				}
			}
		}
		return new String[] { max + "", palindrome };
	}

	public boolean isPalindrome(String data, int from, int upTo) {
		int half_len = (upTo - from) / 2 + from;
		int i = from;
		int j = 0;
		int x = 0;

		for (; (i < half_len && i < (upTo - j - 1))
				|| (j < half_len && i < (upTo - j - 1));) {
			while (!isAlpha(data.charAt(i))) {
				i++;
				x++;
			}
			while (!isAlpha(data.charAt(upTo - j - 1))) {
				j++;
				x++;
			}
			if (data.charAt(i) == data.charAt(upTo - j - 1)) {
				i++;
				j++;
			} else {
				return false;
			}
		//	System.out.println(" i/j  " + i + " / " + j + " f/u " + from + " / " + upTo);

		}

//		int v = data.substring(from, upTo).replaceAll("[^a-zA-Z]", "").length();
		int v = upTo - from - x;
		if (v > this.max) {
			v = data.substring(from, upTo).replaceAll("[^a-zA-Z]", "").length();
		}

		if (v > this.max) {
			this.max = v;
			this.palindrome = this.string.substring(from, upTo);
//			System.out.println("Max: " + this.max);
//			System.out.println("palindrome: " + palindrome);
		}
		return true;
	}

	private static boolean isAlpha(char a) {
		if (a >= 'a' && a <= 'z')
			return true;
		if (a >= 'A' && a <= 'Z')
			return true;
		return false;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));
		StringBuilder builder = new StringBuilder();
		String aux;

		while ((aux = reader.readLine()) != null) {
			builder.append(aux);
			builder.append(System.getProperty("line.separator"));
		}

		CalfFlac pali = new CalfFlac();
		String[] dataOut = pali.find(builder.toString());

		for (String data : dataOut) {
			out.println(data);
		}

		out.close();
		reader.close();
		System.exit(0);
	}
}
