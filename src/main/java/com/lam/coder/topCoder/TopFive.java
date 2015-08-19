package com.lam.coder.topCoder;

import com.lam.annotation.Note;

@Note(note="Incompleted, too complex.")

public class TopFive {

	private int TOP = 5; 
	
	public double findProbability(String[] results, String[] accuracies, int points) {
		
		
		float value; 
		for (int i = 0; i < results.length ; i++ ) {
			value = findMostProbable(results[i], accuracies[i]);
			if (points > value) {
				return 100;
			} else {
			}
		}
		
		for (int i = 0; i < results.length ; i++ ) {
			value = findLeastProbable(results[i], accuracies[i]);
			if (points > value) {
				return 100;
				// Go on further
			} else {
			//	return 0.0;
			}
		}

		
		return 0;
		
//		Assert.assertEquals(0.5, top.findProbability(new String[] {"200 200 200", "200 200 200",
//				"200 200 200","200 200 200","200 200 200"}, 
//				new String[] {"100 100 100", "100 100 100","100 100 100", "100 100 100",
//				"0 0 50"}, 100));
		
		
		
	}

	
	private float findMostProbable(String result, String accuracy) {
		String[] results = result.split(" "); 
		String[] accuracies = accuracy.split(" ");
		
		float points = 0;
		
		for (int i = 0; i < results.length; i++) {
			if ( Float.parseFloat(accuracies[i]) > 0.0 ) {
				   points += Float.parseFloat(results[i]);  
			} else {
				   points += 0;  
			}
		}
		
		return points;
	}
	
	private float findLeastProbable(String result, String accuracy) {
		String[] results = result.split(" "); 
		String[] accuracies = accuracy.split(" ");
		
		float points = 0;
		
		for (int i = 0; i < results.length; i++) {
			if ( Float.parseFloat(accuracies[i]) < 100 ) {
				   points += 0;  
			} else {
				   points += Float.parseFloat(results[i]);
				   
			}
		}
		
		return points;
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] results =    "33 200 200".split(" "); 
		String[] accuracies = "30 80 50".split(" ");
		
		float points = 0;
		float target = 200;
		int max = 1;
        int current;
		
		for (int i = 0; i < results.length; i++) { 
			for (int  j= i; j < results.length; j++) {
				
			}
		}

		
		for (int i = 0; i < results.length; i++) {
			if ( Float.parseFloat(accuracies[i]) > 0.0 ) {
				   points += Float.parseFloat(results[i]);  
			} else {
				   points += 0;  
			}
		}

	}

}
