package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author Usuario
 *
 *
 *
 */

public class WithoutRepetitions {
	
	public String find(String string) { 
		if (string == null || string.length() == 0 ) {
			return string;
		}
		
		StringBuilder builder = new StringBuilder();
		
		char old = string.charAt(0);
		
		for (int i = 1; i < string.length(); i++) {
			if ( string.charAt(i) == old ) {
			} else {
				builder.append(old);
			}
			old = string.charAt(i);
		}
		
		builder.append(string.charAt(string.length()-1));
		return builder.toString();
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        WithoutRepetitions main = new WithoutRepetitions();
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

