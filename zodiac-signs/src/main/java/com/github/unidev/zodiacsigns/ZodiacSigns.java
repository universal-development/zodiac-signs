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

    Aquarius (
        date -> (date.getMonthValue() == 1 && date.getDayOfMonth() >= 20 && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 2 && date.getDayOfMonth() >= 1 && date.getDayOfMonth() <= 17)
    ),

    Pisces(
        date -> (date.getMonthValue() == 2 && date.getDayOfMonth() >= 18 && date.getDayOfMonth() <= 29),
        date -> (date.getMonthValue() == 3 && date.getDayOfMonth() >= 1 && date.getDayOfMonth() <= 19)
    ), Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius;


    private Predicate<LocalDate> verifiers[];

    ZodiacSigns(Predicate<LocalDate>... verifiers) {
        this.verifiers = verifiers;
    }

}
