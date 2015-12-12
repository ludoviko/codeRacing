package com.lam.coder.usaco;

/*
ID: ludovik1
LANG: JAVA
TASK: CombinationLockm
*/

/**
 * Combination Lock
 * Farmer John's cows keep escaping from his farm and causing mischief. To try and prevent them from leaving, he purchases a fancy combination lock to keep his cows from opening the pasture gate.
 * <p/>
 * Knowing that his cows are quite clever, Farmer John wants to make sure they cannot easily open the lock by simply trying many different combinations. The lock has three dials, each numbered 1..N (1 <= N <= 100), where 1 and N are adjacent since the dials are circular. There are two combinations that open the lock, one set by Farmer John, and also a "master" combination set by the lock maker.
 * <p/>
 * The lock has a small tolerance for error, however, so it will open even if the numbers on the dials are each within at most 2 positions of a valid combination.
 * <p/>
 * For example, if Farmer John's combination is (1,2,3) and the master combination is (4,5,6), the lock will open if its dials are set to (1,3,5) (since this is close enough to Farmer John's combination) or to (2,4,8) (since this is close enough to the master combination). Note that (1,5,6) would not open the lock, since it is not close enough to any one single combination.
 * <p/>
 * Given Farmer John's combination and the master combination, please determine the number of distinct settings for the dials that will open the lock. Order matters, so the setting (1,2,3) is distinct from (3,2,1).
 * <p/>
 * PROGRAM NAME: combo
 * <p/>
 * INPUT FORMAT:
 * <p/>
 * Line 1:	The integer N.
 * Line 2:	Three space-separated integers, specifying Farmer John's combination.
 * Line 3:	Three space-separated integers, specifying the master combination (possibly the same as Farmer John's combination).
 * SAMPLE INPUT (file combo.in):
 * <p/>
 * 50
 * 1 2 3
 * 5 6 7
 * INPUT DETAILS:
 * <p/>
 * Each dial is numbered 1..50. Farmer John's combination is (1,2,3), and the master combination is (5,6,7).
 * <p/>
 * OUTPUT FORMAT:
 * <p/>
 * Line 1:	The number of distinct dial settings that will open the lock.
 * SAMPLE OUTPUT (file combo.out):
 * <p/>
 * 249
 */

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Usuario on 11/12/2015.
 */

public class CombinationLock {
    public static final String DirIn = "./src/main/java/com/lam/coder/usaco/dataIn/";
    public static final String DirOut = "./src/main/java/com/lam/coder/usaco/dataOut/";

    public static final String DataIn = DirIn + CombinationLock.class.getSimpleName()
            + ".in";
    public static final String DataOut = DirOut
            + CombinationLock.class.getSimpleName() + ".out";

    public int findCombinations(String c1, String c2, int n) {

        Set<String> set = findCombionation(c1, n);
        set.addAll(findCombionation(c2, n));
        return set.size();
    }

    private Set<String> findCombionation(String combination, int n) {

        Set<String> set = new HashSet<String>();
        String[] data = combination.split(" ");

        int a, b, c;
        int aa, bb, cc;

        a = Integer.parseInt(data[0]);
        b = Integer.parseInt(data[1]);
        c = Integer.parseInt(data[2]);

        String s = "";

        for (int i = a - 2; i < a + 3; i++) {
            aa = correctValue(i, n);
            for (int j = b - 2; j < b + 3; j++) {
                bb = correctValue(j, n);
                for (int k = c - 2; k < c + 3; k++) {
                    cc = correctValue(k, n);
                    s = aa + "," + bb + "," + cc;
                    set.add(s);
                }
            }
        }

        return set;
    }

    private int correctValue(int a, int n) {
        int aa = a % n;
        if (aa == 0) {
            aa = n;
        } else if (aa < 0) {
            aa += n;
        }
        return aa;
    }

    public static void main(String[] strings) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(DataIn));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                DataOut)));

        CombinationLock lock = new CombinationLock();

        int n = Integer.parseInt(reader.readLine().trim());
        String s1 = reader.readLine().trim();
        String s2 = reader.readLine().trim();

        int i = lock.findCombinations(s1, s2, n);
        out.println(i);
        out.close();
        reader.close();
    }
}
