package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContestCoordinator {

	public double bestAverage(int[] scores) {
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i : scores) {
			list.add(i);
		}

		Collections.sort(list);

		return this.findBestAverage2(list);
	}

	private double findAverage(List<Integer> list) {
		double sum = 0.0;

		for (Integer i : list) {
			sum += i;
		}

		return sum / list.size();
	}

	private double findBestAverage2(List<Integer> list) {
		if (list.size() == 1) {
			return list.get(0);
		} else if (list.size() == 2) {
			return (list.get(0) + list.get(1)) / 2.0;
		} else {
			
			int i, j;
			if ( list.size() % 2 == 0 ) {
				j =  list.size() / 2;
				i = j - 1;
			} else {
				j =  list.size() / 2;
			    i = j;
			}

			List<Integer> aux = new ArrayList<Integer>();  
			
			for (int n = 0; n < list.size(); n++) {
				double a = this.findAverage(list.subList(i, j + 1));
				double b = this.findAverage(list);
				
				aux.clear();;
				aux.addAll(list.subList(0,i));
				aux.addAll(list.subList(j+1,list.size()));
				double c = this.findAverage(aux);
				
				if ( this.findAverage(list.subList(i, j + 1)) >= this.findAverage(list)) { 
					return this.findAverage(list.subList(i, j + 1));
				} else {
				}
				i--;
				j++;
			}
			
			return this.findAverage(list);
			
		}
	}

}
