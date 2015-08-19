package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
ID: ludovik1
LANG: JAVA
TASK: PrimeCryptarithm
*/

public class PrimeCryptarithm {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn + PrimeCryptarithm.class.getSimpleName()
			+ ".in";
	public static final String DataOut = DirOut
			+ PrimeCryptarithm.class.getSimpleName() + ".out";
	
	private String digits;

	public int find(String digits) {
		int a, b, c, d, e;
		int count = 0;

		this.digits = digits;

		for (int i = 0; i < digits.length(); i++) {
			for (int j = 0; j < digits.length(); j++) {
				for (int k = 0; k < digits.length(); k++) {
					for (int m = 0; m < digits.length(); m++) {
						for (int n = 0; n < digits.length(); n++) {
							a = Integer.parseInt(digits.charAt(i) + ""
									+ digits.charAt(j) + digits.charAt(k));
							b = Integer.parseInt(digits.charAt(m) + ""
									+ digits.charAt(n));
							c = a * Integer.parseInt(digits.charAt(m) + "");
							d = a * Integer.parseInt(digits.charAt(n) + "") * 10;
							e = c + d;
							if (c / 1000 > 0) {
								continue;
							} else {
							}
							if (d / 10000 > 0) {
								continue;
							} else {
							}
							if (e / 10000 > 0) {
								continue;
							} else {
							}
							if (this.contains(c + "")
									&& this.contains(d/10 + "")
									&& this.contains(e + "")) {
							} else {
								continue;
							}
							count++; 
						}
					}
				}
			}
		}
		return count;
	}

	private boolean contains(String data) {
		boolean result = true;

		for (int i = 0; i < data.length(); i++) {
			if (this.digits.contains(data.charAt(i) + "")) {
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		PrimeCryptarithm crypto = new PrimeCryptarithm();
		int n = Integer.parseInt(reader.readLine());
		String data = reader.readLine().replace(" ","");
		
		out.println(crypto.find(data));

		out.close();
		reader.close();
		System.exit(0);
	}

}
