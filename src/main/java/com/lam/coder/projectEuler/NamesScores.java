package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lam.utilIo.ReadData;

/**
 * Problem 22: Names scores 
 * 
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * Answer: 871198282. 
 */

public class NamesScores {
	private static final String PathToFile = "./src/main/java/com/lam/coder/projectEuler/dataIn/names.txt";
	
	// The code char of A is 65
	private static final int REDUCTION_A  = 64;
	private String string;
	private List<String> names;
	
	public NamesScores() {
		this.loadData(PathToFile);
		this.names = new ArrayList<String>();
	}
	
	private void loadData( String pathToFile ) {
		ReadData data = new ReadData( pathToFile);
		this.string = data.loadAndGetDataAsString();
	}

	public void setNames() {
		String[] strings = this.string.split(",");
		
		for ( String chain : strings ) {
			this.names.add(chain.replaceAll("\"", ""));
		}
		Collections.sort(this.names);
	}
	
	public List<String> getNames() {
		return this.names;
	}
	
	private int findNumericValue(String string) {
       int sum = 0;
       int character;
       for ( int i = 0; i < string.length(); i++ ) { 
    	    character =  string.charAt(i) - REDUCTION_A ;
    	    sum += character;
       }
    	   return sum;
	}

	public int findScores() {
	       int sum = 0;
	       int product = 1;
	       for ( int i = 0; i < this.names.size(); i++ ) {
	    	   product = (i +1 )* this.findNumericValue(this.names.get(i));
	    	   sum += product;
	       }
	    	   return sum;
		}
	
	public static void main(String[] args) {
		NamesScores namesScores = new NamesScores();
		namesScores.setNames();
	    List<String> list = namesScores.getNames();
	    
		for ( String string : list ) {
			System.out.println(string);
		}
		
		int score = namesScores.findScores();
		System.out.println("Expected 871198282: " + score);
	}
}
