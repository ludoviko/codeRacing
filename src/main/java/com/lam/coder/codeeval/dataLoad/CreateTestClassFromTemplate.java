package com.lam.coder.codeeval.dataLoad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.lam.utilString.StringUtils;

public class CreateTestClassFromTemplate {
	public static void main(String[] args) throws IOException {

		System.out
		.println("Code Eval: Utility for creating the Test Class.");
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
		String sourceFile = "src/test/java/com/lam/coder/codeeval/MainTest.java";
		String outputDir = "src/test/java/com/lam/coder/codeeval/";
		String packageTest = "package com.lam.coder.codeeval;" + System.getProperty("line.separator");
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
