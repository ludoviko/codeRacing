package com.lam.coder.topCoder.dp;

import java.util.List;
import java.util.ArrayList;

public class MinimumCoins {

//	1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
	
	public static int ONE_PENCE = 1;
	public static int TWO_PENCE = 2;
	public static int THREE_PENCE = 3;
	public static int FIVE_PENCE = 5;
	public static int TEN_PENCE = 10;
	public static int TWENTY_PENCE = 20;
	public static int FIFTY_PENCE = 50;
	public static int ONE_POUND = 100;
	public static int TWO_POUND = 200;

	private int[] data;
	private int sum;
	private List<Integer> summands;

	public MinimumCoins(int sum, List<Integer> summands) {
		this.sum= sum; 
		this.summands = summands;
		data = new int[sum + 1];
		
		for (int i = 1; i < data.length; i++) {
		  data[i] = Integer.MAX_VALUE;	
		}
		
	}
	
	public void find() {
		for (int i = 1; i <= this.sum; i++) {
			for (int j = 0; j <= summands.size() - 1; j++) {
				if ( summands.get(j) <= i && data[i-summands.get(j)] < data[i] ) {
					data[i] = data[i-summands.get(j)] + 1;
					if (i == this.sum) {
						System.out.println("Ways to made " + i + " : " + data[i]);
					}
				}
			}
		}
		
		System.out.println("Sum up");
		for (int i = 0; i <= sum; i++ ) {
			System.out.println(i + " " + data[i]);
		}
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> summands = new ArrayList<Integer>();
		
//		1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
		
		summands.add(ONE_PENCE);
		summands.add(THREE_PENCE);
		summands.add(FIVE_PENCE);
		
		MinimumCoins coins = new MinimumCoins(11, summands);
		coins.find();
		
		summands.clear();
		summands.add(ONE_PENCE);
		summands.add(TWO_PENCE);
		summands.add(FIVE_PENCE);
		summands.add(TEN_PENCE);
		summands.add(TWENTY_PENCE);
		summands.add(FIFTY_PENCE);
		summands.add(ONE_POUND);
		summands.add(TWO_POUND);
		
		coins = new MinimumCoins(5, summands);
		coins.find();
	}
}
