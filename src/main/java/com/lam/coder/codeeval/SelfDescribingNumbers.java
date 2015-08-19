package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;


public class SelfDescribingNumbers {
	
	public int find(String string) {
		int[] data = new int[string.length()];
		int[] counter = new int[string.length()];
        int s = 0;
		
		for (int i = 0; i < data.length ; i++) {
			data[i] = Integer.parseInt(string.charAt(i) + "");
			s = data[i]; 
			if  (s >= data.length) {
				return 0;
			} 
			counter[data[i]]++;
		}
			
		for (int i = 0; i < data.length; i++) {
			if (data[i] == counter[i] ) {
			} else {
				return 0;
			}
		}

		return 1;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        SelfDescribingNumbers main = new SelfDescribingNumbers();
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

