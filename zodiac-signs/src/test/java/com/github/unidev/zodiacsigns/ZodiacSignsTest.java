package com.github.unidev.zodiacsigns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class ZodiacSignsTest {

    @Test
    public void testLeoMatching() {
        assertTrue(ZodiacSign.Leo.match(7, 25));
        assertFalse(ZodiacSign.Leo.match(7, 19));
    }

    @Test
    public void testMatchingSign() {
        Optional<ZodiacSign> zodiacSign = ZodiacSign.matchSign(Month.FEBRUARY, 22);
        assertTrue(zodiacSign.isPresent());
        assertEquals(ZodiacSign.Pisces, zodiacSign.get());
    }
}
