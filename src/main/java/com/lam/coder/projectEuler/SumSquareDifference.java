package com.lam.coder.projectEuler;

/**
*  Problem 6: Sum square difference
*  
*  The sum of the squares of the first ten natural numbers is,
*  1exp2 + 2exp2 + ... + 10exp2 = 385
*  
*  The square of the sum of the first ten natural numbers is,
*  (1 + 2 + ... + 10)exp2 = 552 = 3025
*  
*  Hence the difference between the sum of the squares of the first ten natural 
*  numbers and the square of the sum is 3025 − 385 = 2640.
*  
*  Find the difference between the sum of the squares of the first one hundred natural numbers 
*  and the square of the sum.
*
* Answer: 25164150.
*  
 */

public class SumSquareDifference {
	private int upTo;
	private int squareOfSum;
	private int sumOfSquares;
	private int difference;
	
	public SumSquareDifference(int upTo) {
		this.upTo = upTo;
	}

	public SumSquareDifference() {
	}
	
	public void setUpto(int upTo) {
		this.upTo = upTo;
	}

	private void findSquareOfSum() {
		squareOfSum = this.upTo * (1 + upTo) /2;
		squareOfSum = squareOfSum * squareOfSum;
	}
	
	private void findSumOfSquares () {
		sumOfSquares = (2*this.upTo +1)*(this.upTo +1)*this.upTo/6;
	}

	public void findDifference() {
		this.findSquareOfSum();
		this.findSumOfSquares();
		difference = squareOfSum - sumOfSquares; 
	} 
	
	public int getUpTo() {
		return upTo;
	}

	public int getSquareOfSum() {
		return squareOfSum;
	}

	public int getSumOfSquares() {
		return sumOfSquares;
	}

	public int getDifference() {
		return difference;
	}

	public static void main(String[] args) {
		SumSquareDifference math = new SumSquareDifference(100);
		math.findDifference();
		int result = math.getDifference();
		System.out.println("Expected 25164150 :" + result);
	}
}

