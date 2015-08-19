package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LittleElephantAndString {

	public int getNumber(String a, String b) {
		
		List<Character> listA = new ArrayList<Character>(); 
		List<Character> listB = new ArrayList<Character>(); 
		List<Character> listC = new ArrayList<Character>(); 
	
		for (int i = 0; i < a.length(); i++ ) {
		    listA.add(a.charAt(i));	
		}
		for (int i = 0; i < b.length(); i++ ) {
		    listB.add(b.charAt(i));	
		}
		
		if (listA.equals(listB)) {
			return 0;
		} else {
		}

		Collections.sort(listA);
		Collections.sort(listB);
		if (listA.equals(listB)) {
		} else {
			return -1;
		}
		
		listA.clear();
		listB.clear();
		for (int i = 0; i < a.length(); i++ ) {
		    listA.add(a.charAt(i));	
		}
		for (int i = 0; i < b.length(); i++ ) {
		    listB.add(b.charAt(i));	
		}

		
		Character pointer;
		int k;
		int count = 0;
		for (int i = 0; i < listB.size(); i++) {
			if ( listA.get(i).equals(listB.get(listB.size() - i -1)) ) {
				listC.add(listA.get(i));
				continue;
			}
			
			pointer = listB.get( listB.size() - i - 1 );
			k = listA.indexOf(pointer);
			listA.remove(k);
			listC.add(0, pointer);
			if ( listC.equals(listB) ) {
				count = i;
				break;
			} 
		}
		
		return count;
		
	//	"AAABBB", "BBBAAA")
//		"ABC"
//		"CBA"
//		Returns: 2
	}
	
	
}
