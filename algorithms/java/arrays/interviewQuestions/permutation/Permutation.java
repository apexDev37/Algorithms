package com.apexdev.algorithms.arrays.permutation;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] firstArray = {2, 1, 3, 5, 4, 6};
        int[] secondArray = {1, 3, 2, 4, 6, 5};
        System.out.println("Both arrays are permutations: " + isPermutation(firstArray, secondArray));
    }

    private static boolean isPermutation(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length)
            return false;
        return arraySumsEqual(firstArray, secondArray) && arrayProductsEqual(firstArray, secondArray);
    }

    private static boolean arraySumsEqual(int[] firstArray, int[] secondArray) {
        return Arrays.stream(firstArray).sum()
                == Arrays.stream(secondArray).sum();
    }

    private static boolean arrayProductsEqual(int[] firstArray, int[] secondArray) {
        return Arrays.stream(firstArray).average().getAsDouble() * firstArray.length
                == Arrays.stream(secondArray).average().getAsDouble() * secondArray.length;
    }
}
