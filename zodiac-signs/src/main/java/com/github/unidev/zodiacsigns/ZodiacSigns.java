package com.github.unidev.zodiacsigns;

import java.time.MonthDay;

/**
 * Zodiac signs enum.
 */
public enum ZodiacSigns {
    Capricorn(
        new Pair(MonthDay.of(12, 22), MonthDay.of(12, 31)),
        new Pair(MonthDay.of(1, 1), MonthDay.of(1, 19))

    ),
    Aquarius(
        new Pair(MonthDay.of(1, 20), MonthDay.of(1, 31)),
        new Pair(MonthDay.of(2, 1), MonthDay.of(2, 17))

    ),
    Pisces(
        new Pair(MonthDay.of(2, 18), MonthDay.of(2, 29)),
        new Pair(MonthDay.of(3, 1), MonthDay.of(3, 19))
    ),
    Aries(
        new Pair(MonthDay.of(3, 20), MonthDay.of(3, 31)),
        new Pair(MonthDay.of(4, 1), MonthDay.of(4, 19))
    ),
    Taurus(
        new Pair(MonthDay.of(4, 20), MonthDay.of(4, 30)),
        new Pair(MonthDay.of(5, 1), MonthDay.of(5, 20))
    ),
    Gemini(
        new Pair(MonthDay.of(5, 21), MonthDay.of(5, 31)),
        new Pair(MonthDay.of(6, 1), MonthDay.of(6, 20))
    ),
    Cancer(
        new Pair(MonthDay.of(6, 21), MonthDay.of(6, 30)),
        new Pair(MonthDay.of(7, 1), MonthDay.of(7, 22))
    ),
    Leo(
        new Pair(MonthDay.of(7, 23), MonthDay.of(7, 31)),
        new Pair(MonthDay.of(8, 1), MonthDay.of(8, 22))
    ),
    Virgo(
        new Pair(MonthDay.of(8, 23), MonthDay.of(8, 31)),
        new Pair(MonthDay.of(9, 1), MonthDay.of(9, 22))
    ),
    Libra(
        new Pair(MonthDay.of(9, 23), MonthDay.of(9, 30)),
        new Pair(MonthDay.of(10, 1), MonthDay.of(10, 22))
    ),
    Scorpio(
        new Pair(MonthDay.of(10, 23), MonthDay.of(10, 31)),
        new Pair(MonthDay.of(11, 1), MonthDay.of(11, 21))
    ),
    Sagittarius(
        new Pair(MonthDay.of(11, 22), MonthDay.of(11, 30)),
        new Pair(MonthDay.of(12, 1), MonthDay.of(12, 21))
    ),;


    private Pair[] dates;

    ZodiacSigns(Pair... dates) {
        this.dates = dates;
    }

    public boolean match(int month, int day) {

        for (Pair date : dates) {
            MonthDay left = date.getLeft();
            MonthDay right = date.getRight();

            if (left.getMonthValue() == month && right.getMonthValue() == month) {
                if (day >= left.getDayOfMonth() && day <= right.getDayOfMonth()) {
                    return true;
                }
            }

        }

        return false;
    }

    public Pair[] getDates() {
        return dates;
    }


    public static final class Pair {

        private final MonthDay left, right;

        private Pair(MonthDay left, MonthDay right) {
            this.left = left;
            this.right = right;
        }

        public MonthDay getLeft() {
            return left;
        }

        public MonthDay getRight() {
            return right;
        }
    }

}
