package com.examples.core;

public class ArraysDemo {
    public static void main(String[] args) {
            int marks[] = new int[6];

            int marksValue[] = {98, 99, 94, 93};
            try {
                marks[0] = 96;
                marks[1] = 98;
                marks[2] = 97;
                marks[3] = 94;
                marks[4] = 97;
                marks[5] = 91;

            }
            catch(Exception ex){
                System.out.println("EXCEPTION MESSAGE: "+ex.getLocalizedMessage());
            }

            System.out.println("NUMBER AT POSITION 3: "+marks[3]);

            int position = 0;

            while(position < marks.length){
                System.out.println("Number at position: "+position+" is - "+marks[position]);
                position++;
            }
        }
    }

