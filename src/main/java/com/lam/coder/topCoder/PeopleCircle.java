package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

public class PeopleCircle {

	
	public String order(int numMales, int numFemales, int index) {

		char M = 'M';
		char F = 'f';
		String mf = "";
		int k = 0;
	//	String males = "";
		
		List<Character> males = new ArrayList<Character>();
		

		for (int i = 0; i < numMales; i++) {
			males.add(M);
		}
		
		 
		for (int i = 0; i < numFemales; i++) {
			k += index;
			if ( k >=  males.size()) {
				k -= males.size() - 1;
			}
			males.add(k -1, F);
		}
		
		
		for (int i = 0; i < males.size(); i++) {
			mf += males.get(i);
		}
		
		return mf.toUpperCase();
	}

}
