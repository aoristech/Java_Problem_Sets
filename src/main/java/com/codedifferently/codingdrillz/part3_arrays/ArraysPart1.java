package com.codedifferently.codingdrillz.part3_arrays;

import java.util.ArrayList;

public class ArraysPart1 {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
//
        ArrayList<String> words = new ArrayList<>();
        String response = "";
        String[] reversedWords = new String[words.size()];
        for (int i = stringArray.length - 1; i >= 0; i--) {
            words.add(stringArray[i]);
        }
        reversedWords = words.toArray(reversedWords);

        return reversedWords;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {


        String response = "";
        for (int i = 0; i < stringArray.length; i++) {
            String currentWord = stringArray[i];

            StringBuilder builder = new StringBuilder();
            Character firstCharacter = (currentWord.charAt(0));
            response += firstCharacter;
        }

        return response;
    }
}