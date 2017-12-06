package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p>
 *         Code Abbey: 45	 Cards Shuffling .
 *         <p>
 *         Let us agree to use the following symbols to describe cards:
 *         <p>
 *         ranks: A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K
 *         suits: C, D, H, S
 *         so that CQ is the "Queen of Clubs", HT is the "Ten of Hearts", D2 is the "Two of Diamonds" and SA is the "Ace of Spades".
 *         <p>
 *         There are 52 cards in total, so they should be put into an array of 52 elements before shuffling.
 *         Initial ordering of the array is the following: 13 cards of Clubs, then 13 cards of Diamonds,
 *         then 13 cards of Hearts and at last 13 cards of Spades. Inside of each suit cards are arranged
 *         from Ace to King, so the whole deck looks like:
 *         <p>
 *         [ CA, C2, C3, ..., CQ, CK, DA, D2, ..., DK, HA, H2, ..., HK, SA, S2, ..., SK ]
 */

public class CardsShuffling {
    // 4 suits.
    public static final Character[] SUITS = {'C', 'D', 'H', 'S'};
    // 13 ranks.
    public static final Character[] RANKS = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    private static int N = 52;
    private String[] cards;

    public CardsShuffling() {
        this.initializeCards();
    }

    /**
     * Let's use values 0, 1, 2, ..., 50, 51 to represent the cards of the full deck (52 in total).
     * <p>
     * n is reduce by module to avoid overflow.
     *
     * @param n Returns the name of the n card.
     */

    public static String getCardName(int n) {
        int rank = n % 13;
        int suit = (n / 13) % 4;

        char[] cardNames = new char[2];

        cardNames[0] = SUITS[suit];
        cardNames[1] = RANKS[rank];

        return new String(cardNames);
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        CardsShuffling cardsShuffling = new CardsShuffling();

        int n = CardsShuffling.N;
        int[] data = scanner.nextIntArray();

        for (int i = 0; i < n; i++) {
            cardsShuffling.swap(i, data[i]);
        }

        String[] cards = cardsShuffling.getCards();
        for (int i = 0; i < n; i++) {
            out.format("%s ", cards[i]);
        }

        out.println();

        scanner.reader.close();
        out.close();
    }

    public String[] getCards() {
        return this.cards;
    }

    public void swap(int pos1, int pos2) {
        pos1 = pos1 % N;
        pos2 = pos2 % N;

        String x = this.cards[pos1];
        this.cards[pos1] = this.cards[pos2];
        this.cards[pos2] = x;
    }

    public void initializeCards() {
        this.cards = new String[N];
        int c = 0;

        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++) {
                this.cards[c++] = String.valueOf(SUITS[i]) + String.valueOf(RANKS[j]);
            }
        }
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

