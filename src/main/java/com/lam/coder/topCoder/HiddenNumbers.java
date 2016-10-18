package com.lam.coder.topCoder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author TopCoder. Solution by L.Azuaje.
 *         <p>
 *         Problem: HiddenNumbers.
 *         Single Round Match 220 Round 1 - Division I, Level One
 *         Single Round Match 220 Round 1 - Division II, Level Two
 */


public class HiddenNumbers {
    public String[] findAll(String[] text) {

        StringBuilder builder = new StringBuilder();

        for (String t : text) {
            builder.append(t);
        }

        List<String> list = new ArrayList<String>();

/*     // A aproach.
        List<String> list2 = new ArrayList<String>();
        String[] numbers = builder.toString().split("\\D+");
        list.addAll(Arrays.asList(numbers));

        for (String s : list) {
            if (!s.isEmpty()) {
                list2.add(s);
            }
        }

        list = list2;
*/
        // A second aproach.
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher;

        matcher = pattern.matcher(builder.toString());
        while (matcher.find()) {
            list.add(matcher.group());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigInteger bi1 = new BigInteger(o1);
                BigInteger bi2 = new BigInteger(o2);

                if (bi1.compareTo(bi2) > 0) {
                    return 1;
                } else if (bi1.compareTo(bi2) < 0) {
                    return -1;
                } else {
                    if (o1.length() > o2.length()) {
                        return 1;
                    } else if (o1.length() < o2.length()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        list = list.subList(list.size() / 2, list.size());

        String[] solution = new String[list.size()];
        list.toArray(solution);

        return solution;
    }
}