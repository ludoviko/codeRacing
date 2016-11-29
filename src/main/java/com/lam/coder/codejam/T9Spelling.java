package com.lam.coder.codejam;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Problem T9 Spelling
 * <p>
 * The Latin alphabet contains 26 characters and telephones only have ten digits on the keypad.
 * We would like to make it easier to write a message to your friend using a sequence of keypresses
 * to indicate the desired characters. The letters are mapped onto the digits as shown below.
 * To insert the character B for instance, the program would press 22. In order to insert two
 * characters in sequence from the same key, the user must pause before pressing the key a second time.
 * The space character ' ' should be printed to indicate a pause. For example, 2 2 indicates AA whereas
 * 22 indicates B.
 * <p>
 * <p>
 * Input
 * <p>
 * The first line of input gives the number of cases, N. N test cases follow.
 * Each case is a line of text formatted as
 * <p>
 * desired_message
 * Each message will consist of only lowercase characters a-z and space characters ' '.
 * Pressing zero emits a space.
 * <p>
 * Output
 * <p>
 * For each test case, output one line containing "Case #x: " followed by the message
 * translated into the sequence of keypresses.
 * <p>
 * Limits
 * <p>
 * 1 ? N ? 100.
 * <p>
 * Small dataset
 * <p>
 * 1 ? length of message in characters ? 15.
 * <p>
 * Large dataset
 * <p>
 * 1 ? length of message in characters ? 1000.
 * <p>
 * Sample
 * <p>
 * <p>
 * Input
 * <p>
 * 4
 * hi
 * yes
 * foo  bar
 * hello world
 * <p>
 * Output
 * Case #1: 44 444
 * Case #2: 999337777
 * Case #3: 333666 6660 022 2777
 * Case #4: 4433555 555666096667775553
 */
public class T9Spelling {
    public static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    public static final String[] values = new String[LETTERS.length()];

    static {
        T9Spelling.setValues();
    }

    public static void setValues() {
        values[0] = "2";
        values[1] = "22";
        values[2] = "222";
        values[3] = "3";
        values[4] = "33";
        values[5] = "333";
        values[6] = "4";
        values[7] = "44";
        values[8] = "444";
        values[9] = "5";
        values[10] = "55";
        values[11] = "555";
        values[12] = "6";
        values[13] = "66";
        values[14] = "666";
        values[15] = "7";
        values[16] = "77";
        values[17] = "777";
        values[18] = "7777";
        values[19] = "8";
        values[20] = "88";
        values[21] = "888";
        values[22] = "9";
        values[23] = "99";
        values[24] = "999";
        values[25] = "9999";
    }

    public static String translate(String string) {
        String former = ".";
        StringBuilder translation = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                if (string.charAt(i) == former.charAt(0)) {
                    translation.append(" ");
                } else {
                }
                translation.append("0");
                former = " ";
            } else {
                if (values[string.charAt(i) - 'a'].startsWith(former.substring(0, 1))) {
                    translation.append(" ");
                } else {
                }
                translation.append(values[string.charAt(i) - 'a']);
                former = values[string.charAt(i) - 'a'] + "";
            }
        }

        return translation.toString();
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= n; i++) {
            String s = in.nextLine();
            System.out.format("Case #%d: %s %s%n", i, s, T9Spelling.translate(s));
            out.format("Case #%d: %s%n", i, T9Spelling.translate(s));
        }
    }

    void run() {
        String fileIn = "T9Spelling-large.in";
        String fileOut = "T9Spelling-large.out";
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
        new T9Spelling().run();
    }
}
