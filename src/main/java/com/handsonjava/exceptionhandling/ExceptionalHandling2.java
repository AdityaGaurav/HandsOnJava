package com.handsonjava.exceptionhandling;

public class ExceptionalHandling2 {
    public static void catchTheException() {
        int[] input = {2, 4, 6, 8, 9};
        int key = 0;
        int result;
        for (int i = 0; i < input.length; i++) {
            try {
                result = input[i] / key;
                System.out.println("result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error occured inside for loop");
                if (key == 0) {
                    key = 2;
                }
//                e.printStackTrace();
            }

        }
    }

    static void handleError() {
        try {
            int a = 10;
            for (int i = 0; i < 5; i++) {
//                try {
                    System.out.println(a / i);
//                }catch (ArithmeticException e){
//                    e.printStackTrace();
                }
//            }
        } catch (ArithmeticException e){
            e.printStackTrace();
        } catch (RuntimeException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Exception handled");
        System.out.println("Exception handled");
        System.out.println("Exception handled");
        ma2();

    }
static void ma2(){
    System.out.println("Exception ma2");
    System.out.println("Exception ma2");
    System.out.println("Exception ma2");
    System.out.println("Exception ma2");
}
    static int remainder(int dividend, int divisor)
            throws ArithmeticException {
        try {
            return dividend % divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        handleError();
    }
}
