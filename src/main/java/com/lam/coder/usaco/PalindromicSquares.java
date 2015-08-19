package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Palindromic Squares Rob Kolstad
 * 
 *         Palindromes are numbers that read the same forwards as backwards. The
 *         number 12321 is a typical palindrome.
 * 
 *         Given a number base B (2 <= B <= 20 base 10), print all the integers
 *         N (1 <= N <= 300 base 10) such that the square of N is palindromic
 *         when expressed in base B; also print the value of that palindromic
 *         square. Use the letters 'A', 'B', and so on to represent the digits
 *         10, 11, and so on.
 * 
 *         Print both the number and its square in base B. PROGRAM NAME:
 *         palsquare INPUT FORMAT A single line with B, the base (specified in
 *         base 10). SAMPLE INPUT (file palsquare.in)
 * 
 *         10
 * 
 *         OUTPUT FORMAT Lines with two integers represented in base B. The
 *         first integer is the number whose square is palindromic; the second
 *         integer is the square itself. SAMPLE OUTPUT (file palsquare.out)
 * 
 *         1 1 2 4 3 9 11 121 22 484 26 676 101 10201 111 12321 121 14641 202
 *         40804 212 44944 264 69696
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: PalindromicSquares
 */

public class PalindromicSquares {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn
			+ PalindromicSquares.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ PalindromicSquares.class.getSimpleName() + ".out";

	private int base;

	private Map<String, String> numbers;

	public static final int UP_TO = 300;

	private List<String> keys;

	public PalindromicSquares() {
		numbers = new HashMap<String, String>();
		keys = new ArrayList<String>();
	}

	public void find(int base) {
		this.base = base;

		String n;
		String nn;

		int square;
		for (int i = 1; i <= UP_TO; i++) {
			square = i * i;
			n = from10UpToZ(i);
			nn = from10UpToZ(square);
			if (isPalindrome(nn)) {
				numbers.put(n, nn);
				keys.add(n);
			}
		}
	}

	public int getBase() {
		return base;
	}

	private static boolean isPalindrome(String string) {
		StringBuilder builder = new StringBuilder(string);
		builder = builder.reverse();
		return builder.toString().equals(string);
	}

	private String from10UpToZ(long number) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String result = "";
		int aux;

		do {
			aux = (int) (number % base);
			result = chars.charAt(aux) + result;
			number /= base;
		} while (number > 0);

		return result;
	}

	public Map<String, String> getNumbers() {
		return numbers;
	}

	public List<String> getKeys() {
		return keys;
	}

	public static void main(String[] args) throws IOException {
		PalindromicSquares pali = new PalindromicSquares();

		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		int number = Integer.parseInt(read.readLine());

		pali.find(number);

		Iterator<String> keysItera = pali.getKeys().iterator();

		String key;

		while (keysItera.hasNext()) {
			key = keysItera.next();
			out.println(key + " " + pali.getNumbers().get(key));
		}

		read.close();
		out.close();
		System.exit(0);
	}

}
