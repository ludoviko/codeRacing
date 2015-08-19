package com.lam.coder.topCoder;

public class Traffic {

	int DISTANCE_BETWEEN_TRAFFIC_LIGHTS  = 150;
	
	public int time(int[] lights, int speed) {
		
		int time  = 0;
		int distanceUp = 0;
		int distanceDown = 0;
		int x;

		time += DISTANCE_BETWEEN_TRAFFIC_LIGHTS / speed;
		
		for (int i = 1; i < lights.length; i++) {
			if ( (i + 1) % 2  == 1) {
				time += DISTANCE_BETWEEN_TRAFFIC_LIGHTS / speed;
				if ( time < lights[i] ) {
				} else {
					time += lights[i];
				}
				// green
			}  else if ( (i + 1) % 2  == 0) {
				// red
			}
			
			
			
			
		}
		
//		{10,10,10}
//
//		30
//
//		Returns: 30
//
//		The car reaches the first traffic light at time = 5, so the light is still green and the car drives on through.
//
//		The car then reaches the second traffic light at time = 10, and the light has just turned red. The car then waits 10 more seconds for the light to turn green.
//
//		At time = 20, the light is green and the car starts driving instantly at 30 meters/second.
//
//		At time = 25 the car hits the third traffic light, which is green.
//
//		At time = 30 the car reaches the end, 150 meters past the last traffic light. 
		
		return 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
