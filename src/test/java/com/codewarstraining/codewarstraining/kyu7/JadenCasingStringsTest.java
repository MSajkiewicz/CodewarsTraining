package com.codewarstraining.codewarstraining.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCasingStringsTest {

    JadenCasingStrings jadenCasingStrings = new JadenCasingStrings();
    @Test
    void toJadenCase() {
        assertEquals(null, jadenCasingStrings.toJadenCase(null));
    }


}