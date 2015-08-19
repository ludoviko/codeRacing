package com.lam.coder.topCoder;


// 144.73

public class TwoWaysSorting {
	public static final String LEXI = "lexicographically";
	public static final String BOTH = "both";
	public static final String LEN = "lengths";
	public static final String NONE = "none";
	
	public String sortingMethod(String[] strings) {
		boolean lexi = isSortedLexi(strings);
		boolean len = isSortedByLen(strings);
		
		if (lexi && len) {
			return BOTH;
		} else if (lexi) {
			return LEXI;
		} else if (len ){
			return LEN;
		} else {
			return NONE;
		}
		
	}
	
	private boolean isSortedByLen(String[] strings) {
		if ( strings.length == 1 ) {
			return true;
		}
		
		for (int i = 0; i < strings.length - 1; i++ ) {
			if ( strings[i].length() <=  strings[i+1].length() ) {
			} else {
				return false;
			}
		}
		
		return true;
	}

	private boolean isSortedLexi(String[] strings) {
		if ( strings.length == 1 ) {
			return true;
		}
		
		for (int i = 0; i < strings.length - 1; i++ ) {
			if ( strings[i].compareTo(strings[i+1]) <= 0) {
			} else {
				return false;
			}
		}
		
		return true;
	}
}
