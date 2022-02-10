package com.codedifferently.codingdrillz.part2_loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoopsPart1Test {
    private LoopsPart1 loops;

    @BeforeEach
    public void setUp(){
        loops  = new LoopsPart1();
    }

    @Test
    public void testGetEvenNumbers() {
        // : Given
        String expected = "5791113151719";
        int start = 5;
        int stop = 20;

        // : When
        String actual = loops.getOddNumbers(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetOddNumbers() {
        // : Given
        String expected = "681012141618";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = loops.getEvenNumbers(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSquareNumbers() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = loops.getSquareNumbers(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange1A() {
        // : Given
        String expected = "0123456789";
        int stop = 11;

        // : When
        String actual = loops.getRange(stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange2A() {
        // : Given
        String expected = "01234";
        int stop = 5;

        // : When
        String actual = loops.getRange(stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange3A() {
        // : Given
        String expected = "012345678910111213141516171819";
        int stop = 20;

        // : When
        String actual = loops.getRange(stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange1B() {
        // : Given
        String expected = "5678910111213141516171819";
        int start = 5;
        int stop = 20;

        // : When
        String actual = loops.getRange(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2B() {
        // : Given
        String expected = "101112131415161718192021222324";
        int start = 10;
        int stop = 25;

        // : When
        String actual = loops.getRange(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange3B() {
        // : Given
        String expected = "100101103104105106107108109";
        int start = 100;
        int stop = 110;

        // : When
        String actual = loops.getRange(start, stop);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange1C() {
        // : Given
        String expected = "51015";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = loops.getRange(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2C() {
        // : Given
        String expected = "012345678910111213141516171819";
        int start = 0;
        int stop = 20;
        int step = 1;

        // : When
        String actual = loops.getRange(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange3C() {
        // : Given
        String expected = "0246810";
        int start = 0;
        int stop = 11;
        int step = 2;

        // : When
        String actual = loops.getRange(start, stop, step);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetExponentiationNumbers() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;
        int exponent = 2;

        // : When
        String actual = loops.getExponentiation(start, stop, step, exponent);

        Assertions.assertEquals(expected, actual);
    }
}
