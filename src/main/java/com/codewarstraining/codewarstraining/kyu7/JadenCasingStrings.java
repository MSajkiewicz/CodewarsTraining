package com.codewarstraining.codewarstraining.kyu7;

import java.util.ArrayList;
import java.util.List;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        List<String> splittedPhrasesWithUpperCase = new ArrayList<>();
        String resultPhrase = "";


        if(phrase == null || phrase == ""){
            resultPhrase = null;
        } else {
            String[] splitedPhrasse = phrase.split(" ");
            for (String e : splitedPhrasse) {
                splittedPhrasesWithUpperCase.add(e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase());
            }

            resultPhrase = String.join(" ", splittedPhrasesWithUpperCase);
        }

        return resultPhrase;
    }
}
