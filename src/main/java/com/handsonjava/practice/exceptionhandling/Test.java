package com.handsonjava.practice.exceptionhandling;

public class Test {
    public static void main(String[] args){
        ExceptionHandling.tryException();
        try {
            ExceptionHandling.tryException2();
        }catch (Exception e){
            try {
                throw e;
            }catch (Exception e1){
                e.printStackTrace();
            }
        }
        ExceptionHandling.throwMe();
     }
}
