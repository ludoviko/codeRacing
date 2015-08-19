package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetIntersection {
	
	public String find(String string) {
	
		String[] aux = string.split(";");
		
		String[] data_1 = aux[0].split(","); 
		String[] data_2 = aux[1].split(",");
		String data  = "";
		Set<String> set_1 = new TreeSet<String>();
		Set<String> set_2 = new TreeSet<String>();
		
		set_1.addAll(Arrays.asList(data_1));
		set_2.addAll(Arrays.asList(data_2));
		
		set_1.retainAll(set_2);
		
		for (String s : set_1) {
			data += s + ",";
		}
		
		if (data.equals("") ) {
			return "";
		}
		
		return data.substring(0, data.length() - 1);
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        SetIntersection main = new SetIntersection();
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

