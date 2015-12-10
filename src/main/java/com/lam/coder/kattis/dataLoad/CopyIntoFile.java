package com.lam.coder.kattis.dataLoad;

import java.io.*;
import java.util.Scanner;

public class CopyIntoFile {
	public static void main(String[] args) throws IOException {
		String dirSource = "./src/main/java/com/lam/coder/kattis/";
		String dirOut = "./src/main/java/";

		System.out
		.println("Kattis: Utility for creating the a GivenClass.java Class -within the default package- from a given class.");

		System.out
		.println("Enter arg: the name of the source class to copy from, v.g. NextRound, you might use white spaces as they will be trimmed. ");

		Scanner sc = new Scanner(System.in);

		String name  = sc.nextLine().replace(" " , ""); 

		Scanner s = null;
		StringBuilder output = new StringBuilder();
		PrintWriter outputStream = null;
		String data = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader(
					dirSource + name + ".java")));

			// Skip package declaration
			s.nextLine();
			s.nextLine();

			while (s.hasNext()) {
				output.append(s.nextLine());
				output.append(System.getProperty("line.separator"));
			}
			
			data = output.toString();

//			data = data.replace(name, name);

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

}
