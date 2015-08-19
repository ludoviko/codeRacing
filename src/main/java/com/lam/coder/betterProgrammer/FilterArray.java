package com.lam.coder.betterProgrammer;

import java.util.*;

/*
Please implement this method to
return a new array with only positive numbers from the given array.
The elements in the resulting array shall be sorted in the ascending order.

 http://www.betterprogrammer.com/

*/

public class FilterArray {

    public static int[] retainPositiveNumbers(int[] a) {
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for (int i = 0; i < a.length; i++) {
    		if (a[i] > 0) {
    			list.add(a[i]);
    		};
    	};
    	
    	Collections.sort(list);
    	int[] b = new int[list.size()];    	
        
    	Object[] c = list.toArray();
    	
    	for ( int i = 0; i <  c.length; i++ ) {
    		b[i] = (Integer)c[i]; 
    	} 
    	
    	return b;
    };
   
    public static void main(String[] strings) {
    	int[] a = {9,8,7,6,-5,1,2,3,-89,4,5,89};
    	int[] b = FilterArray.retainPositiveNumbers(a);
    	
    	for ( int i : b ) {
    		System.out.println(i);	
    	}
    }

}
