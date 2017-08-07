package com.handsonjava.arraypool;

import java.lang.reflect.Array;

/**
 * Created by adityag on 2/12/17.
 */
public class MissingNumberMatrix {

    public static int findMissingNumberMatrix(int[][] inputs) {
//        int totalElement = (inputs.length*inputs.length)
//        int sumOfMatrix = ((inputs.length*inputs.length) * ((inputs[0].length) + 1) / 2);

        int totalElement = (inputs.length*inputs[0].length);

        int sumOfElement = totalElement * ((totalElement + 1) / 2);
        System.out.println(totalElement);
        System.out.println(sumOfElement);
        int sumCurrentMatrix = 0;
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < 1; j++) {
                sumCurrentMatrix += inputs[i][j] + inputs[i][j + 1] + inputs[i][j + 2];
            }
        }

        return sumOfElement - sumCurrentMatrix;

    }

    public static void main(String[] args) {

        int[][] inputs = {{1, 2, 3},
                          {4,5,6},
                           {7,8,0}};
        System.out.println(findMissingNumberMatrix(inputs));
    }
}
