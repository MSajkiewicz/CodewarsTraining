package com.codewarstraining.codewarstraining.kyu8;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String result = null;

        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        return result;
    }

}
