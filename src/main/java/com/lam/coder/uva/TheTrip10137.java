package com.lam.coder.uva;

// MateusAraujoBorges/contests

public class TheTrip10137 {

	public static int compute(int[] array) {
		int avg = 0;
		int rem = 0;
		int total = 0;

		for (int c : array) {
			total += c;
		}
		avg = total / array.length;
		rem = total % array.length;		 

		int totalPos = 0;
		int nBiggerAvg = 0;

		for (int c : array) {
			if (c > avg) {
				totalPos += c - avg;
				nBiggerAvg++;
			}
		}
		//don't need to give remaining pennies to the people that will give money
		return totalPos - (Math.min(nBiggerAvg,rem));
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int nStudents = -1;
		
		nStudents = Integer.parseInt(sc.nextLine().trim());
		do {
			int[] costs = new int[nStudents];
			for (int i = 0; i < nStudents; i++) {
				String line = sc.nextLine().trim();
				int cents = (Integer.parseInt(line.replace(".","")));
				costs[i] = cents;
			}

			int toExchange = compute(costs);
			System.out.printf("$%d.%02d\n",toExchange / 100, toExchange % 100);
			nStudents = Integer.parseInt(sc.nextLine().trim());
		} while (nStudents != 0); 
	}
}

/*
3 
10.00 
20.00 
30.00 
4 
15.00 
15.01 
3.00 
3.01 
5 
5000.00 
11.11 
11.11 
11.11 
11.11 
3 
0.01 
0.03 
0.03 
4 
25.00 
25.00 
25.00 
28.00 
3 
10.01 
15.25 
18.96 
4 
25.03 
25.00 
25.00 
25.00 
0 
$10.00
$11.99
$3991.11
$0.01
$2.25
$4.73
$0.02

*/