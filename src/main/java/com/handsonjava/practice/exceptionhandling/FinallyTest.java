package com.handsonjava.practice.exceptionhandling;

public class FinallyTest {
    public static void finallyCheck(){
        try{
            int a =1/0;
        }catch(Exception e){
            System.out.println("Catch");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args){
        finallyCheck();
    }
}
