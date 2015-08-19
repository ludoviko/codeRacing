package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lam.utilIo.ReadData;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 42: Coded triangle numbers
 * 
 *         The nth term of the sequence of triangle numbers is given by, tn =
 *         ½n(n+1); so the first ten triangle numbers are:
 * 
 *         1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 *         By converting each letter in a word to a number corresponding to its
 *         alphabetical position and adding these values we form a word value.
 *         For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If
 *         the word value is a triangle number then we shall call the word a
 *         triangle word.
 * 
 *         Using words.txt (right click and 'Save Link/Target As...'), a 16K
 *         text file containing nearly two-thousand common English words, how
 *         many are triangle words?
 * 
 *         Answer: 162.
 * 
 */

public class CodedTriangleNumbers {

	private static final String PathToFile = "src/main/java/com/lam/coder/projectEuler/dataIn/words.txt";
	// The code char of A is 65
	private static final int REDUCTION_A = 64;
	private String string;
	private List<String> words;
	private Map<Integer, Integer> mapSum;

	public CodedTriangleNumbers() {
		this.loadData(PathToFile);
		this.words = new ArrayList<String>();
		this.setMap();
	}

	public void setMap() {
		this.mapSum = new HashMap<Integer, Integer>();
		for (int i = 1; i < 30; i++) {
			mapSum.put(this.findSum(i), new Integer(i));
		}
	}

	private boolean isSumOf(int n) {
		Object object = mapSum.get(new Integer(n));
		return object == null ? false : true;
	}

	private void loadData(String pathToFile) {
		ReadData data = new ReadData(pathToFile);
		string = data.loadAndGetDataAsString();
	}

	public void setWords() {
		String[] strings = this.string.split(",");

		for (String chain : strings) {
			words.add(chain.replaceAll("\"", ""));
		}
		Collections.sort(words);
	}

	public List<String> getWords() {
		return words;
	}

	private int findNumericValue(String string) {
		int sum = 0;
		int character;
		for (int i = 0; i < string.length(); i++) {
			character = string.charAt(i) - REDUCTION_A;
			sum += character;
		}
		return sum;
	}

	private int findSum(int n) {
		return n * (1 + n) / 2;
	}

	public int findQuantityTriangleWords() {
		int sum = 0;
		int numericValue;

		for (int i = 0; i < this.words.size(); i++) {
			numericValue = this.findNumericValue(words.get(i));
			if (this.isSumOf(numericValue)) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		CodedTriangleNumbers triangleNumbres = new CodedTriangleNumbers();
		triangleNumbres.setWords();

		int sum = triangleNumbres.findQuantityTriangleWords();
		System.out.println("Answer: 162 " + sum);
	}
}
