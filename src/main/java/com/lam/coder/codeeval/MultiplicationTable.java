package com.lam.coder.codeeval;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author Usuario
 *
 *
 *
 */

public class MultiplicationTable {
    public static void main (String[] args) throws IOException {
		PrintStream out = System.out;

		for (int j = 1; j <= 12; j++) {
			for (int i = 1; i <= 12; i++) {
				out.format("%4d", i*j);   
			}
			out.format("%n");   
		}
        
        out.close();
    }
}

