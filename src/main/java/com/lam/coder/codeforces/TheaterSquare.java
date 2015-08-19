package com.lam.coder.codeforces;

import java.util.*;

/**
 * 
 * @author LAzuaje
 *
 *         A. Theatre Square 
 *         
 *         time limit per test2 seconds memory limit per
 *         test64 megabytes inputstandard input outputstandard output Theatre
 *         Square in the capital city of Berland has a rectangular shape with
 *         the size n × m meters. On the occasion of the city's anniversary, a
 *         decision was taken to pave the Square with square granite flagstones.
 *         Each flagstone is of the size a × a.
 * 
 *         What is the least number of flagstones needed to pave the Square?
 *         It's allowed to cover the surface larger than the Theatre Square, but
 *         the Square has to be covered. It's not allowed to break the
 *         flagstones. The sides of flagstones should be parallel to the sides
 *         of the Square.
 * 
 *         Input The input contains three positive integer numbers in the first
 *         line: n,  m and a (1 ≤  n, m, a ≤ 109).
 * 
 *         Output Write the needed number of flagstones.
 * 
 *         Sample test(s) input 6 6 4 output 4
 *
 */

public class TheaterSquare {

	public long find(long n, long m, long a) {
		long result;

		result = (long) Math.ceil(((double) n) / a);
		result *= (long) Math.ceil(((double) m) / a);

		return result;
	}

	public static void main(String[] args) {
		long n;
		long m;
		long a;
		long result;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // Read data as integer
		m = sc.nextInt();
		a = sc.nextInt();

		TheaterSquare theater = new TheaterSquare();

		result = theater.find(n, m, a);

		System.out.print(result);

		sc.close();
	}
}
