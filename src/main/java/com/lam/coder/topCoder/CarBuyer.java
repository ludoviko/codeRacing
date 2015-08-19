package com.lam.coder.topCoder;

public class CarBuyer {
	public double lowestCost(String[] cars, int fuelPrice, int annualDistance,
			int years) {
		double min = Double.MAX_VALUE;
		double n;

		for (String car : cars) {
			n = this.cost(car, fuelPrice, annualDistance, years);
			if (n < min) {
				min = n;
			}
		}
		return min;
	}

	private double cost(String cars, int fuelPrice, int annualDistance,
			int years) {
		double cost = 0.0;

		String[] data = cars.split(" ");

		cost += Integer.parseInt(data[0]) + Integer.parseInt(data[1]) * years;
		cost += ((double) fuelPrice * annualDistance * years)
				/ Double.parseDouble(data[2]);

		return cost;
	}
}
