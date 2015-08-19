package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

public class DualPalindromes {
    public static int STARTING_BASE = 2;
    public static int NUMBER_OF_BASES = 2;

    public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";
	
	public static final String DataIn = DirIn
			+ DualPalindromes.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ DualPalindromes.class.getSimpleName() + ".out";

	private int greaterThan;
	private int quantity;
	public static final int UP_TO = Integer.MAX_VALUE;

	private List<Integer> keys;

	public DualPalindromes() {
		keys = new ArrayList<Integer>();
	}

	public void find(int greaterThan, int quantity) {
		this.greaterThan = greaterThan;
		this.quantity = quantity;
		String n;
		int count = 0;
		int base = STARTING_BASE;

		for (int i = this.greaterThan; i <= UP_TO; i++) {
			while (count < NUMBER_OF_BASES && base < 11) {
				n = from10UpToZ(i, base++);
				if (isPalindrome(n)) {
					count++;
				}
			}
			if (count >= NUMBER_OF_BASES) {
				keys.add(i);
			}
			if (keys.size() >= this.quantity) {
				return;
			}
			count = 0;
			base = STARTING_BASE;
		}
	}

	private static boolean isPalindrome(String string) {
		StringBuilder builder = new StringBuilder(string);
		builder = builder.reverse();
		return builder.toString().equals(string);
	}

	private String from10UpToZ(long number, int base) {
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

	public List<Integer> getKeys() {
		return keys;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		String line = read.readLine();
		
		int quantity = Integer.parseInt(line.split(" ")[0]);
		int number = Integer.parseInt(line.split(" ")[1]);
		
		DualPalindromes dualPali = new DualPalindromes();
		dualPali.find(number, quantity);

		for (int i = 0; i < dualPali.getKeys().size(); i++) {
			out.println(dualPali.getKeys().get(i));
		}

		read.close();
		out.close();
		System.exit(0);
	}
}
