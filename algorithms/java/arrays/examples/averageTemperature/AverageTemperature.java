package com.apexdev.algorithms.arrays.averageTemperature;

import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        int[] temperatures = getTemperatures();
        double average = computeAverage(temperatures);
        System.out.println("Average temperature: " + average);
        System.out.println("Temperatures above average: " + countAboveAverage(average, temperatures));
    }

    private static int[] getTemperatures() {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[getNumberOfDays(scanner)];
        captureTemperatures(temperatures, scanner);
        scanner.close();
        return temperatures;
    }

    private static int getNumberOfDays(Scanner scanner) {
        System.out.print("How many days' temperature: ");
        return scanner.nextInt();
    }

    private static void captureTemperatures(int[] temperatures, Scanner scanner) {
        for (int day = 0; day < temperatures.length; day++) {
            int temperature = captureDayTemperature(day + 1, scanner);
            temperatures[day] = temperature;
        }
    }

    private static int captureDayTemperature(int day, Scanner scanner) {
        System.out.print("Highest temperature for Day " + day + ": ");
        return scanner.nextInt();
    }

    private static double computeAverage(int[] temperatures) {
        return Arrays.stream(temperatures).average().orElse(0);
    }

    private static long countAboveAverage(double average, int[] temperatures) {
        return Arrays.stream(temperatures)
                .filter(temperature -> temperature > average)
                .count();
    }
}
