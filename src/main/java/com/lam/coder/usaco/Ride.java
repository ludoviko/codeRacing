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
 TASK: Ride
 */

public class Ride {
	public static final String DataIn = "./source/com/coder/usaco/dataIn/Ride.in";
	public static final String DataOut = "./source/com/coder/usaco/dataOut/Ride.out";

	public static final String GO = "GO";
	public static final String STAY = "STAY";

	public String find(String wordOne, String wordTwo) {
		int w = getProductOfLetters(wordOne);
		int w2 = getProductOfLetters(wordTwo);

		if (areTheSameModule(w, w2)) {
			return GO;
		} else {
			return STAY;
		}
	}

	private int getProductOfLetters(String word) {
		int A = 'A' - 1;
		int product = 1;

		for (int i = 0; i < word.length(); i++) {
			product *= (word.charAt(i) - A);
		}
		return product;
	}

	private boolean areTheSameModule(int n, int m) {
		if (n % 47 == m % 47) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		String word = read.readLine();
		String word2 = read.readLine();

		Ride ride = new Ride();
		out.print(ride.find(word, word2));

		read.close();
		out.close();

		System.exit(0);
	}
}
