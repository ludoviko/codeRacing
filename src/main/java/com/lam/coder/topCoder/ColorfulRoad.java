package com.lam.coder.topCoder;

public class ColorfulRoad {

	public int getMin(String road) {

		char R = 'R';
		char G = 'G';
		char B = 'B';
		int current;
		int sum = 0;
		int k = 0;
		int old = 0;
		String RGB = "RGB";
        int j = 1;
		
		while ( j < road.length()) {
			
			for (int i = 0; i < road.length(); i++) {
				// Expect G
				if (road.charAt(i) == RGB.charAt(k)) {
					k++;
					sum += (i -old)*(i -old);
					old = i;
				} else {
				}
			}
		}

		return 0;

		// "RGGGB"
		// Returns: 8
		// The optimum solution is to step part 0 -> part 2 -> part 4. The total
		// cost is 2*2 + 2*2 = 8.
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColorfulRoad color = new ColorfulRoad();
		
		color.getMin("RGGGB");

	}

}
