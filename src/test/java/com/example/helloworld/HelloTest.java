package com.example.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    @Test
    void messageReturnsHelloWorld() {
        assertEquals("Hello World!", Hello.message());
    }
}