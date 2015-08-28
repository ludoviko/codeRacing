package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author L.Azuaje.
 *         <p/>
 *         You are given several strings that may/may not be valid emails. You should write a regular expression that determines if the email id is a valid email id or not. You may assume all characters are from the english language.
 *         <p/>
 *         INPUT SAMPLE:
 *         <p/>
 *         Your program should accept as its first argument a filename. This file will contain several text strings, one per line. Ignore all empty lines. E.g.
 *         <p/>
 *         foo@bar.com
 *         this is not an email id
 *         admin#codeeval.com
 *         good123@bad.com
 *         OUTPUT SAMPLE:
 *         <p/>
 *         Print out 'true' (all lowercase) if the string is a valid email. Else print out 'false' (all lowercase). E.g.
 *         <p/>
 *         true
 *         false
 *         false
 *         true
 */

public class EmailValidation {

    public boolean find(String string) {
        String regex = "^\\w+@\\w+(\\.\\w+)+$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(string);

        return matcher.matches();
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        PrintStream out = System.out;

        EmailValidation main = new EmailValidation();
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.length() == 0) {
                continue;
            }
            // Process line of input Here
            out.println(main.find(line));
        }

        buffer.close();
        out.close();
    }
}

