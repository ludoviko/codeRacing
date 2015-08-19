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


public class ReadMore {

	public String find(String string) {
		String[] data;
		StringBuilder aux = new StringBuilder();
		
		if (string.length() > 55) {
			string = string.substring(0, 40);
			// remove last word
			data = string.split(" ");
			
			for (int i = 0; i < data.length -1; i++) {
				aux.append(data[i]);
				aux.append(" ");
			}
					
			string = aux.toString().trim();
			
			string = this.trimSpaces(string);
			string += "... <Read More>";
		}

		return string;
	}

	private String trimSpaces(String string) {
		StringBuilder builder = new StringBuilder();
		boolean isSpace = false;

		int i = 0;
		while (i < string.length()) {

			while (i < string.length() && string.charAt(i) == ' ') {
				i++;
				isSpace = true;
			}

			if (i < string.length() && isSpace) {
				builder.append(" ");
				isSpace = false;
			}

			if (i < string.length() && string.charAt(i) != ' ') {
				builder.append(string.charAt(i));
				i++;
			}
		}

		return builder.toString();
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		ReadMore main = new ReadMore();
		String line;

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			out.println(main.find(line));
		}

		buffer.close();
		out.close();
	}
}

