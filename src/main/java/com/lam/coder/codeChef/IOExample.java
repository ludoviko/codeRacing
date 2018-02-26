package com.lam.coder.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TEST      Beginner       Life, the Universe, and Everything
public class IOExample {
    public static void main(String args[]) {
        String line = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                line = br.readLine();
                if (Integer.parseInt(line) == 42) {
                    break;
                } else {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

