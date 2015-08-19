package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author 
 *
 * Valid knights move on a chessboard.
 *
 */

public class KnightMoves {
	
	public String find(String string) {
		String digits = "87654321"; 
		String letters = "abcdefgh"; 
		
        StringBuilder builder = new StringBuilder(); 
		String[] aux;
        List<String> solution = new ArrayList<String>(); 
        
		int x =  '8' - string.charAt(1);
		int y =  string.charAt(0) - 'a';
		
		if ( ! this.movesUp(x,y).equals("") ) {
			builder.append(this.movesUp(x,y));
		}
		if ( ! this.movesDown(x,y).equals("") ) {
			builder.append(this.movesDown(x,y));
		}
		if ( ! this.movesRight(x,y).equals("") ) {
			builder.append(this.movesRight(x,y));
		}
		if ( ! this.movesLeft(x,y).equals("") ) {
			builder.append(this.movesLeft(x,y));
		}
		
		aux = builder.toString().split(" ");
		
		for (int i = 0; i < aux.length; i++) {
			solution.add(new String( String.valueOf(letters.charAt( aux[i].charAt(1) - '0')) + digits.charAt( aux[i].charAt(0) - '0') + " " ));
		}
		
		Collections.sort(solution);
		
		String s = "";
		for (String d : solution) {
			s += d;
		}
		
		return s.trim();
	}

	private String movesUp(int x, int y) {
   		String s = "";
   		int aux;
   		
   		x = x - 2;
   		if (x < 0) {
   			return "";
   		}

   		aux = y - 1;
   		if (aux >= 0 ) {
   			s += x;
   			s += aux + " ";  
   		}
   		
   		aux = y + 1;
   		if (aux <= 7  ) {
   			s += x;
   			s += aux + " ";  
   		}

   		return s;
	}

	private String movesDown(int x, int y) {
   		String s = "";
   		int aux;
   		
   		x = x + 2;
   		if (x > 7) {
   			return "";
   		}

   		aux = y - 1;
   		if (aux >= 0 ) {
   			s += x;
   			s += aux + " ";  
   		}
   		
   		aux = y + 1;
   		if (aux <= 7  ) {
   			s += x;
   			s += aux + " ";  
   		}

   		return s;
	}

	private String movesRight(int x, int y) {
   		String s = "";
   		int aux;
   		
   		y = y + 2;
   		if (y > 7) {
   			return "";
   		}

   		aux = x - 1;
   		if (aux >= 0 ) {
   			s += aux ;  
   			s += y + " ";
   		}
   		
   		aux = x + 1;
   		if (aux <= 7  ) {
   			s += aux ;  
   			s += y + " ";
   		}

   		return s;
	}
	
	private String movesLeft(int x, int y) {
   		String s = "";
   		int aux;
   		
   		y = y - 2;
   		if (y < 0) {
   			return "";
   		}

   		aux = x - 1;
   		if (aux >= 0 ) {
   			s += aux ;  
   			s += y + " ";
   		}
   		
   		aux = x + 1;
   		if (aux <= 7  ) {
   			s += aux ;  
   			s += y + " ";
   		}

   		return s;
	}
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        KnightMoves main = new KnightMoves();
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