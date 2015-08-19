package com.lam.coder.uva.dataLoad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFromMain {
	public static void main(String[] args) throws IOException {
		System.out
		.println("Utility fro creating the Given Class from a Main Class Template.");

		System.out
				.println("Enter arg: the name of the target class: NextRound or what ever, you might use white spaces as they will be trimmed. ");

		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine().replace(" ", "");

		Scanner s = null;
		StringBuilder output = new StringBuilder();
		PrintWriter outputStream = null;
		String data = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader(
					"source/com/lam/coder/uva/Main.java")));

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
					"source/com/lam/coder/uva/" + name + ".java"));

			outputStream.println(data);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
		sc.close();
	}
}
