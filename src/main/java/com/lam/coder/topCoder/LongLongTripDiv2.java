package com.lam.coder.topCoder;

public class LongLongTripDiv2 {

	String POSSIBLE = "Possible";
	String IMPOSSIBLE = "Impossible";
	
	
	public String isAble(long D, int T, int B) {
		String answer = IMPOSSIBLE;
		int c = 1;
		long cc = 0;
		long q;
		
		while (true) {
		     q = D / B;
			  cc = c + q;  
		      q *=  c;
		     q += D - T;
		     
             if (cc > T) {
            	 c++;
              } else if (cc == T) {
            	  answer = POSSIBLE;
             	 break;
             }	else  {
             	 break;
             }	
		}
		
		return answer;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
