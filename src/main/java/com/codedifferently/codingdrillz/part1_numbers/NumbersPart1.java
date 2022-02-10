package com.codedifferently.codingdrillz.part1_numbers;

import java.util.ArrayList;

public class NumbersPart1 {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> odd = new ArrayList<>();
        Integer[] removed = new Integer[odd.size()];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                odd.add(ints[i]);

                removed = odd.toArray(removed);
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> even = new ArrayList<>();
        Integer[] removed = new Integer[even.size()];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                even.add(ints[i]);

                removed = even.toArray(removed);
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> three = new ArrayList<>();
        Integer[] removed = new Integer[three.size()];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                three.add(ints[i]);

                removed = three.toArray(removed);
            }
        }
        return removed;
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> multiples = new ArrayList<>();
        Integer[] removed = new Integer[multiples.size()];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                multiples.add(ints[i]);

                removed = multiples.toArray(removed);
            }
        }
        return removed;
    }
}
