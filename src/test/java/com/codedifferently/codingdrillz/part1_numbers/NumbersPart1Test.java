package com.codedifferently.codingdrillz.part1_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersPart1Test {
    @Test
    public void deleteEvensTest() {
        // Given
        Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = { 1, 3, 5, 7, 9 };

        // When
        Integer[] actual = NumbersPart1.deleteEvens(inputArray);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void deleteOddsTest() {
        // Given
        Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = {  2, 4, 6, 8, 10 };

        // When
        Integer[] actual = NumbersPart1.deleteOdds(inputArray);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void deleteMultiplesOf3Test() {
        // Given
        Integer[] inputArray = { 3, 6, 9, 12, 15, 4, 7, 10, 13, 16};
        Integer[] expected = {4, 7, 10, 13, 16};

        // When
        Integer[] actual = NumbersPart1.deleteMultiplesOf3(inputArray);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void deleteMultiplesOfNTest() {
        // Given
        Integer multiple = 6;
        Integer[] inputArray = { 6, 12, 18, 24, 30, 4, 7, 10, 13, 16};
        Integer[] expected = {4, 7, 10, 13, 16};

        // When
        Integer[] actual = NumbersPart1.deleteMultiplesOfN(inputArray, multiple);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }
}
