package com.lam.coder.codejam;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;


/**
 * Problem Alien Language
 * <p>
 * After years of study, scientists at Google Labs have discovered an alien language transmitted from a faraway planet. The alien language is very unique in that every word consists of exactly L lowercase letters. Also, there are exactly D words in this language.
 * <p>
 * Once the dictionary of all the words in the alien language was built, the next breakthrough was to discover that the aliens have been transmitting messages to Earth for the past decade. Unfortunately, these signals are weakened due to the distance between our two planets and some of the words may be misinterpreted. In order to help them decipher these messages, the scientists have asked you to devise an algorithm that will determine the number of possible interpretations for a given pattern.
 * <p>
 * A pattern consists of exactly L tokens. Each token is either a single lowercase letter (the scientists are very sure that this is the letter) or a group of unique lowercase letters surrounded by parenthesis ( and ). For example: (ab)d(dc) means the first letter is either a or b, the second letter is definitely d and the last letter is either d or c. Therefore, the pattern (ab)d(dc) can stand for either one of these 4 possibilities: add, adc, bdd, bdc.
 * <p>
 * Input
 * <p>
 * The first line of input contains 3 integers, L, D and N separated by a space. D lines follow, each containing one word of length L. These are the words that are known to exist in the alien language. N test cases then follow, each on its own line and each consisting of a pattern as described above. You may assume that all known words provided are unique.
 * <p>
 * Output
 * <p>
 * For each test case, output
 * <p>
 * Case #X: K
 * where X is the test case number, starting from 1, and K indicates how many words in the alien language match the pattern.
 * <p>
 * Limits
 * <p>
 * Small dataset
 * <p>
 * 1 ? L ? 10
 * 1 ? D ? 25
 * 1 ? N ? 10
 * Large dataset
 * <p>
 * 1 ? L ? 15
 * 1 ? D ? 5000
 * 1 ? N ? 500
 * Sample
 * <p>
 * <p>
 * Input
 * <p>
 * <p>
 * 3 5 4
 * abc
 * bca
 * dac
 * dbc
 * cba
 * (ab)(bc)(ca)
 * abc
 * (abc)(abc)(abc)
 * (zyx)bc
 *
 * Output
 * Case #1: 2
 * Case #2: 1
 * Case #3: 3
 * Case #4: 0
 */
public class AlienLanguage {

    public static int find(String[] data, String pattern) {
        int c = 0;

        for (String s : data) {
            if (s.matches(pattern)) {
                c++;
            }
        }

        return c;
    }

    /**
     *
     * This method converts the pattern from its format to regular expression format.
     *
      * @param string: The pattern in its own format.
     * @return the pattern is regular expresssion form.
     */
    private static String convert(String string) {
        StringBuilder pattern = new StringBuilder();
        Stack<Character> inParenthesis = new Stack<Character>();

        char or = '|';

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                inParenthesis.push(string.charAt(i));
                pattern.append(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                inParenthesis.pop();
                pattern.deleteCharAt(pattern.length() - 1);
                pattern.append(string.charAt(i));
            } else if (!inParenthesis.empty()) {
                if (inParenthesis.peek() == '(') {
                    pattern.append(string.charAt(i));
                    pattern.append(or);
                }
            } else {
                pattern.append(string.charAt(i));
            }
        }

        return pattern.toString();
    }

    void solve(Scanner in, PrintWriter out) {
        String[] data;
        String[] patterns;

        int size = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();

        data = new String[n];
        patterns = new String[p];

        // Read data.
        for (int i = 0; i < n; i++) {
            data[i] = in.next();
        }

        // Read patterns.
        for (int i = 0; i < p; i++) {
            patterns[i] = in.next();
        }

        // For each patterns.
        for (int i = 0; i < p; i++) {
            System.out.format("Case #%d: %d%n", i + 1, AlienLanguage.find(data, convert(patterns[i])));
            out.format("Case #%d: %d%n", i + 1, AlienLanguage.find(data, convert(patterns[i])));
        }
    }

    void run() {
        String name = AlienLanguage.class.getName();
        String sizeS = "-small";
        String sizeX = "-large";
        String size = sizeX;
        String fileIn = name + size + ".in";
        String fileOut = name + size + ".out";
        Locale.setDefault(Locale.US);
        try {
       // Read from keyboard, write to screen.
                Scanner in = new Scanner(new FileReader(fileIn));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                        new File(fileOut))));

            solve(in, out);
            in.close();
            out.close();
        } catch (Exception exception) {
               throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new AlienLanguage().run();
    }
}
