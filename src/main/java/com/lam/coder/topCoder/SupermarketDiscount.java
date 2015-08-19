package com.lam.coder.topCoder;

public class SupermarketDiscount {
	private static int FROM = 50;
	private static int OFF = 10;

	public int minAmount(int[] goods) {
		int subTotal = 0;
		int total = 0;
		int i = 0;

		for (int g : goods) {
			total += g;
		}

		for (int g : goods) {
			if (g >= FROM) {
				i++;
				continue;
			}

			subTotal += g;
			if (subTotal >= FROM) {
				subTotal = 0;
				i++;
			}
		}
		return total - i * OFF;
	}
}
