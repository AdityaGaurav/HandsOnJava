package com.handsonjava.iproblems.interview1;

import java.util.Arrays;

public class EvenAndOdd {
    public static void findEvenNumbers(int[] inputs){
        if(inputs.length == 0 || inputs.length == 1){

        }
        Arrays.sort(inputs);
        for(int i=0; i< inputs.length-1; i++){
            if(inputs[inputs.length-1-i]%2 == 0){
                System.out.println(inputs[inputs.length-1-i]);
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] ints ={1,11,3,97,65,57,79};
        findEvenNumbers(ints);
    }
}
