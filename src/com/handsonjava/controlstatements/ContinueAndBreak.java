package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class ContinueAndBreak {

    public static void useContinueAndBreak(int number) {

        int[] myArray = {10, -1, 2, 23, 44, 0, -2};
        int totalOfPositiveNumbers = 0;

        if (number == 1) {
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] < 0) {
                    continue;
                }
                totalOfPositiveNumbers++;
            }
        } else {
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] >= 0) {
                    totalOfPositiveNumbers++;
                }
            }

        }

        System.out.println(totalOfPositiveNumbers);

    }

    public static void main(String[] args) {
        useContinueAndBreak(2);
    }
}
