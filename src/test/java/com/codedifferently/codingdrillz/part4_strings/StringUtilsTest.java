package com.codedifferently.codingdrillz.part4_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void getWordsTest() {
        // Given
        String inputString = "The quick brown fox jumps";
        String[] expected = {"The", "quick", "brown", "fox", "jumps"};

        // When
        String[] actual = StringUtils.getWords(inputString);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void getWordsTest2() {
        // Given
        String inputString = "She sells sea shells";
        String[] expected = {"She", "sells", "sea", "shells"};

        // When
        String[] actual = StringUtils.getWords(inputString);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void getFirstWordTest() {
        // Given
        String inputString = "Quick Brown Fox";
        String expected = "Quick";

        // When
        String actual = StringUtils.getFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getFirstWordTest2() {
        // Given
        String inputString = "She sells sea shells";
        String expected = "She";

        // When
        String actual = StringUtils.getFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reverseFirstWordTest() {
        // Given
        String inputString = "Yats Ready";
        String expected = "staY Ready";

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordTest2() {
        // Given
        String inputString = "Adjunct professor";
        String expected = "tcnujdA professor";

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest() {
        // Given
        String inputString = "yats Ready";
        String expected = "Stay Ready";

        // When
        String actual = StringUtils.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest2() {
        // Given
        String inputString = "adjunct professor";
        String expected = "Tcnujda Professor";

        // When
        String actual = StringUtils.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterAtIndexTest() {
        // Given
        String inputString = "Jumping";
        Integer characterIndex = 2;
        String expected = "Juping";

        // When
        String actual = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterAtIndexTest2() {
        // Given
        String inputString = "Tower";
        Integer characterIndex = 4;
        String expected = "Towe";

        // When
        String actual = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
