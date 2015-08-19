package com.lam.coder.usaco;

/*
 ID: ludovik1
 LANG: JAVA
 TASK: TestExample
 */

//The simplest programming challenge is named 'test' and requires you to 
//read a pair of small integers from a single input line in the file 'test.in' 
//and print their sum to the file 'test.out'.

import java.io.*;
import java.util.*;

public class TestExample {

	public static final String DataIn = "./source/com/coder/usaco/dataIn/TestExample.in";
	public static final String DataOut = "./source/com/coder/usaco/dataOut/TestExample.out";

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));
		StringTokenizer st = new StringTokenizer(read.readLine());
		int i1 = Integer.parseInt(st.nextToken());
		int i2 = Integer.parseInt(st.nextToken());
		out.println(i1 + i2);
		read.close();
		out.close();
		System.exit(0);
	}
}