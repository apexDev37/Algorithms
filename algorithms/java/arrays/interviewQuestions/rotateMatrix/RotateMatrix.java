package com.apexdev.algorithms.arrays.rotateMatrix;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matrix rotated 90 degrees right: "
                + Arrays.deepToString(rotate90DegreesRight(matrix)));
    }

    private static int[][] rotate90DegreesRight(int[][] matrix) {
        int[][] rotateCornerValues = rotateEvenSumIndices(matrix);
        return rotateOddSumIndices(rotateCornerValues);
    }

    private static int[][] rotateEvenSumIndices(int[][] matrix) {
        int temp = matrix[2][2];
        matrix[2][2] = matrix[0][2];
        matrix[0][2] = matrix[0][0];
        matrix[0][0] = matrix[2][0];
        matrix[2][0] = temp;
        return matrix;
    }

    private static int[][] rotateOddSumIndices(int[][] matrix) {
        int temp = matrix[2][1];
        matrix[2][1] = matrix[1][2];
        matrix[1][2] = matrix[0][1];
        matrix[0][1] = matrix[1][0];
        matrix[1][0] = temp;
        return matrix;
    }
}
