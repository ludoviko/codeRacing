package com.lam.coder.projectEuler;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 31: Coin sums
 * 
 *         In England the currency is made up of pound, £, and pence, p, and
 *         there are eight coins in general circulation:
 * 
 *         1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * 
 *         It is possible to make £2 in the following way: 1×£1 + 1×50p + 2×20p
 *         + 1×5p + 1×2p + 3×1p
 * 
 *         How many different ways can £2 be made using any number of coins?
 */

public class CoinSums {
	private static int combinations = 0;
	private int amount;

	private int[] denominations;
	private int[] minimumChange;

	public CoinSums(int amount, int[] denominations) {
		this.amount = amount;
		this.minimumChange = new int[amount + 1];
		this.denominations = denominations;
	}

	// public CoinSums(int... denominations) {
	// this.denominations = denominations;
	// }

	// public int minimumChangeOld(int amount) {
	// int minimum = Integer.MAX_VALUE;
	// int coins;
	// if (amount == 0) {
	// combinations++;
	// return 0;
	// }
	//
	// for (int i = 0; i < denominations.length; i++) {
	// if (denominations[i] <= amount) {
	// coins = 1 + this.minimumChangeOld(amount - denominations[i]);
	// if (coins < minimum) {
	// minimum = coins;
	// }
	// }
	// }
	// return minimum;
	// }

	public int find() {
		return minimumChange();
	}

	public int minimumChange() {
		int coins;

		if (amount == 0) {
			return 0;
		}

		for (int i = 1; i <= amount; i++) {
			int minimum = Integer.MAX_VALUE;
			for (int j = 0; j < denominations.length; j++) {
				if (denominations[j] <= i) {
					coins = 1 + minimumChange[i - denominations[j]];
					if (coins < minimum) {
						minimum = coins;
					}
				}
			}
			minimumChange[i] = minimum;
		}

		return minimumChange[amount];

	}

	public int combinationsXXX() {
		int coins = 0;

		if (amount == 0) {
			return 0;
		}

		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < denominations.length; j++) {
				if (denominations[j] <= i) {
					coins = 1 + minimumChange[i - denominations[j]];
				}
				if (i == amount) {
					minimumChange[i] += coins;
				}
			}
		}

		return minimumChange[amount];

	}

	public static void main(String[] args) {
		// CoinSums coins = new CoinSums(200, new int[] {1,2,5,10,20,50,100,200
		// });
		CoinSums coins = new CoinSums(200, new int[] { 10 ,50, 100, 200 });
		int minimumChange = coins.find();
		System.out.println("minimumChange: " + minimumChange);
	}

}
