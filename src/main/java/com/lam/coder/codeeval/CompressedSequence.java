package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author 
 *
 *
 *
 */

public class CompressedSequence {

	public String find(String string) {

		String[] data = string.split(" ");
		int[] numbers = new int[data.length];
        String s = "";
		
		for (int i = 0; i < data.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}

		int c = 1;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i+1]) {
			    c++;
			} else {
				s += c + " " + numbers[i] + " ";
				c = 1;
			}
		}
		
		s += c + " " + numbers[numbers.length - 1];
		
		return s;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		CompressedSequence main = new CompressedSequence();
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
