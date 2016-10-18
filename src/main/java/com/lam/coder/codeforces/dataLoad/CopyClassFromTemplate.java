package com.lam.coder.codeforces.dataLoad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyClassFromTemplate {
	public static void main(String[] args) throws IOException {
		String dirIn = "src/main/java/com/lam/coder/codeforces/";
		String dirOut = "src/main/java/com/lam/coder/codeforces/";
		System.out
		.println("Code Forces: Utility for creating the Given Class from a Main Class Template.");

		System.out
				.println("Enter arg: the name of the target class: NextRound or what ever, you might use white spaces as they will be trimmed. ");

		Scanner sc = new Scanner(System.in);

		String name = toFirstUpperCase( sc.nextLine()).replace(" ", "");

		Scanner s = null;
		StringBuilder output = new StringBuilder();
		PrintWriter outputStream = null;
		String data = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader(
					dirIn + "Main.java")));

			while (s.hasNext()) {
				output.append(s.nextLine());
				output.append(System.getProperty("line.separator"));
			}

			data = output.toString();

			data = data.replace("Main", name);

			System.out.println(output);

		} finally {
			if (s != null) {
				s.close();
			}
		}

		try {
			outputStream = new PrintWriter(new FileWriter(
					dirOut + name + ".java"));

			outputStream.println(data);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
		sc.close();
	}

    public static String toFirstUpperCase(String title) {
        char separator = ' ';
        char[] output = title.toCharArray();
        boolean space = true;

        for (int i = 0; i < output.length; i++) {
            if (output[i] == separator) {
                space = true;
                continue;
            }

            if (space) {
                output[i] = Character.toUpperCase(output[i]);
                space = false;
            }

        }

        return new String(output);
    }
}
