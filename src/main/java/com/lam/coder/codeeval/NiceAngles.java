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

public class NiceAngles {
	
	public String find(String string) {
		
		String data = string.split("\\.")[0] +  ".";
		double d = Double.parseDouble("0."+ string.split("\\.")[1]);
		double sexagecimal;
		
		int i = 0;
		while (i < 2) {
			sexagecimal = Math.floor(d * 60);
			
			if ((int) sexagecimal < 10) {			
				data += "0";
			}

			data +=  (int) sexagecimal; 
		
			if (i == 0) {
				data += "'"; 
			} else {
				data += "\""; 
			}
			i++;
			d =  d * 60 - (int)(d * 60);
		}
		
		return data;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        NiceAngles main = new NiceAngles();
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

