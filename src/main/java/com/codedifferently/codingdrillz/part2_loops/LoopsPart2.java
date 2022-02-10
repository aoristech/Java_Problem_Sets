package com.codedifferently.codingdrillz.part2_loops;

public class LoopsPart2 {



    /**
     * Generate a String representation of a multiplication table whose dimensions are 4 by 4
     *   1 |  2 |  3 |  4 |
     *   2 |  4 |  6 |  8 |
     *   3 |  6 |  9 | 12 |
     *   4 |  8 | 12 | 16 |
     * @return
     */
    public static String getSmallMultiplicationTable() {

        String result = "";
        int tableSize = 4;
        for(int i = 1 ;i<=tableSize;i++) {
            for(int j=1;j<=tableSize;j++) {
                result += String.format("%3d |", (i*j));
            }
            result += "\n";
        }
        return (result);
    }

    /**
     * Generate a String representation of a multiplication table whose dimensions are 9 by 9
     * 1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |
     * 2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |
     * 3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |
     * 4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |
     * 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |
     * 6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |
     * 7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |
     * 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |
     * 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |
     * 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |
     */
    public static String getLargeMultiplicationTable() {
        String result = "";
        int tableSize = 9;
        for(int i = 1 ;i<=tableSize;i++) {
            for(int j=1;j<=tableSize;j++) {
                result += String.format("%3d |", (i*j));
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Given one integer, width, generate a String representation of a multiplication table whose dimensions are width by width
     * tableSize = 6
     *
     *  1 |  2 |  3 |  4 |  5 |  6 |
     *  2 |  4 |  6 |  8 | 10 | 12 |
     *  3 |  6 |  9 | 12 | 15 | 18 |
     *  4 |  8 | 12 | 16 | 20 | 24 |
     *  5 | 10 | 15 | 20 | 25 | 30 |
     *  6 | 12 | 18 | 24 | 30 | 36 |
     */
    public static String getMultiplicationTable ( int tableSize){
        String result = "";
        for(int i = 1 ;i<=tableSize;i++) {
            for(int j=1;j<=tableSize;j++) {
                result += String.format("%3d |", (i*j));
            }
            result += "\n";
        }
        return result;

    }
}