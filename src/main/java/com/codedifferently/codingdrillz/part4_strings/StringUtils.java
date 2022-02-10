package com.codedifferently.codingdrillz.part4_strings;

public class StringUtils {
    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
       String [] split = sentence.split(" ");

        return split;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String [] split = sentence.split(" ");
        String word = split[0];

        return word;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        StringBuilder sb = new StringBuilder();
        String [] split = sentence.split(" ");

        for(int i = 0; i< split.length;i++){
            if(i == 0){
                sb.append(split[i]);
                sb.reverse();
                sb.append(" ");
            }else{
                sb.append(split[i]);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String response = "";
        String [] split = sentence.split(" ");
        sb1.append(split[0]).reverse();
        String first = sb1.toString();
        first = first.substring(0,1).toUpperCase() + first.substring(1);
        sb.append(first).append(" ");

        for(int i = 1; i < split.length; i++) {
            String currentWord = split[i];
            Character firstCharacter = Character.toUpperCase(currentWord.charAt(0));
            response += firstCharacter + currentWord.substring(1) + " ";
            sb.append(response);
        }
        return sb.toString().trim();
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
       StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);


        return sb.toString();
    }

}
