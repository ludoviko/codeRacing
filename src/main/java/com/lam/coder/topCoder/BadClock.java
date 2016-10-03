package com.lam.coder.topCoder;

public class BadClock {

    // SRM 172
	public double nextAgreement(String trueTime, String skewTime, int hourlyGain) {

		int s1 = convertToSeconds(trueTime);
		int s2 = convertToSeconds(skewTime);

		double solution = (s1 - s2) * 1.0 / hourlyGain;
//		double solution = Math.abs(s1 - s2) * 1.0 / hourlyGain;

		return solution;
	}

	private int convertToSeconds(String time) {
		String[] hms = time.split(":");

		int s = Integer.parseInt(hms[0]) * 3600 + Integer.parseInt(hms[1]) * 60
				+ Integer.parseInt(hms[2]);

		return s;
	}
}
