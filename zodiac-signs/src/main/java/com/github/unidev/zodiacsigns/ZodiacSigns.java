package com.github.unidev.zodiacsigns;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 * Zodiac signs enum.
 */
public enum ZodiacSigns {
    Capricorn(
        date -> (date.getMonthValue() == 12 && date.getDayOfMonth() >= 22 && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 1 && date.getDayOfMonth() >= 1 && date.getDayOfMonth() <= 19)
    ),

    Aquarius, Pisces, Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius;


    private Predicate<LocalDate> verifiers[];

    ZodiacSigns(Predicate<LocalDate>... verifiers) {
        this.verifiers = verifiers;
    }

}
