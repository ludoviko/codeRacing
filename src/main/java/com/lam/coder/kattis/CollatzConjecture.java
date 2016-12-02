package com.lam.coder.kattis;

import java.io.*;
import java.util.*;

/**
 * @author Solution by: L.Azuaje.
 *         <p>
 *         <p>
 *         Collatz Conjecture
 *         The Collatz Conjecture is an interesting phenomenon. Though its principle
 *         is very simple, it still remains among unresolved problems in mathematics,
 *         even after many years of study. However, the years of intensive research brought
 *         at least some results, which is a huge advantage of the human race against the aliens,
 *         because they did not study the conjecture for so many years. We want to keep this advantage.
 *         <p>
 *         Imagine a sequence defined recursively as follows: Start with any positive
 *         integer x0x0 (so-called “starting value”). Then repeat the following:
 *         <p>
 *         if xixi is even, then xi+1=xi/2xi+1=xi/2 (“half …”)
 *         if xixi is odd, then xi+1=3xi+1xi+1=3xi+1 (“…or triple plus one”)
 *         The Collatz Conjecture says that every such sequence will eventually reach 11.
 *         It has still not been proven until today but we already know for sure that this is
 *         true for every x0<258x0<258. (Never tell this to aliens!)
 *         <p>
 *         In this problem, you are given two starting values and your task is to say
 *         after how many steps their sequences “meet” for the first time (which means the first number
 *         that occurs in both sequences) and at which number is it going to happen. For simplicity,
 *         we will assume that the sequence does not continue once it has reached the number one.
 *         In reality, it would then turn into 1,4,2,1,4,2,1,…1,4,2,1,4,2,1,…, which quickly becomes boring.
 *         <p>
 *         Input
 *         The input contains at most 1 5001 500 test cases. Each test case is described by
 *         a single line containing two integer numbers AA and BB, 1≤A,B≤1 000 0001≤A,B≤1 000 000.
 *         <p>
 *         The last test case is followed by a line containing two zeros.
 *         <p>
 *         Output
 *         For each test case, output the sentence “AA needs SASA steps,
 *         BB needs SBSB steps, they meet at CC”, where SASA and SBSB are the number of
 *         steps needed in both sequences to reach the same number CC. Follow the output format precisely.
 *         <p>
 *
 *         Sample Input 1
 *         7 8
 *         27 30
 *         0 0
 *
 *         Sample Output 1
 *         7 needs 13 steps, 8 needs 0 steps, they meet at 8
 *         27 needs 95 steps, 30 needs 2 steps, they meet at 46
 */

public class CollatzConjecture {
    private Map<Long, Long> cache;

    public CollatzConjecture() {
        cache = new HashMap<Long, Long>();
        cache.put(1L, 1L);
    }

    public List<Long> findCollatzSize(long n) {
        List<Long> list = new LinkedList<Long>();

        long m;
        list.add(n);

        while (n != 1) {
            m = n;
            if (  cache.containsKey(m)) {
                list.add( cache.get(m) );
                n = cache.get(m);
            } else {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                list.add(n);
                cache.put(m, n);
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;

        CollatzConjecture main = new CollatzConjecture();

        List<Long> list;
        List<Long> list_2;
        List<Long> list_3;

        boolean goOn = true;

        while (goOn) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0) {
                goOn = false;
                break;
            }

            list = main.findCollatzSize(a);
            list_2 = main.findCollatzSize(b);
            list_3 = new ArrayList<Long>();

            list_3.addAll(list_2);

            list_3.retainAll(list);

            System.out.format("%d needs %d steps, %d needs %d steps, they meet at %d%n", a, list.indexOf(list_3.get(0)), b, list_2.indexOf(list_3.get(0)), list_3.get(0));
        }

        scanner.close();
        out.close();
    }
}

