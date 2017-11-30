package com.handsonjava.lambdaexpression;

public class LambdaBasics {
    static LambdaInterface lambdaInterface = () -> System.out.println("Lambda Expression");
    public static void main(String[] args){
     lambdaInterface.printIt();
    }
}
