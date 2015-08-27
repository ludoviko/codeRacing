package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * 
 * @author Usuario
 *
 *
 *
 */

public class Pangrams {
	
	public String  find(String string) {
        String  letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet  = letters.toCharArray();

        String missings = "";

        string = string.toLowerCase();

        int[] frequency  = new int[alphabet.length];

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                frequency[string.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
          if ( frequency[i] == 0 ) {
              missings +=  (char) (i + 'a');
          }
        }

        if (missings.length() > 0) {
            char[] missData = missings.toCharArray();
            Arrays.sort(missData);
            return new String(missData);
        }

        return "NULL" ;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        Pangrams main = new Pangrams();
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

