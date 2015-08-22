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

public class Main {
	
//	public find() {
//	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        Main main = new Main();
		String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            out.println(main);
        }
        
        buffer.close();
        out.close();
    }


    String[] nextStringArray(String string) {
        String[] str = null;
            str = string.trim().split(" ");

        return str;
    }

    int[] nextIntArray(String string) {
        String[] data  = nextStringArray(string);
        int[] a  = new int[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        return a;
    }

    Integer[] nextIntegerArray(String string) {
        String[] data  = nextStringArray(string);
        Integer[] a  = new Integer[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        return a;
    }

}
