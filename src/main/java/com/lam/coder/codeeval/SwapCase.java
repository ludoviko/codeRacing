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

public class SwapCase {
	
	public static String swapCase(String string) {
		char[] data = string.toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			if (Character.isLowerCase(data[i])) {
				data[i] = Character.toUpperCase(data[i]); 
			} else if (Character.isUpperCase(data[i])) {
				data[i] = Character.toLowerCase(data[i]); 
			}
		}
		
		return new String(data);
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            out.println(swapCase(line));
        }
        
        buffer.close();
        out.close();
    }
}

