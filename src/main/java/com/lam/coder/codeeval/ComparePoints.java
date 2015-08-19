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

public class ComparePoints {
	
	public String find(String string) {
		String[] data = string.split(" ");
		String position = "";
		
		int y = Integer.parseInt(data[3]) - Integer.parseInt(data[1]); 
		int x = Integer.parseInt(data[2]) - Integer.parseInt(data[0]); 
		
		if (y > 0) {
			position = "N";
		} else if (y < 0) {
			position = "S";
		}
			
		if (x > 0) {
			position += "E";
		} else if (y < 0) {
			position += "W";
		}
			
		if (position.isEmpty()) {
			position = "here";
		}
		
		return position;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        ComparePoints main = new ComparePoints();
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

