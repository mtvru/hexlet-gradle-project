package io.hexlet.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {
    @Test
    public void testSum() {
        int expected = 5;
        int actual = SomeClass.sum(3, 2);
        assertEquals(expected, actual);
    }
}
