package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author L.Azuaje.
 *         <p/>
 *         The sentence 'A quick brown fox jumps over the lazy dog' contains every single letter in the alphabet. Such sentences are called pangrams. You are to write a program, which takes a sentence, and returns all the letters it is missing (which prevent it from being a pangram). You should ignore the case of the letters in sentence, and your return should be all lower case letters, in alphabetical order. You should also ignore all non US-ASCII characters.In case the input sentence is already a pangram, print out the string NULL
 *         <p/>
 *         INPUT SAMPLE:
 *         <p/>
 *         Your program should accept as its first argument a path to a filename. This file will contain several text strings, one per line. E.g.
 *         <p/>
 *         A quick brown fox jumps over the lazy dog
 *         A slow yellow fox crawls under the proactive dog
 *         OUTPUT SAMPLE:
 *         <p/>
 *         Print out all the letters each string is missing in lowercase, alphabetical order . E.g.
 *         <p/>
 *         NULL
 *         bjkmqz
 */

public class Pangrams {

    public String find(String string) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = letters.toCharArray();

        String missings = "";

        string = string.toLowerCase();

        int[] frequency = new int[alphabet.length];

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                frequency[string.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 0) {
                missings += (char) (i + 'a');
            }
        }

        if (missings.length() > 0) {
            char[] missData = missings.toCharArray();
            Arrays.sort(missData);
            return new String(missData);
        }

        return "NULL";
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        PrintStream out = System.out;

        Pangrams main = new Pangrams();
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            out.println(main.find(line));
        }

        buffer.close();
        out.close();
    }
}

