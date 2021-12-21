package com.yourgroup.yourproject;

import org.junit.Test;

import static com.yourgroup.yourproject.Main.multiply;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMultiply() {
        assertEquals(4, multiply(2, 2));
    }
}