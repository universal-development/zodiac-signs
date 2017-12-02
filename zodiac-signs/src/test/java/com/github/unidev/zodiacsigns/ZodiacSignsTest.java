package com.github.unidev.zodiacsigns;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ZodiacSignsTest {

    @Test
    public void testLeoMatching() {
        assertTrue(ZodiacSigns.Leo.match(7, 25));
        assertFalse(ZodiacSigns.Leo.match(7, 19));
    }
}
