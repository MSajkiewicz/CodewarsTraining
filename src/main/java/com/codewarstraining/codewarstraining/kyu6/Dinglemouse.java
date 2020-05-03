package com.codewarstraining.codewarstraining.kyu6;

public class Dinglemouse {

    public static int countDeafRats(final String town) {
        // Your code here
        String[] frontAndRear = town.split("P", 2);
        int result;

            int front = frontAndRear[0].replaceAll("~O", "").replaceAll(" ","").length()/2;
            int rear = frontAndRear[1].replaceAll("O~", "").replaceAll(" ","").length()/2;
            result = front+rear;

        return result;
    }

}
