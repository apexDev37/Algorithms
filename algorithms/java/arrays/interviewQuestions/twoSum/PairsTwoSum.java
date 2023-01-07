package com.apexdev.algorithms.arrays.twoSum;

import java.util.Arrays;

public class PairsTwoSum {

    public static void main(String[] args) {
        int[] values = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Indices of pair sum: " + Arrays.toString(twoSum(values, target)));
    }

    private static int[] twoSum(int[] values, int target) {
        for (int n = 0; n < values.length; n++) {
            for (int m = n + 1; m < values.length; m++) {
                if (values[n] + values[m] == target)
                    return new int[]{n, m};
            }
        }
        throw new IllegalArgumentException("No solution: Couldn't find pairs whose sum equals target!");
    }
}
