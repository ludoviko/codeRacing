package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Usuario
 *
 *
 *
 */

public class RacingChars {

	
	
	public void find(List<String> list) {
		
		String[] data = new String[list.size()]; 
		
		String s = list.get(0);
		
		if (s.contains("C")) {
		    s = s.replace("C", "|");	
		} else if (s.contains("_")) {
		    s = s.replace("_", "|");	
		}
		
		data[0] = s;
		
		int pos = s.indexOf('|');
		int posC;
		int posUnderscore;
		
		for (int i = 1; i < list.size(); i++) {
			s = list.get(i);
			posC = s.indexOf('C');
			if ( posC > -1 )  {
				if ( posC < pos )  {
					s = s.replace("C", "/");
				} else if ( posC > pos )  {
					s = s.replace("C", "\\");
				} else {
					s = s.replace("C", "|");
				}
				pos = posC; 
			} else {
				posUnderscore = s.indexOf('_');
				if ( posUnderscore < pos )  {
					s = s.replace("_", "/");
				} else if ( posUnderscore > pos )  {
					s = s.replace("_", "\\");
				} else {
					s = s.replace("_", "|");
				}
				pos = posUnderscore; 
			}
			data[i] = s;
		}
		
		for (String string : data) {
			System.out.println(string);
		}
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        RacingChars main = new RacingChars();
		List<String> list = new ArrayList<String>();
        String line;
		
		
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            list.add(line);
        }

        main.find(list);        
        
        buffer.close();
        out.close();
    }
}

