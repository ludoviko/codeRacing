package com.lam.coder.topCoder;

public class TransportCounting {
	public int countBuses(int speed, int[] positions, int[] velocities, int time) {
		int distance = speed * time;
		int count = 0;

		for (int i = 0; i < positions.length; i++) {
			if (distance >= positions[i] + velocities[i] * time || positions[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
