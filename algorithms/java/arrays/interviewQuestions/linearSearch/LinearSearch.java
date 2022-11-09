package com.apexdev.algorithms.arrays.linearSearch;

import java.util.NoSuchElementException;

public class LinearSearch {

    public static void main(String[] args) {
        int[] values = {4, 7, 13, 31, 24, 17};
        int target = 17;
        int targetIndex = linearSearch(values, target);
        System.out.println("Index of target: " + targetIndex);
    }

    private static int linearSearch(int[] values, int target) {
        for (int n = 0; n < values.length; n++) {
            if (values[n] == target)
                return n;
        }
        throw new NoSuchElementException(
                String.format("Target: %d, not found in given array.", target));
    }
}
