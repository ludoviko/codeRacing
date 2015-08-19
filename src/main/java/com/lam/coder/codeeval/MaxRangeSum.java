package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author 
 *
 *
 *
 */

public class MaxRangeSum {
	
	public int find(int n, String string) {
		
		String[] data = string.split(" ");
		int[] array = new int[data.length];
		int[] aux = new int[n];
		
		for (int i = 0; i < data.length; i++) {
			array[i] = Integer.parseInt(data[i]);
		}
		
		int slice = 0;
        int max = 0;

        int k = array.length - ( n - 1 ); 
        int m = 0;
        
        while (m < k) {
            System.arraycopy(array, m, aux, 0, n); 
    		for (int i : aux) {
    			slice += i; 
    		}
    		if (slice > max) {
    			max = slice;
    		}
    		slice = 0;
        	m++;
        }
		
		return max;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        MaxRangeSum main = new MaxRangeSum();
		String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            out.println(main.find(Integer.parseInt(line.split(";")[0]),line.split(";")[1]));
        }
        
        buffer.close();
        out.close();
    }
}

