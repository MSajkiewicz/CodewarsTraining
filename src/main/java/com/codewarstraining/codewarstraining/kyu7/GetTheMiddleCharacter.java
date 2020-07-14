package com.codewarstraining.codewarstraining.kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        StringBuilder str = new StringBuilder();
        str.append(word);

        while(str.length()>2){
            str.deleteCharAt(0);
            str.deleteCharAt(str.length()-1);
        }

        return str.toString();
    }

}
