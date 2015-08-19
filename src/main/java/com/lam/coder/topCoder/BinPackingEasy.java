package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinPackingEasy {

	
	public int minBins(int[] item) {
		
		int UPTO  = 300;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int n : item) {
			list.add(n);
		}
		
		Collections.sort(list);
		
		int sum = 0;
		int q = 0;
//		int i = 0;
		int SIZE = 0;
		int  i = 0;
		for ( i = 0; i <  list.size() - 1;  ) {
			if ( list.get(i)  +  list.get(i+1) > 200 && list.get(i)  +  list.get(i) <= 300) {
				q++;
				list.remove(i);
				list.remove(i);
			} else {
				q++;
				list.remove(i);
			}
		}
		
		
		if (list.size() == 1) {
			q++;
		}
		
		
		return q;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
