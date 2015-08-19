package com.lam.coder.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOExample {
	
	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		while (num != 42) {
			num = in.nextInt();
			if (num != 42) {
				System.out.println(num);
			}
		}
	}

	public static void main(String args[]) {
		String line = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				line = br.readLine();
				if (Integer.parseInt(line) == 42) {
					break;
				} else {
					System.out.println(line);
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

