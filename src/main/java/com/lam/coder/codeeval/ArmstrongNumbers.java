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

public class ArmstrongNumbers {
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        ArmstrongNumbers main = new ArmstrongNumbers();
		String line;
        
        int n;
		String data = "";
        
        while ((line = buffer.readLine()) != null) {
        	n = Integer.parseInt(line);
    		data = "False";
        	
        	if (n == 153 || n == 370 || n == 371 || n == 407 ) {
        		data = "True";
        	}
            
            // Process line of input Here
            out.println(data);
        }
        
        buffer.close();
        out.close();
    }
}

