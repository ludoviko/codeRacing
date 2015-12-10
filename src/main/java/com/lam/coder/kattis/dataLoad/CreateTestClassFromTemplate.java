package com.lam.coder.kattis.dataLoad;

import com.lam.utilString.StringUtils;

import java.io.*;
import java.util.Scanner;

public class CreateTestClassFromTemplate {
	public static void main(String[] args) throws IOException {

		System.out
		.println("Kattis: Utility for creating the Test Class.");
		System.out
		.println("Enter arg: the name of the target class to copy into, v.g., NextRound, white spaces will be trimmed: ");

		Scanner sc = new Scanner(System.in);
		String name  = sc.nextLine();
		name  = name.replaceAll(" ", ""); 

		while ( name.isEmpty() ) {
			System.out
			.println("Empty String. Enter the class name:");

			name  = sc.nextLine();
			name  = name.replaceAll(" ", ""); 
		}

		sc.close();
		String sourceFile = "src/test/java/com/lam/coder/kattis/MainTest.java";
		String outputDir = "src/test/java/com/lam/coder/kattis/";
		String packageTest = "package com.lam.coder.kattis;" + System.getProperty("line.separator");
		Scanner s = null;
		StringBuilder output = new StringBuilder();
		PrintWriter outputStream = null;
		String data = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader( sourceFile)));

			// Skip package declaration
			s.nextLine();
			s.nextLine();

			output.append(packageTest);
			output.append(System.getProperty("line.separator"));
			
			while (s.hasNext()) {
				output.append(s.nextLine());
				output.append(System.getProperty("line.separator"));
			}

			data = output.toString();

			data = data.replaceAll("Main", name);
			
			data = data.replaceAll("main", StringUtils.toFirstLowerCase(name));

			System.out.println(output);

		} finally {
			if (s != null) {
				s.close();
			}

		}

		try {
			outputStream = new PrintWriter(new FileWriter(
					outputDir +  name  + "Test.java"));

			outputStream.print(data);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

}
