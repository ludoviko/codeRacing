package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 * 
 *  Find the minimun value in base two that is greater than a given number.
 *
 *
 */

public class MultiplesOfANumber {
	public int find(String string) {
		int a = Integer.parseInt(string.split(",")[0].trim());
		int n = Integer.parseInt(string.split(",")[1].trim());
		
		while ( a > n ) {
			n <<= 1;
		}
		
		return n;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        MultiplesOfANumber main = new MultiplesOfANumber();
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

