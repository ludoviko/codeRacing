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

public class QueryBoard {
	
	int[][] array;
	int size; 
	
	public QueryBoard() {
		this.size = 256;
		this.array = new int[this.size][this.size];
	}

	
	private void setRow(int row, int value) {
		for (int i = 0; i < this.size; i++) {
			this.array[row][i] = value;
		}
	}

	private void setColumn(int column, int value) {
		for (int i = 0; i < this.size; i++) {
			this.array[i][column] = value;
		}
	}

	private int queryRow(int row) {
		int sum = 0;
		for (int i = 0; i < this.size; i++) {
			sum += this.array[row][i];
		}
		
		return sum;
	}

	private int queryColumn(int column) {
		int sum = 0;
		for (int i = 0; i < this.size; i++) {
			sum += this.array[i][column];
		}
		
		return sum;
	}
	
	public void find(String string) {
		
		String[] data = string.split(" ");

		int sum = 0;
		
		if (data[0].equals("SetCol")) {
			this.setColumn(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
			return;
		} else if (data[0].equals("SetRow")) {
			this.setRow(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
			return;
		} else if (data[0].equals("QueryCol")) {
			sum = this.queryColumn(Integer.parseInt(data[1]));
		} else if (data[0].equals("QueryRow")) {
			sum = this.queryRow(Integer.parseInt(data[1]));
		}
	
		System.out.println(sum);
	   }
	
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

        QueryBoard main = new QueryBoard();
		String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            main.find(line);;
        }
        
        buffer.close();
        out.close();
    }
}

