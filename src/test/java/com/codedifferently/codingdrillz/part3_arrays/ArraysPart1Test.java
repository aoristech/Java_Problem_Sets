package com.codedifferently.codingdrillz.part3_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysPart1Test {
    @Test
    public void getFirstElementTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "The";

        // When
        String actual = ArraysPart1.getFirstElement(inputArray);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getFirstElementTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "Somewhere";

        // When
        String actual = ArraysPart1.getFirstElement(inputArray);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown"};
        String expected = "quick";

        // When
        String actual = ArraysPart1.getSecondElement(inputArray);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "over";

        // When
        String actual = ArraysPart1.getSecondElement(inputArray);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseArrayTest() {
        // Given
        String[] input = {"The", "quick", "brown"};
        String[] expected = {"brown", "quick", "The"};

        // When
        String[] actual = ArraysPart1.reverse(input);

        // Then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseArrayTest2() {
        // Given
        String[] input = {"Somewhere", "over", "the", "rainbow"};
        String[] expected = {"rainbow", "the", "over", "Somewhere"};

        // When
        String[] actual = ArraysPart1.reverse(input);

        // Then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void firstLetterTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown", "fox"};
        String expected = "Tqbf";

        // When
        String actual = ArraysPart1.getFirstLetterOfEachElement(inputArray);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstLetterTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "Sotr";

        // When
        String actual = ArraysPart1.getFirstLetterOfEachElement(inputArray);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
