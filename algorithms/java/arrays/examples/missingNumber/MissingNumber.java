package com.apexdev.algorithms.arrays.missingNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = setup();
        int missingNumber = getMissingNumberIn(numbers);
        System.out.println("Missing number: " + missingNumber);
    }

    private static int getMissingNumberIn(int[] numbers) {
        int sumIncludingMissingNumber = getSumOfNumbers(numbers);
        int sumExcludingMissingNumber = Arrays.stream(numbers).sum();
        return sumIncludingMissingNumber - sumExcludingMissingNumber;
    }

    private static int getSumOfNumbers(int[] numbers) {
        int n = numbers[numbers.length - 1];
        return (n * (n + 1)) / 2;
    }

    // Utility functions to ease setup before computing missing number
    private static int[] setup() {
        int lastNumber = 100;
        int[] numbers = getInclusiveRange(lastNumber);
        return removeElementFrom(numbers, 23);
    }

    private static int[] getInclusiveRange(int max) {
        return IntStream.iterate(1, i -> i < max + 1, i -> i + 1)
                .toArray();
    }

    private static int[] removeElementFrom(int[] numbers, int element) {
        return IntStream.range(1, numbers.length + 1)
                .filter(number -> number != element)
                .toArray();
    }
}
