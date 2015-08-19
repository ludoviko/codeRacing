package com.lam.coder.codility.tmp;

public class PawsMovement {
    public int solution(int[] array) {
    	int period = array.length;
    	int next = array[0];
    	int count = 0; 
    	
    	while (true) {
            count++;
            if (next >= period) {
            	break;
            }
            next = next + array[next];
            if ( count >= period ) {
            	count = -1;
            	break;
            }
    	}
    	
    	return count;
    }
}
