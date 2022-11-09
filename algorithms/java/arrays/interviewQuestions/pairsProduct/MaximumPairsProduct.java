package com.apexdev.algorithms.arrays.pairsProduct;

public class MaximumPairsProduct {

    public static void main(String[] args) {
        int[] values = {20, 10, 60, 40, 30, 50};
        int maxProduct = getMaxPairProduct(values);
        System.out.println("Max pairs product:" + maxProduct);
    }

    private static int getMaxPairProduct(int[] values) {
        int maxProduct = 0;
        for (int multiplicand : values)
            for (int multiplier : values)
                maxProduct = updateMaxProduct(maxProduct, multiplicand, multiplier);
        return maxProduct;
    }

    private static int updateMaxProduct(int maxProduct, int multiplicand, int multiplier) {
        int product = multiplicand * multiplier;
        if (product > maxProduct && multiplicand != multiplier)
            maxProduct = product;
        return maxProduct;
    }
}
