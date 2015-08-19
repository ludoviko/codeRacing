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
 *         You have a list of words. Letters of these words are mixed with extra
 *         symbols, so it is hard to define the beginning and end of each word.
 *         Write a program that will clean up the words from extra numbers and
 *         symbols.
 * 
 *         INPUT SAMPLE:
 * 
 *         The first argument is a path to a file. Each line includes a test
 *         case with a list of words: letters are both lowercase and uppercase,
 *         and are mixed with extra symbols.
 * 
 *         For example:
 * 
 * 
 *         1 2 3 (--9Hello----World...--) Can 0$9 ---you~
 *         13What213are;11you-123+138doing7 OUTPUT SAMPLE:
 * 
 *         Print the cleaned up words separated by spaces in lowercase letters.
 * 
 *         For example:
 * 
 * 
 *         1 2 3 hello world can you what are you doing CONSTRAINTS:
 * 
 *         Print the words separated by spaces in lowercase letters. The length
 *         of a test case together with extra symbols can be in a range from 10
 *         to 100 symbols. The number of test cases is 40.
 *
 */

public class CleanUpTheWords {

	public String find(String string) {

		string = string.toLowerCase();
		StringBuilder builder = new StringBuilder();

		int i = 0;

		while (i < string.length()) {
			while (i < string.length()
					&& ((string.charAt(i) >= 'a') && string.charAt(i) <= 'z')) {
				builder.append(string.charAt(i++));
			}
			while (i < string.length()
					&& ((string.charAt(i) < 'a') || string.charAt(i) > 'z')) {
				i++;
			}
			builder.append(" ");
		}

		return builder.toString().trim();
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		String line;
		CleanUpTheWords main = new CleanUpTheWords();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			out.println(main.find(line));
		}

		buffer.close();
		out.close();

	}
}
