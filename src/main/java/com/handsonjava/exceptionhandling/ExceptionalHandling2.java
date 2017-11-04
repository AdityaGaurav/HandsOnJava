package com.handsonjava.exceptionhandling;

public class ExceptionalHandling2 {
    public static void catchTheException(){
        int[] input ={2,4,6,8,9};
        int key =0;
        int result;
        for(int i=0; i< input.length; i++){
            try {
                result = input[i]/ key;
                System.out.println("result: "+result);
            } catch (ArithmeticException e){
                System.out.println("Error occured inside for loop");
                if(key == 0) {
                    key = 2;
                }
//                e.printStackTrace();
            }

        }
    }
    static int remainder(int dividend, int divisor)
            throws ArithmeticException {
        try {
            return dividend % divisor;
        }
        catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
    public static void main(String[] args) {
        catchTheException();
    }
}
