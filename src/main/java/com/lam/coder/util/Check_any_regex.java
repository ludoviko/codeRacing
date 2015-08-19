/**
 * 
 */
package com.lam.coder.util;

/**
 * @author lazuajemolle
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ploenzke
 * 
 */
public class Check_any_regex {

    public static final String REGEX = "^[\\w&&[^_]]+$";

    public static final String REGEX_2 = "(^.*[\\({\\[]+.*[\\)}\\]]*.*)|(^.*[\\({\\[]*.*[\\)}\\]]+.*)$";

    private Pattern pattern;

    // public Check_any_format( ) {
    // pattern = Pattern.compile(REGEX);
    // };

    public Check_any_regex( String regex ) {
        if ( regex == null ) {
            throw new IllegalArgumentException("Faltan datos");
        } else if ( regex.equals("") ) {
            throw new IllegalArgumentException("Faltan datos");
        }

        pattern = Pattern.compile(regex);
    };

    public boolean doCheck( String string ) {
        boolean result = false;

        if ( string == null ) {
            return false;
        } else if ( string.trim().equals("") ) {
            return false;
        }

        Matcher matcher = pattern.matcher(string.trim());

        result = matcher.matches();
        return result;
    };

    public static void main( String[] args ) {
		//Check_any_regex check_it = testInMain();
        boolean result;
        
        String REGEX  = "((http:\\/\\/)|(http:\\/\\/www\\.)|(www\\.))[a-zA-Z.0-9]+" +
    			"((\\.com)|(\\.org)|(\\.edu)|(\\.info)|(\\.tv))";
        
        Check_any_regex check = new Check_any_regex(REGEX);

        result = check.doCheck("espihttp://www.tv.org.superwww.cali.comaladocious");
        System.out.println(result);
        
    }
// 04140123848
	private static Check_any_regex testInMain() {
		Check_any_regex check_it = new Check_any_regex(REGEX_2);

        String[] WRONG_SET = { "1232131244", "acd23jkhkjh", "231234ghsdgdfs", "hfdhdf565",
                "h58cker8cke" };
        String[] RIGHT_SET = { "020(0)89", "35(gsdfg", "02{}0446", "ma(2{0[6]})26ni",
                "020{}640", "0[2]0641", "04{01}709", };

        List<String> list = new ArrayList<String>(Arrays.asList(RIGHT_SET));
        boolean result;
        for ( String string : list ) {
            result = check_it.doCheck(string);
            if ( result ) {
                System.out.println("El formato es correcto para: " + string);
            } else {
                System.out.println("El formato es incorrecto para: " + string);
            }
        }

        list = new ArrayList<String>(Arrays.asList(WRONG_SET));
        for ( String string : list ) {
            result = check_it.doCheck(string);
            if ( result ) {
                System.out.println("El formato es correcto para: " + string);
            } else {
                System.out.println("El formato es incorrecto para:" + string);
            }
        }
		return check_it;
	}

}
