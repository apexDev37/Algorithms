package com.apexdev.algorithms.arrays.uniqueArray;

public class UniqueArray {

    public static void main(String[] args) {
        int[] hasDuplicates = {1, 2, 4, 1};
        int[] nonDuplicates = {1, 2, 3, 4};
        System.out.println("Unique array: " + isUnique(hasDuplicates));
        System.out.println("Unique array: " + isUnique(nonDuplicates));
    }

    private static boolean isUnique(int[] values) {
        for (int n = 0; n < values.length; n++) {
            for (int m = n + 1; m < values.length; m++) {
                if (values[n] == values[m])
                    return false;
            }
        }
        return true;
    }

}
