package com.yourgroup.yourproject;

import org.junit.Test;

import static com.yourgroup.yourproject.Main.main;
import static com.yourgroup.yourproject.Main.multiply;
import static org.junit.Assert.*;

public class MainTest {

    // nonsense
    @Test
    public void testMain() {
        main(new String[]{"0"});
        assertTrue(true);
    }

    @Test
    public void testMultiply() {
        assertEquals(4, multiply(2, 2));
    }

    @Test
    public void testMultiplyFail() {
        assertNotEquals(4, multiply(2, 3));
    }
}