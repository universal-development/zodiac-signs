package com.github.unidev.zodiacsigns;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 * Zodiac signs enum.
 */
public enum ZodiacSigns {
    Capricorn(
        date -> (date.getMonthValue() == 12 && date.getDayOfMonth() >= 22
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 1 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 19)
    ),

    Aquarius(
        date -> (date.getMonthValue() == 1 && date.getDayOfMonth() >= 20
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 2 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 17)
    ),

    Pisces(
        date -> (date.getMonthValue() == 2 && date.getDayOfMonth() >= 18
            && date.getDayOfMonth() <= 29),
        date -> (date.getMonthValue() == 3 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 19)
    ),
    Aries(
        date -> (date.getMonthValue() == 3 && date.getDayOfMonth() >= 20
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 4 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 19)
    ),
    Taurus(
        date -> (date.getMonthValue() == 4 && date.getDayOfMonth() >= 20
            && date.getDayOfMonth() <= 30),
        date -> (date.getMonthValue() == 5 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 20)
    ),
    Gemini(
        date -> (date.getMonthValue() == 5 && date.getDayOfMonth() >= 21
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 6 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 20)
    ),
    Cancer(
        date -> (date.getMonthValue() == 6 && date.getDayOfMonth() >= 21
            && date.getDayOfMonth() <= 30),
        date -> (date.getMonthValue() == 7 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 22)
    ), Leo(
        date -> (date.getMonthValue() == 7 && date.getDayOfMonth() >= 23
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 8 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 22)
    ), Virgo(
        date -> (date.getMonthValue() == 8 && date.getDayOfMonth() >= 23
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 9 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 22)
    ), Libra(
        date -> (date.getMonthValue() == 9 && date.getDayOfMonth() >= 23
            && date.getDayOfMonth() <= 30),
        date -> (date.getMonthValue() == 10 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 22)
    ), Scorpio(
        date -> (date.getMonthValue() == 10 && date.getDayOfMonth() >= 23
            && date.getDayOfMonth() <= 31),
        date -> (date.getMonthValue() == 11 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 21)
    ), Sagittarius(
        date -> (date.getMonthValue() == 11 && date.getDayOfMonth() >= 22
            && date.getDayOfMonth() <= 30),
        date -> (date.getMonthValue() == 12 && date.getDayOfMonth() >= 1
            && date.getDayOfMonth() <= 21)
    );


    private Predicate<LocalDate> verifiers[];

    ZodiacSigns(Predicate<LocalDate>... verifiers) {
        this.verifiers = verifiers;
    }

}
