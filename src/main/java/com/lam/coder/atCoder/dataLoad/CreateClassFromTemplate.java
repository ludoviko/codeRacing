package com.lam.coder.atCoder.dataLoad;

import java.io.*;
import java.util.Scanner;

public class CreateClassFromTemplate {
	public static void main(String[] args) throws IOException {
		String dir = "src/main/java/com/lam/coder/atCoder/";

		System.out
		.println("atCoder.jp: Utility for creating the Given Class from a Main Class Template.");

		System.out
				.println("Enter arg: the name of the target class: v.g. NextRound , you might use white spaces as they will be trimmed. ");

		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine().replace(" ", "");

		Scanner s = null;
		StringBuilder output = new StringBuilder();
		PrintWriter outputStream = null;
		String data = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader(
					dir + "Main.java")));

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
					dir + name + ".java"));

			outputStream.println(data);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
		sc.close();
	}
}
