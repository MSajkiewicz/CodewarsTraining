package com.codewarstraining.codewarstraining.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisemvovelTrolls {
    public static String disemvowel(String str) {

        return str.replaceAll("a", "")
                .replaceAll("e", "")
                .replaceAll("i", "")
                .replaceAll("o", "")
                .replaceAll("u", "")
                .replaceAll("A", "")
                .replaceAll("E", "")
                .replaceAll("I", "")
                .replaceAll("O", "")
                .replaceAll("U", "");

    }
}
