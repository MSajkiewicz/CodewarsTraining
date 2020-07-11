package com.codewarstraining.codewarstraining.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    @Test
    void greet() {
        assertEquals("Welcome", Welcome.greet("english"));
        assertEquals("Welkom", Welcome.greet("dutch"));
        assertEquals("Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }
}