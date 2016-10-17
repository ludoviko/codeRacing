package com.lam.coder.topCoder;

/**
 * @author TopCoder Solution by: L.Azuaje.
 *         <p>
 *         Problem: VLNString.
 *         This problem was used for:
 *         Single Round Match 226 Round 1 - Division II, Level One
 */
public class VLNString {

    public String makeAcronym(String name) {
        String acronym = "";
        name = name.replaceAll("\\bthe\\b|\\bof\\b|\\band\\b", "").trim();

        String[] data = name.split("\\s+");

        for (String d : data) {
            if (d.length() > 0) {
                acronym += Character.toUpperCase(d.charAt(0));
            }
        }

        return acronym;
    }
}
