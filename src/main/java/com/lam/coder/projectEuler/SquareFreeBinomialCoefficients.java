package com.lam.coder.projectEuler;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lam.mathematics.PascalTriangleBI;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 203: Squarefree Binomial Coefficients
 * 
 *         The binomial coefficients nCk can be arranged in triangular form,
 *         Pascal's triangle, like this: 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10
 *         5 1 1 6 15 20 15 6 1 1 7 21 35 35 21 7 1 .........
 * 
 *         It can be seen that the first eight rows of Pascal's triangle contain
 *         twelve distinct numbers: 1, 2, 3, 4, 5, 6, 7, 10, 15, 20, 21 and 35.
 * 
 *         A positive integer n is called squarefree if no square of a prime
 *         divides n. Of the twelve distinct numbers in the first eight rows of
 *         Pascal's triangle, all except 4 and 20 are squarefree. The sum of the
 *         distinct squarefree numbers in the first eight rows is 105.
 * 
 *         Find the sum of the distinct squarefree numbers in the first 51 rows
 *         of Pascal's triangle.
 * 
 *        Answer: <35978961685>
 *        
 *        junit.framework.AssertionFailedError: expected:<null> but was:<35978961685>
 */

public class SquareFreeBinomialCoefficients {
	private PascalTriangleBI pascal;
	List<BigInteger> elements;
	
	public SquareFreeBinomialCoefficients() {
		pascal = new PascalTriangleBI();
	}
	
	public BigInteger findSumElementsSquareFree(int rows) {
		BigInteger sum = new BigInteger("0");

		elements = pascal.findPascal(rows);
		
		Set<BigInteger> set = new HashSet<BigInteger>();
		
		set.addAll(elements);
		
		elements.clear();
		elements.addAll(set);
		// size = 1328 
		Collections.sort(elements);
		
		BigInteger max = elements.get(elements.size() - 1);
//		int maxPrime = (int)Math.sqrt(max);
//		
//		Primes primes = new Primes();
//		primes.find(maxPrime);
//		
//		long[] arrayPrimes = primes.getArray(); 
//		
//		boolean isSquareFree = true;
//		
//		for (long data : elements) {
//			System.out.println(data);
//			isSquareFree = true;
//			for (long aPrime : arrayPrimes) {
//				if ( data % (aPrime * aPrime) == 0 ) {
//					isSquareFree = false;
//					break;
//				} else {
//				}
//			}
//			
//			if (isSquareFree) {
//				sum = sum.add(new BigInteger("" + data)); 
//			}
//			 
//		}
		
		return sum;
	}
}
