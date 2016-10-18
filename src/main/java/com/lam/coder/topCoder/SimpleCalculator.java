package com.lam.coder.topCoder;

/**
 * Created by Usuario on 18/10/2016.
 */
public class SimpleCalculator {

    public int calculate(String input)     {
        String[] data = input.split("\\*|\\+|-|\\/");

        char operator = ' ';
        if ( input.contains("*")  ) {
            operator = '*';
        } else if ( input.contains("/")  ) {
            operator = '/';
        } else if ( input.contains("+")  ) {
            operator = '+';
        } else if ( input.contains("-")  ) {
            operator = '-';
        }

        int result = 0;

        switch (operator) {
            case '*':
                result = Integer.parseInt(data[0]) * Integer.parseInt(data[1]);
                break;
            case '/':
                result = Integer.parseInt(data[0]) / Integer.parseInt(data[1]);
                break;
            case '+':
                result = Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
                break;
            case '-':
                result = Integer.parseInt(data[0]) - Integer.parseInt(data[1]);
                break;
            default:
        }

        return result;
    }
}
