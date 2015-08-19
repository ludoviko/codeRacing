package com.lam.coder.betterProgrammer;

// http://www.betterprogrammer.com/

public class FindValue {
	    public static int getClosestToZero(int[] a) {

	        /*
	          Please implement this method to
	          return the number in the array that is closest to zero.
	          If there are two equally close to zero elements like 2 and -2
	          - consider the positive element to be "closer" to zero.
	         */
	    	
	    	int closestToZero = a[0];
	    	char sign = FindValue.getSign(closestToZero);
	    	char sign_aux;
	    	char plus = ' ';
	    	
	    	for (int i = 1; i < a.length ; i++ ) {
	    		if ( Math.abs (a[i]) < Math.abs (closestToZero) ) {
	    			closestToZero = a[i];
	    			sign = FindValue.getSign(a[i]);	
	    		} else if ( Math.abs (a[i]) > Math.abs ( closestToZero ) ) {
	    		} else if ( Math.abs (a[i]) == Math.abs (closestToZero) ) {
	    			sign_aux = FindValue.getSign(a[i]);
	    			if ( sign == plus ) {
	    				// No changes;
	    			} else {
	    				sign = sign_aux;
	    				closestToZero = a[i];
	    			};
	    		};
	    	};
	    	
	    	return closestToZero;
	    }

		private static char getSign(int i) {
			char sign;
			if (i >= 0 ) {
	    		sign = ' ';
	    	} else {
	    		sign = '-';
	    	};
	    	return sign;
		};
	    
		public static void main(String[] strings) { 
		//	FindValue find = new FindValue();
			int[] a = {10,-1,1,3,4,5,6,7,8,9};
			int[] b = {-1,1};
			int i = FindValue.getClosestToZero(a);
			System.out.println(i);
		}
	}
	

