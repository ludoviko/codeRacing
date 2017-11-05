package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Stack;

/**
 * @author L.Azuaje.
 *         <p>
 *         Code Abbey: 19	 Matching Brackets            String manipulation, working with stacks.
 */

public class MatchingBrackets {
    public static final char ROUND_LEFT = '(';
    public static final char ROUND_RIGHT = ')';
    public static final char SQUARE_LEFT = '[';
    public static final char SQUARE_RIGHT = ']';
    public static final char CURLY_LEFT = '{';
    public static final char CURLY_RIGHT = '}';
    public static final char ANGLE_LEFT = '<';
    public static final char ANGLE_RIGHT = '>';
    private String string;

    public MatchingBrackets(String string) {
        this.string = string;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        MatchingBrackets main = null;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            main = new MatchingBrackets(scanner.next());
            if (main.areRightNested()) {
                out.format(Locale.US, "%d ", 1);
            } else {
                out.format(Locale.US, "%d ", 0);
            }
        }

        out.println();

        scanner.reader.close();
        out.close();
    }

    public boolean areRightNested() {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ROUND_LEFT ||
                    string.charAt(i) == SQUARE_LEFT ||
                    string.charAt(i) == CURLY_LEFT ||
                    string.charAt(i) == ANGLE_LEFT
                    ) {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == ROUND_RIGHT ||
                    string.charAt(i) == SQUARE_RIGHT ||
                    string.charAt(i) == CURLY_RIGHT ||
                    string.charAt(i) == ANGLE_RIGHT) {

                if (stack.isEmpty()) {
                    // Push the unmatched character and exit.
                    stack.push(string.charAt(i));
                    break;
                }

                char readLeft = stack.peek();

                if (string.charAt(i) == ROUND_RIGHT) {
                    if (readLeft == ROUND_LEFT) {
                        stack.pop();
                    }
                } else if (string.charAt(i) == CURLY_RIGHT) {
                    if (readLeft == CURLY_LEFT) {
                        stack.pop();
                    }
                } else if (string.charAt(i) == SQUARE_RIGHT) {
                    if (readLeft == SQUARE_LEFT) {
                        stack.pop();
                    }
                } else if (string.charAt(i) == ANGLE_RIGHT) {
                    if (readLeft == ANGLE_LEFT) {
                        stack.pop();
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    // -----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader reader;

        public MyScanner() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public void close() throws IOException {
            this.reader.close();
        }

        int nextInt() {
            return Integer.parseInt(this.next());
        }

        long nextLong() {
            return Long.parseLong(this.next());
        }

        double nextDouble() {
            return Double.parseDouble(this.next());
        }

        String next() {
            String str = "";
            try {
                str = this.reader.readLine().trim();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        String[] nextStringArray() {
            String[] str = null;
            try {
                str = this.reader.readLine().trim().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextIntArray() {
            String[] data = nextStringArray();
            int[] a = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data = nextStringArray();
            Integer[] a = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data = nextStringArray();
            long[] a = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }

        float[] nextFloatArray() {
            String[] data = nextStringArray();
            float[] a = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data = nextStringArray();
            double[] a = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}

