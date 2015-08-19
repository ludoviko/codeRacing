package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author Usuario
 *
 *         Write a program that, given a sentence where each word has a single
 *         digit positive integer as a prefix and suffix, swaps the numbers
 *         while retaining the word in between. Words in the sentence are
 *         delimited from each other by a space.
 * 
 *         INPUT SAMPLE:
 * 
 *         The first argument is a path to a file. Each line of the input file
 *         contains one test case represented by a sentence. Each word in the
 *         sentence begins and ends with a single digit positive integer i.e. 0
 *         through 9. Assume all characters are ASCII.
 * 
 * 
 *         1 2 4Always0 5look8 4on9 7the2 4bright8 9side7 3of8 5life5 5Nobody5
 *         7expects3 5the4 6Spanish4 9inquisition0 OUTPUT SAMPLE:
 * 
 *         For each test case, print to standard output the sentence obtained by
 *         swapping the numbers surrounding each word, one per line.
 * 
 * 
 *         1 2 0Always4 8look5 9on4 2the7 8bright4 7side9 8of3 5life5 5Nobody5
 *         3expects7 4the5 4Spanish6 0inquisition9 CONSTRAINTS:
 * 
 *         The suffix and the prefix of each word may be equal. Sentences are
 *         form 1 to 17 words long. The number of test cases is 40.
 *
 */

public class SwapNumbers {

	public String find(String string) {
		String[] data = string.split(" ");
		char[] word;

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < data.length; i++) {
			word = data[i].toCharArray();
			this.swap(word, 0, word.length - 1);
			builder.append(word);
			builder.append(" ");
		}

		return builder.toString().trim();

	}

	private void swap(char[] array, int i, int j) {
		char c;

		c = array[i];
		array[i] = array[j];
		array[j] = c;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		String line;
		SwapNumbers main = new SwapNumbers();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			out.println(main.find(line));
		}

		buffer.close();
		out.close();
	}
}
