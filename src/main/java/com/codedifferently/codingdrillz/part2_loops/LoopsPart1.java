package com.codedifferently.codingdrillz.part2_loops;

public class LoopsPart1 {
    /**
     * Given two integers, start, and stop, return a String concatenation of all
     * even integers between start up to and not including stop.
     */
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNumbers = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenNumbers.append(i);
            }
        }
        return evenNumbers.toString();
    }


    /**
     * Given two integers, start, and stop, return a String concatenation of all even
     * integers between start up to and not including stop.
     */
    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddNumbers = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNumbers.append(i);
            }
        }
        return oddNumbers.toString();

    }


    /**
     * Given two integers, start, and stop, return a String concatenation of all values
     * squared between start up to and not including stop.
     */
    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder oddNumbers = new StringBuilder();

        for (int i = start; i < stop; i += step) {

            oddNumbers.append(i * i);
        }

        return oddNumbers.toString();

    }

    /**
     * Given an integer, stop, return a String concatenation of
     * all integers between 0 up to and not including stop.
     */
    public static String getRange(int stop) {
        StringBuilder range = new StringBuilder();

        for (int i = 0; i < stop; i++) {

            range.append(i);
        }

        return range.toString();

    }

    /**
     * Given two integers, start, and stop, return a String concatenation of all integers
     * between start up to and not including stop.
     */
    public static String getRange(int start, int stop) {
        StringBuilder range = new StringBuilder();

        for (int i = start; i < stop; i++) {

            range.append(i);
        }

        return range.toString();

    }


    /**
     * Given three integers, start, stop, and step return a String concatenation of
     * all integers between start, incrementing by step, up to and not including stop.
     */
    public static String getRange(int start, int stop, int step) {
        StringBuilder range = new StringBuilder();

        for (int i = start; i <= stop - 1; i += step) {

            range.append(i);
        }

        return range.toString();

    }


    /**
     * Given four integers, start, stop, step, and exponent, return a String concatenation
     * of all values, raised to the specified exponent, between start up to and not including stop,
     * incrementing by the specified step.
     */
    public static String getExponentiation(int start, int stop, int step, int exponent) {
        StringBuilder range = new StringBuilder();

        for (int i = start; i < stop; i += step) {

            range.append((int)Math.pow(i, exponent));
        }

        return range.toString();

    }
}