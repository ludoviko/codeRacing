package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         CHALLENGE DESCRIPTION:
 * 
 *         Print the longest word in a stepwise manner.
 * 
 *         INPUT SAMPLE:
 * 
 *         The first argument is a path to a file. Each line contains a test
 *         case with a list of words that have different or the same length.
 * 
 *         For example:
 * 
 * 
 *         1 2 3 cat dog hello stop football play music is my life OUTPUT
 *         SAMPLE:
 * 
 *         Find the longest word in each line and print it in one line in a
 *         stepwise manner. Separate each new step with a space. If there are
 *         several words of the same length and they are the longest, then print
 *         the first word from the list.
 * 
 * 
 *         1 2 3 h *e **l ***l ****o f *o **o ***t ****b *****a ******l *******l
 *         m *u **s ***i ****c CONSTRAINTS:
 * 
 *         The word length is from 1 to 10 characters. The number of words in a
 *         line is from 5 to 15. If there are several words of the same length
 *         and they are the longest, then print the first word from the list.
 *         The number of test cases is 40. SUBMIT SOLUTIO
 */

public class StepwiseWord {

	public String find(String data) {
		String star = "*";
		String stars = "";

		String[] strings = data.split(" ");
		String string = this.findLongest(strings);

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			builder.append(string.charAt(i));
			stars += star;
			if (i < string.length() - 1) {
				builder.append(' ');
				builder.append(stars);
			} else {
			}
		}

		return builder.toString();
	}

	private String findLongest(String[] strings) {

		int j = 0;
		int max = 0;

		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > max) {
				max = strings[i].length();
				j = i;
			}
		}

		return strings[j];
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		String line;
		StepwiseWord main = new StepwiseWord();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			out.println(main.find(line));
		}

		buffer.close();
		out.close();
	}
}
