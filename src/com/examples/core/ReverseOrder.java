package com.examples.core;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] numbers = {12, 64, 23, 35, 2, 67, 9, 11};

        int index = numbers.length - 1;

        System.out.print("Reversed list: {");
        while (index >= 0) {
            System.out.print(numbers[index]);
            if (index > 0) {
                System.out.print(", ");
            }
            index--;
        }
        System.out.println("}");
    }
}
