package com.lam.coder.projectEuler;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 9: Special Pythagorean triplet
 * 
 *         A Pythagorean triplet is a set of three natural numbers, a < b < c,
 *         for which, a^2 + b^2 = c^2
 * 
 *         For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 *         There exists exactly one Pythagorean triplet for which a + b + c =
 *         1000. Find the product abc.
 * 
 *         a = 2mn 
 *         b = m*m - n*n 
 *         c = m*m + n*n
 * 
 *         Answer = 31875000.
 * 
 */

public class PythagoreanTriplet {
	private static final int SUM = 1000;

	public int go() {
		int a, b, c;
		a = b = c = 0;
		end: for (int i = 1; i < 97; i++) {
			for (int j = i + 1; j < 97; j++) {
				a = 2 * i * j;
				b = Math.abs(i * i - j * j);
				c = i * i + j * j;
//				System.out.println(i + "/" + j);
//				System.out.println(a + "/" + b + "/" + c);
//				System.out.println(a * a + "/" + b * b + "/" + c * c);
				if (a + b + c == SUM) {
//					System.out.println(a + b + c);
					break end;
				}
			}
		}

		return a * b * c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PythagoreanTriplet triplet = new PythagoreanTriplet();
		int result = triplet.go();
		System.out.println(result);
	}

}
