package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testGreet() {
        String result = App.greet("World");
        assertEquals("Hello, World", result);
    }
}