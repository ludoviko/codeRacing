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
 * Check if a given number is happy.
 *
 */

public class HappyNumbers {
	
	public int find(long n) {
		long digit = 0;
		long sum = 0;
        
		while (n > 0) {
			digit = n % 10;
			n /= 10;
			sum += digit * digit;
		}

        if ( sum == 1 ) {
    		return 1;
        } else if ( sum == 4 ) {
        	return 0;
        } else {
        	return this.find(sum);
        }
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        HappyNumbers main = new HappyNumbers();
		String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            out.println(main.find(Integer.parseInt(line)));
        }
        
        buffer.close();
        out.close();
    }
}

