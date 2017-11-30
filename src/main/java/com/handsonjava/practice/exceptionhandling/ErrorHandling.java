package com.handsonjava.practice.exceptionhandling;

public class ErrorHandling {
    public void errorThrow(){
        try{
            throw new RuntimeException("");
        } catch (Exception e){
            throw new RuntimeException("");
        }
    }
}
