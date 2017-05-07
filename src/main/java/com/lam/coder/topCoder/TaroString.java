package com.lam.coder.topCoder;

public class TaroString {
    public String getAnswer(String string) {
        string = string.replaceAll("[^ACT]", "");
        return string.equals("CAT") ? "Possible":"Impossible";
    }
}
