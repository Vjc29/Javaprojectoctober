package com.examples.core;

public class SearchNumber {
    public static void main(String[] args) {
        int numbers[] = {54, 67, 81, 97, 45, 54, 90, 83};

        int searchnumber = 40;

        boolean flag = false;

        int position = 0;

        while (position < numbers.length) {
            if (numbers[position] == searchnumber) {
                System.out.println("Number at position: "+position+" is - "+numbers[position]);
                flag = true;
            }
            position++;

        }

        if (flag) {
            System.out.println("Given number is present in the list");
        } else {
            System.out.println("Given number is not present in the list");
        }
    }
}
