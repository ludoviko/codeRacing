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
 *
 *
 */

public class StringsAndArrows {

	public int find(String string) {
		int c = 0;

		// '>>-->' or '<--<<'
		int i = 0;
		while (i < string.length()) {

			// Right arrow: >>-->
			if (i < string.length() && string.charAt(i) == '>') {
				i++;
				if (i < string.length() && string.charAt(i++) == '>') {
					if (i < string.length() && string.charAt(i++) == '-') {
						if (i < string.length() && string.charAt(i++) == '-') {
							if (i < string.length()
									&& string.charAt(i++) == '>') {
								c++;
							}
						}
					}
				}
			} else
			// Left arrow: <--<<
			if (i < string.length() && string.charAt(i) == '<') {
				i++;
				if (i < string.length() && string.charAt(i++) == '-') {
					if (i < string.length() && string.charAt(i++) == '-') {
						if (i < string.length() && string.charAt(i++) == '<') {
							if (i < string.length()
									&& string.charAt(i++) == '<') {
								c++;
							}
						}
					}
				}
			}

			if (i < string.length() && string.charAt(i++) == 'X') {
				if (i < string.length() && string.charAt(i++) == '-') {
					if (i < string.length() && string.charAt(i++) == '-') {
						if (i < string.length() && string.charAt(i++) == '<') {
							if (i < string.length()
									&& string.charAt(i++) == '<') {
								c++;
							}
						}
					}
				}
			}
		}

		return c;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		String line;
		StringsAndArrows main = new StringsAndArrows();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			out.println(main);
		}

		buffer.close();
		out.close();
	}
}
