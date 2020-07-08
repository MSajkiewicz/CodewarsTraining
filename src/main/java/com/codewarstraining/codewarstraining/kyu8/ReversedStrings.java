package com.codewarstraining.codewarstraining.kyu8;

public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder string = new StringBuilder();
        string.append(str);
        string = string.reverse();
        return string.toString();
    }

}
