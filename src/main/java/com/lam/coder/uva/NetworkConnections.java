package com.lam.coder.uva;

import java.io.*;

/**
 * UVA 793: Network Connections.
 *
 * <p/>
 * Bob, who is a network administrator, supervises a network of computers. He is keeping a log connections
 * between the computers in the network. Each connection is bi–directional. Two computers
 * are interconnected if they are directly connected or if they are interconnected with the same computer.
 * Occasionally, Bob has to decide, quickly, whether two given computers are connected, directly
 * or indirectly, according to the log information.
 * Write a program which based on information input from a text file counts the number of successful
 * and the number of unsuccessful answers to the questions of the kind:
 * is computeri
 * interconnected with computerj ?
 * Input
 * The input begins with a single positive integer on a line by itself, indicating the number
 * of the cases following. This line is followed by a blank line, and there is also a blank line
 * between two consecutive inputs.
 * For each test case, the input must follow the description below.
 * 1. The number of computers in the network (a strictly positive integer);
 * 2. A list of pairs of the form:
 * (a) c computeri computerj , where computeri and computerj are integers from 1 to no of computers.
 * A pair of this form shows that computeri and computerj get interconnected.
 * (b) q computeri computerj , where computeri and computerj are integers from 1 to no of computers.
 * A pair of this form stands for the question:
 * is computeri interconnected with computerj ?
 * Each pair is on a separate line. Pairs can appear in any order, regardless of their type. The log is
 * updated after each pair of type (a) and each pair of type (b) is processed according to the current
 * network configuration.
 * Output
 * For each test case, the output must follow the description below. The outputs of two
 * consecutive cases will be separated by a blank line.
 * The program prints two integer numbers to the standard output on the same line, in the order:
 * ‘successful answers, unsuccessful answers’, as shown in the sample output.
 * Note:
 * For example, the first input illustrated in the sample below corresponds to a network of 10 computers
 * and 7 pairs. There are ‘1’ successfully answered questions and ‘2’ unsuccessfully answered questions.
 * Sample Input
 * 2
 * 10
 * c 1 5
 * c 2 7
 * q 7 1
 * c 3 9
 * q 9 6
 * c 2 5
 * q 7 5
 * 1
 * q 1 1
 * c 1 1
 * q 1 1
 * Sample Input
 * 1,2
 * 2,0
 */
public class NetworkConnections {
    public class UF {
        private int[]	array;

        public UF(int n) {
            this.array = new int[n];
            for (int i = 0; i < n; i++) {
                this.array[i] = i;
            }

        }

        public void union(int p, int q) {
            if (!areConnected(p, q)) {
                this.array[this.getRoot(p)] = this.getRoot(q);
            }

        }

        public boolean areConnected(int p, int q) {
            return this.getRoot(p) == this.getRoot(q);
        }

        public int size() {
            return 0;
        }

        public int getRoot(int p) {
            this.validate(p);
            while (this.array[p] != p) {
                p = this.array[p];
            }

            return p;
        }

        // validate that p is a valid index
        private void validate(int p) {
            if (p < 0 || p >= array.length) {
                throw new IndexOutOfBoundsException("index " + p
                        + " is not between 0 and " + array.length);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        NetworkConnections main = new NetworkConnections();

        int n = scanner.nextInt();
        int i = -1;
        int elements = 0;
        String string;
        UF uf = null;
        String[] data;
        int success = 0;
        int notSuccess = 0;

        while ((string = scanner.next()) != null && i < n) {
            if (string.isEmpty() ) {
                if (i > -1) {
                    System.out.println(success + "," + notSuccess);
                    System.out.println();
                    success = 0;
                    notSuccess = 0;
                }
                i++;
                if (i >= n) {
                    break;
                }

                elements = scanner.nextInt() + 1;
                uf = main.new UF(elements);
                string = scanner.next();
            }

            data = string.split(" ");
            if (data[0].charAt(0) == 'c') {
                uf.union(Integer.parseInt(data[1]), Integer.parseInt(data[2]) );
            }
            if (data[0].charAt(0) == 'q') {
             if (uf.areConnected(Integer.parseInt(data[1]), Integer.parseInt(data[2] ))) {
                 success++;
             } else {
                 notSuccess++;
             }

            }

        }

        scanner.reader.close();
        out.close();
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
                str = this.reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}
