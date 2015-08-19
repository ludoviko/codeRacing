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

public class BeautifulStrings {
	
	public int find(String string) {
		int sum = 0;
		int top = 26;
		
		string = string.toLowerCase();
		
		int[] array = new int[26];
		
		for (int i = 0; i < string.length(); i++) {
			if ( string.charAt(i) < 'a' || string.charAt(i) > 'z') {
				continue;
			}
			array[ string.charAt(i) - 'a']++;
		}
		
		Arrays.sort(array);

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == 0) {
				continue;
			}
			sum += array[i] * (top--);
		}
		
		
		return sum;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        BeautifulStrings main = new BeautifulStrings();
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

