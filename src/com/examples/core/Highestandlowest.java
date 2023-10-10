package com.examples.core;

public class Highestandlowest {
    public static void main(String[] args) {


        int numbers[] = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int highest = numbers[0];
        int lowest = numbers[0];
        int result;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];

            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];

            }
        }
        result = highest - lowest;


        System.out.println("HIGHEST NUMBER: " + highest);
        System.out.println("LOWEST NUMBER: " + lowest);
        System.out.println("Differense: " + result);

    }
}