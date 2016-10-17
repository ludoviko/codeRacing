package com.lam.coder.topCoder;

/**
 * @author  Solution by L.Azuaje.
 * <p>
 * This problem was used for:
 * Single Round Match 246 Round 1 - Division II, Level One
 */
public class CalcTest {
    public String[] uniform(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i].replaceAll(" ", "");
            numbers[i] = numbers[i].replaceAll("\\D", ".");
        }
        return numbers;
    }
}
