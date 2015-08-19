package com.lam.coder.codility.tmp;

public class MaximumDeviation {
    public int solution(int[] array) {
    	if (array.length == 0 ) {
    		return -1;
    	}
    	return findExtremeElement(array);
    }
    
    private double findAverage(int[] array) {
    	double average = 0;
    	
    	for (int i: array) {
    		average += i; 	
    	}
    	return average / array.length;
    }
    
    private int findExtremeElement(int[] array) {
    	double deviation;
    	double maxDeviation = -1;
    	int index = -1;

    	double average = this.findAverage(array);
    	
    	for (int i = 0; i < array.length; i++) {
    		deviation = Math.abs(array[i] - average);
    		if ( deviation >  maxDeviation) {
    			maxDeviation = deviation;
    			index = i;
    		}
    	}
    	return index;
    }
}
