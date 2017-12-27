package com.lam.coder.codeChef.dataLoad;

import java.io.*;
import java.util.Scanner;

public class CopyIntoMain {
    public static void main(String[] args) throws IOException {
        String dirIn = "./src/main/java/com/lam/coder/codeChef/";
        String dirOut = "./src/main/java/";

        System.out
                .println("Code Chef: Utility for creating the Main Class -to be sent to the judges- from a Given Class.");

        System.out
                .println("Enter arg: the name of the source class to copy into Main.java, NextRound or what ever, you might use white spaces as they will be trimmed. ");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().replace(" ", "");

        Scanner s = null;
        StringBuilder output = new StringBuilder();
        PrintWriter outputStream = null;
        String data = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(
                    dirIn + name + ".java")));

            // Skip package declaration
            s.nextLine();
            s.nextLine();

            while (s.hasNext()) {
                output.append(s.nextLine());
                output.append(System.getProperty("line.separator"));
            }

            data = output.toString();

            data = data.replace(name, "Main");

            System.out.println(output);

        } finally {
            if (s != null) {
                s.close();
            }

        }

        try {
            outputStream = new PrintWriter(new FileWriter(
                    dirOut + "Main.java"));

            outputStream.println(data);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
        sc.close();

    }

}
