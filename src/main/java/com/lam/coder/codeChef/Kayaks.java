package com.lam.coder.codeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// XXXX Failed. 
public class Kayaks {
	public double findSlowestPair(List<String> list) {

		List<Fraction> fractions = new ArrayList<Fraction>();

		for (int i = 0; i < list.size(); i++) {
			fractions.add(new Fraction(Long
					.parseLong(list.get(i).split(" ")[1]), Long.parseLong(list
					.get(i).split(" ")[0])));
		}

		Collections.sort(fractions);

		double slowest = 0.0;
		double min = Long.MAX_VALUE;

		for (int i = 0; i < list.size() / 2; i++) {
			slowest = fractions.get(i).getNumerator()
					+ fractions.get(list.size() - i - 1).getNumerator();
			slowest /= 20 + fractions.get(i).getDenominator()
					+ fractions.get(list.size() - i - 1).getDenominator();
			if (slowest < min) {
				min = slowest;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 0;
		int top = in.nextInt();

		List<String> list = new ArrayList<String>();

		in.nextLine();

		while (counter < top) {
			list.add(in.nextLine());
			counter++;
		}

		Kayaks kayaks = new Kayaks();
		Double data = kayaks.findSlowestPair(list);
		System.out.println(data);
	}
}

class GCD {
	public static long find(long m, long n) {
		long a = Math.max(m, n);
		long b = Math.min(m, n);

		if (a % b == 0) {
			return b;
		} else {
			return find(b, a % b);
		}
	}

	public static long findLCM(long m, long n) {
		return m * n / GCD.find(m, n);
	}
}

class Fraction implements Comparable<Fraction> {
	public long numerator;
	public long denominator;

	public Fraction(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	};

	public Fraction(long numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	};

	public long getNumerator() {
		return this.numerator;
	}

	public Fraction add(Fraction b) {
		long lcm = GCD.findLCM(this.denominator, b.denominator);
		long num_1 = this.numerator * lcm / this.denominator;
		long num_2 = b.numerator * lcm / b.denominator;
		long num = num_1 + num_2;
		return new Fraction(num, lcm);
	}

	public Fraction multiply(Fraction b) {
		long num = this.numerator * b.numerator;
		long den = this.denominator * b.denominator;
		return new Fraction(num, den);
	}

	public Fraction divide(Fraction b) {
		long num = this.numerator * b.denominator;
		long den = this.denominator * b.numerator;
		return new Fraction(num, den);
	}

	public Fraction subtract(Fraction b) {
		long lcm = GCD.findLCM(this.denominator, b.denominator);
		long num_1 = this.numerator * lcm / this.denominator;
		long num_2 = b.numerator * lcm / b.denominator;
		long num = num_1 - num_2;
		return new Fraction(num, lcm);
	};

	public void reduce() {
		long gdc = GCD.find(this.numerator, this.denominator);
		this.numerator /= gdc;
		this.denominator /= gdc;
	}

	public long getDenominator() {
		return this.denominator;
	}

	@Override
	public String toString() {
		return "Fraction [ " + this.numerator + " / " + this.denominator + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.denominator ^ (this.denominator >>> 32));
		result = prime * result + (int) (this.numerator ^ (this.numerator >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Fraction other = (Fraction) obj;
		if (this.denominator != other.denominator) {
			return false;
		}
		if (this.numerator != other.numerator) {
			return false;
		}
		return true;
	}

	public int compareTo(Fraction o) {
		long LCM = GCD.findLCM(this.denominator, o.denominator);

		Fraction a = new Fraction(LCM * this.numerator / this.denominator, LCM);
		Fraction b = new Fraction(LCM * o.numerator / o.denominator, LCM);

		if (a.numerator > b.numerator) {
			return 1;
		} else if (a.numerator < b.numerator) {
			return -1;
		} else {
			return 0;
		}
	}
}
