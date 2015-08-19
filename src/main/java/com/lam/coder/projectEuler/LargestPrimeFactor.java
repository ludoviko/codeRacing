package com.lam.coder.projectEuler;

public class LargestPrimeFactor {
	
	/**
	 *
	 *  Problem 3: Largest prime factor
	 *
     *    The prime factors of 13195 are 5, 7, 13 and 29.
     *    What is the largest prime factor of the number 600851475143 ?
	 *
	 *   The largest prime factor of a given number is greater than its square root. 
	 *   
	 *   Answer: 6857.
	 */
	
	public long getLargest(long number) {
// For number 2, the only even prime
	    while (number % 2 == 0) {    
	    	if ( number == 2 ) {
	    		break;
	    	} else {
	    	number = number/2;
	    	};
	    }    
// From now only on uneven numbers are considered
	    for (long i = 3 ; i <= Math.sqrt(number); i = i + 2)  {    
	    	    while (number % i == 0) {    
	    	    	if ( i == number) {
	    	    		break;
	    	    	} else {
	    	    	number = number/i;
	    	    	};
	    	    }    
	    	 };   
		   return number;
	};
	
    public static void main( String[] args ) {
   	 long number = 600851475143l;
   	 long result = new LargestPrimeFactor().getLargest(number); 
     System.out.println("The Largest Prime Factor is : "+ result);    
   	 result = new LargestPrimeFactor().getLargest(2); 
     System.out.println("The Largest Prime Factor is : "+ result);    
   	 result = new LargestPrimeFactor().getLargest(32); 
     System.out.println("The Largest Prime Factor is : "+ result);    
   	 result = new LargestPrimeFactor().getLargest(100); 
     System.out.println("The Largest Prime Factor is : "+ result);    
  };    
}
