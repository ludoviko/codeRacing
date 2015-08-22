package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje
 *
 * Count the number of ones in an int.
 *
 */

public class NumberOfOnes {
	
	public int  find(int n) {
        int k = 0;
        while (n > 0) {
            n = n >> 1;
            byte i = (byte) (n & 1);
                k += i;
        }

        return  k;
	}


    public byte findBit(int n) {
        // Position zero-based.
        byte i = (byte) ((n >> 1) & 1);
        return i;
    }


    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        NumberOfOnes main = new NumberOfOnes();
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

