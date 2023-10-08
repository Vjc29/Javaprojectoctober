package com.examples.core;

public class practice {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char targetChar = 'o'; // Change this to the character you want to check

        boolean exists = doesCharacterExist(inputString, targetChar);

        if (exists) {
            System.out.println("'" + targetChar + "' exists in the string.");
        } else {
            System.out.println("'" + targetChar + "' does not exist in the string.");
        }
    }

    public static boolean doesCharacterExist(String str, char target) {
        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
