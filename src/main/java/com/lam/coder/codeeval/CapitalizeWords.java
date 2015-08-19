package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author  L.Azuaje.
 * 
 * Capitalize first letter of any word.
 *
 */


public class CapitalizeWords {
	
	char SPACE = ' ';
	
	public String find(String title) {
			char[] output = title.toCharArray();
			boolean space = true;

			for (int i = 0; i < output.length; i++) {
				if (output[i] == this.SPACE) {
					space = true;
					continue;
				}

				if (space) {
					output[i] = Character.toUpperCase(output[i]);
					space = false;
				}

			}

			return new String(output);

	
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        CapitalizeWords main = new CapitalizeWords();
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

