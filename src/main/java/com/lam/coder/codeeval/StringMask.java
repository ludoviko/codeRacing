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
 *         You’ve got a binary code which has to be buried among words in order
 *         to unconsciously pass the cipher. Create a program that would cover
 *         the word with a binary mask. If, while covering, a letter finds
 *         itself as 1, you have to change its register to the upper one, if
 *         it’s 0, leave it as it is. Words are always in lower case and in the
 *         same row with the binary mask.
 * 
 *         INPUT SAMPLE:
 * 
 *         The first argument is a path to a file. Each row contains a test case
 *         with a word and a binary code separated with space, inside of it. The
 *         length of each word is equal to the length of the binary code.
 * 
 *         For example:
 * 
 * 
 *         1 2 3 hello 11001 world 10000 cba 111 OUTPUT SAMPLE:
 * 
 *         Print the encrypted words without binary code.
 * 
 *         For example:
 * 
 * 
 *         1 2 3 HEllO World CBA CONSTRAINTS:
 * 
 *         Words are from 1 to 20 letters long. The number of test cases is 40.
 */
public class StringMask {

	public String find(String string) {

		String[] data = string.split(" ");

		char[] word = data[0].toCharArray();

		for (int i = 0; i < data[1].length(); i++) {
			if (data[1].charAt(i) == '1') {
				word[i] = Character.toUpperCase(word[i]);
			} else {
			}
		}

		return new String(word);
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		String line;
		StringMask main = new StringMask();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			out.println(main.find(line));
		}

		buffer.close();
		out.close();
	}
}
