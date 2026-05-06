package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSampleAssertion() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
    }

    @Test
    void testStringNotNull() {
        String value = "Java 21";
        assertNotNull(value);
        assertTrue(value.contains("21"));
    }
}
