package com.lam.coder.projectEuler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.AbundantNumbers;
import com.lam.utilIo.ReadData;

/**
 * 
 * Problem 23: Non-abundant sums
 * 
 * A perfect number is a number for which the sum of its proper divisors is
 * exactly equal to the number. For example, the sum of the proper divisors
 * of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect
 * number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less
 * than n and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the
 * smallest number that can be written as the sum of two abundant numbers is
 * 24. 
 * 
 * By mathematical analysis, it can be shown that all integers greater
 * than 28123 can be written as the sum of two abundant numbers. However,
 * this upper limit cannot be reduced any further by analysis even though it
 * is known that the greatest number that cannot be expressed as the sum of
 * two abundant numbers is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the
 * sum of two abundant numbers.
 * 
 *  Answer:  4 179 871.
 *        
 */

// XXX Broken test.
public class NonAbundantSum {
	public static final String PathToFile = "src/main/java/com/lam/coder/projectEuler/dataOut/notTheSumOfTwoAbundantNumbers";
	public static final String AbundantNumberFile  = "src/main/java/com/lam/coder/projectEuler/dataIn/abundantNumbers";
	public List<String> abundants;
	public List<Long> numbers;

	public NonAbundantSum() {
		abundants = new ArrayList<String>();
		numbers = new ArrayList<Long>();
		this.loadData(abundants, AbundantNumberFile);
	}
	
	private void loadData(List<String> list, String pathToFile) {
		ReadData data = new ReadData(list, pathToFile);
		data.loadData();
	}
	
	public int find() {
		int abundantI = 0;
		int abundantJ = 0;
		long sumIJ = 0;
		int sum = 0;
		boolean[] canBeWrittenAsAbundant = new boolean[AbundantNumbers.LIMIT + 1];

		for (int i = 0; i < abundants.size(); i++) {
			abundantI = Integer.parseInt(abundants.get(i));
			for (int j = i; j < abundants.size(); j++) {
				abundantJ = Integer.parseInt(abundants.get(j));
				sumIJ = abundantI + abundantJ;
				if (sumIJ > AbundantNumbers.LIMIT) {
//					System.out.print("Sum: " + sumIJ);
//					System.out.print("i: " + i + ", ");
//					System.out.println("j: " + j);
					break;
				} else {
					canBeWrittenAsAbundant[abundantI + abundantJ] = true;
				}
			}
		}
		
		for (int i = 1; i <= AbundantNumbers.LIMIT; i++) {
			if (!canBeWrittenAsAbundant[i]) {
				sum += i;
				this.numbers.add((long) i);
			}
		}
//		System.out.print("Sum: " + sum);
        return sum;
	};

    public void saveNumbers() {
    	PrintWriter out = null;
		try {
			out = new PrintWriter(PathToFile);
	    	for (int i = 0; i < this.numbers.size(); i++) {
				out.println(this.numbers.get(i)); 
			};
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
    }	
	
	public List<Long> getNumbers() {
		return this.numbers;
	}
	
	public static void main(String[] args) {
		long sum = 0;
		NonAbundantSum nonAbundantSum = new NonAbundantSum();
		sum = nonAbundantSum.find();
		nonAbundantSum.saveNumbers();
		System.out.println("Sum: "+ sum);
	}
}
